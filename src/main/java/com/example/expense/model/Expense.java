package com.example.expense.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="expense")
public class Expense {
    @Id
    private Long id;

    private Instant expensedate; //Used for a time stamp

    private String descript;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    /*
    Example:
    ID(PK),    Date,        Description,      UserID,  CategoryID
    100,    10.11.2020,     "Trip to Canada",    2,       10
     */


}
