package com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.models;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    @NotNull(message = "User code required")
    private Integer userCode;
    @NotEmpty(message = "Name required")
    private String name;
    @NotEmpty(message = "Surname required")
    private String surName;
    @NotEmpty(message = "Account type required")
    private String accountType;
    @NotNull(message = "Account code required")
    private Integer accountCode;
    @NotNull(message = "Balance required")
    private Double balance;

}