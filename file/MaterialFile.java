package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.imageio.IIOException;
import domain.Books;
import javax.swing.JOptionPane;

public class MaterialFile {

    public RandomAccessFile randomAccessFile;
    private int regsQuantity; //cantidad de registros que tiene mi archivo
    private int regSize; //Tama;o en bytes de mis registros
    private String myFilePath; //Ruta del archivoden

    //constructor
    public MaterialFile(File file) throws IIOException, FileNotFoundException, IOException {

        //guardar la ruta del archivo
        this.myFilePath = file.getPath();

        //tama;o maximo de cada registro en el archivo
        this.regSize = 289;//yo decido de que tama;o

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
    public boolean putValue(int position, Books bookstoinsert) throws IOException {

        //vamos hacer una peque;a a;idacion de position
        if (position >= 0 && position <= this.regsQuantity) {
            //verificar el tama;o sea el adecuado
            if (bookstoinsert.sizeIntBytess() > this.regSize) {
                System.err.println("1002-records size is too large");
                return false;
            } else {

                //escribir archivo
                randomAccessFile.seek(position * this.regSize);//seek es el brazo
                randomAccessFile.writeInt(bookstoinsert.getYear());
                randomAccessFile.writeUTF(bookstoinsert.getAuthor());
                randomAccessFile.writeUTF(bookstoinsert.getFormat());
                randomAccessFile.writeUTF(bookstoinsert.getName());
                randomAccessFile.writeUTF(bookstoinsert.getCode());
                randomAccessFile.writeInt(bookstoinsert.getQuantity());
                randomAccessFile.writeInt(bookstoinsert.getAvailable());
                return true;

            }

        } else {
            System.err.println("1001-position is out bounds"); //codigo para saber cual error es exactamente
            return false;
        }

    }//end method
    //metodo para insertar al final del archivo

    public boolean addEndRecord(Books book) throws IOException {
        boolean success = putValue(this.regsQuantity, book);
        if (success) {
            ++this.regsQuantity;
        }
        return success;
    }

    //obtener un estudiante de una posicion especifica
    public Books getBooks(int position) throws IOException {
        //validar position
        if (position >= 0 && position <= this.regsQuantity) {
            //colocar el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            //leer
            Books bookTemp = new Books();

            bookTemp.setYear(randomAccessFile.readInt());
            bookTemp.setAuthor(randomAccessFile.readUTF());
            bookTemp.setFormat(randomAccessFile.readUTF());
            bookTemp.setName(randomAccessFile.readUTF());
            bookTemp.setCode(randomAccessFile.readUTF());
            bookTemp.setQuantity(randomAccessFile.readInt());
            bookTemp.setAvailable(randomAccessFile.readInt());

            if (bookTemp.getName().equals("deleted")) {
                return null;
            } else {
                return bookTemp;
            }
        } else {
            System.err.println("1004-position is out bounds");
            return null;
        }
    }//end method

    //metodo para retornar todos los estudiantes que estan dentro del archivo
    public ArrayList<Books> getBookList() throws IOException {

        //crear una instancia de una array list
        ArrayList<Books> arrayListOfBooks = new ArrayList<>();

        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < this.regsQuantity; i++) {
            Books bookTemp = this.getBooks(i);

            //insertar ese estudiante en la lista
            if (bookTemp != null) {
                arrayListOfBooks.add(bookTemp);
            }
        }
        return arrayListOfBooks;
    }

    public boolean deleteRecord(String name) throws IOException {
        Books booksTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            booksTemp = this.getBooks(i);

            if (booksTemp.getName().equals(name)) {
                booksTemp.setName("delete");
                return this.putValue(i, booksTemp);
            }
        }
        return false;
    }//end method

    public String getCode() {
        String code = "ISBN";
        int num = 100 + (int) (Math.random() * 901);
        code += num;
        return code;
    }

    public boolean quantity(String name, String author, int num, String formato, int year) throws IOException {
        Books booksTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            booksTemp = this.getBooks(i);
            if (booksTemp.getName().equals(name) && booksTemp.getAuthor().equals(author) && booksTemp.getFormat().equals(formato) && booksTemp.getYear() == year) {
                int quantity = booksTemp.getQuantity();
                booksTemp.setQuantity(quantity + num);
                booksTemp.setAvailable(quantity + num);
                return this.putValue(i, booksTemp);
            }
        }
        return false;
    }

    public String[] array() throws IOException {
        String array[] = new String[regsQuantity];
        Books booksTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            booksTemp = this.getBooks(i);
            array[i] = booksTemp.getName() + ", " + getCode();
        }
        return array;
    }

    public boolean verifyCompleteBook(String name, String author, String format, String ano, String quantity) {
        if (name.equals("") || author.equals("") || format.equals("") || ano.equals("") || quantity.equals("")) {
            JOptionPane.showMessageDialog(null, "You can not leave blank spaces", "Error registering book", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
