package com.rubfitness.app.service;

import com.rubfitness.app.entity.Treino;
import com.rubfitness.app.entity.TipoTreino;
import com.rubfitness.app.models.TreinoDTO;
import com.rubfitness.app.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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


    public List<TreinoDTO> listarTreinos(String tipo) {

        List<Treino> treinos;

        if (tipo != null &&  !tipo.isEmpty()){
            treinos = treinoRepository.findByTipoTreinoDescricao(tipo);
        }else{
             treinos = treinoRepository.findAll();
        }


        return treinos.stream().map(treino ->
                new TreinoDTO(
                        treino.getId(),
                        treino.getDescricao(),
                        treino.getQtdSeries(),
                        treino.getCarga_reconhecimento(),
                        treino.getQtdSeriesValidas(),
                        treino.getCarga_valida(),
                        treino.getPercepcaoEsforco(),
                        treino.getData(),
                        treino.getExercicio() != null ? treino.getExercicio().getNome() : null,
                        treino.getTipoTreino() != null ? treino.getTipoTreino().getDescricao() : null
                )
        ).collect(Collectors.toList());
    }


    public void deletarTreino(Long id) {
        treinoRepository.deleteById(id);
    }
}
