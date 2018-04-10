package file;

import domain.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StudentFile implements Serializable {

    private String path;

    public StudentFile(String path) {
        super();
        this.path = path;
    }

    public void serialize(Student student) throws IOException, ClassNotFoundException {

        //instancia de file
        File myFile = new File(path);

        //lista que se obtiene y se guarda en archivo
        ArrayList<Student> studentList = new ArrayList<Student>();

        //si el archivo existe, recupero la lista
        if (myFile.exists()) {

            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting a lista
            studentList = (ArrayList<Student>) aux;
            objectInput.close();
        }
        //agrego la persona a la lista
        studentList.add(student);

        //escribo el objeto lista (que contiene objetos de tipo Person) en archivo
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        output.writeUnshared(studentList);

        //cierro el archivo
        output.close();

    }

    public ArrayList getListStudent() throws IOException, ClassNotFoundException {

        //instancia de file
        File myFile = new File(path);

        //lista que voy a recorrer para buscar a una persona
        List<Student> studentList = new ArrayList<>();

        //si el archivo existe entonces recupero a la persona
        if (myFile.exists()) {
            try ( //llevo a cabo una lectura de la lista
                    ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile))) {
                Object aux = objectInput.readObject();

                //casting del objeto
                studentList = (List<Student>) aux;
            }
        }

        //mi instancia a retornar
        ArrayList<Student> arrayStudent = new ArrayList<>();
        //recorro la lista en busca de la persona que me interesa
        for (int i = 0; i < studentList.size(); i++) {
            arrayStudent.add(studentList.get(i));

        }
        //retorna la persona ya sea con datos nulos o con la persona buscada
        return arrayStudent;
    }

    public String getId(int year, String career) throws IOException, ClassNotFoundException {

        String carne = "";
        char letra = career.charAt(0);
        char digit = ("" + year).charAt(3);
        int temp = (120 + getListStudent().size());
        carne = letra + ("" + digit) + (temp);
        return carne;
    }

    public boolean verify(String id) throws IOException, ClassNotFoundException {
        Student studentTemp;
        //instancia de file
        File myFile = new File(path);
        for (int i = 0; i < this.getListStudent().size(); i++) {
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            ArrayList<Student> arr = getListStudent();
            arr = (ArrayList< Student>) aux;
            studentTemp = arr.get(i);
            if (studentTemp.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean verifyComplete(String name, String carrer, String email, String ano, String cel, String direction) {
        if (name.equals("") || carrer.equals("") || email.equals("") || ano.equals("") || direction.equals("")) {
            JOptionPane.showMessageDialog(null, "You can not leave blank spaces", "Error registering student", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
