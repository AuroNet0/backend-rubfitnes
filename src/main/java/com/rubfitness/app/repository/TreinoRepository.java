package com.rubfitness.app.repository;

import com.rubfitness.app.entity.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {
    List<Treino> findByTipoTreinoDescricao(String descricao);
}
