package com.project.library.entities;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name="Fine")
@Data
public class Fine {


    @Id


    Long fineId;
    Long processId;
    Long Fine_amount;
    String Fine_Status;

}
