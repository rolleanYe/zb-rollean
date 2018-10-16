package com.rollean.zb.dal.mapper;

import com.rollean.zb.dal.model.TbUser;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbUserMapper extends Mapper<TbUser>, MySqlMapper<TbUser> {
}