package com.rubfitness.app.service;

import com.rubfitness.app.entity.TipoTreino;
import com.rubfitness.app.repository.TipoTreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoTreinoService {

    private final TipoTreinoRepository tipoRepository;

    @Autowired
    public TipoTreinoService(TipoTreinoRepository treinoRepository) {
        this.tipoRepository = treinoRepository;
    }

    public List<TipoTreino> ListarTipos(){
        return tipoRepository.findAll();
    }

    public TipoTreino incluirNovoTipo (TipoTreino tipo){
        return tipoRepository.save(tipo);
    }

    public void deletarTipo(Long id) {
        tipoRepository.deleteById(id);
    }

}
