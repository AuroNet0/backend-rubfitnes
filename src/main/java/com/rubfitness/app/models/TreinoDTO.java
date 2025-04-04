package com.rubfitness.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TreinoDTO {
    private int id;
    private String descricao;
    private int qtdSeries;
    private int cargaReconhecimento;
    private int qtdSeriesValidas;
    private int cargaValida;
    private int percepcaoEsforco;
    private Date data;
    private String exercicioNome;
    private String tipoTreinoDescricao;
}
