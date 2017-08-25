-- begin PSAOB_PAZIENTE
create table PSAOB_PAZIENTE (
    ID varchar2(32),
    VERSION number(10) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar2(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar2(50),
    DELETE_TS timestamp,
    DELETED_BY varchar2(50),
    --
    PZ_ID varchar2(16),
    PZ_COGN varchar2(40) not null,
    PZ_NOME varchar2(40) not null,
    PZ_DT_NAS date,
    PZ_SESSO varchar2(50) not null,
    PZ_CFIS varchar2(16),
    PZ_IND_RES varchar2(255),
    PZ_NCIV_RES varchar2(10),
    PZ_TSAN_ID varchar2(20),
    PZ_ASL_APP varchar2(10),
    PZ_TSAN_ISTITUZ_COMP varchar2(255),
    PZ_TSAN_DT_INI date,
    PZ_TSAN_DT_FIN date,
    PZ_STP_CODICE varchar2(50),
    PZ_STP_DT_INI date,
    PZ_STP_DT_FIN date,
    PZ_CITT_CTID varchar2(10),
    PZ_COM_NAS_CMID varchar2(8),
    PZ_COM_RES_CMID varchar2(8),
    PZ_TEL1 varchar2(25),
    --
    primary key (ID)
)^
-- end PSAOB_PAZIENTE
-- begin PSAOB_PS_SCHEDA
create table PSAOB_PS_SCHEDA (
    ID number(19),
    UUID varchar2(32),
    --
    SC_ID number(19),
    SC_SCHEDA varchar2(11),
    SC_STRUTTURA_SRID varchar2(11),
    SC_PAZIENTE varchar2(32),
    SC_DT_INIZIO timestamp not null,
    SC_DT_FINE timestamp,
    SC_STATOSK varchar2(50),
    SC_CASE_MANAGER varchar2(32),
    SC_PROBLEMA_PRINC_ID varchar2(2),
    SC_TRG_IN integer,
    SC_TRG_OUT integer,
    SC_MOD_ACC varchar2(50),
    SC_ANAMNESI_INFERM varchar2(255),
    SC_CAUSA_DICHIARATA_ACC varchar2(255),
    SC_ANAMNESI_MEDICA1 clob,
    SC_ANAMNESI_MEDICA2 clob,
    SC_ANAMNESI_MEDICA3 clob,
    SC_DIAGNOSI_USCITA_TXT clob,
    SC_TIPO_ESITO_CODICE varchar2(11),
    SC_SOLVENTE char(1),
    SC_NOTE_PRESCRIZIONI clob,
    SC_DT_VISITA timestamp,
    PS_ESAME_OBIETTIVO clob,
    PS_TERAPIA_PRATICATA clob,
    PS_CONCLUSIONI_INDICZIONI clob,
    PS_PROGNOSI_GG_CLINICI varchar2(10),
    PS_PROGNOSI_GG_LAV varchar2(10),
    PS_PAZ_RIFIUTO_RICOVERO char(1),
    PS_MEDICO_ACC_ID varchar2(32),
    PS_MEDICO_DIM_ID varchar2(32),
    --
    primary key (ID)
)^
-- end PSAOB_PS_SCHEDA
-- begin PSAOB_PS_PROBLEMA_PRINCIPALE
create table PSAOB_PS_PROBLEMA_PRINCIPALE (
    ID varchar2(2),
    UUID varchar2(32),
    --
    CODICE varchar2(2),
    DESCRIZIONE varchar2(255),
    --
    primary key (ID)
)^
-- end PSAOB_PS_PROBLEMA_PRINCIPALE
-- begin PSAOB_SA_CITTADINANZA
create table PSAOB_SA_CITTADINANZA (
    CTID varchar2(10),
    UUID varchar2(32),
    --
    CT_CODICE varchar2(3) not null,
    CT_DESC varchar2(255) not null,
    --
    primary key (CTID)
)^
-- end PSAOB_SA_CITTADINANZA
-- begin PSAOB_SA_COMUNE
create table PSAOB_SA_COMUNE (
    CMID varchar2(6),
    UUID varchar2(32),
    --
    CM_CISTAT varchar2(8) not null,
    CM_DESC varchar2(255),
    CM_CFIS varchar2(5),
    CM_PROV clob,
    CM_DT_ENABLE date,
    CM_DT_DISABLE date,
    CM_CODICE varchar2(8),
    --
    primary key (CMID)
)^
-- end PSAOB_SA_COMUNE
-- begin PSAOB_SA_STRUTTURA
create table PSAOB_SA_STRUTTURA (
    SRID varchar2(11),
    UUID varchar2(32),
    --
    SR_CODICE varchar2(30),
    SR_DESC varchar2(255),
    SR_RESPONSABILE varchar2(255),
    SR_TEL varchar2(18),
    SR_FAX varchar2(18),
    SR_TIPO varchar2(10),
    --
    primary key (SRID)
)^
-- end PSAOB_SA_STRUTTURA
-- begin PSAOB_PS_TIPO_ESITO_TAB
create table PSAOB_PS_TIPO_ESITO_TAB (
    CODICE varchar2(11),
    --
    DESCRIZIONE varchar2(100),
    --
    primary key (CODICE)
)^
-- end PSAOB_PS_TIPO_ESITO_TAB
-- begin PSAOB_SA_DIAGNOSI
create table PSAOB_SA_DIAGNOSI (
    DGID varchar2(11),
    --
    DESCRIZIONE varchar2(255),
    CODICE varchar2(8),
    --
    primary key (DGID)
)^
-- end PSAOB_SA_DIAGNOSI
-- begin PSAOB_SA_PRESTAZIONI
create table PSAOB_SA_PRESTAZIONI (
    PRID varchar2(15),
    --
    PR_CODICE varchar2(15),
    PR_DESCR_B varchar2(150),
    PR_CODMIN varchar2(8),
    --
    primary key (PRID)
)^
-- end PSAOB_SA_PRESTAZIONI

-- begin PSAOB_PR_RICHIESTE
create table PSAOB_PR_RICHIESTE (
    RICCODE varchar2(12),
    --
    RIC_POS_ERO varchar2(50),
    RIC_DRIC timestamp,
    RIC_PAZIENTE_ID varchar2(32),
    RIC_URGENZA varchar2(50),
    RIC_NOTE varchar2(4000),
    RIC_QUESITO_DIAGNOSTICO varchar2(1000),
    RIC_CODICE varchar2(12),
    RIC_MEDICO_RIC_ID varchar2(32),
    PS_SCHEDA_ID number(19),
    --
    primary key (RICCODE)
)^
-- end PSAOB_PR_RICHIESTE
-- begin PSAOB_PR_RICH_SA_PREST_LINK
create table PSAOB_PR_RICH_SA_PREST_LINK (
    PR_RICHIESTE_ID varchar2(12),
    SA_PRESTAZIONI_ID varchar2(15),
    primary key (PR_RICHIESTE_ID, SA_PRESTAZIONI_ID)
)^
-- end PSAOB_PR_RICH_SA_PREST_LINK
-- begin PSAOB_PS_SCHEDA_SA_DGN_LINK
create table PSAOB_PS_SCHEDA_SA_DGN_LINK (
    SA_DIAGNOSI_ID varchar2(11),
    PS_SCHEDA_ID number(19),
    primary key (SA_DIAGNOSI_ID, PS_SCHEDA_ID)
)^
-- end PSAOB_PS_SCHEDA_SA_DGN_LINK
