package com.example.expense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@AllArgsConstructor //All of them
@NoArgsConstructor //for JPA not to make a confl-> empty constuctor
@Entity
@Table(name = "user")
@Data
public class User {
    @Id //a primary key

    private Long id;
    //How Lombok works- creats by default @Getter @Setter Upper
    private String name;
    private String email;


    //One user can have a lot categories -dependencies
    @OneToMany
    private Set<Category> category; //removes all the dublicates
}
