package day_0805;

class Car{}
class Bus extends Car{}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar{}

public class _02_TypeChange {
    public static void main(String[] args) {
        Car c1 = new SchoolBus();

        Bus b1 = new Bus();
        Bus b2 = new SchoolBus();

        Car c2 = new OpenCar();
        Car c3 = new SportsCar();
        OpenCar oc = new SportsCar();

//        Bus b3 = new OpenCar();




    }
}
