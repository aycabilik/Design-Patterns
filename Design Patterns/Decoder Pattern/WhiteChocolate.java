package lab4;

public class WhiteChocolate extends Chocolate {
    public WhiteChocolate(Waffle waffle) {
        super(waffle);
        this.price = 2.0;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", White Chocolate ";
    }
}

