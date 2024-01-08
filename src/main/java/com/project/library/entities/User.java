package com.project.library.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="User")
@Data
public class User {


    Long userId;
    String username;
    String e_mail;
    String password;
    String Rol;

}
