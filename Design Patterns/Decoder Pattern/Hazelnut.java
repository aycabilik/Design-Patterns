package lab4;

class Hazelnut extends Nuts {


    public Hazelnut(Waffle waffle) {
        super(waffle);
        this.price = 1.00;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Hazelnut ";
    }
}