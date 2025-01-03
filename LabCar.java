package src;

public class LabCar {
    public static void main(String[] args) {
        Car auto = new Car("Audi", "RS 6 (C8)", 2019);
        Car auto1 = new Car("Dodge","Challenger SRT Demon 170",2023);
        Car auto2 = new Car("Toyota","Crown S170",2001);

        auto.setFuelLevel(100);
        auto.drive(10);
        auto.refuel(0);
        auto.showMeInfo();

        auto1.setFuelLevel(100);
        auto1.drive(100);
        auto1.refuel(0);
        auto1.showMeInfo();

        auto2.setFuelLevel(100);
        auto2.drive(90);
        auto2.refuel(0);
        auto2.showMeInfo();

    }
}
