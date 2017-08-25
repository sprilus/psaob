package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PsStatiSchedaEnum implements EnumClass<String> {

    Apertura_Amministrativa("AA"),
    Chiusa("C"),
    Da_Ammettere("AM"),
    Esami_Eseguiti("EE"),
    FastTrack("FT"),
    In_Attesa_di_Triage("AT"),
    In_Attesa_di_Visita("AV"),
    In_Visita("V"),
    In_Visita_Standby("O");

    private String id;

    PsStatiSchedaEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PsStatiSchedaEnum fromId(String id) {
        for (PsStatiSchedaEnum at : PsStatiSchedaEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}