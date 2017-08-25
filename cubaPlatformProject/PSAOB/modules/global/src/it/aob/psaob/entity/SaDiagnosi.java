package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.UUID;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s %s|dgId,descrizione")
@Table(name = "PSAOB_SA_DIAGNOSI")
@Entity(name = "psaob$SaDiagnosi")
public class SaDiagnosi extends BaseStringIdEntity {
    private static final long serialVersionUID = -7809715865570329092L;

    @Column(name = "DESCRIZIONE")
    protected String descrizione;

    @JoinTable(name = "PSAOB_PS_SCHEDA_SA_DGN_LINK",
        joinColumns = @JoinColumn(name = "SA_DIAGNOSI_ID"),
        inverseJoinColumns = @JoinColumn(name = "PS_SCHEDA_ID"))
    @ManyToMany
    protected List<PsScheda> psSchedasDiagnosiCod;

    @Column(name = "CODICE", length = 8)
    protected String codice;

    @Id
    @Column(name = "DGID", nullable = false, length = 11)
    protected String dgId;

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }


    public void setPsSchedasDiagnosiCod(List<PsScheda> psSchedasDiagnosiCod) {
        this.psSchedasDiagnosiCod = psSchedasDiagnosiCod;
    }

    public List<PsScheda> getPsSchedasDiagnosiCod() {
        return psSchedasDiagnosiCod;
    }



    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDgId(String dgId) {
        this.dgId = dgId;
    }

    public String getDgId() {
        return dgId;
    }

    @Override
    public String getId() {
        return dgId;
    }

    @Override
    public void setId(String id) {
        this.dgId = id;
    }


}