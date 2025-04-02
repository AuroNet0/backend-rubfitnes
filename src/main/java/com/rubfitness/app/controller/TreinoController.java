package com.rubfitness.app.controller;

import com.rubfitness.app.entity.Treino;
import com.rubfitness.app.models.TreinoDTO;
import com.rubfitness.app.service.TreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/treinos")
@CrossOrigin(origins = "*")
public class TreinoController {

    @Autowired
    private final TreinoService treinoService;

    @Autowired
    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @GetMapping("/{id}")
    public Optional<Treino> buscarTreino(@PathVariable Long id) {
        return treinoService.buscarTreinoPorId(id);
    }

    @GetMapping
    public ResponseEntity<List<TreinoDTO>> buscarTreino(
            @RequestParam(value = "tipo" , required = false)String tipo) {
        return ResponseEntity.ok(treinoService.listarTreinos(tipo));
    }

    @PostMapping
    public Treino salvarTreino(@RequestBody Treino treino) {
        return treinoService.salvarTreino(treino);
    }

    @DeleteMapping("/{id}")
    public void deletarTreino(@PathVariable Long id) {
        treinoService.deletarTreino(id);
    }
}
