package domain;



public class Audiovisual extends Material {
private String brand;

    public Audiovisual() {
        super();
    }

    public Audiovisual(String brand, String name, String code, int quantity, int available) {
        super(name, code, quantity, available);
        this.brand = brand;
    }

    public Audiovisual(String brand) {
        this.brand = brand;
    }


    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
     public boolean search(String search) {

        if (search.isEmpty() || search.length() > super.getCode().length()) {
            return false;
        }
        for (int i = 0; i < search.length(); i++) {
            if (search.charAt(i) != super.getCode().charAt(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Brand:" + brand + " ";
    }
    
     public int sizeIntBytess(){
        return  4 + 4 + this.getBrand().length()*2+ this.getName().length()*2 + super.getCode().length()*2;
 
   }

    

   
}
