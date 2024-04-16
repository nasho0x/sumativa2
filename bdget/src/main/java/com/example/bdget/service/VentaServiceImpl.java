package com.example.bdget.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdget.model.Producto;
import com.example.bdget.model.Venta;
import com.example.bdget.repository.ProductoRepository;
import com.example.bdget.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> getVentaById(Long id) {
        return ventaRepository.findById(id);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Venta crearVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Producto actualizarProducto(Long id, Producto producto) {
      if (productoRepository.existsById(id)) {
        producto.setIdProducto(id);
        return productoRepository.save(producto);
      } else {
        return null;
      }
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
