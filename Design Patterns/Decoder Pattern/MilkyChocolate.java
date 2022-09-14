package lab4;

public class MilkyChocolate extends Chocolate {
    public MilkyChocolate(Waffle waffle) {
        super(waffle);
        this.price = 2.0;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Milky Chocolate ";
    }
}
