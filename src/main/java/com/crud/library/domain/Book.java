package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue
    private long id;
    private String signature;
    private String title;
    private String author;
    private long year;
    @OneToMany(
            targetEntity = Exemplar.class,
            mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private final List<Exemplar> exemplars = new ArrayList<>();
}
