package lab4;

public class DarkChocolate extends Chocolate {
    public DarkChocolate(Waffle waffle) {
        super(waffle);
        this.price = 2.0;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Dark Chocolate ";
    }
}
