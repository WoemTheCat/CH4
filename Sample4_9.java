public class Sample4_9 {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        cars[0] = new Car();
        cars[1] = new RacingCar();

        for (int i = 0; i < cars.length; i++)
            System.out.println("第" + (i + 1) + "個物件的類別是" + cars[i].getClass());
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
}

class RacingCar extends Car {
    public RacingCar() {
        System.out.println("生產了賽車");
    }
}