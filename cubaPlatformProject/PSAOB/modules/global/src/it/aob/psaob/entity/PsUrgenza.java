package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PsUrgenza implements EnumClass<Integer> {

    ROSSO(1),
    GIALLO(2),
    VERDE(3),
    BIANCO(4),
    NERO(5);

    private Integer id;

    PsUrgenza(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PsUrgenza fromId(Integer id) {
        for (PsUrgenza at : PsUrgenza.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}