package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

@NamePattern("%s|prDescrB")
@Table(name = "PSAOB_SA_PRESTAZIONI")
@Entity(name = "psaob$SaPrestazioni")
public class SaPrestazioni extends BaseStringIdEntity {
    private static final long serialVersionUID = -5300000384723926062L;

    @Column(name = "PR_CODICE", length = 15)
    protected String prCodice;

    @Column(name = "PR_DESCR_B", length = 150)
    protected String prDescrB;

    @Column(name = "PR_CODMIN", length = 8)
    protected String prCodmin;

    @JoinTable(name = "PSAOB_PR_RICH_SA_PREST_LINK",
        joinColumns = @JoinColumn(name = "SA_PRESTAZIONI_ID"),
        inverseJoinColumns = @JoinColumn(name = "PR_RICHIESTE_ID"))
    @ManyToMany
    protected List<PrRichieste> prRichieste;

    @Id
    @Column(name = "PRID", nullable = false, length = 15)
    protected String prId;

    public void setPrRichieste(List<PrRichieste> prRichieste) {
        this.prRichieste = prRichieste;
    }

    public List<PrRichieste> getPrRichieste() {
        return prRichieste;
    }


    public void setPrCodice(String prCodice) {
        this.prCodice = prCodice;
    }

    public String getPrCodice() {
        return prCodice;
    }

    public void setPrDescrB(String prDescrB) {
        this.prDescrB = prDescrB;
    }

    public String getPrDescrB() {
        return prDescrB;
    }

    public void setPrCodmin(String prCodmin) {
        this.prCodmin = prCodmin;
    }

    public String getPrCodmin() {
        return prCodmin;
    }

    public void setPrId(String prId) {
        this.prId = prId;
    }

    public String getPrId() {
        return prId;
    }

    @Override
    public String getId() {
        return prId;
    }

    @Override
    public void setId(String id) {
        this.prId = id;
    }


}