public class Sample4_12 {
    public static void main(String[] args) {
        iVehicle[] ivc = new iVehicle[2];

        ivc[0] = new Car(1234, 0.5);
        ivc[1] = new Plane(232);

        for (int i = 0; i < ivc.length; i++)
            ivc[i].show();
    }
}

interface iVehicle {
    int weight = 1000;

    void show();
}

class Car implements iVehicle {
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
    }
}

class Plane implements iVehicle {
    private int flight;

    public Plane(int f) {
        this.flight = f;
        System.out.println("生產了" + this.flight + "班次的飛機");
    }

    @Override
    public void show() {
        System.out.println("飛機的班次是" + this.flight);
    }
}