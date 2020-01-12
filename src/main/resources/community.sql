--Table structure for user
drop table if exists `user`;
create table if not EXISTS `user`(
	`id` int not null auto_increment,
	`account_id` VARCHAR(100),
	`name` VARCHAR(50),
	`token` char(36),
	`gmt_create` BIGINT,
	`gmt_modified` BIGINT,
	PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
------------------------------------------------
