package com.github.app.model.consulta;

import java.time.LocalDateTime;


public record DadosAgendamentoConsulta(

    Integer medicoId,  // id do médico que será associado à consulta
    Integer pacienteId, // id do paciente que será associado à consulta
    String observacao,
    Status status,
    LocalDateTime data
) {
    
}
