package practice;

// Robot 親クラス・スーパークラス
// RobotwithDrill・・・子クラス・サブクラス
// 直接継承できるクラスは一つだけ
public class RobotwithDrill extends Robot {

    RobotwithDrill(String name, String color) {
        super(name, color);
    }

    public void dig(){
        System.out.println(name + "穴を掘った！");
    }

    // オーバーライド
    @Override
    String sayName() {
        return "Myname is " + name;
    }
}
