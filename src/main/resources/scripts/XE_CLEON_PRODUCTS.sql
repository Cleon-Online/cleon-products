drop table product;
drop table product_type;
drop table product_category;

drop sequence product_cat_seq;
drop sequence product_sequence;
drop sequence product_type_seq;

create sequence product_cat_seq start with 10001 increment by 1;
create sequence product_sequence start with 30001 increment by 1;
create sequence product_type_seq start with 20001 increment by 1;

create table product (product_id number not null, 
created_date timestamp, 
last_modified_date timestamp, 
product_name varchar(100) not null, 
product_number varchar(100) not null, 
product_price number(8,2) not null, 
serial_number varchar(100) not null, 
product_type_id NUMBER not null, 
primary key (product_id));


create table product_category (
    product_category_id NUMBER not null, 
    created_date timestamp, 
    last_modified_date timestamp, 
    product_category_description varchar(500) not null, 
    product_category_name varchar(100) not null, 
    primary key (product_category_id));
    
create table product_type (
    product_type_id NUMBER not null, 
    created_date timestamp, 
    last_modified_date timestamp, 
    product_type_description varchar(500) not null, 
    product_type_name varchar(100) not null, 
    product_category_id NUMBER not null, 
    primary key (product_type_id));


alter table product add constraint UK_383i0awxqlq7pc33hil7afbgo unique (product_name);
alter table product add constraint UK_o9lr7abbchek72c2xu8x0g884 unique (product_number);
alter table product add constraint UK_i0l0yp44bh32fs5hwiah4cn8j unique (serial_number);
alter table product_category add constraint UK_b1vdn8m15jr0qguijivv950h1 unique (product_category_name);
alter table product_type add constraint UK_kktowkbnjpaqncxpry32flnym unique (product_type_name);
alter table product add constraint FKlabq3c2e90ybbxk58rc48byqo foreign key (product_type_id) references product_type;
alter table product_type add constraint FK1kf0jqpi79x9p0wwa4fsah38i foreign key (product_category_id) references product_category;
