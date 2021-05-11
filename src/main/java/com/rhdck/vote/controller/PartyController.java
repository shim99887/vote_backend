package com.rhdck.vote.controller;

import com.rhdck.vote.entity.Party;
import com.rhdck.vote.entity.PartyDetail;
import com.rhdck.vote.repository.PartyRepository;
import com.rhdck.vote.repository.PlayerRepository;
import com.rhdck.vote.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/party")
public class PartyController {

    @Autowired
    private PartyRepository repo;

    @Autowired
    private PlayerRepository repos;

    @Autowired
    private PartyService service;

    @GetMapping
    public List<Party> getAllParty(){
        List<Party> list = repo.findAll();
        System.out.println(list);
        System.out.println(repos.findAll());
//        List<PartyPlayerList> playerLists = new ArrayList<>();
        List<PartyDetail> playerList = repos.findAll();
        for(int i=0; i < playerList.size(); i++){
            for(int j=0; j < list.size(); j++){
                if(list.get(j).getNo() == playerList.get(i).getParty_no()){
                    List<PartyDetail> party = list.get(j).getPlayers();
                    party.add(playerList.get(i));
                    list.get(j).setPlayers(party);
                    break;
                }
            }
        }
        return list;
    }

    @GetMapping("/title")
    public List<Party> getTitles(){
        return repo.findAll();
    }

    @GetMapping("/player")
    public List<PartyDetail> partyLists(){
        return repos.findAll();
    }

    @DeleteMapping
    public void deleteParty(@RequestBody Map<String, String> map){
        System.out.println(map);
        repo.deleteById(Integer.parseInt(map.get("no")));
//        repo.deleteById(Integer.parseInt(map.get("no")));
    }

    @DeleteMapping("/player")
    public void deletePartyDetail(@RequestBody Map<String, String> map){
        repos.deleteById(Integer.parseInt(map.get("no")));
    }

    @PostMapping("/player")
    public void postPlayerToParty(@RequestBody Map<String, String> map){
        System.out.println(map);
        PartyDetail player = new PartyDetail();
        player.setParty_no(Integer.parseInt(map.get("party_no")));
        player.setId(map.get("id"));
        repos.save(player);
    }

    @PostMapping("/{title}")
    public void postParty(@PathVariable String title){
        Party party = new Party();
        party.setTitle(title);
        repo.save(party);
    }
}
