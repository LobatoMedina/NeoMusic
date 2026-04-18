package com.NeoMusic.Core.Permanence.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_ope_track")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class TrackEntity {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private Long trackId;
    private String trackName;
    private int trackDurationSeconds;
    private Boolean trackIsExplicit;
}
