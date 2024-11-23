public class Sample4_7 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setcar(1234, 20.5);
        System.out.println(car1);
    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        this.num = 0;
        this.gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setcar(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + this.num + "，汽油量設為" + this.gas);
    }

    @Override
    public String toString() {
        String str = "車號:" + this.num + ";汽油量" + gas;
        return str;
    }
}