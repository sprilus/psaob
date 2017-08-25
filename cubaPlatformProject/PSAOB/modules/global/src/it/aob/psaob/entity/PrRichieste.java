package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import com.haulmont.cuba.security.entity.User;

@NamePattern("%s %s|ricCode,ricPaziente")
@Table(name = "PSAOB_PR_RICHIESTE")
@Entity(name = "psaob$PrRichieste")
public class PrRichieste extends BaseStringIdEntity {
    private static final long serialVersionUID = -8071869141000391116L;

    @Column(name = "RIC_POS_ERO")
    protected String ricPosEro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RIC_DRIC")
    protected Date ricDric;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RIC_PAZIENTE_ID")
    protected Paziente ricPaziente;

    @Column(name = "RIC_URGENZA")
    protected String ricUrgenza;

    @JoinTable(name = "PSAOB_PR_RICH_SA_PREST_LINK",
        joinColumns = @JoinColumn(name = "PR_RICHIESTE_ID"),
        inverseJoinColumns = @JoinColumn(name = "SA_PRESTAZIONI_ID"))
    @ManyToMany
    protected List<SaPrestazioni> ricPrestazioni;

    @Column(name = "RIC_NOTE", length = 4000)
    protected String ricNote;

    @Column(name = "RIC_QUESITO_DIAGNOSTICO", length = 1000)
    protected String ricQuesitoDiagnostico;

    @Column(name = "RIC_CODICE", length = 12)
    protected String ricCodice;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RIC_MEDICO_RIC_ID")
    protected User ricMedicoRic;

    @Id
    @Column(name = "RICCODE", nullable = false, length = 12)
    protected String ricCode;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PS_SCHEDA_ID")
    protected PsScheda psScheda;

    public void setPsScheda(PsScheda psScheda) {
        this.psScheda = psScheda;
    }

    public PsScheda getPsScheda() {
        return psScheda;
    }


    public void setRicMedicoRic(User ricMedicoRic) {
        this.ricMedicoRic = ricMedicoRic;
    }

    public User getRicMedicoRic() {
        return ricMedicoRic;
    }


    public String getRicCodice() {
        return ricCodice;
    }


    public SaErogatori getRicPosEro() {
        return ricPosEro == null ? null : SaErogatori.fromId(ricPosEro);
    }

    public void setRicPosEro(SaErogatori ricPosEro) {
        this.ricPosEro = ricPosEro == null ? null : ricPosEro.getId();
    }




    public PrLivelliUrgenza getRicUrgenza() {
        return ricUrgenza == null ? null : PrLivelliUrgenza.fromId(ricUrgenza);
    }

    public void setRicUrgenza(PrLivelliUrgenza ricUrgenza) {
        this.ricUrgenza = ricUrgenza == null ? null : ricUrgenza.getId();
    }


    public void setRicQuesitoDiagnostico(String ricQuesitoDiagnostico) {
        this.ricQuesitoDiagnostico = ricQuesitoDiagnostico;
    }

    public String getRicQuesitoDiagnostico() {
        return ricQuesitoDiagnostico;
    }



    public void setRicPrestazioni(List<SaPrestazioni> ricPrestazioni) {
        this.ricPrestazioni = ricPrestazioni;
    }

    public List<SaPrestazioni> getRicPrestazioni() {
        return ricPrestazioni;
    }

    public void setRicNote(String ricNote) {
        this.ricNote = ricNote;
    }

    public String getRicNote() {
        return ricNote;
    }


    public void setRicDric(Date ricDric) {
        this.ricDric = ricDric;
    }

    public Date getRicDric() {
        return ricDric;
    }

    public Paziente getRicPaziente() {
        return ricPaziente;
    }

    public void setRicCode(String ricCode) {
        this.ricCode = ricCode;
    }

    public String getRicCode() {
        return ricCode;
    }

    @Override
    public String getId() {
        return ricCode;
    }

    @Override
    public void setId(String id) {
        this.ricCode = id;
    }


}