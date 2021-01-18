package com.rgr.msfilme.model.enumeracoes.conversores;


import javax.persistence.AttributeConverter;

import com.rgr.msfilme.model.enumeracoes.Estado;

public class EstadoConverter implements AttributeConverter<Estado, String> {
    @Override
    public String convertToDatabaseColumn(Estado etapa) {
        return etapa != null ? etapa.getSigla() : null;
    }

    @Override
    public Estado convertToEntityAttribute(String codigo) {
        try {
            return Estado.getByUf(codigo);
        } catch (Exception ex) {
            return Estado.getByOrdinal(codigo);
        }
    }
}