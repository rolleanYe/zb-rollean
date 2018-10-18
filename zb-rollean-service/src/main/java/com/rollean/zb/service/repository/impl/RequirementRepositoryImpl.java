package com.rollean.zb.service.repository.impl;

import com.rollean.zb.dal.mapper.TbRequirementMapper;
import com.rollean.zb.dal.model.TbRequirement;
import com.rollean.zb.domain.Requirement;
import com.rollean.zb.service.convert.RequirementConvert;
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

    @Override
    public List<Requirement> querRequirement() {
        List<TbRequirement> tbRequirementList = tbRequirementMapper.selectAll();

        return RequirementConvert.convertRequirementList(tbRequirementList);
    }
}
