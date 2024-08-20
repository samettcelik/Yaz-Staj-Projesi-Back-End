package com.demo.authdemo.repository;

import com.demo.authdemo.entity.FoundMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoundMaterialRepository extends JpaRepository<FoundMaterial, Long> {
    // Malzeme zaten kaydedildiyse true döner
    boolean existsByMaterialMatId(Long matId);
}