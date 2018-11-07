package com.rollean.zb.dal.mapper;

import com.rollean.zb.dal.model.TbUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface TbUserMapper extends Mapper<TbUser>, MySqlMapper<TbUser> {

    List<TbUser> queryByReqId(@Param("id") Integer id );

    TbUser loginQuery(@Param("loginName") String loginName, @Param("userPassword") String userPassword);

}