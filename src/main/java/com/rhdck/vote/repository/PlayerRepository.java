package com.rhdck.vote.repository;

import com.rhdck.vote.entity.PartyDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PartyDetail, Integer> {
}
