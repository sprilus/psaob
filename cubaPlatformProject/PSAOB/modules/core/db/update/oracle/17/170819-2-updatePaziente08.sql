alter table PSAOB_PAZIENTE add constraint FK_PSAOB_PAZ_PZ_COM_NAS_CMID foreign key (PZ_COM_NAS_CMID) references PSAOB_SA_COMUNE(CMID)^
