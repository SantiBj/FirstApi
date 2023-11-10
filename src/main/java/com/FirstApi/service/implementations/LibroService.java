package com.FirstApi.service.implementations;

import com.FirstApi.dao.models.Libro;
import com.FirstApi.dao.repositories.LibroRep;
import com.FirstApi.service.interfaces.ILibroService;
import com.FirstApi.web.dtos.share.LibroDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibroService {

    @Autowired
    LibroRep libroRep;
    ModelMapper modelMapper;

    @Override
    public LibroDTO obtenerLibro(Integer id) {
       return modelMapper.map(libroRep.findById(id), LibroDTO.class);
    }

    @Override
    public void eliminarLibro(Integer id) {

    }

    @Override
    public List<LibroDTO> obtenerLibros() {
        return null;
    }

    @Override
    public LibroDTO crearLibro(LibroDTO libroDTO) {
        return null;
    }
}
