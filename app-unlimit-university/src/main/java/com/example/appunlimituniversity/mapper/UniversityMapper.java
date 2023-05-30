package com.example.appunlimituniversity.mapper;

import com.example.appunlimituniversity.entity.University;
import com.example.appunlimituniversity.payload.UniversityDto;

import java.util.ArrayList;

public class UniversityMapper {
    public static UniversityDto toDto(University university) {
        UniversityDto dto = new UniversityDto();
        dto.setId(university.getId());
        dto.setName(university.getName());
        dto.setGmail(university.getGmail());
        dto.setAddress(university.getAddress());
        return dto;
    }

    public static ArrayList<UniversityDto> toDto(ArrayList<University> universities) {
        ArrayList<UniversityDto> universityDtos = new ArrayList<>();
        for (University university : universities) {
            universityDtos.add(toDto(university));
        }
        return universityDtos;
    }

    public static University toModel(UniversityDto dto) {
        University university = new University();
        university.setId(dto.getId());
        university.setName(dto.getName());
        university.setGmail(dto.getGmail());
        university.setAddress(dto.getAddress());
        return university;
    }

    public static University toModel(UniversityDto dto, University university) {
        university.setName(dto.getName());
        university.setGmail(dto.getGmail());
        university.setAddress(dto.getAddress());
        return university;
    }
}
