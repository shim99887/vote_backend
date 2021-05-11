package com.rhdck.vote.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Party {
    int party_no;
    String title;
    String id;
    int no;
}
