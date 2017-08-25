-- alter table PSAOB_PAZIENTE add ( PZ_COM_NAS_CMID varchar2(6) ) ^
-- update PSAOB_PAZIENTE set PZ_COM_NAS_CMID = <default_value> ^
-- alter table PSAOB_PAZIENTE modify PZ_COM_NAS_CMID varchar2(6) not null ^
alter table PSAOB_PAZIENTE add ( PZ_COM_NAS_CMID varchar2(6) not null ) ^
alter table PSAOB_PAZIENTE add ( PZ_TSAN_ID varchar2(20) ) ^
alter table PSAOB_PAZIENTE add ( PZ_ASL_APP varchar2(10) ) ^
alter table PSAOB_PAZIENTE add ( PZ_TSAN_ISTITUZ_COMP varchar2(255) ) ^
alter table PSAOB_PAZIENTE add ( PZ_TSAN_DT_INI date ) ^
alter table PSAOB_PAZIENTE add ( PZ_TSAN_DT_FIN date ) ^
alter table PSAOB_PAZIENTE add ( PZ_STP_CODICE varchar2(50) ) ^
alter table PSAOB_PAZIENTE add ( PZ_STP_DT_INI date ) ^
alter table PSAOB_PAZIENTE add ( PZ_STP_DT_FIN date ) ^
alter table PSAOB_PAZIENTE drop column PZ_COM_NAS cascade constraints ^
update PSAOB_PAZIENTE set PZ_COGN = ' ' where PZ_COGN is null ^
alter table PSAOB_PAZIENTE modify PZ_COGN varchar2(40) not null ^
update PSAOB_PAZIENTE set PZ_NOME = ' ' where PZ_NOME is null ^
alter table PSAOB_PAZIENTE modify PZ_NOME varchar2(40) not null ^
update PSAOB_PAZIENTE set PZ_DT_NAS = current_date where PZ_DT_NAS is null ^
alter table PSAOB_PAZIENTE modify PZ_DT_NAS date not null ^
update PSAOB_PAZIENTE set PZ_SESSO = 'M' where PZ_SESSO is null ^
alter table PSAOB_PAZIENTE modify PZ_SESSO varchar2(50) not null ^
