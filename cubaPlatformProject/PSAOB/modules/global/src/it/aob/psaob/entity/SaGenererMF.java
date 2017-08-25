package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum SaGenererMF implements EnumClass<String> {

    Maschio("M"),
    Femmina("F");

    private String id;

    SaGenererMF(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SaGenererMF fromId(String id) {
        for (SaGenererMF at : SaGenererMF.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}