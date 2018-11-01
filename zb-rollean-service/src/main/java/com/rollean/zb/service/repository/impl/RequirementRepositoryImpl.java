package com.rollean.zb.service.repository.impl;

import com.rollean.zb.dal.mapper.TbRequirementMapper;
import com.rollean.zb.dal.mapper.TbUserMapper;
import com.rollean.zb.dal.model.Requirement;
import com.rollean.zb.dal.model.TbRequirement;
import com.rollean.zb.dal.model.TbUser;
import com.rollean.zb.domain.RequirementVo;
import com.rollean.zb.service.convert.RequirementConvert;
import com.rollean.zb.service.convert.UserConvert;
import com.rollean.zb.service.repository.RequirementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rollean.
 */
@Slf4j
@Service
public class RequirementRepositoryImpl implements RequirementRepository {

    @Autowired
    private TbRequirementMapper tbRequirementMapper;

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public List<RequirementVo> querAllRequirements() {
        List<Requirement> requirementList = tbRequirementMapper.queryRequirementDtl(null,null,new Integer("1"));
        return RequirementConvert.convertRequirementList(requirementList);
    }


    @Override
    public List<RequirementVo> requirementSearch(String searchText,String projectTypeFilter,String requirementTypeFilter) {
        List<Requirement> requirementList = tbRequirementMapper.requirementSearch( searchText, projectTypeFilter, requirementTypeFilter);
        return RequirementConvert.convertRequirementList(requirementList);
    }

    @Override
    public RequirementVo queryById(Integer id) {
        List<Requirement> requirementList = tbRequirementMapper.queryRequirementDtl(null,id,null);
        Requirement tbRequirement = requirementList.get(0);

        List<TbUser> tbUserList = tbUserMapper.queryByReqId(tbRequirement.getId());
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(tbRequirement.getUserId());

        RequirementVo requirementVo = RequirementConvert.convertRequirement(tbRequirement);
        requirementVo.setUser(UserConvert.convertUser(tbUser));
        requirementVo.setSignUpList(UserConvert.convertUserList(tbUserList));

        return requirementVo;
    }
}
