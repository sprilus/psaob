package it.aob.psaob.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.UUID;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|ctCodice,ctDesc")
@Table(name = "PSAOB_SA_CITTADINANZA")
@Entity(name = "psaob$SaCittadinanza")
public class SaCittadinanza extends BaseStringIdEntity implements HasUuid {
    private static final long serialVersionUID = 3761530939019407266L;

    @Column(name = "CT_CODICE", nullable = false, length = 3)
    protected String ctCodice;

    @Column(name = "CT_DESC", nullable = false)
    protected String ctDesc;

    @Id
    @Column(name = "CTID", nullable = false, length = 10)
    protected String ctId;

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


    public void setCtCodice(String ctCodice) {
        this.ctCodice = ctCodice;
    }

    public String getCtCodice() {
        return ctCodice;
    }

    public void setCtDesc(String ctDesc) {
        this.ctDesc = ctDesc;
    }

    public String getCtDesc() {
        return ctDesc;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    public String getCtId() {
        return ctId;
    }

    @Override
    public String getId() {
        return ctId;
    }

    @Override
    public void setId(String id) {
        this.ctId = id;
    }


}