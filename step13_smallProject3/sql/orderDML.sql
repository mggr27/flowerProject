-- orderer insert[�ֹ��� ����]
insert into orderer values('�Ѽ���', '010-1234-5678', 'GOLD');
insert into orderer values('�ϸ�', '010-2412-6756', 'SILVER');
insert into orderer values('��Ʈ��', '010-5234-8734', 'VIP');

-- recipient insert[�޴º� ����]
insert into recipient values('�鸸����', '010-9876-5432', '����Ư���� ������ �Ϳ��� 30����', 'SILVER');
insert into recipient values('ǥ����', '010-4354-1241', '�״����� ƫ���� 44���� ', 'GOLD');
insert into recipient values('�ͽ���', '010-4231-4321', '�̱� ����� ������� 50����', 'VIP');

-- orderInfo insert[�ֹ� ���� ����]
insert into orderInfo values('���', '�ɴٹ�', '2����');
insert into orderInfo values('ƫ��', '�ɹٱ���', '5����');
insert into orderInfo values('ȥ��', 'ȭ��', '10����');

-- orderInfo_project insert[��� ��� ������Ʈ ����]
--insert into order_project values(orderInfo_project_id_seq.nextval, '����12��10��', '���', '�ɴٹ�', '2����', '�Ѽ���', '010-1234-5678', 'GOLD', '�鸸����', '010-9876-5432', '����Ư���� ������ �Ϳ��� 30����', 'SILVER');
insert into order_project values('����12��10��', '���', '�ɴٹ�', '2����', '�Ѽ���', '010-1234-5678', 'GOLD', '�鸸����', '010-9876-5432', '����Ư���� ������ �Ϳ��� 30����', 'SILVER');
insert into order_project values('����14��20��', 'ƫ��', '�ɹٱ���', '5����', '�ϸ�', '010-2412-6756', 'SILVER', 'ǥ����', '010-4354-1241', '�״����� ƫ���� 44���� ', 'GOLD');
insert into order_project values('����16��30��', 'ȥ��', 'ȭ��', '10����', '��Ʈ��', '010-5234-8734', 'VIP', '�ͽ���', '010-4231-4321', '�̱� ����� ������� 50����', 'VIP');

commit;
