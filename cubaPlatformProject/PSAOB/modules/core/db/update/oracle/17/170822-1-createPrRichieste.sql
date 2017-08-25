create table PSAOB_PR_RICHIESTE (
    RICCODE varchar2(12),
    --
    RIC_POS_ERO varchar2(11),
    RIC_DRIC timestamp,
    RIC_PS_SCHEDA_ID number(19),
    RIC_PAZIENTE_ID varchar2(32),
    RIC_URGENZA varchar2(20),
    RIC_NOTE varchar2(4000),
    --
    primary key (RICCODE)
)^
