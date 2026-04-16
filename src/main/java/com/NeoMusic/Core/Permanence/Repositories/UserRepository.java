package com.NeoMusic.Core.Permanence.Repositories;

import com.NeoMusic.Core.Permanence.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
