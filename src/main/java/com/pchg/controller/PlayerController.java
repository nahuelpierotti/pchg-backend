package com.pchg.controller;

import com.pchg.model.Player;
import com.pchg.service.IPlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {

    private final IPlayerService service;
/*
    public PlayerController(IPlayerService service){
        this.service=service;

    }
*/
    @GetMapping
    public List<Player> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Player getById(@PathVariable("id")Integer id){
        return service.findById(id);
    }
}
