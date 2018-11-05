-- we don't know how to generate schema rollean_zb (class Schema) :(
create table tb_code_table
(
	CODE_ID int auto_increment comment '字典ID'
		primary key,
	CODE_KEY varchar(32) null comment '字典标识',
	ATTR_NAME varchar(32) null comment '属性名称',
	ATTR_KEY varchar(32) null comment '属性标识',
	ATTR_VALUE varchar(32) null comment '属性值',
	ENABLE char null comment '是否使用',
	constraint IX_CODETABLE_CODEKEY_ATTRKEY
		unique (CODE_KEY, ATTR_KEY)
)
comment '字典表'
;

create table tb_requirement
(
	ID int auto_increment
		primary key,
	USER_ID int null comment '用户ID',
	PROJECT_TYPE int null comment '项目类型：项目，悬赏',
	SUBJECT_DESC varchar(256) null comment '主题',
	REQUIREMENT_TYPE int null comment '需求类型',
	REQUIREMENT_DESC varchar(1024) null comment '需求描述',
	SKILLS varchar(256) null comment '技能要求',
	PRICE varchar(20) null comment '价格',
	CYCLE varchar(20) null comment '周期',
	STATUS int null comment '状态',
	ATTACHMENT varchar(256) null comment '附件',
	CREATE_TIME timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
	UPDATE_TIME timestamp default CURRENT_TIMESTAMP not null comment '最后修改时间'
)
comment '需求'
;

create table tb_user
(
	ID int auto_increment comment '主键(自增处理)'
		primary key,
	NICKNAME varchar(60) null comment '昵称',
	AGE int null comment '年龄',
	MOBILE varchar(20) null comment '手机号',
	EMAIL varchar(20) null comment '邮箱',
	PWD varchar(20) null comment '密码',
	GENDER int null comment '性别(0保密 1男 2女)'
)
comment '用户表'
;

create table tb_sign_up_list
(
	ID int auto_increment comment '主键(自增处理)'
		primary key,
	USER_ID int null comment '会员ID',
	REQUIREMENT_ID int null comment '需求ID',
	REMARK varchar(2014) null comment '备注',
	CREATE_TIME timestamp default CURRENT_TIMESTAMP null comment '创建时间',
	UPDATE_TIME timestamp default CURRENT_TIMESTAMP null comment '修改时间',
	constraint tb_sign_up_list_tb_requirement_ID_fk
		foreign key (REQUIREMENT_ID) references tb_requirement (ID),
	constraint tb_sign_up_list_tb_user_ID_fk
		foreign key (USER_ID) references tb_user (ID)
)
comment '报名列表'
;

