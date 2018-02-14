-- begin SALES_ORDER
alter table SALES_ORDER add column IS_URGENT boolean ^
update SALES_ORDER set IS_URGENT = false where IS_URGENT is null ^
alter table SALES_ORDER alter column IS_URGENT set not null ^
alter table SALES_ORDER add column DTYPE varchar(100) ^
update SALES_ORDER set DTYPE = 'extsales$ExtOrder' where DTYPE is null ^
-- end SALES_ORDER
