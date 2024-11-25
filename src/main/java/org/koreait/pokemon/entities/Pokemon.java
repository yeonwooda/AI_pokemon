package org.koreait.pokemon.entities;

import lombok.Data;

@Data
public class Pokemon {
    private Long seq;
    private String name; // 한글
    private String nameEn;
    private int weight;
    private int height;
    private int baseExperience;
    private String frontImage;
    private String flavorText; // 설명
    private String types; // 타입1 || 타입 2|| 타입 3
    private String abilities; // 능력 1 | 능력2 | 능력 3
}
