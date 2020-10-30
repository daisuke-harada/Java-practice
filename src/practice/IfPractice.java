package practice;

public class IfPractice {
    public static void main(String[] args) {
        int number = 8;

        //条件分岐
        if (number == 10) {
            System.out.println("10です。");
        }else if (number == 9) {
            System.out.println("9です");
        } else {
            System.out.println("10じゃないですし、9でもないです。");
        }

        if (true) {
            System.out.println("ここは必ず実行される。何故ならboolean型だから");
        }
    }
}
