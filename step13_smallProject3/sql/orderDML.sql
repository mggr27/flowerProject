-- orderer insert[주문자 저장]
insert into orderer values('한송이', '010-1234-5678', 'GOLD');
insert into orderer values('하멜', '010-2412-6756', 'SILVER');
insert into orderer values('엔트맨', '010-5234-8734', 'VIP');

-- recipient insert[받는분 저장]
insert into recipient values('백만송이', '010-9876-5432', '서울특별시 마포구 와우산로 30번지', 'SILVER');
insert into recipient values('표류기', '010-4354-1241', '네덜란드 튤립길 44번지 ', 'GOLD');
insert into recipient values('와스프', '010-4231-4321', '미국 뉴욕시 좁은길로 50번지', 'VIP');

-- orderInfo insert[주문 정보 저장]
insert into orderInfo values('장미', '꽃다발', '2만원');
insert into orderInfo values('튤립', '꽃바구니', '5만원');
insert into orderInfo values('혼합', '화분', '10만원');

-- orderInfo_project insert[재능 기부 프로젝트 저장]
--insert into order_project values(orderInfo_project_id_seq.nextval, '오후12시10분', '장미', '꽃다발', '2만원', '한송이', '010-1234-5678', 'GOLD', '백만송이', '010-9876-5432', '서울특별시 마포구 와우산로 30번지', 'SILVER');
insert into order_project values('오후12시10분', '장미', '꽃다발', '2만원', '한송이', '010-1234-5678', 'GOLD', '백만송이', '010-9876-5432', '서울특별시 마포구 와우산로 30번지', 'SILVER');
insert into order_project values('오후14시20분', '튤립', '꽃바구니', '5만원', '하멜', '010-2412-6756', 'SILVER', '표류기', '010-4354-1241', '네덜란드 튤립길 44번지 ', 'GOLD');
insert into order_project values('오후16시30분', '혼합', '화분', '10만원', '엔트맨', '010-5234-8734', 'VIP', '와스프', '010-4231-4321', '미국 뉴욕시 좁은길로 50번지', 'VIP');

commit;
