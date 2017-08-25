alter table PSAOB_PS_SCHEDA_SA_DGN_LINK add constraint FK_PPSSDL_SA_DIAGNOSI foreign key (SA_DIAGNOSI_ID) references PSAOB_SA_DIAGNOSI(DGID)^
alter table PSAOB_PS_SCHEDA_SA_DGN_LINK add constraint FK_PPSSDL_PS_SCHEDA foreign key (PS_SCHEDA_ID) references PSAOB_PS_SCHEDA(ID)^
