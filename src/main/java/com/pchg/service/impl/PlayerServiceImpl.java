package com.pchg.service.impl;

import com.pchg.model.Player;
import com.pchg.repo.IPlayerRepo;
import com.pchg.service.IPlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements IPlayerService {

    private final IPlayerRepo repo;
/*
    public PlayerServiceImpl(IPlayerRepo repo){
        this.repo=repo;
    }
*/
    @Override
    public Player save(Player player) {
        return repo.save(player);
    }

    @Override
    public Player update(Integer id, Player player) {
        return repo.save(player);
    }

    @Override
    public List<Player> findAll() {
        return repo.findAll();
    }

    @Override
    public Player findById(Integer id) {
        return repo.findById(id).orElse(new Player());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
