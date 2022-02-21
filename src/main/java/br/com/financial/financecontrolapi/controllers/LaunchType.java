package br.com.financial.financecontrolapi.controllers;

import br.com.financial.financecontrolapi.model.LauchTypeModel;
import br.com.financial.financecontrolapi.services.LauchTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
@RequestMapping("/launch-type")
public class LaunchType {

    @Autowired
    private LauchTypeService launchTypeService;

    @PostMapping
    public ResponseEntity<LauchTypeModel> insertLaunchType(LauchTypeModel lauchTypeModel) {
        LauchTypeModel body = launchTypeService.insert(lauchTypeModel);
        return ResponseEntity.ok(body);
    }

}
