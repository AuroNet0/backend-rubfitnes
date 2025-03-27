package com.rubfitness.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;
    private int qtdSeries;
    private int carga_reconhecimento;
    private int qtdSeriesValidas;
    private int carga_valida;
    private int percepcaoEsforco;
    private String data;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercicio_id")
    private Exercicio exercicio;
}
