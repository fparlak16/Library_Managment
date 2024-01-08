package com.project.library.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name="Browwing")
@Data
public class Browwing {

    @Id
    Long processId;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @JsonIgnore
    Long book_Id;
    LocalDate Browwing_date;
    LocalDate Return_date;
    LocalDate Real_Return_date;


}
