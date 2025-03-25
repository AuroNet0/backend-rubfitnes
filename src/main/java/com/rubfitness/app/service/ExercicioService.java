package com.rubfitness.app.service;

import com.rubfitness.app.entity.Exercicio;
import com.rubfitness.app.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExercicioService {

    private final ExercicioRepository exercicioRepository;

    @Autowired
    public ExercicioService(ExercicioRepository exercicioRepository) {
        this.exercicioRepository = exercicioRepository;
    }

    public Exercicio salvarExercicio(Exercicio exercicio) {
        return (Exercicio) exercicioRepository.save(exercicio);
    }

    public Optional<Exercicio> buscarExercicioPorId(Long id) {
        return exercicioRepository.findById(id);
    }

    public List<Exercicio> listarExercicios() {
        return exercicioRepository.findAll();
    }

    public void deletarExercicio(Long id) {
        exercicioRepository.deleteById(id);
    }
}
