/*
-Added setters and getters
-Added getWeaponType method
-action method uses getWeaponType instead of nested ifs
 */
public class Player {
        private Weapon weapon;
        private String name;
        public Player(Weapon weapon,String name)
        {
            this.name=name;
            this.weapon=weapon;
        }
        public void setWeapon(Weapon weapon)
        {
            this.weapon=weapon;
        }
        public Weapon getWeapon()
        {
            return this.weapon;
        }
        public String getWeaponType()
        {
            return this.weapon.getType();
        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public void action()
        {
            System.out.println(getName()+" performed a "+getWeaponType()+" attack");
        }
    }

