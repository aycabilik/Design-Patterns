package lab4;

class Strawberry extends Fruits {


    public Strawberry(Waffle waffle) {
        super(waffle);
        this.price = 0.5;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Strawberry ";
    }


}