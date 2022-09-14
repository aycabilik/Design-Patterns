package lab4;

class Almond extends Nuts {


    public Almond(Waffle waffle) {
        super(waffle);
        this.price = 1.00;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Almond ";
    }
}
