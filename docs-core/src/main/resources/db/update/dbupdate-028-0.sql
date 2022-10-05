alter table T_DOCUMENT add column DOC_SCORESUM_C int default 0 not null;
alter table T_DOCUMENT add column DOC_SCORECOUNT_C int default 0 not null;
update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';