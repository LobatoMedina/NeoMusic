package com.NeoMusic.Core.Permanence.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_ope_playlist")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PlaylistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long playlistId;
    private String playlistName;
    private int playlistDurationSeconds;
    private int playlistTrackCount;
    private String playlistDescription;
    private Boolean  playlistIsPrivate;
    private Boolean playlistIsActive;
}
