package com.rollean.zb.service.impl;

import com.rollean.zb.dal.mapper.TbCodeTableMapper;
import com.rollean.zb.dal.model.TbCodeTable;
import com.rollean.zb.domain.BasicContext;
import com.rollean.zb.service.InitDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rollean.
 */
@Service
public class InitDateServiceImp implements InitDateService{

    @Autowired
    private TbCodeTableMapper tbCodeTableMapper;

    @Override
    public void initDate() {
        TbCodeTable tbCodeTable = new TbCodeTable();
        tbCodeTable.setEnable("Y");
        List<TbCodeTable> tbCodeTableList = tbCodeTableMapper.select(tbCodeTable);

        for(TbCodeTable to : tbCodeTableList){
            if("developmentLanguage".equals(to.getCodeKey())){
                BasicContext.skillList.add(to.getAttrValue());
            }

            if("requirementType".equals(to.getCodeKey())){
                BasicContext.requirementTypeMap.put(to.getAttrKey(),to.getAttrValue());
            }

            if("projectType".equals(to.getCodeKey())){
                BasicContext.projectTypeMap.put(to.getAttrKey(),to.getAttrValue());
            }

        }


    }
}
