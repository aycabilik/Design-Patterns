package lab5;

public class Main {
    public static void main(String[] args) {

        BlacksmithTypee t1 = new FactoryElvBlackSmith();
        BlacksmithTypee t2 = new FactoryOrcBlacksmith();

        t1.typeWeapon(WeaponType.Spear);
        t1.typeWeapon(WeaponType.Axe);
        t2.typeWeapon(WeaponType.Short_sword);
        t2.typeWeapon(WeaponType.Spear);
    }
}
