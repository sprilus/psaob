alter table PSAOB_PS_SCHEDA add constraint FK_PSAOB_PSSCHE_SC_PAZIENTE foreign key (SC_PAZIENTE) references PSAOB_PAZIENTE(ID)^
create index IDX_PSAOB_PSSCHE_SC_PAZIENTE on PSAOB_PS_SCHEDA (SC_PAZIENTE)^
