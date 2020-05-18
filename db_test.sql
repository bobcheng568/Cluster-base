create database test;

use test;

create table if not exists test.tb_resume
(
	id bigint auto_increment
		primary key,
	address varchar(255) null,
	name varchar(255) null,
	phone varchar(255) null
)
;

INSERT INTO test.tb_resume (id, address, name, phone) VALUES (2, 'usa', 'lisi2', '151000000');
INSERT INTO test.tb_resume (id, address, name, phone) VALUES (3, '广州', '王五', '153000000');
INSERT INTO test.tb_resume (id, address, name, phone) VALUES (6, 'usa', 'test', '11112222');