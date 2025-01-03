package src;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage = 0;
    private int fuelLevel = 100;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
// методы геттеры
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getYear() {return year;}
    public int getMileage() {return mileage;}
    public int getFuelLevel() {return fuelLevel;}
// методы сеттеры
    public void setYear(int year) {this.year = year;}
    public void setFuelLevel(int fuelLevel) {this.fuelLevel = fuelLevel;}
// метод drive
    public void drive(int distance) {
        fuelLevel -= distance / 10;
        mileage += distance;
        if (fuelLevel < 0) {System.out.println("Недостаточно топлива для поездки на " + distance + " км");fuelLevel=100;mileage=0;}
    }
// метод refuel
    public void refuel(int amount) {
        this.fuelLevel+=amount;
        if (fuelLevel > 100) {this.fuelLevel = 100;
        System.out.println("Бак полон");}
    }

    public void showMeInfo(){
        System.out.println(this.brand+" "+this.model+"  "+"Год выпуска "+this.year+"   "+"Пробег "+mileage+" "+"Топливо "+this.fuelLevel);
    }
}
