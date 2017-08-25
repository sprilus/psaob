package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.UUID;
import java.util.Date;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern(" %s|cmDesc")
@Table(name = "PSAOB_SA_COMUNE")
@Entity(name = "psaob$SaComune")
public class SaComune extends BaseStringIdEntity implements HasUuid {
    private static final long serialVersionUID = 5662615241282566983L;

    @Column(name = "CM_CISTAT", nullable = false, length = 8)
    protected String cmCistat;

    @Column(name = "CM_DESC")
    protected String cmDesc;

    @Column(name = "CM_CFIS", length = 5)
    protected String cmCfis;

    @Lob
    @Column(name = "CM_PROV")
    protected String cmProv;

    @Temporal(TemporalType.DATE)
    @Column(name = "CM_DT_ENABLE")
    protected Date cmDtEnable;

    @Temporal(TemporalType.DATE)
    @Column(name = "CM_DT_DISABLE")
    protected Date cmDtDisable;

    @Column(name = "CM_CODICE", length = 8)
    protected String cmCodice;

    @Id
    @Column(name = "CMID", nullable = false, length = 8)
    protected String cmId;

    @Column(name = "UUID")
    private UUID uuid;

    public void setCmCodice(String cmCodice) {
        this.cmCodice = cmCodice;
    }

    public String getCmCodice() {
        return cmCodice;
    }


    public void setCmCistat(String cmCistat) {
        this.cmCistat = cmCistat;
    }

    public String getCmCistat() {
        return cmCistat;
    }


    public void setCmDesc(String cmDesc) {
        this.cmDesc = cmDesc;
    }

    public String getCmDesc() {
        return cmDesc;
    }

    public void setCmCfis(String cmCfis) {
        this.cmCfis = cmCfis;
    }

    public String getCmCfis() {
        return cmCfis;
    }

    public void setCmProv(String cmProv) {
        this.cmProv = cmProv;
    }

    public String getCmProv() {
        return cmProv;
    }

    public void setCmDtEnable(Date cmDtEnable) {
        this.cmDtEnable = cmDtEnable;
    }

    public Date getCmDtEnable() {
        return cmDtEnable;
    }

    public void setCmDtDisable(Date cmDtDisable) {
        this.cmDtDisable = cmDtDisable;
    }

    public Date getCmDtDisable() {
        return cmDtDisable;
    }


    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }


    public void setCmId(String cmId) {
        this.cmId = cmId;
    }

    public String getCmId() {
        return cmId;
    }

    @Override
    public String getId() {
        return cmId;
    }

    @Override
    public void setId(String id) {
        this.cmId = id;
    }


}