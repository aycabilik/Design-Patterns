package lab5;

public class SpearWeapon extends Weapon{

    public String Weapon_name = "spear";

    @Override
    String getWeaponType() {
        return Weapon_name;
    }
}
