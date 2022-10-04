alter table T_DOCUMENT add column scoresum int;
alter table T_DOCUMENT add column scorecount int;
update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';