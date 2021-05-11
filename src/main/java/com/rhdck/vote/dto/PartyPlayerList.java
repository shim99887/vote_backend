package com.rhdck.vote.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PartyPlayerList {
    int party_no;
    String title;
    List<PartyDetail> players;
}
