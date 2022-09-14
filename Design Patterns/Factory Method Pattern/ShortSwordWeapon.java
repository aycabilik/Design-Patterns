package lab5;

public class ShortSwordWeapon extends Weapon{

    public String Weapon_name = "short sword";

    @Override
    String getWeaponType() {
        return Weapon_name;
    }
}
