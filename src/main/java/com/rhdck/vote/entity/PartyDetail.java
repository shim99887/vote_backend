package com.rhdck.vote.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Getter
@Setter
@ToString
@Table(name = "party_detail")
public class PartyDetail {
    @Id
    @Column(name = "no")
    int no;
    String id;
    int party_no;

    @ManyToOne
    @JoinColumn(name = "party_no", referencedColumnName = "party_no", nullable = false, updatable = false, insertable = false)
    @JsonIgnore
    private Party party;
}
