package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.validation.constraints.Future;
import org.hibernate.validator.constraints.Length;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import com.haulmont.cuba.core.entity.CategorizedEntity;
import javax.validation.constraints.Past;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s %tD|pzCogn,pzNome,pzDtNas")
@Table(name = "PSAOB_PAZIENTE")
@Entity(name = "psaob$Paziente")
public class Paziente extends StandardEntity {
    private static final long serialVersionUID = -1854786045161860647L;

    @Column(name = "PZ_ID", length = 16)
    protected String pzId;

    @NotNull
    @Column(name = "PZ_COGN", nullable = false, length = 40)
    protected String pzCogn;

    @NotNull
    @Column(name = "PZ_NOME", nullable = false, length = 40)
    protected String pzNome;

    @Past(message = "la data di nascita non può essere nel futuro")
    @Temporal(TemporalType.DATE)
    @Column(name = "PZ_DT_NAS")
    protected Date pzDtNas;

    @NotNull
    @Column(name = "PZ_SESSO", nullable = false)
    protected String pzSesso;

    @Length(message = "CF deve essere di 16 caratteri", min = 16, max = 16)
    @Column(name = "PZ_CFIS", length = 16)
    protected String pzCfis;





    @Column(name = "PZ_IND_RES")
    protected String pzIndRes;

    @Column(name = "PZ_NCIV_RES", length = 10)
    protected String pzNcivRes;

    @Column(name = "PZ_TSAN_ID", length = 20)
    protected String pzTsanId;

    @Column(name = "PZ_ASL_APP", length = 10)
    protected String pzAslApp;

    @Column(name = "PZ_TSAN_ISTITUZ_COMP")
    protected String pzTsanIstituzComp;

    @Temporal(TemporalType.DATE)
    @Column(name = "PZ_TSAN_DT_INI")
    protected Date pzTsanDtIni;

    @Temporal(TemporalType.DATE)
    @Column(name = "PZ_TSAN_DT_FIN")
    protected Date pzTsanDtFin;

    @Column(name = "PZ_STP_CODICE", length = 50)
    protected String pzStpCodice;

    @Temporal(TemporalType.DATE)
    @Column(name = "PZ_STP_DT_INI")
    protected Date pzStpDtIni;

    @Temporal(TemporalType.DATE)
    @Column(name = "PZ_STP_DT_FIN")
    protected Date pzStpDtFin;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PZ_CITT_CTID")
    protected SaCittadinanza pzCitt;


    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PZ_COM_NAS_CMID")
    protected SaComune pzComNas;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PZ_COM_RES_CMID")
    protected SaComune pzComRes;

    @Column(name = "PZ_TEL1", length = 25)
    protected String pzTel1;

    public void setPzTel1(String pzTel1) {
        this.pzTel1 = pzTel1;
    }

    public String getPzTel1() {
        return pzTel1;
    }


    public void setPzComNas(SaComune pzComNas) {
        this.pzComNas = pzComNas;
    }

    public SaComune getPzComNas() {
        return pzComNas;
    }

    public void setPzComRes(SaComune pzComRes) {
        this.pzComRes = pzComRes;
    }

    public SaComune getPzComRes() {
        return pzComRes;
    }


    public void setPzCitt(SaCittadinanza pzCitt) {
        this.pzCitt = pzCitt;
    }

    public SaCittadinanza getPzCitt() {
        return pzCitt;
    }


    public void setPzTsanDtIni(Date pzTsanDtIni) {
        this.pzTsanDtIni = pzTsanDtIni;
    }

    public Date getPzTsanDtIni() {
        return pzTsanDtIni;
    }

    public void setPzTsanDtFin(Date pzTsanDtFin) {
        this.pzTsanDtFin = pzTsanDtFin;
    }

    public Date getPzTsanDtFin() {
        return pzTsanDtFin;
    }

    public void setPzStpCodice(String pzStpCodice) {
        this.pzStpCodice = pzStpCodice;
    }

    public String getPzStpCodice() {
        return pzStpCodice;
    }

    public void setPzStpDtIni(Date pzStpDtIni) {
        this.pzStpDtIni = pzStpDtIni;
    }

    public Date getPzStpDtIni() {
        return pzStpDtIni;
    }

    public void setPzStpDtFin(Date pzStpDtFin) {
        this.pzStpDtFin = pzStpDtFin;
    }

    public Date getPzStpDtFin() {
        return pzStpDtFin;
    }


    public void setPzTsanId(String pzTsanId) {
        this.pzTsanId = pzTsanId;
    }

    public String getPzTsanId() {
        return pzTsanId;
    }

    public void setPzTsanIstituzComp(String pzTsanIstituzComp) {
        this.pzTsanIstituzComp = pzTsanIstituzComp;
    }

    public String getPzTsanIstituzComp() {
        return pzTsanIstituzComp;
    }


    public SaGenererMF getPzSesso() {
        return pzSesso == null ? null : SaGenererMF.fromId(pzSesso);
    }

    public void setPzSesso(SaGenererMF pzSesso) {
        this.pzSesso = pzSesso == null ? null : pzSesso.getId();
    }



    public void setPzAslApp(String pzAslApp) {
        this.pzAslApp = pzAslApp;
    }

    public String getPzAslApp() {
        return pzAslApp;
    }


    public void setPzIndRes(String pzIndRes) {
        this.pzIndRes = pzIndRes;
    }

    public String getPzIndRes() {
        return pzIndRes;
    }

    public void setPzNcivRes(String pzNcivRes) {
        this.pzNcivRes = pzNcivRes;
    }

    public String getPzNcivRes() {
        return pzNcivRes;
    }


    public String getPzId() {
        return pzId;
    }

    public void setPzCogn(String pzCogn) {
        this.pzCogn = pzCogn;
    }

    public String getPzCogn() {
        return pzCogn;
    }

    public void setPzNome(String pzNome) {
        this.pzNome = pzNome;
    }

    public String getPzNome() {
        return pzNome;
    }

    public void setPzDtNas(Date pzDtNas) {
        this.pzDtNas = pzDtNas;
    }

    public Date getPzDtNas() {
        return pzDtNas;
    }

    public void setPzCfis(String pzCfis) {
        this.pzCfis = pzCfis;
    }

    public String getPzCfis() {
        return pzCfis;
    }


}