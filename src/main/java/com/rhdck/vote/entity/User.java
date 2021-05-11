package com.rhdck.vote.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    private String id;
    private String password;
    private String job;
    private String role;
}
