package ir.maktab.model;

import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String email;
    private String phone;
    private String username;
    private String favoriteColor;
    private String birthDate;
    private String ipv4;
    private String ipv6;

}