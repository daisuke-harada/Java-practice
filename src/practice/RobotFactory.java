package practice;

public class RobotFactory {
    public static void main(String[] args) {
        Robot robota = new Robot("ロボ太","青");
        Robot robota2 = new Robot("ロボ太","青");
        System.out.println(robota == robota2);
        System.out.println(robota.sayName());

        Robot roboko = new Robot("ロボ子","青");
        System.out.println(roboko.sayName());

        RobotwithDrill drillRobot = new RobotwithDrill ("ドリお", "黒");
        System.out.println(drillRobot.sayName());
        drillRobot.dig();
    }
}
