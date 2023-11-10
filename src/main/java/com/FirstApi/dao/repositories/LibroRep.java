package com.FirstApi.dao.repositories;

import com.FirstApi.dao.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRep extends JpaRepository<Libro,Integer> {
}
