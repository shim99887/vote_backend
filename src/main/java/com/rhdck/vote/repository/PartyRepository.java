package com.rhdck.vote.repository;

import com.rhdck.vote.entity.Party;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PartyRepository extends JpaRepository<Party, Integer>{

}
