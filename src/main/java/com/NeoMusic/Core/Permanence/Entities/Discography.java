package com.NeoMusic.Core.Permanence.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_ope_discography")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Discography {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long discographyId;
    private String discographyName;
    private String discographyTypeId;
    
}
