package file;

import domain.Audiovisual;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.imageio.IIOException;
import javax.swing.JOptionPane;

public class AudiovisualFile {
    //atributos

    public RandomAccessFile randomAccessFile;
    private int regsQuantity; //cantidad de registros que tiene mi archivo
    private int regSize; //Tama;o en bytes de mis registros
    private String myFilePath; //Ruta del archivoden

    //constructor
    public AudiovisualFile(File file) throws IIOException, FileNotFoundException, IOException {

        //guardar la ruta del archivo
        this.myFilePath = file.getPath();

        //tama;o maximo de cada registro en el archivo
        this.regSize = 1200;//yo decido de que tama;o

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

    //metodo para insertar un estudiante en una posicion especifica
    public boolean putValue(int position, Audiovisual studenttoinsert) throws IOException {

        //vamos hacer una peque;a a;idacion de position
        if (position >= 0 && position <= this.regsQuantity) {
            //verificar el tama;o sea el adecuado
            if (studenttoinsert.sizeIntBytess() > this.regSize) {
                System.err.println("1002-records size is too large");
                return false;
            } else {

                //escribir archivo
                randomAccessFile.seek(position * this.regSize);//seek es el brazo
                randomAccessFile.writeUTF(studenttoinsert.getBrand());
                randomAccessFile.writeUTF(studenttoinsert.getName());
                randomAccessFile.writeUTF(studenttoinsert.getCode());
                randomAccessFile.writeInt(studenttoinsert.getQuantity());
                randomAccessFile.writeInt(studenttoinsert.getAvailable());

                return true;

            }

        } else {
            System.err.println("1001-position is out bounds"); //codigo para saber cual error es exactamente
            return false;
        }

    }//end method
    //metodo para insertar al final del archivo

    public boolean addEndRecord(Audiovisual student) throws IOException {
        boolean success = putValue(this.regsQuantity, student);

        if (success) {
            ++this.regsQuantity;

        }
        return success;
    }

    //obtener un estudiante de una posicion especifica
    public Audiovisual getStudent(int position) throws IOException {
        //validar position
        if (position >= 0 && position <= this.regsQuantity) {
            //colocar el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            //leer
            Audiovisual studentTemp = new Audiovisual();
            studentTemp.setName(randomAccessFile.readUTF());
            studentTemp.setBrand(randomAccessFile.readUTF());
            studentTemp.setCode(randomAccessFile.readUTF());
            studentTemp.setQuantity(randomAccessFile.readInt());
            studentTemp.setAvailable(randomAccessFile.readInt());

            if (studentTemp.getName().equals("deleted")) {
                return null;
            } else {
                return studentTemp;
            }
        } else {
            System.err.println("1003-position is out bounds");
            return null;
        }
    }//end method

    //metodo para retornar todos los estudiantes que estan dentro del archivo
    public ArrayList<Audiovisual> getStudentList() throws IOException {

        //crear una instancia de una array list
        ArrayList<Audiovisual> arrayListOfStudents = new ArrayList<>();

        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < this.regsQuantity; i++) {
            Audiovisual studentTemp = this.getStudent(i);

            //insertar ese estudiante en la lista
            if (studentTemp != null) {
                arrayListOfStudents.add(studentTemp);
            }
        }
        return arrayListOfStudents;
    }

    public boolean deleteRecord(String name) throws IOException {
        Audiovisual studentTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            studentTemp = this.getStudent(i);

            if (studentTemp.getName().equals(name)) {
                studentTemp.setName("delete");
                return this.putValue(i, studentTemp);
            }
        }
        return false;
    }//end method

    public boolean quantity(String name, String bran, int num) throws IOException {
        Audiovisual audiovisualTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            audiovisualTemp = this.getStudent(i);
            if (audiovisualTemp.getName().equals(name) && audiovisualTemp.getBrand().equals(bran)) {
                int quantity = audiovisualTemp.getQuantity();
                audiovisualTemp.setQuantity(quantity + num);
                audiovisualTemp.setAvailable(quantity + num);
                return this.putValue(i, audiovisualTemp);
            }
        }
        return false;
    }

    public boolean verifyComplete(String name, String carrer, String email, String ano, String cel, String direction) {
        if (name.equals("") || carrer.equals("") || email.equals("") || ano.equals("") || direction.equals("")) {
            JOptionPane.showMessageDialog(null, "No puede dejar espacios en blanco", "Error al registrar estudiante", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public int getCodeAudiovisual() {

        int code = 10000 + (int) (Math.random() * 9999);

        return code;

    }

}
