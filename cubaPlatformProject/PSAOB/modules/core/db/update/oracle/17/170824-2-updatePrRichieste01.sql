alter table PSAOB_PR_RICHIESTE add constraint FK_PSAOB_PRRICH_PS_SCHEDA foreign key (PS_SCHEDA_ID) references PSAOB_PS_SCHEDA(ID)^
create index IDX_PSAOB_PRRICH_PS_SCHEDA on PSAOB_PR_RICHIESTE (PS_SCHEDA_ID)^