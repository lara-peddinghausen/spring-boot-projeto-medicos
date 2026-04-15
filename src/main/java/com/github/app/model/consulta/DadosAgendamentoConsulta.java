package com.github.app.model.consulta;

import java.time.LocalDateTime;


public record DadosAgendamentoConsulta(

    Integer medicoId,  // para pegar o id do médico
    Integer pacienteId, // para pegar o id do paciente
    String observacao,
    Status status,
    LocalDateTime data
) {
    
}
