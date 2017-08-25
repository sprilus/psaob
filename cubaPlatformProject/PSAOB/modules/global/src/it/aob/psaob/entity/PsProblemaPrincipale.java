package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.UUID;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|descrizione")
@Table(name = "PSAOB_PS_PROBLEMA_PRINCIPALE")
@Entity(name = "psaob$PsProblemaPrincipale")
public class PsProblemaPrincipale extends BaseStringIdEntity implements HasUuid {
    private static final long serialVersionUID = 3581923726873559027L;

    @Column(name = "CODICE", length = 2)
    protected String codice;

    @Column(name = "DESCRIZIONE")
    protected String descrizione;

    @Id
    @Column(name = "ID", nullable = false, length = 2)
    protected String id;

    @Column(name = "UUID")
    private UUID uuid;

    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }


    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }


}