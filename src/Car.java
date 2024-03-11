public class Car{

    //メンバ変数
    String brand;

    //コンストラクタ
    public Car(String brand){    //コンストラクタはクラスと同じ名前にする
        this.brand = brand;
    }

    //メソッド
    public void carBrand(){
        System.out.println("Brand:" + brand);

    }
}
