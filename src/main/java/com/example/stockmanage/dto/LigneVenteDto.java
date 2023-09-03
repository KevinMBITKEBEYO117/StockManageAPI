package com.example.stockmanage.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private VentesDto vente;

    private ArticleDto article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;
}
