alter table PSAOB_PAZIENTE add ( PZ_COM_RES_CMID varchar2(8) ) ^
alter table PSAOB_PAZIENTE drop column PZ_COM_RES cascade constraints ^
alter table PSAOB_PAZIENTE modify PZ_COM_NAS_CMID varchar2(8) null ^
