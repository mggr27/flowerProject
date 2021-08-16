-- 주문자
DROP TABLE orderer cascade constraint;

-- 받는분
DROP TABLE recipient cascade constraint;

-- 주문정보
DROP TABLE orderInfo cascade constraint;
-- 주문 프로제그
DROP TABLE order_project cascade constraint;


DROP SEQUENCE orderInfo_project_id_seq;


CREATE TABLE orderer (
       orderName        	VARCHAR2(20)  PRIMARY KEY,
       phone        	VARCHAR2(50) NOT NULL,
       membership	VARCHAR2(50) NOT NULL
);

CREATE TABLE recipient (
       recipientName        	VARCHAR2(20) PRIMARY KEY,
       phone            	VARCHAR2(20) NOT NULL,
       address          VARCHAR2(50) NOT NULL,
       membership   VARCHAR2(50) NOT NULL
);


CREATE TABLE orderInfo (
       flowerType          	VARCHAR2(50) PRIMARY KEY,
       goodsType      VARCHAR2(50) NOT NULL,
       price  	VARCHAR2(200) NOT NULL
);

--CREATE SEQUENCE order_project_id_seq;
CREATE TABLE order_project (
	   order_id     		VARCHAR2(50) PRIMARY KEY,
	   datetime     		VARCHAR2(50) NOT NULL,
	   flowerType 			VARCHAR2(50) NOT NULL,
       goodsType        	VARCHAR2(50) NOT NULL,       
       price          		VARCHAR2(20) NOT NULL,
       orderName			VARCHAR2(20) NOT NULL,
       ordererPhone			VARCHAR2(200) NOT NULL,
       orderer_membership			VARCHAR2(50) NOT NULL,
       recipientName		VARCHAR2(50) NOT NULL,
       recipientPhone		VARCHAR2(50) NOT NULL,
       address				VARCHAR2(50) NOT NULL,
       recipient_membership			VARCHAR2(50) NOT NULL
);

--ALTER TABLE orderInfo_project  ADD FOREIGN KEY () REFERENCES recipient  ();
--ALTER TABLE orderInfo_project ADD FOREIGN KEY ()  REFERENCES orderer  ();
--ALTER TABLE orderInfo_project ADD FOREIGN KEY () REFERENCES orderInfo  ();