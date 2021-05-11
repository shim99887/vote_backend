package com.rhdck.vote.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "party")
public class Party {
    @Id
    @Column(name = "party_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int no;
    @Column(name = "title")
    String title;

//    @JoinColumn(name = "party_no", nullable = true)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PartyDetail> players = new ArrayList<>();

    public void addDetails(PartyDetail detail){
        players.add(detail);
        detail.setParty(this);
    }
}
