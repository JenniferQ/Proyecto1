package file;

import com.toedter.calendar.JDateChooser;
import domain.Audiovisual;
import domain.Books;
import domain.Loan;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.imageio.IIOException;
import javax.swing.JOptionPane;

public class LoanFile {
    //atributos

    public RandomAccessFile randomAccessFile;
    private int regsQuantity;
    private int regSize; //Tama;o en bytes de mis registros
    private String myFilePath; //Ruta del archivoden
    File archivoBooks = new File("Books.dat");
    MaterialFile material;
    AudiovisualFile audiovisualFile;
    File archivoAudiovisual = new File("Audiovisual.dat");

    //constructor
    public LoanFile(File file) throws IIOException, FileNotFoundException, IOException {

        //guardar la ruta del archivo
        this.myFilePath = file.getPath();

        //tama;o maximo de cada registro en el archivo
        this.regSize = 1600;//yo decido de que tama;o

        //una validacion basica de file
        if (file.exists() && !file.isFile()) {
            throw new IIOException(file.getName() + "is an invalid file");
        } else {
            //crear una nueva instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");
            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) this.regSize);
        }
    }

    public LoanFile() {
    }

    //metodo para insertar un estudiante en una posicion especifica
    public boolean putValue(int position, Loan loantoinsert) throws IOException {

        //vamos hacer una peque;a a;idacion de position
        if (position >= 0 && position <= this.regsQuantity) {
            //verificar el tama;o sea el adecuado
            if (loantoinsert.sizeIntBytess() > this.regSize) {
                System.err.println("1002-records size is too large");
                return false;
            } else {

                //escribir archivo
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(loantoinsert.getNameStudent());
                randomAccessFile.writeUTF(loantoinsert.getId());
                randomAccessFile.writeUTF(loantoinsert.getCode());
                randomAccessFile.writeUTF(loantoinsert.getFechaSolicitud());
                return true;
            }

        } else {
            System.err.println("1001-position is out bounds");
            return false;
        }

    }//end method

    //metodo para insertar al final del archivo
    public boolean addEndRecord(Loan loan) throws IOException {
        boolean success = putValue(this.regsQuantity, loan);

        if (success) {
            ++this.regsQuantity;

        }
        return success;
    }

    //obtener un estudiante de una posicion especifica
    public Loan getLoan(int position) throws IOException {
        //validar position
        if (position >= 0 && position <= this.regsQuantity) {
            //colocar el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            //leer
            Loan loanTemp = new Loan();
            loanTemp.setNameStudent(randomAccessFile.readUTF());
            loanTemp.setId(randomAccessFile.readUTF());
            loanTemp.setCode(randomAccessFile.readUTF());
            loanTemp.setFechaSolicitud(randomAccessFile.readUTF());

            if (loanTemp.getCode().equals("deleted")) {
                return null;
            } else {
                return loanTemp;
            }
        } else {
            System.err.println("1003-position is out bounds");
            return null;
        }
    }//end method

    //metodo para retornar todos los estudiantes que estan dentro del archivo
    public ArrayList<Loan> getLoanList() throws IOException {

        //crear una instancia de una array list
        ArrayList<Loan> arrayofLoan = new ArrayList<>();

        for (int i = 0; i < this.regsQuantity; i++) {
            Loan loanTemp = this.getLoan(i);

            if (loanTemp != null) {
                arrayofLoan.add(loanTemp);
            }
        }
        return arrayofLoan;
    }

    public boolean deleteRecord(String code, String id) throws IOException {
        Loan loanTemp;
        Books bookTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            loanTemp = this.getLoan(i);

            if (loanTemp.getCode().equals(code) && loanTemp.getId().equals(id)) {
                loanTemp.setCode("deleted");
                return this.putValue(i, loanTemp);
            }
        }
        return false;
    }//end method

    public boolean verifyComplete(String name, String carrer, String email, String ano, String cel, String direction) {
        if (name.equals("") || carrer.equals("") || email.equals("") || ano.equals("") || direction.equals("")) {
            JOptionPane.showMessageDialog(null, "You can not leave blank spaces", "Error al registrar al estudiante", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean quantityAvailable(String code) throws IOException {
        Books booksTemp;
        material = new MaterialFile(archivoBooks);
        for (int i = 0; i < material.getBookList().size(); i++) {
            booksTemp = material.getBooks(i);
            if (code.equals(booksTemp.getCode()) && booksTemp.getAvailable() > 0) {
                booksTemp.setAvailable(booksTemp.getAvailable() - 1);
                return material.putValue(i, booksTemp);
            }
        }
        return false;
    }

    public boolean returnAvailable(String code) throws FileNotFoundException, IOException {
        Books booksTemp;
        material = new MaterialFile(archivoBooks);
        for (int i = 0; i < material.getBookList().size(); i++) {
            booksTemp = material.getBooks(i);
            if (code.equals(booksTemp.getCode())) {
                booksTemp.setAvailable(booksTemp.getAvailable() + 1);
                return material.putValue(i, booksTemp);
            }

        }
        return false;
    }

    public void comprimir() throws IOException {
        ArrayList<Loan> loan = getLoanList();
        this.randomAccessFile.setLength(0);
        this.regsQuantity = 0;
        for (Loan temp : loan) {
            addEndRecord(temp);
        }
    }

    public boolean quantityAvailableAudiovisual(String code) throws IOException {
        Audiovisual booksTemp;
        audiovisualFile = new AudiovisualFile(archivoAudiovisual);
        for (int i = 0; i < audiovisualFile.getStudentList().size(); i++) {
            booksTemp = audiovisualFile.getStudent(i);
            if (code.equals(booksTemp.getCode()) && booksTemp.getAvailable() > 0) {
                booksTemp.setAvailable(booksTemp.getAvailable() - 1);
                return audiovisualFile.putValue(i, booksTemp);
            }
        }
        return false;
    }

    public boolean returnAvailableAudiovisual(String code) throws FileNotFoundException, IOException {
        Audiovisual audiovisualTemp;
        audiovisualFile = new AudiovisualFile(archivoAudiovisual);
        for (int i = 0; i < audiovisualFile.getStudentList().size(); i++) {
            audiovisualTemp = audiovisualFile.getStudent(i);
            if (code.equals(audiovisualTemp.getCode())) {
                audiovisualTemp.setAvailable(audiovisualTemp.getAvailable() + 1);
                return audiovisualFile.putValue(i, audiovisualTemp);
            }

        }
        return false;
    }

    public int fine(JDateChooser startDate, JDateChooser finalDate) {

        int dias = -1;
        if (startDate.getDate() != null && finalDate.getDate() != null) {
            Calendar fechaInicio = startDate.getCalendar(); //capturar fechas de los JDateChooser
            Calendar fechaFinal = finalDate.getCalendar();

            while (fechaInicio.before(fechaFinal) || fechaInicio.equals(fechaFinal)) {
                dias += 1;
                fechaInicio.add(Calendar.DATE, 1); //suma a la variable 1 dia cada vez que se ccumpla la condicion
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select dates", "You must select the dates", JOptionPane.ERROR_MESSAGE);
        }
        if (dias > 7) {
            int fine = (dias - 7) * 1000;
            return fine;
        }
        return 0;
    }

}
