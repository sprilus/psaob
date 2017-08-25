alter table PSAOB_PS_SCHEDA add ( SC_DT_INIZIO timestamp ) ^
update PSAOB_PS_SCHEDA set SC_DT_INIZIO = current_timestamp where SC_DT_INIZIO is null ^
alter table PSAOB_PS_SCHEDA modify SC_DT_INIZIO timestamp not null ^
alter table PSAOB_PS_SCHEDA add ( SC_DT_FINE timestamp ) ^
alter table PSAOB_PS_SCHEDA add ( SC_STATOSK number(19) ) ^
alter table PSAOB_PS_SCHEDA add ( SC_CASE_MANAGER varchar2(32) ) ^
