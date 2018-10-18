package com.rollean.zb.web.controller;

import com.rollean.zb.domain.Requirement;
import com.rollean.zb.service.repository.RequirementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by rollean.
 */
@Slf4j
@Controller
public class RequirementController {

    @Autowired
    private RequirementRepository requirementRepository;

    @GetMapping("/requirementList")
    public String queryAll(Model model){

        List<Requirement> requirementList = requirementRepository.querRequirement();

        model.addAttribute("requirementList",requirementList);
        return "requirementCenter";
    }


}
