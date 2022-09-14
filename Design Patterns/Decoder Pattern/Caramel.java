package lab4;

public class Caramel extends Chocolate {
    public Caramel(Waffle waffle) {
        super(waffle);
        this.price = 2.0;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Caramel ";
    }
}
