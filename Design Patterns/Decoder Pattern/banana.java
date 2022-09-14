package lab4;


class banana extends Fruits {


    public banana(Waffle waffle) {
        super(waffle);
        this.price = 0.5;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Banana ";
    }
}