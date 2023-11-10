package com.FirstApi.web.dtos.share;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {
    private Integer id;
    private String nombre;
    private String autor;
}
