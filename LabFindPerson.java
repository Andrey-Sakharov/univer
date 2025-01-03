package src;

import java.util.ArrayList;
import java.util.List;

public class LabFindPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Олег", 18, new Address("Москва", "Арбат", 5)));
        persons.add(new Person("Елена", 25, new Address("Москва", "Тверская", 12)));
        persons.add(new Person("Иван", 32, new Address("Санкт-Петербург", "Невский", 22)));
        persons.add(new Person("Анна", 28, new Address("Москва", "Арбат", 15)));
        persons.add(new Person("Дмитрий", 45, new Address("Казань", "Баумана", 8)));
        persons.add(new Person("Мария", 21, new Address("Санкт-Петербург", "Литейный", 3)));
        persons.add(new Person("Сергей", 38, new Address("Москва", "Тверская", 28)));
        persons.add(new Person("Ольга", 29, new Address("Казань", "Кремлевская", 7)));
        persons.add(new Person("Алексей", 41, new Address("Москва", "Арбат", 32)));
        persons.add(new Person("Наталья", 35, new Address("Санкт-Петербург", "Невский", 55)));
        persons.add(new Person("Владимир", 27, new Address("Казань", "Баумана", 18)));

        List<Person> filter = findPersons(persons, null ,"Москва", null);
        for (Person person : filter) {
            person.getPerson();
        }
    }

    public static List<Person> findPersons(List<Person> persons, Integer age, String city, String street) {
        List<Person> output = new ArrayList<Person>();
        for (Person person : persons) {
            boolean pers = true;
            if (age != null){
//                if (age != person.getAge()){pers = false;}
            }

            if (city != null){
                if (city != person.getAddress().getCity()){pers = false;}
            }

            if (street != null){
                if (street != person.getAddress().getStreet()){pers = false;}
            }
            if (pers){output.add(person);}
        }
        return output;
    }
}