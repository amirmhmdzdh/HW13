package ir.maktab;

import ir.maktab.mockdata.MockData;
import ir.maktab.model.Person;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = MockData.getPeople();

//        //TODO Q1
//
//        List<Person> CustomAge = personList.stream()
//                .filter(p -> p.getAge() < 50).toList();
//        for (Person person : CustomAge)
//            System.out.println(person);


        //TODO Q2

//        List<Person> username = personList.stream().sorted(new Comparator<Person>() {
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getUsername().compareTo(o2.getUsername());
//            }
//        }).toList();
//
//        username.forEach(p -> System.out.println(p.getUsername()));


        //TODO Q3

//        List<Person> sortedPeople = personList.stream()
//                .sorted(Comparator.comparing(Person::getAge)
//                        .thenComparing(Person::getLastName))
//                .toList();
//        sortedPeople.forEach(p -> System.out.println(p.getAge() + " " + p.getLastName()));


        //TODO Q4

//        List<String> ipv4Address = personList.stream()
//                .map(Person::getIpv4)
//                .toList();
//        ipv4Address.forEach(System.out::println);

        //TODO Q5

//        Map<String, Person> filteredList = personList.stream()
//                .sorted(Comparator.comparing(Person::getLastName))
//                .filter(person -> person.getGender().equals("Female") && person.getAge() < 40 || person.getGender().equals("Male"))
//                .sorted(Comparator.comparing(Person::getFirstName))
//                .dropWhile(person -> person.getFirstName().startsWith("A"))
//                .skip(5)
//                .limit(100)
//                .collect(Collectors.toMap(
//                        person -> person.getFirstName() + " " + person.getLastName(),
//                        person -> person,
//                        (existing, replacement) -> replacement
//
//                ));
//
//        for (Map.Entry<String, Person> entry : filteredList.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        //TODO Q6




    }
}

