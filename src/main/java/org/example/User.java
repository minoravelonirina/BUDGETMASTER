package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor

public class User {
    private String lastname;
    private String firstname;
    private ProfilUser profilUser;
    private LocalDate birthday;
    private String address;
    private String contact;
    private String email;

    
}
