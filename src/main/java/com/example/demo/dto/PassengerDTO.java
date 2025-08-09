package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PassengerDTO {
    private String id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

}
