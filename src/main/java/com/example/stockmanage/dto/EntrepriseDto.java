package com.example.stockmanage.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;


    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;
}
