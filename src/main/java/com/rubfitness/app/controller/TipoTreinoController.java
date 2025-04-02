package com.rubfitness.app.controller;

import com.rubfitness.app.entity.TipoTreino;
import com.rubfitness.app.service.TipoTreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos")
@CrossOrigin(origins = "*")
public class TipoTreinoController {

    @Autowired
    private final TipoTreinoService tipoService;

    @Autowired
    public TipoTreinoController(TipoTreinoService tipoService) {
        this.tipoService = tipoService;
    }

    @GetMapping
    public List<TipoTreino> listar (){
        return tipoService.ListarTipos();
    }

    @PostMapping
    public TipoTreino novoTipo(@RequestBody TipoTreino tipo) {
        return tipoService.incluirNovoTipo(tipo);
    }

    @DeleteMapping("/{id}")
    public void deletarTreino(@PathVariable Long id) {
        tipoService.deletarTipo(id);
    }

}
