package lab4;

class Walnut extends Nuts {


    public Walnut(Waffle waffle) {
        super(waffle);
        this.price = 1.00;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Walnut ";
    }
}