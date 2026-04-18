package com.NeoMusic.Core.Permanence.Repositories;

import com.NeoMusic.Core.Permanence.Entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

}
