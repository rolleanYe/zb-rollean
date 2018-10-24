package com.rollean.zb.service.convert;

import com.rollean.zb.dal.model.TbRequirement;
import com.rollean.zb.domain.RequirementVo;
import com.rollean.zb.domain.enums.ProjectType;
import com.rollean.zb.domain.enums.RequirementType;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollean.
 */
public class RequirementConvert {

    public static RequirementVo convertRequirement(TbRequirement tbRequirement){
        RequirementVo requirement = new RequirementVo();
        BeanUtils.copyProperties(tbRequirement,requirement);

        if(tbRequirement.getProjectType() != null){
            requirement.setProjectTypeStr(ProjectType.getByCode(tbRequirement.getProjectType().toString()).getMessage());
        }

        if(tbRequirement.getRequirementType() != null){
            requirement.setRequirementTypeStr(RequirementType.getByCode(tbRequirement.getRequirementType().toString()).getMessage());
        }

        return requirement;
    }

    public static List<RequirementVo> convertRequirementList(List<TbRequirement> tbRequirementList){
        if(tbRequirementList == null || tbRequirementList.size() == 0){
            return null;
        }

        List<RequirementVo> requirementList = new ArrayList<RequirementVo>();
        for(TbRequirement tbRequirement : tbRequirementList){
            requirementList.add(convertRequirement(tbRequirement));
        }

        return requirementList;
    }

}
