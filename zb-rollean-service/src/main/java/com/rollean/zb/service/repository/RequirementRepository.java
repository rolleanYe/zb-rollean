package com.rollean.zb.service.repository;

import com.rollean.zb.domain.RequirementVo;

import java.util.List;

/**
 * Created by rollean.
 */
public interface RequirementRepository {

    List<RequirementVo> querAllRequirements();

    List<RequirementVo> requirementSearch(String searchText,String projectTypeFilter,String requirementTypeFilter);

    RequirementVo queryById(Integer id);

}
