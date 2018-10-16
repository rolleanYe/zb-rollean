DROP TABLE IF EXISTS rollean_zb.`tb_user`;
CREATE TABLE rollean_zb.`tb_user` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT '主键(自增处理)',
  `NAME` varchar(20) DEFAULT NULL COMMENT '姓名',
  `AGE` INT  COMMENT '年龄',
  `MOBILE` varchar(20)  COMMENT '手机号',
  `EMAIL` varchar(20)  COMMENT '邮箱',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='用户表';


