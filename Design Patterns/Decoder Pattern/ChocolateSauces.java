package lab4;

class ChocolateSauces extends Sauces {


    public ChocolateSauces(Waffle wafflee) {
        super(wafflee);
        this.price = 1.00;
    }


    public String getDescription() {
        return waffle.getDescription() + ", Chocolate Sauce ";
    }
}