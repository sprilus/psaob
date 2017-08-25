package it.aob.psaob.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.UUID;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.security.entity.User;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.chile.core.annotations.Composition;

@NamePattern("%s %s|scStruttura,scScheda")
@Table(name = "PSAOB_PS_SCHEDA")
@Entity(name = "psaob$PsScheda")
public class PsScheda extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = 6078559515416821270L;

    @Column(name = "SC_ID")
    protected Long scId;

    @Column(name = "SC_SCHEDA", length = 11)
    protected String scScheda;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SC_STRUTTURA_SRID")
    protected SaStruttura scStruttura;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SC_PAZIENTE")
    protected Paziente scPaziente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SC_DT_INIZIO", nullable = false)
    protected Date scDtInizio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SC_DT_FINE")
    protected Date scDtFine;

    @Column(name = "SC_STATOSK")
    protected String scStatosk="AT";

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SC_CASE_MANAGER")
    protected User scCaseManager;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SC_PROBLEMA_PRINC_ID")
    protected PsProblemaPrincipale scProblemaPrinc;

    @Column(name = "SC_TRG_IN")
    protected Integer scTrgIn;

    @Column(name = "SC_TRG_OUT")
    protected Integer scTrgOut;

    @Column(name = "SC_MOD_ACC")
    protected String scModAcc;

    @Column(name = "SC_ANAMNESI_INFERM")
    protected String scAnamnesiInferm;

    @Column(name = "SC_CAUSA_DICHIARATA_ACC")
    protected String scCausaDichiarataAcc;

    @Lob
    @Column(name = "SC_ANAMNESI_MEDICA1")
    protected String scAnamnesiMedica1;

    @Lob
    @Column(name = "SC_ANAMNESI_MEDICA2")
    protected String scAnamnesiMedica2;

    @Lob
    @Column(name = "SC_ANAMNESI_MEDICA3")
    protected String scAnamnesiMedica3;

    @Lob
    @Column(name = "SC_DIAGNOSI_USCITA_TXT")
    protected String scDiagnosiUscitaTxt;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SC_TIPO_ESITO_CODICE")
    protected PsTipoEsitoTab scTipoEsito;

    @Column(name = "SC_SOLVENTE")
    protected Boolean scSolvente;

    @Lob
    @Column(name = "SC_NOTE_PRESCRIZIONI")
    protected String scNotePrescrizioni;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SC_DT_VISITA")
    protected Date scDtVisita;

    @Lob
    @Column(name = "PS_ESAME_OBIETTIVO")
    protected String psEsameObiettivo;

    @Lob
    @Column(name = "PS_TERAPIA_PRATICATA")
    protected String psTerapiaPraticata;

    @Lob
    @Column(name = "PS_CONCLUSIONI_INDICZIONI")
    protected String psConclusioniIndiczioni;

    @Column(name = "PS_PROGNOSI_GG_CLINICI", length = 10)
    protected String psPrognosiGgClinici;

    @Column(name = "PS_PROGNOSI_GG_LAV", length = 10)
    protected String psPrognosiGgLav;

    @Column(name = "PS_PAZ_RIFIUTO_RICOVERO")
    protected Boolean psPazRifiutoRicovero;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PS_MEDICO_ACC_ID")
    protected User psMedicoAcc;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PS_MEDICO_DIM_ID")
    protected User psMedicoDim;

    @JoinTable(name = "PSAOB_PS_SCHEDA_SA_DGN_LINK",
        joinColumns = @JoinColumn(name = "PS_SCHEDA_ID"),
        inverseJoinColumns = @JoinColumn(name = "SA_DIAGNOSI_ID"))
    @ManyToMany
    protected List<SaDiagnosi> scDiagnosiCod;

    @Composition
    @OneToMany(mappedBy = "psScheda")
    protected List<PrRichieste> scRichiesta;

    @Id
    @Column(name = "ID", nullable = false)
    protected Long id;

    @Column(name = "UUID")
    private UUID uuid;



    public void setScRichiesta(List<PrRichieste> scRichiesta) {
        this.scRichiesta = scRichiesta;
    }

    public List<PrRichieste> getScRichiesta() {
        return scRichiesta;
    }


    public void setScDiagnosiCod(List<SaDiagnosi> scDiagnosiCod) {
        this.scDiagnosiCod = scDiagnosiCod;
    }

    public List<SaDiagnosi> getScDiagnosiCod() {
        return scDiagnosiCod;
    }


    public PsStatiSchedaEnum getScStatosk() {
        return scStatosk == null ? null : PsStatiSchedaEnum.fromId(scStatosk);
    }

    public void setScStatosk(PsStatiSchedaEnum scStatosk) {
        this.scStatosk = scStatosk == null ? null : scStatosk.getId();
    }


    public PsTipoEsitoTab getScTipoEsito() {
        return scTipoEsito;
    }

    public void setScTipoEsito(PsTipoEsitoTab scTipoEsito) {
        this.scTipoEsito = scTipoEsito;
    }


    public SaStruttura getScStruttura() {
        return scStruttura;
    }

    public void setScStruttura(SaStruttura scStruttura) {
        this.scStruttura = scStruttura;
    }


    public void setPsEsameObiettivo(String psEsameObiettivo) {
        this.psEsameObiettivo = psEsameObiettivo;
    }

    public String getPsEsameObiettivo() {
        return psEsameObiettivo;
    }

    public void setPsTerapiaPraticata(String psTerapiaPraticata) {
        this.psTerapiaPraticata = psTerapiaPraticata;
    }

    public String getPsTerapiaPraticata() {
        return psTerapiaPraticata;
    }

    public void setPsConclusioniIndiczioni(String psConclusioniIndiczioni) {
        this.psConclusioniIndiczioni = psConclusioniIndiczioni;
    }

    public String getPsConclusioniIndiczioni() {
        return psConclusioniIndiczioni;
    }

    public void setPsPrognosiGgClinici(String psPrognosiGgClinici) {
        this.psPrognosiGgClinici = psPrognosiGgClinici;
    }

    public String getPsPrognosiGgClinici() {
        return psPrognosiGgClinici;
    }

    public void setPsPrognosiGgLav(String psPrognosiGgLav) {
        this.psPrognosiGgLav = psPrognosiGgLav;
    }

    public String getPsPrognosiGgLav() {
        return psPrognosiGgLav;
    }

    public void setPsPazRifiutoRicovero(Boolean psPazRifiutoRicovero) {
        this.psPazRifiutoRicovero = psPazRifiutoRicovero;
    }

    public Boolean getPsPazRifiutoRicovero() {
        return psPazRifiutoRicovero;
    }

    public void setPsMedicoAcc(User psMedicoAcc) {
        this.psMedicoAcc = psMedicoAcc;
    }

    public User getPsMedicoAcc() {
        return psMedicoAcc;
    }

    public void setPsMedicoDim(User psMedicoDim) {
        this.psMedicoDim = psMedicoDim;
    }

    public User getPsMedicoDim() {
        return psMedicoDim;
    }


    public void setScDtVisita(Date scDtVisita) {
        this.scDtVisita = scDtVisita;
    }

    public Date getScDtVisita() {
        return scDtVisita;
    }


    public PsModalitaAccesso getScModAcc() {
        return scModAcc == null ? null : PsModalitaAccesso.fromId(scModAcc);
    }

    public void setScModAcc(PsModalitaAccesso scModAcc) {
        this.scModAcc = scModAcc == null ? null : scModAcc.getId();
    }



    public void setScSolvente(Boolean scSolvente) {
        this.scSolvente = scSolvente;
    }

    public Boolean getScSolvente() {
        return scSolvente;
    }

    public void setScNotePrescrizioni(String scNotePrescrizioni) {
        this.scNotePrescrizioni = scNotePrescrizioni;
    }

    public String getScNotePrescrizioni() {
        return scNotePrescrizioni;
    }


    public void setScAnamnesiInferm(String scAnamnesiInferm) {
        this.scAnamnesiInferm = scAnamnesiInferm;
    }

    public String getScAnamnesiInferm() {
        return scAnamnesiInferm;
    }

    public void setScCausaDichiarataAcc(String scCausaDichiarataAcc) {
        this.scCausaDichiarataAcc = scCausaDichiarataAcc;
    }

    public String getScCausaDichiarataAcc() {
        return scCausaDichiarataAcc;
    }

    public void setScAnamnesiMedica1(String scAnamnesiMedica1) {
        this.scAnamnesiMedica1 = scAnamnesiMedica1;
    }

    public String getScAnamnesiMedica1() {
        return scAnamnesiMedica1;
    }

    public void setScAnamnesiMedica2(String scAnamnesiMedica2) {
        this.scAnamnesiMedica2 = scAnamnesiMedica2;
    }

    public String getScAnamnesiMedica2() {
        return scAnamnesiMedica2;
    }

    public void setScAnamnesiMedica3(String scAnamnesiMedica3) {
        this.scAnamnesiMedica3 = scAnamnesiMedica3;
    }

    public String getScAnamnesiMedica3() {
        return scAnamnesiMedica3;
    }

    public void setScDiagnosiUscitaTxt(String scDiagnosiUscitaTxt) {
        this.scDiagnosiUscitaTxt = scDiagnosiUscitaTxt;
    }

    public String getScDiagnosiUscitaTxt() {
        return scDiagnosiUscitaTxt;
    }


    public void setScTrgIn(PsUrgenza scTrgIn) {
        this.scTrgIn = scTrgIn == null ? null : scTrgIn.getId();
    }

    public PsUrgenza getScTrgIn() {
        return scTrgIn == null ? null : PsUrgenza.fromId(scTrgIn);
    }

    public void setScTrgOut(PsUrgenza scTrgOut) {
        this.scTrgOut = scTrgOut == null ? null : scTrgOut.getId();
    }

    public PsUrgenza getScTrgOut() {
        return scTrgOut == null ? null : PsUrgenza.fromId(scTrgOut);
    }


    public void setScProblemaPrinc(PsProblemaPrincipale scProblemaPrinc) {
        this.scProblemaPrinc = scProblemaPrinc;
    }

    public PsProblemaPrincipale getScProblemaPrinc() {
        return scProblemaPrinc;
    }


    public void setScDtInizio(Date scDtInizio) {
        this.scDtInizio = scDtInizio;
    }

    public Date getScDtInizio() {
        return scDtInizio;
    }

    public void setScDtFine(Date scDtFine) {
        this.scDtFine = scDtFine;
    }

    public Date getScDtFine() {
        return scDtFine;
    }

    public void setScCaseManager(User scCaseManager) {
        this.scCaseManager = scCaseManager;
    }

    public User getScCaseManager() {
        return scCaseManager;
    }


    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }


    public Long getScId() {
        return scId;
    }

    public String getScScheda() {
        return scScheda;
    }

    public void setScPaziente(Paziente scPaziente) {
        this.scPaziente = scPaziente;
    }

    public Paziente getScPaziente() {
        return scPaziente;
    }

}