package com.rhdck.vote.service;

import com.rhdck.vote.dto.Party;
import com.rhdck.vote.dto.PartyDetail;
import com.rhdck.vote.dto.PartyPlayerList;
import com.rhdck.vote.dto.Title;
import com.rhdck.vote.mapper.PartyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartyServiceImpl implements PartyService{
    @Autowired
    private PartyMapper dao;


    @Override
    public List<PartyPlayerList> getList() {
        List<Party> list = dao.getList();

        List<PartyPlayerList> playerLists = new ArrayList<>();

        List<Title> titles = dao.getTitle();

        for(int i=0; i<titles.size(); i++){
            PartyPlayerList temp = new PartyPlayerList();
            temp.setTitle(titles.get(i).getTitle());
            temp.setParty_no(titles.get(i).getParty_no());
            temp.setPlayers(new ArrayList<>());
            playerLists.add(temp);
        }
        List<PartyDetail> getPlayer = dao.getPlayer();
        for(int i=0; i <getPlayer.size(); i++){
            for(int j=0; j < playerLists.size(); j++){
                if(playerLists.get(j).getParty_no() == getPlayer.get(i).getParty_no()){
                    List<PartyDetail> party_detail = playerLists.get(j).getPlayers();
                    party_detail.add(getPlayer.get(i));
                    playerLists.get(j).setPlayers(party_detail);
                    break;
                }
            }
        }
//        System.out.println(playerLists);
        return playerLists;
    }
}
