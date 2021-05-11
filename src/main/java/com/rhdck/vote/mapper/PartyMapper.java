package com.rhdck.vote.mapper;

import com.rhdck.vote.dto.Party;
import com.rhdck.vote.dto.PartyDetail;
import com.rhdck.vote.dto.Title;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Timer;

@Mapper
public interface PartyMapper {
    public List<Party> getList();
    public List<Title> getTitle();
    public List<PartyDetail> getPlayer();
}
