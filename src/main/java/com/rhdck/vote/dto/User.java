package com.rhdck.vote.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
public class User {
    private String id;
    private String password;
    private String job;
    private String role;
}
