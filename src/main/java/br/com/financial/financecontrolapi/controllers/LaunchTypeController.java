package br.com.financial.financecontrolapi.controllers;

import br.com.financial.financecontrolapi.model.LauchTypeModel;
import br.com.financial.financecontrolapi.services.LauchTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api
@RequestMapping("/launch-type")
public class LaunchTypeController {

    @Autowired
    private LauchTypeService launchTypeService;

    @GetMapping
    public ResponseEntity<List<LauchTypeModel>> getAllLaunchType() {
        List<LauchTypeModel> body = launchTypeService.findAll();
        return ResponseEntity.ok(body);
    }

    @PostMapping
    public ResponseEntity<LauchTypeModel> insertLaunchType(LauchTypeModel lauchTypeModel) {
        LauchTypeModel body = launchTypeService.insert(lauchTypeModel);
        return ResponseEntity.ok(body);
    }

    @PutMapping
    public ResponseEntity<LauchTypeModel> updateLaunchType(LauchTypeModel lauchTypeModel) {
        LauchTypeModel body = launchTypeService.update(lauchTypeModel);
        return ResponseEntity.ok(body);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteLaunchType(LauchTypeModel lauchTypeModel) {
        Boolean body = launchTypeService.delete(lauchTypeModel);
        return ResponseEntity.ok(body);
    }
}
