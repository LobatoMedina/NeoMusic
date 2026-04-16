package com.NeoMusic.Core.Permanence.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_ope_image")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;
    private String imageUrl;
}
