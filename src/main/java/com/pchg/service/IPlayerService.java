package com.pchg.service;

import com.pchg.model.Player;

import java.util.List;

public interface IPlayerService {
    Player save(Player player);
    Player update(Integer id,Player player);
    List<Player> findAll();
    Player findById(Integer id);
    void delete(Integer id);
}
