package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PsTipoEsito implements EnumClass<String> {

    Giunto_cadavere("90000000114"),
    Trasferito_altra_struttura("90000000115"),
    Deceduto_in_Pronto_Soccorso("90000000116"),
    Non_risponde_a_chiamata("90000000117"),
    A_domicilio("90000000118"),
    Ricovero_ospedaliero("90000000119"),
    Paziente_rifiuta_ricovero_ospedaliero("90000000120"),
    Non_rientra_da_consulenza("90000000121"),
    OBI("90000000122"),
    Ricovero_dopo_consulenza("90000000227"),
    Si_allontana_prima_della_conclusione("90000000228"),
    Rfiuta_OBI("90000000232"),
    Passato_in_cura_allo_specialista("90000001374"),
    Scheda_annullata("90000000675");

    private String id;

    PsTipoEsito(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PsTipoEsito fromId(String id) {
        for (PsTipoEsito at : PsTipoEsito.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}