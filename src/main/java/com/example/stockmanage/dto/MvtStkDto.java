package com.example.stockmanage.dto;

import com.example.stockmanage.model.SourceMvtStk;
import com.example.stockmanage.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvt;

    private SourceMvtStk sourceMvt;

    private Integer idEntreprise;
}
