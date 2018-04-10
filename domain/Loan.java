package domain;

public class Loan {
    
    private String nameStudent;
    private String id;
    private String code;
    private String fechaSolicitud;
  

    public Loan(String nameStudent, String id, String code, String fechaSolicitud) {
        this.nameStudent = nameStudent;
        this.id = id;
        this.code = code;
        this.fechaSolicitud = fechaSolicitud;
      
    }

    public Loan() {
    }

    /**
     * @return the nameStudent
     */
    public String getNameStudent() {
        return nameStudent;
    }

    /**
     * @param nameStudent the nameStudent to set
     */
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the fechaSolicitud
     */
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * @param fechaSolicitud the fechaSolicitud to set
     */
    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

      public boolean search(String search) {

        if (search.isEmpty() || search.length() > getId().length()) {
            return false;
        }
        for (int i = 0; i < search.length(); i++) {
            if (search.charAt(i) != getId().charAt(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Loan{" + "nameStudent=" + nameStudent + ", id=" + id + ", code=" + code + ", fechaSolicitud=" + fechaSolicitud +  '}';
    }

    public int sizeIntBytess() {
        return  this.code.length()*2+ this.fechaSolicitud.length()*2+this.id.length()*2+ this.nameStudent.length()*2;
    }
}
