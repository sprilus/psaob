package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.UUID;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|srCodice")
@Table(name = "PSAOB_SA_STRUTTURA")
@Entity(name = "psaob$SaStruttura")
public class SaStruttura extends BaseStringIdEntity implements HasUuid {
    private static final long serialVersionUID = -4541217524356246416L;

    @Column(name = "SR_CODICE", length = 30)
    protected String srCodice;

    @Column(name = "SR_DESC")
    protected String srDesc;

    @Column(name = "SR_RESPONSABILE")
    protected String srResponsabile;

    @Column(name = "SR_TEL", length = 18)
    protected String srTel;

    @Column(name = "SR_FAX", length = 18)
    protected String srFax;

    @Column(name = "SR_TIPO", length = 10)
    protected String srTipo;

    @Id
    @Column(name = "SRID", nullable = false, length = 11)
    protected String srId;

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


    public void setSrCodice(String srCodice) {
        this.srCodice = srCodice;
    }

    public String getSrCodice() {
        return srCodice;
    }

    public void setSrDesc(String srDesc) {
        this.srDesc = srDesc;
    }

    public String getSrDesc() {
        return srDesc;
    }

    public void setSrResponsabile(String srResponsabile) {
        this.srResponsabile = srResponsabile;
    }

    public String getSrResponsabile() {
        return srResponsabile;
    }

    public void setSrTel(String srTel) {
        this.srTel = srTel;
    }

    public String getSrTel() {
        return srTel;
    }

    public void setSrFax(String srFax) {
        this.srFax = srFax;
    }

    public String getSrFax() {
        return srFax;
    }

    public void setSrTipo(String srTipo) {
        this.srTipo = srTipo;
    }

    public String getSrTipo() {
        return srTipo;
    }

    public void setSrId(String srId) {
        this.srId = srId;
    }

    public String getSrId() {
        return srId;
    }

    @Override
    public String getId() {
        return srId;
    }

    @Override
    public void setId(String id) {
        this.srId = id;
    }


}