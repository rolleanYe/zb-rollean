package com.rollean.zb.service.convert;

import com.rollean.zb.dal.model.Requirement;
import com.rollean.zb.domain.BasicContext;
import com.rollean.zb.domain.RequirementVo;
import com.rollean.zb.domain.enums.ReqStatus;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollean.
 */
public class RequirementConvert {

    public static RequirementVo convertRequirement(Requirement requirement){
        RequirementVo requirementVo = new RequirementVo();
        BeanUtils.copyProperties(requirement,requirementVo);

        if(requirement.getProjectType() != null){
            requirementVo.setProjectTypeStr(BasicContext.projectTypeMap.get(requirement.getProjectType().toString()));
        }

        if(requirement.getRequirementType() != null){
            requirementVo.setRequirementTypeStr(BasicContext.requirementTypeMap.get(requirement.getRequirementType().toString()));
        }

        if(requirement.getStatus() != null){
            requirementVo.setStatusStr(ReqStatus.getByCode(requirement.getStatus().toString()).getMessage());
        }

        return requirementVo;
    }

    public static List<RequirementVo> convertRequirementList(List<Requirement> requirementList){
        if(requirementList == null || requirementList.size() == 0){
            return null;
        }

        List<RequirementVo> requirementVoList = new ArrayList<RequirementVo>();
        for(Requirement requirement : requirementList){
            requirementVoList.add(convertRequirement(requirement));
        }

        return requirementVoList;
    }

}
