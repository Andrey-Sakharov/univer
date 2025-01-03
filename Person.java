package src;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
// имя
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
// возраст
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
// адрес
    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}

    public void getPerson(){
        System.out.println("Имя: " + this.name + ", Возраст: " + this.age + ", Город: " + this.address.getCity() + ", Улица: " + this.address.getStreet() + ", Дом: " + this.address.getHouseNumber());
    }
}