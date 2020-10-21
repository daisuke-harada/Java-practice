package practice;

// クラス
// クラス名  Robot
class Robot {
    //フィールド
    //インスタンスに状態を保持する変数のようなもの
    String name;
    String color;

    // コンストラクタ(メソッドのようだけど、メソッドではない)
    // 戻り値の型がない
    // クラス名と同じ名前
    // インスタンス生成物に呼び出される特殊な処理
    // インスタンスの初期処理を行う
    Robot(String name, String color) {
        // フィールドにコンストラクタ呼び出し時に渡された引数をセットしている。
        // thisによりフィールドと同じ名前のものを参照している
        this.name = name;
        this.color = color;
    }

    String sayName() {
        // thisは省略している(名前が被っていないから)
        return name + "です。";
    }
}
