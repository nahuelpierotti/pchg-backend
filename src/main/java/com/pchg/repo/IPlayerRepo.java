package com.pchg.repo;

import com.pchg.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerRepo extends JpaRepository<Player,Integer> {
}
