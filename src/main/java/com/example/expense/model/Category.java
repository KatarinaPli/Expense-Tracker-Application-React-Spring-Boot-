package com.example.expense.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name= "category")
@Data

public class Category {
    @Id
    private Long id;
    //Travel, Grocery and so on for instance
    private String name;

    //Many categories can be connected to one user
    @ManyToOne(cascade = CascadeType.PERSIST)//will cascade trough the operation
    private User user;

}
