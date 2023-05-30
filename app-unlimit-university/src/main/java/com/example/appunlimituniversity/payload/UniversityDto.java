package com.example.appunlimituniversity.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversityDto {
    private Integer id;
    private String name;
    private String gmail;
    private String address;

}
