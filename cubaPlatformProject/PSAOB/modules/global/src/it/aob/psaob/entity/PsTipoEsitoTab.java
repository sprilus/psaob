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
@Table(name = "PSAOB_PS_TIPO_ESITO_TAB")
@Entity(name = "psaob$PsTipoEsitoTab")
public class PsTipoEsitoTab extends BaseStringIdEntity {
    private static final long serialVersionUID = 7833213524995707091L;

    @Column(name = "DESCRIZIONE", length = 100)
    protected String descrizione;

    @Id
    @Column(name = "CODICE", nullable = false, length = 11)
    protected String codice;


    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    @Override
    public String getId() {
        return codice;
    }

    @Override
    public void setId(String id) {
        this.codice = id;
    }


}