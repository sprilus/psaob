alter table PSAOB_PAZIENTE add constraint FK_PSAOB_PAZIENTE_CATEGORY foreign key (CATEGORY_ID) references SYS_CATEGORY(ID)^
create index IDX_PSAOB_PAZIENTE_CATEGORY on PSAOB_PAZIENTE (CATEGORY_ID)^
