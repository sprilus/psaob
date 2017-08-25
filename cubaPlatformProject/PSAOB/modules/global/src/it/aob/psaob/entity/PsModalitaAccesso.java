package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PsModalitaAccesso implements EnumClass<String> {

    Ambulanza_118("90000000150"),
    Unita_Medicalizzata_118("90000000151"),
    Altra_Ambulanza("90000000152"),
    Autonomo("90000000153"),
    Elicottero_118("90000000154"),
    Altro_Elicottero("90000000155"),
    Altro("90000000157"),
    Non_rilevato("90000000158");

    private String id;

    PsModalitaAccesso(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PsModalitaAccesso fromId(String id) {
        for (PsModalitaAccesso at : PsModalitaAccesso.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}