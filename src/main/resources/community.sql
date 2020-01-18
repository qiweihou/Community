--创建user表
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
--创建question表
drop table if exists `question`;
create table if not exists `question`(
	`id` int not null auto_increment,
	`title` varchar(50),
	`description` text,
	`gmt_create` bigint,
	`gmt_modified` bigint,
	`creator` int,
	`comment_count` int default 0,
	`view_count` int default 0,
	`like_count` int default 0,
	`tag` varchar(256),
	PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;