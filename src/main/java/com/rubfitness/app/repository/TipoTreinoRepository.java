package com.rubfitness.app.repository;

import com.rubfitness.app.entity.TipoTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTreinoRepository extends JpaRepository<TipoTreino, Long> {
}
