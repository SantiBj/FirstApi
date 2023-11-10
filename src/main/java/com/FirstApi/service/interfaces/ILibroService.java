package com.FirstApi.service.interfaces;


import com.FirstApi.web.dtos.share.LibroDTO;

import java.util.List;

public interface ILibroService {
  LibroDTO obtenerLibro(Integer id);
  void eliminarLibro(Integer id);

  List<LibroDTO> obtenerLibros();
  LibroDTO crearLibro(LibroDTO libroDTO);
}
