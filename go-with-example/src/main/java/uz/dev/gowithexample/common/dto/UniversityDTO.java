package uz.dev.gowithexample.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversityDTO {
    private Long id;
    private String name;
    private int totalStudents;
    private AddressDTO addressDTO;


}
