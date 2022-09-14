package lab4;

abstract class Sauces extends DecoratorWaffle {


    public Waffle waffle;


    public Sauces(Waffle waffle) {
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

