package com.example.stockmanage.dto;
import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;

    @JsonIgnore
    private UtilisateurDto utilisateur;
}
