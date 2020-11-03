package practice;

import sample.CrashException;

public class RobotFactory {
    public static void main(String[] args) {
        Robot robota = new Robot("ロボ太","青");
        Robot robota2 = new Robot("ロボ太","青");
        System.out.println(robota == robota2);
        System.out.println(robota.sayName());

        try {
            System.out.println(robota.charge(3));
            System.out.println(robota.charge(5));
            System.out.println(robota.charge(6));

            System.out.println("無事充電完了!");
        } catch (CrashException e) {
            e.printStackTrace();
        }



        Robot roboko = new Robot("ロボ子","青");
        System.out.println(roboko.sayName());

        RobotwithDrill drillRobot = new RobotwithDrill ("ドリお", "黒");
        System.out.println(drillRobot.sayName());
        drillRobot.dig();
    }
}
