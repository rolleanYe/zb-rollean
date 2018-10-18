package com.rollean.zb.service.convert;

import com.rollean.zb.dal.model.TbRequirement;
import com.rollean.zb.domain.Requirement;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollean.
 */
public class RequirementConvert {

    public static Requirement convertRequirement(TbRequirement tbRequirement){
        Requirement requirement = new Requirement();
        BeanUtils.copyProperties(tbRequirement,requirement);
        return requirement;
    }

    public static List<Requirement> convertRequirementList(List<TbRequirement> tbRequirementList){
        if(tbRequirementList == null || tbRequirementList.size() == 0){
            return null;
        }

        List<Requirement> requirementList = new ArrayList<Requirement>();
        for(TbRequirement tbRequirement : tbRequirementList){
            requirementList.add(convertRequirement(tbRequirement));
        }

        return requirementList;
    }

}
