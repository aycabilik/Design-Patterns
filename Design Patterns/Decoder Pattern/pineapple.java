package lab4;

class pineapple extends Fruits {


    public pineapple(Waffle waffle) {
        super(waffle);
        this.price = 0.5;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Pineapple ";
    }
}