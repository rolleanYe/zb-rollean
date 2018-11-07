package com.rollean.zb.web.controller;

import com.rollean.zb.common.annotation.NoLogin;
import com.rollean.zb.domain.BasicContext;
import com.rollean.zb.domain.RequirementVo;
import com.rollean.zb.service.repository.RequirementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by rollean.
 */
@Slf4j
@Controller
@RequestMapping(value = "/requirement")
public class RequirementController {

    @Autowired
    private RequirementRepository requirementRepository;

    @NoLogin
    @RequestMapping("/requirementList")
    public String queryAll(Model model){

        List<RequirementVo> requirementList = requirementRepository.querAllRequirements();

        model.addAttribute("requirementList",requirementList);
        model.addAttribute("projectTypeFilter","0");
        model.addAttribute("requirementTypeFilter","0");


        setCommonAttribute(model);
        return "requirement/requirementCenter";
    }

    @GetMapping("/requirementDetail")
    public String queryDetail(String requirementId, Model model){

        RequirementVo requirementVo = requirementRepository.queryById(new Integer(requirementId));

        model.addAttribute("requirement",requirementVo);

        return "requirement/requirementDetail";
    }

    @NoLogin
    @GetMapping("/requirementSearch")
    public String requirementSearch(String searchText, String projectTypeFilter, String requirementTypeFilter,  Model model){

        List<RequirementVo> requirementList = requirementRepository.requirementSearch(searchText,projectTypeFilter,requirementTypeFilter);
        model.addAttribute("requirementList",requirementList);

        model.addAttribute("searchText",searchText);
        model.addAttribute("projectTypeFilter",projectTypeFilter);
        model.addAttribute("requirementTypeFilter",requirementTypeFilter);

        setCommonAttribute(model);
        return "requirement/requirementCenter";
    }

    public void setCommonAttribute(Model model){
        model.addAttribute("projectTypeMap", BasicContext.projectTypeMap);
        model.addAttribute("requirementTypeMap", BasicContext.requirementTypeMap);
    }


}
