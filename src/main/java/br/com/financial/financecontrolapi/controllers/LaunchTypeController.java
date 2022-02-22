package br.com.financial.financecontrolapi.controllers;

import br.com.financial.financecontrolapi.dto.LauchTypeDTO;
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
    public ResponseEntity<List<LauchTypeDTO>> getAllLaunchType() {
        List<LauchTypeDTO> body = launchTypeService.findAll();
        return ResponseEntity.ok(body);
    }

    @PostMapping
    public ResponseEntity<LauchTypeDTO> insertLaunchType(LauchTypeDTO lauchTypeDTO) {
        LauchTypeDTO body = launchTypeService.insert(lauchTypeDTO);
        return ResponseEntity.ok(body);
    }

    @PutMapping
    public ResponseEntity<LauchTypeDTO> updateLaunchType(LauchTypeDTO lauchTypeDTO) {
        LauchTypeDTO body = launchTypeService.update(lauchTypeDTO);
        return ResponseEntity.ok(body);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteLaunchType(LauchTypeDTO lauchTypeDTO) {
        Boolean body = launchTypeService.delete(lauchTypeDTO);
        return ResponseEntity.ok(body);
    }
}
