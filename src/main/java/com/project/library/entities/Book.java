package com.project.library.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Book")
@Data
public class Book {
        @Id
        List<Browwing> browwings=new ArrayList<>();
        @Id
        @OneToMany
        @JoinColumn(name = "bookId")
        private Browwing browwing;
        @JsonIgnore
        String Book_name;
        String Author;
        Long publication_year;
        Long stock;
}
