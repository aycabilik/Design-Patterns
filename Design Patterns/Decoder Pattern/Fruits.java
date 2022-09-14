package lab4;

public class Fruits extends DecoratorWaffle {
    public Waffle waffle;

    public Fruits(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return this.waffle.getPrice() + this.price;
    }
}
