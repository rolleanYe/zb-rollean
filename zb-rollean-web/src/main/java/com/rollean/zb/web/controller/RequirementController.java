package com.rollean.zb.web.controller;

import com.rollean.zb.domain.RequirementVo;
import com.rollean.zb.service.repository.RequirementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/requirementList")
    public String queryAll(Model model){

        List<RequirementVo> requirementList = requirementRepository.querAllRequirements();

        model.addAttribute("requirementList",requirementList);
        return "requirement/requirementCenter";
    }

    @GetMapping("/requirementDetail")
    public String queryDetail(String requirementId, Model model){

        RequirementVo requirementVo = requirementRepository.queryById(new Integer(requirementId));

        model.addAttribute("requirement",requirementVo);
        return "requirement/requirementDetail";
    }

}
