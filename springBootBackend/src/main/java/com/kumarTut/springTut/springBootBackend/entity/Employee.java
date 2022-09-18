package com.kumarTut.springTut.springBootBackend.entity;


import lombok.*;

import javax.persistence.*;

/*  Lombok */

@Getter //Creates Getter Method
@Setter //Creates Setter Method
@NoArgsConstructor //Creates a No Argument Constructor
@AllArgsConstructor //Creates an all Argument Constructor
@Builder

/* JPA */


@Entity //Makes it a JPA Entity
@Table(name = "employees") //Creates/Adds in the table named employees
public class Employee {

    @Id //Provides it with an id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Increases the id of the next instance by 1.

    private long id;

    @Column(name = "first_name", nullable = false)
    /* Creates/Adds a column in the table named as First Name and stores fName in the column.
     * Also checks if the fName is null. If null, throws error. */
    private String fName;

    @Column(name = "last_name")
    /* Creates/Adds a column in the table named as Last Name and stores lName in the column.*/
    private String lName;

    /* Not adding @Column creates a column with default name as that of the variable.
    *  In this case, column name is email. */
    private String email;

}
