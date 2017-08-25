create table PSAOB_SA_COMUNE (
    CMID varchar2(6),
    UUID varchar2(32),
    --
    CM_CODICE varchar2(6) not null,
    CM_CISTAT varchar2(8) not null,
    CM_DESC varchar2(255),
    CM_CFIS varchar2(5),
    CM_PROV clob,
    CM_DT_ENABLE date,
    CM_DT_DISABLE date,
    --
    primary key (CMID)
)^
