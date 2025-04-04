package com.rubfitness.app.controller;

import com.rubfitness.app.entity.Exercicio;
import com.rubfitness.app.service.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    @Autowired
    private final ExercicioService exercicioService;

    @Autowired
    public ExercicioController(ExercicioService exercicioService) {
        this.exercicioService = exercicioService;
    }
    @PostMapping
    public Exercicio salvarExercicio(@RequestBody Exercicio exercicio) {
        return exercicioService.salvarExercicio(exercicio);
    }
    @GetMapping("/{id}")
    public Optional<Exercicio> buscarExercicio(@PathVariable Long id) {
        return exercicioService.buscarExercicioPorId(id);
    }
    @GetMapping
    public List<Exercicio> listarExercicios() {
        return exercicioService.listarExercicios();
    }
    @DeleteMapping("/{id}")
    public void deletarExercicio(@PathVariable Long id) {
        exercicioService.deletarExercicio(id);
    }
}
