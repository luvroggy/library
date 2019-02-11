-- ========================================================================
-- table drop
-- ========================================================================
drop sequence code_ids;
drop sequence institution_ids;
drop sequence book_ids;
drop table acquisition;
drop table request;
drop table users;
drop table code;
DROP TABLE orderlist;
DROP TABLE holdinginst;
DROP TABLE inspection;
DROP TABLE stackbooks;
DROP TABLE rental;
drop table booking;

-- ========================================================================
-- sequence create
-- ========================================================================

CREATE SEQUENCE code_ids START WITH 1 INCREMENT BY 1 MAXVALUE 999999 CYCLE NOCACHE;
CREATE SEQUENCE institution_ids START WITH 1 INCREMENT BY 1 MAXVALUE 999999 CYCLE NOCACHE;
create sequence book_ids start with 1 INCREMENT by 1 MAXVALUE 999999 cycle nocache;


-- ========================================================================
-- table create
-- ========================================================================

create table code
( code_id                 number(6)    
, code                    varchar2(8)
, code_name               VARCHAR2(100)             NOT NULL
, code_desc               varchar2(100)
, code_super              VARCHAR2(8)
, regdt                   date                      default sysdate
, moddt                   date
, constraint pk_code      primary key (code_id)
, constraint uq_code      unique      (code)
, constraint fk_supercode foreign key (code_super) references code(code)
);

create table users
( user_id            VARCHAR2(14)
, password           VARCHAR2(50)
, user_name          varchar2(50)
, user_phone         varchar2(11)
, user_email         varchar2(26)
, user_grade         varchar2(9) default 'normal'
, regdt              date        default sysdate
, moddt              date
, CONSTRAINT pk_user PRIMARY KEY (user_id)
, constraint uq_email   UNIQUE   (user_email)
--, constraint fk_user_position foreign key (user_position) references code(code)
--, constraint fk_user_facility foreign key (user_facility) references code(code)
);

CREATE TABLE request
( request_id            varchar2(13)
, user_id               varchar2(14)
, request_status        VARCHAR2(8)
, isbn                  varchar2(13)
, title                 varchar2(200) not null
, author                varchar2(100)  not null
, publisher             varchar2(100)
, regdt date            default       sysdate
, moddt date
, constraint pk_request primary key   (request_id)
--, constraint fk_request_type   foreign key (request_type)   references code(code)
--, constraint fk_request_status foreign key (request_status) references code(code)
--, constraint fk_user_request   foreign key (user_id)        references users(user_id)
);

CREATE TABLE acquisition
( acquisition_id            VARCHAR2(13)
, user_id                   varchar2(14)
, title                     VARCHAR2(200) NOT NULL
, author                    VARCHAR2(100)  NOT NULL
, publisher                 VARCHAR2(100)
, isbn                      VARCHAR2(13)
, acquisition_status        VARCHAR2(8)
, request_id                VARCHAR2(13)
, manager_id                VARCHAR2(14)
, regdt                     DATE          DEFAULT sysdate
, moddt                     DATE
, constraint pk_acquisition primary key    (acquisition_id)
--, constraint fk_acquisition_status  foreign key (acquisition_status) references code(code)
--, constraint fk_request_acquisition foreign key (request_id)         references request(request_id)
--, constraint fk_manager_acquisition foreign key (manager_id)         references manager(manager_id)
);

CREATE TABLE orderlist
( order_id            VARCHAR2(13)
, acquisition_id      VARCHAR2(13)
, request_id          VARCHAR2(13)
, title               VARCHAR2(200)
, author              VARCHAR2(100)
, isbn                VARCHAR2(13)
, publisher           varchar2(100)
, quantity            number(4)
, price               number(12)
, regdt               date        default sysdate
, moddt               date
, constraint pk_order primary key (order_id)
);

CREATE TABLE holdinginst
( institution_id       NUMBER(6)
, institution_name     VARCHAR2(50)
, institution_assigned VARCHAR2(8)
, regdt                DATE         DEFAULT sysdate
, moddt                date  
, CONSTRAINT pk_holdinginst PRIMARY KEY (institution_id)
);

CREATE TABLE inspection
( inspection_id  VARCHAR2(13)
, order_id       VARCHAR2(13)
, acquisition_id VARCHAR2(13)
, request_id     VARCHAR2(13)
, title          VARCHAR2(200)
, author         VARCHAR2(100)
, publisher      VARCHAR2(100)
, isbn           varchar2(13)
, regdt          DATE           DEFAULT sysdate
, moddt          date 
, CONSTRAINT pk_inspection PRIMARY key (inspection_id)
);

CREATE TABLE booking
( booking_id     VARCHAR2(13)
, book_id        NUMBER(10)
, user_id        VARCHAR2(14)
, booking_status VARCHAR2(8)
, booking_date   DATE         DEFAULT sysdate
, regdt          DATE         DEFAULT sysdate
, moddt          date
, CONSTRAINT pk_booking primary key (booking_id)
);

CREATE TABLE rental
( rental_id     VARCHAR2(13)
, book_id       NUMBER(10)
, user_id       VARCHAR2(14)
, rental_status VARCHAR2(8)
, rental_number NUMBER(1)
, rental_date   DATE          DEFAULT sysdate
, due_date      DATE          DEFAULT sysdate + 7
, return_date   DATE
, regdt         DATE          DEFAULT sysdate
, moddt         date
, CONSTRAINT pk_rental primary key (rental_id)
);

CREATE TABLE stackbooks
( book_id         NUMBER(10)
, title           VARCHAR2(200)
, author          VARCHAR2(100)
, isbn            VARCHAR2(13)
, translator      VARCHAR2(100)
, book_type       VARCHAR2(8)
, book_copy       NUMBER(2)
, publisher       VARCHAR2(100)
, book_status     VARCHAR2(8)
, institution_id  NUMBER(6)
, acquisition_id  VARCHAR2(13)
, request_id       varchar2(13)
, regdt           DATE        DEFAULT sysdate
, moddt           DATE
, CONSTRAINT pk_stackbooks primary key (book_id)
);


commit;