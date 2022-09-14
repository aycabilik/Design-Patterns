package lab4;

class kiwi extends Fruits {


    public kiwi(Waffle waffle) {
        super(waffle);
        this.price = 0.5;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Kiwi ";
    }
}