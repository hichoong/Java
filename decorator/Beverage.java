package decorator;

public abstract class Beverage {
    String description = "그냥커피";
    String size;
    static final String TALL = "TALL";
    static final String GRANDE = "GRANDE";
    static final String VENTI = "VENTI";
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    };
    public abstract int cost();
}
