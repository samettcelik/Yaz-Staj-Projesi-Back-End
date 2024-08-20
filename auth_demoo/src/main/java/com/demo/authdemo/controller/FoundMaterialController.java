package com.demo.authdemo.controller;

import java.util.List;
import com.demo.authdemo.entity.FoundMaterial;
import com.demo.authdemo.service.FoundMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/found-materials")
public class FoundMaterialController {

    @Autowired
    private FoundMaterialService foundMaterialService;

    @PostMapping("/save")
    public ResponseEntity<FoundMaterial> saveFoundMaterial(@RequestBody FoundMaterial foundMaterial) {
        FoundMaterial savedMaterial = foundMaterialService.saveFoundMaterial(foundMaterial);
        return ResponseEntity.ok(savedMaterial);
    }

    @PostMapping("/save-all")
    public ResponseEntity<List<FoundMaterial>> saveAllFoundMaterials(@RequestBody List<FoundMaterial> foundMaterials) {
        List<FoundMaterial> savedMaterials = foundMaterialService.saveAllFoundMaterials(foundMaterials);
        return ResponseEntity.ok(savedMaterials);
    }
}
