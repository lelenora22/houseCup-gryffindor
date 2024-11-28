package org.generation.italy.houseCup.controllers;

import org.generation.italy.houseCup.model.entities.Course;
import org.generation.italy.houseCup.model.services.RegisterService;
import org.generation.italy.houseCup.viewModels.ChooseClassViewModel;
import org.generation.italy.houseCup.viewModels.CourseSelectViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreController {
    private RegisterService registerService;
    @Autowired
    public ScoreController(RegisterService registerService){
        this.registerService=registerService;
    }

    @GetMapping("/classSelectionForm")
    public String showClassSelectionForm(Model model){
        List<Course> courses=registerService.getAllCourses();
        List<CourseSelectViewModel> coursesVm = courses.stream()
                //.map(c-> CourseSelectViewModel.fromCourse(c)))
                .map((CourseSelectViewModel::fromCourse)).toList();
        ChooseClassViewModel classModel=new ChooseClassViewModel(0,coursesVm);
        model.addAttribute("courseSelector",classModel);
        return "/score/assegnaClasse";
    }

}
