package com.Abdinahmen.Springboottutorial.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity // it makes this class to interact with the database
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // you don't need to know about it now but learn it next time)
@Data // this is lombok it omits getters and setters and constructors

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

//    @Length(max = 5, min =1)
////    @Size(max = 10, min = 0)
////    @Email
////    @Positive
////    @Negative
////    @PositiveOrZero
////    @NegativeOrZero
////    @Future
////    @FutureOrPresent
////    @Past
////    @PastOrPresent
    @NotBlank(message = "Please add Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
