package lab4;

abstract class Nuts extends DecoratorWaffle {


    public Waffle waffle;


    public Nuts(Waffle waffle) {
        this.waffle = waffle;
    }


    @Override
    public String getDescription() {
        return super.getDescription();
    }


    @Override
    public double getPrice() {
        return (this.waffle.getPrice() + this.price);
    }
}