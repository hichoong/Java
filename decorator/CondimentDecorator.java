package decorator;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public void setSize(String size){
        super.setSize(size);
    }
}
