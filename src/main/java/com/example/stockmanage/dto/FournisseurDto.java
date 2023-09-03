package com.example.stockmanage.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numTel;

    private Integer idEntreprise;

    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseurs;
}
