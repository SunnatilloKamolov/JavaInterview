package com.example.appunlimituniversity.service;

import com.example.appunlimituniversity.entity.University;
import com.example.appunlimituniversity.exception.EntityNotFoundException;
import com.example.appunlimituniversity.mapper.UniversityMapper;
import com.example.appunlimituniversity.payload.UniversityDto;
import com.example.appunlimituniversity.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {
    @Autowired
    UniversityRepository universityRepository;

    public List<University> getUniversities() {
        return (List<University>) universityRepository.findAll();
    }

    public University getUniversityById(Integer id) throws EntityNotFoundException {
        return universityRepository.findById(id)
                .orElseThrow(() -> new jakarta.persistence.EntityNotFoundException("not found university with id=" + id));
    }

    public University addUniversity(UniversityDto universityDto) {
        return universityRepository.save(UniversityMapper.toModel(universityDto));
    }

    public void deleteUniversity(Integer id) throws EntityNotFoundException {
        University university = universityRepository.findById(id)
                .orElseThrow(() -> new jakarta.persistence.EntityNotFoundException("Not found university with id=" + id));
        universityRepository.deleteById(id);
    }

    public University editUniversity(UniversityDto universityDto, Integer id) throws EntityNotFoundException {
        Optional<University> optionalUniversity = universityRepository.findById(id);
        if (optionalUniversity.isEmpty()) {
            throw new EntityNotFoundException("Not found id=" + id);
        }else{
            University university=optionalUniversity.get();
            return universityRepository.save(UniversityMapper.toModel(universityDto,university));
    }}
}
