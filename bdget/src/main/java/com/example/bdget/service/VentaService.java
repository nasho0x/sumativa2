package com.example.bdget.service;

import java.util.List;
import java.util.Optional;

import com.example.bdget.model.Producto;
import com.example.bdget.model.Venta;

public interface VentaService {
    List<Venta> getAllVentas();
    Optional<Venta> getVentaById(Long id);
    Producto crearProducto(Producto producto);
    Venta crearVenta(Venta venta);
    Producto actualizarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);

}
