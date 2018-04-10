package domain;

public class Books extends Material {

    private int year;
    private String author;
    private String format;

    public Books() {
        super();
    }

    public Books(int year, String author, String format, String name, String code, int quantity, int available) {
        super(name, code, quantity, available);
        this.year = year;
        this.author = author;
        this.format = format;
    }

    public Books(int year, String author, String format) {
        this.year = year;
        this.author = author;
        this.format = format;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
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
        return super.toString() + " Year: " + getYear() + "\n Author: " + getAuthor() + " \n Format: " + getFormat();
    }

    public int sizeIntBytess() {

        return 4 + 4 + 4 + this.getFormat().length() * 2 + this.getAuthor().length() * 2 + super.getName().length() * 2 + super.getCode().length() * 2;

    }

}
 