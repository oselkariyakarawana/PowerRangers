//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        PowerRangers RedRanger = new PowerRangers("Red", "Dragon", "Sword");
        PowerRangers BlueRanger = new PowerRangers("Blue", "Shark", "Claw");
        PowerRangers YellowRanger = new PowerRangers("Yellow", "phoenix", "WingBlades");
        PowerRangers BlackRanger = new PowerRangers("Black", "Frog", "Gun");
        PowerRangers PinkRanger = new PowerRangers("Pink", "Snake", "Poison");

        //comment
        //hi batch 86

        System.out.println(RedRanger.color);
        System.out.println(RedRanger.helmet);
        System.out.println(RedRanger.weapon);

        System.out.println();

        System.out.println(BlueRanger.color);
        System.out.println(BlueRanger.helmet);
        System.out.println(BlueRanger.weapon);

        System.out.println();

        System.out.println(YellowRanger.color);
        System.out.println(YellowRanger.helmet);
        System.out.println(YellowRanger.weapon);

        System.out.println();

        System.out.println(BlackRanger.color);
        System.out.println(BlackRanger.helmet);
        System.out.println(BlackRanger.weapon);

        System.out.println();

        System.out.println(PinkRanger.color);
        System.out.println(PinkRanger.helmet);
        System.out.println(PinkRanger.weapon);
    }
}