package lab5;

public class FactoryElvBlackSmith extends BlacksmithTypee {


   public String name = "Orcish ";


    @Override
    void typeWeapon(WeaponType weaponType) {
        Weapon weapon;

        if(weaponType == WeaponType.Axe){
            weapon = new AxeWeapon();
            System.out.println(name + weapon.getWeaponType());
        }
        else if(weaponType == WeaponType.Short_sword){
            weapon = new ShortSwordWeapon();
            System.out.println(name + weapon.getWeaponType());
        }
        else if(weaponType == WeaponType.Spear){
            weapon = new SpearWeapon();
            System.out.println(name + weapon.getWeaponType());
        }

    }
}
