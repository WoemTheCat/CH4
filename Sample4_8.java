public class Sample4_8 {
    public static void main(String[] args) {
        Car car1 = new Car(), car2 = new Car();
        Car car3 = car1;

        System.out.println("car1與car2相同" + car1.equals(car2));
        System.out.println("car1與car3相同" + car1.equals(car3));
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