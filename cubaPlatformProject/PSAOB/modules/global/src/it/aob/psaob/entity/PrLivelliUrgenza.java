package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PrLivelliUrgenza implements EnumClass<String> {

    Ordinario("Ordinario"),
    Urgente("Urgente"),
    Urgentissima_trasfusionale("Urgentissima");

    private String id;

    PrLivelliUrgenza(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PrLivelliUrgenza fromId(String id) {
        for (PrLivelliUrgenza at : PrLivelliUrgenza.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}