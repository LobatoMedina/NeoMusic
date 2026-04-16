package com.NeoMusic.Core.Permanence.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_cat_discography_type")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class DiscographyTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer discographyTypeId;
    private String discographyTypeName;
}
