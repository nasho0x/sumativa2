package com.example.bdget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bdget.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
