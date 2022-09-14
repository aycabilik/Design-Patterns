package lab4;

public class Main {

    public static void main(String[] args) {
        Waffle w = new BelgianWaffle();
        System.out.println(w.getDescription() + " $" + w.getPrice());

        w = new NutellaChocolate(w);
        System.out.println(w.getDescription() + " $ " + w.getPrice());

        w = new ChocolateSauces(w);
        System.out.println(w.getDescription() + " $ " + w.getPrice());

        w = new kiwi(w);
        System.out.println(w.getDescription() + " $ " + w.getPrice());


        Waffle w2 = new FreeGlutenWaffle();
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new DarkChocolate(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new MilkyChocolate(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new RasberrySauces(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new Strawberry(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new pineapple(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new kiwi(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new Pistachio(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());

        w2 = new Walnut(w2);
        System.out.println(w2.getDescription() + " $ " + w2.getPrice());
    }

}
