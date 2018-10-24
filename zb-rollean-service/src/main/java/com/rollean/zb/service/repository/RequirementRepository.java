package com.rollean.zb.service.repository;

import com.rollean.zb.domain.RequirementVo;

import java.util.List;

/**
 * Created by rollean.
 */
public interface RequirementRepository {

    List<RequirementVo> querAllRequirements();

    RequirementVo queryById(Integer id);

}
