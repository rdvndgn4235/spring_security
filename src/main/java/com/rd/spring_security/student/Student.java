package com.rd.spring_security.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created at 26.05.2022.
 *
 * @author Ridvan Dogan
 */
@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
}
