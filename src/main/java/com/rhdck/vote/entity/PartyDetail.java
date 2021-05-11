package com.rhdck.vote.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "party_detail")
public class PartyDetail {
    @Id
    @Column(name = "no")
    int no;
    String id;
    int party_no;

    @ManyToOne
    @JoinColumn(name = "party_no", referencedColumnName = "party_no", nullable = false, updatable = false, insertable = false)
    private Party party;
}
