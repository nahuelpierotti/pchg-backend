package com.pchg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    private Integer id;
    private String description;
    private List<Skill> skills;
}
