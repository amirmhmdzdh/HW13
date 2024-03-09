package ir.maktab;

import ir.maktab.mockdata.MockData;
import ir.maktab.model.Person;
import ir.maktab.model.PersonSummary;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

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

        List<Long> maleAges = personList.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("male"))
                .map(person -> {
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date birthDate = dateFormat.parse(person.getBirthDate());
                        return new PersonSummary(person.getId(), person.getFirstName(), person.getLastName(), person.getAge(), birthDate);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .map(personSummary -> {
                    Date birthDate = personSummary.getBirthDate();
                    Date currentDate = new Date();
                    long years = ChronoUnit.YEARS.between(
                            birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                            currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    );
                    return years;
                })
                .toList();

        OptionalDouble averageAge = maleAges.stream().mapToLong(Long::valueOf).average();
        if (averageAge.isPresent()) {
            float age = (float) averageAge.getAsDouble();
            System.out.println("Average Age: " + age);
        }

        maleAges.forEach(System.out::println);
    }
}