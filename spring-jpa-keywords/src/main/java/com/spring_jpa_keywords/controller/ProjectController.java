package com.spring_jpa_keywords.controller;

import com.spring_jpa_keywords.entities.Projet;
import com.spring_jpa_keywords.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

   @Autowired
    private ProjetRepository projectRepository;

   @GetMapping("/get")
    public List<Projet> getProjects()
   {
       return projectRepository.findAll();
   }

}
