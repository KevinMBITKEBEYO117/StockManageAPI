package com.example.stockmanage.dto;

import com.example.stockmanage.model.EtatCommande;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private EtatCommande etatCommande;

    private ClientDto client;

    private Integer idEntreprise;
}
