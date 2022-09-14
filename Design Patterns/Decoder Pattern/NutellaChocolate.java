package lab4;

public class NutellaChocolate extends Chocolate {
    public NutellaChocolate(Waffle waffle) {
        super(waffle);
        this.price = 2.0;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Nutella Chocolate ";
    }
}
