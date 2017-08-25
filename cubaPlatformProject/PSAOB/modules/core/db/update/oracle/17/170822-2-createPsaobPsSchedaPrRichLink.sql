alter table PSAOB_PS_SCHEDA_PR_RICH_LINK add constraint FK_PPSPRL_PR_RICHIESTE foreign key (PR_RICHIESTE_ID) references PSAOB_PR_RICHIESTE(RICCODE)^
alter table PSAOB_PS_SCHEDA_PR_RICH_LINK add constraint FK_PPSPRL_PS_SCHEDA foreign key (PS_SCHEDA_ID) references PSAOB_PS_SCHEDA(ID)^
