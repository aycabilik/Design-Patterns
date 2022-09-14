package lab4;

class RasberrySauces extends Sauces {


    public RasberrySauces(Waffle wafflee) {
        super(wafflee);
        this.price = 1.00;
    }


    public String getDescription() {


        return waffle.getDescription() + ", Raspberry Sauce ";
    }
}
