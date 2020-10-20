package practice;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.execute();
    }

    // 引数がないメソッド
    void execute() {
        outputSum(1, 2 );
        outputSum(3, 5 );
        outputSum(6, 10 );
    }

    // メソッドとは  処理のブロック
    // outputSum メソッド名
    // nuberA  numberB 引数（メソッドを実行するときに渡される変数みたいなもの)
    void outputSum(int numberA, int numberB) {
        System.out.println(sum(numberA, numberB));
    }

    // int型の戻り値を表すメソッド
    // 戻り値は0 or 1個
    int sum(int numberA, int numberB) {
        return numberA + numberB;
    }
}
