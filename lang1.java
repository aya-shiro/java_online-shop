public class lang1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Apple");   //文字列をバッファに追加
    sb.append("Banana");
    sb.append("Orange");

    sb.reverse();
    // sb.deleteCharAt(1);  //一文字目を削除
    sb.delete(6, 12);  //7~12文字を削除

    String toInsert = "Lemon/";   //挿入したい文字列
    int index = 0;    //挿入場所、O文字目を指定
    sb.insert(index, toInsert);


    String result = sb.toString();
    System.out.println(result);

    lang2 obj = new lang2();
    obj.jdkSample();
    // 呼び出すメソッドが非staticの場合はオブジェクト生成が必要

    // lang2.jdkSample();
    // 呼び出すメソッドにstaticを付けた場合はクラス名.メソッド名で呼び出せる
  }
}

class lang2 {
  public static void jdkSample() {
    String jdk = "Java Development Kit";

    String s = jdk.toUpperCase();
    System.out.println(s);

    String ss = jdk.toLowerCase();
    System.out.println(ss);
  }
}