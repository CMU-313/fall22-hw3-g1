alter table T_DOCUMENT add column scoresum int default 0 not null;
alter table T_DOCUMENT add column scorecount int default 0 not null;
update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';