package com.NeoMusic.Core.Permanence.Repositories;

import com.NeoMusic.Core.Permanence.Entities.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreEntity, Integer> {
    
}
