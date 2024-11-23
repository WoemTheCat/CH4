public class Sample4_10 {
    public static void main(String[] args) {
        Vehicle[] vc = new Vehicle[2];

        vc[0] = new Car(1234, 0.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        for (int i = 0; i < vc.length; i++)
            vc[i].show();
    }
}

abstract class Vehicle {
    protected int speed;

    public void setSpeed(int s) {
        this.speed = s;
        System.out.println("將速度設為" + this.speed + "了");
    }

    abstract void show();
}

class Car extends Vehicle {
    private int num;
    private double gas;

    public Car(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("生產了車號為" + this.num + "，汽油量為" + this.gas + "的車子");
    }

    @Override
    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
        System.out.println("速度是" + this.speed);
    }
}

class Plane extends Vehicle {
    private int flight;

    public Plane(int f) {
        this.flight = f;
        System.out.println("生產了" + this.flight + "班次的飛機");
    }

    @Override
    public void show() {
        System.out.println("飛機的班次是" + this.flight);
        System.out.println("速度是" + this.speed);
    }
}