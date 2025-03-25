package com.rubfitness.app.service;

import com.rubfitness.app.entity.Treino;
import com.rubfitness.app.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreinoService {

    private final TreinoRepository treinoRepository;

    @Autowired
    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    public Treino salvarTreino(Treino treino) {
        return treinoRepository.save(treino);
    }

    public Optional<Treino> buscarTreinoPorId(Long id) {
        return treinoRepository.findById(id);
    }

    public List<Treino> listarTreinos() {
        return treinoRepository.findAll();
    }

    public void deletarTreino(Long id) {
        treinoRepository.deleteById(id);
    }
}
