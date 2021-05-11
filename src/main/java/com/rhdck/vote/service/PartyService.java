package com.rhdck.vote.service;

import com.rhdck.vote.dto.Party;
import com.rhdck.vote.dto.PartyPlayerList;

import java.util.List;

public interface PartyService {
    public List<PartyPlayerList> getList();
}
