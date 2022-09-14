package lab4;

class CaramelSauces extends Sauces {


    public CaramelSauces(Waffle wafflee) {
        super(wafflee);
        this.price = 1.00;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Caramel Sauce ";
    }
}