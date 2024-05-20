public class PowerRangers {


    String color;
    String helmet;
    String weapon;

    PowerRangers(String color, String helmet, String weapon) {
        this.color = color;
        this.helmet = helmet;
        this.weapon = weapon;
    }

    void fight() {
        System.out.println("The" + color + "Power Ranger equiped with the" + helmet + "with the mighty weapon of" + weapon);

    }
}
