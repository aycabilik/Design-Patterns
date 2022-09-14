package lab4;

public abstract class Chocolate extends DecoratorWaffle {
    public Waffle waffle;

    public Chocolate(Waffle waffle) {
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
