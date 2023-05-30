package com.example.appunlimituniversity.controller;

import com.example.appunlimituniversity.entity.University;
import com.example.appunlimituniversity.exception.EntityNotFoundException;
import com.example.appunlimituniversity.mapper.UniversityMapper;
import com.example.appunlimituniversity.payload.UniversityDto;
import com.example.appunlimituniversity.service.UniversityService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.InternalResourceView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/unlimit/university", produces = MediaType.APPLICATION_JSON_VALUE)
public class UniversityController {
    @Autowired
    UniversityService universityService;

    @GetMapping
    public ResponseEntity<List<UniversityDto>> getUniversities() {
        List<University> universities = universityService.getUniversities();
        List<UniversityDto> universityDtos = new ArrayList<>();
        for (University university : universities) {
            universityDtos.add(UniversityMapper.toDto(university));
        }
        if (universityDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(universityDtos);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<UniversityDto> getUniversityById(@PathVariable Integer id) throws EntityNotFoundException {
        UniversityDto universityDto = UniversityMapper.toDto(universityService.getUniversityById(id));
        if (universityDto == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(universityDto);
        }
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UniversityDto> addUniversity(@RequestBody UniversityDto universityDto) {
        try {
            return ResponseEntity.ok(UniversityMapper.toDto(universityService.addUniversity(universityDto)));
        } catch (Exception e) {
            System.out.println("Issue is happened");
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUniversity(@PathVariable Integer id) throws EntityNotFoundException {
        try {
            universityService.deleteUniversity(id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            System.out.println("Issue is happened");
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UniversityDto> editUniversity(@RequestBody UniversityDto universityDto, @PathVariable Integer id) throws EntityNotFoundException {
        try {
            return ResponseEntity.ok(UniversityMapper.toDto(universityService.editUniversity(universityDto, id)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            System.out.println("Issue is happened");
            return ResponseEntity.internalServerError().build();
        }
    }


}
