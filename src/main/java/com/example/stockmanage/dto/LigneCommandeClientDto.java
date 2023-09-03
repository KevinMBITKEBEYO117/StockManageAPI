package com.example.stockmanage.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
public class LigneCommandeClientDto {
    private Integer id;

    private ArticleDto article;

    @JsonIgnore
    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

}
