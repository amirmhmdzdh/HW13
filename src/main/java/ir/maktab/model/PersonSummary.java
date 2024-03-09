package ir.maktab.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonSummary {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Date birthDate;

}