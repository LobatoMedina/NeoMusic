package com.NeoMusic.Core.Permanence.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_cat_genre")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int genreId;
    private String genreGenre;


}
