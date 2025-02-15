package com.pchg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    private Integer id;
    private String description;
    private List<Player> players;
    private Integer level;

}
