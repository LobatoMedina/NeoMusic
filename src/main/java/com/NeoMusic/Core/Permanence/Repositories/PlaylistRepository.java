package com.NeoMusic.Core.Permanence.Repositories;

import com.NeoMusic.Core.Permanence.Entities.PlaylistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<PlaylistEntity, Long> {

}
