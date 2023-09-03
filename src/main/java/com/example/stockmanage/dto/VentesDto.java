package com.example.stockmanage.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VentesDto {

    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    private List<LigneVenteDto> ligneVentes;

    private Integer idEntreprise;
}
