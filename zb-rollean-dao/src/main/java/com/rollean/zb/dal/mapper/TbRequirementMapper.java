package com.rollean.zb.dal.mapper;

import com.rollean.zb.dal.model.Requirement;
import com.rollean.zb.dal.model.TbRequirement;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface TbRequirementMapper extends Mapper<TbRequirement>, MySqlMapper<TbRequirement> {

    List<Requirement> queryRequirementDtl(@Param("userId") Integer userId, @Param("requirementId") Integer requirementId,@Param("status") Integer status );

    List<Requirement> requirementSearch(@Param("searchText") String searchText,@Param("projectTypeFilter")String projectTypeFilter,@Param("requirementTypeFilter")String requirementTypeFilter);


}