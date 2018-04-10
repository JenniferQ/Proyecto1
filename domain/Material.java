package domain;

import java.io.Serializable;

public class Material  implements Serializable{
    
    private String name;
    private String code;
    private int quantity;
    private int available;

    public Material(String name, String code, int quantity, int available) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.available = available;
    }

    public Material() {
    }

     /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the available
     */
    public int getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return  " Name: " + getName() + "\n Code: " + getCode() + " \n Quantity: " + getQuantity() + "\n Available: " + getAvailable();
    }
  }
