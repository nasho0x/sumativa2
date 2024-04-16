package com.example.bdget.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdget.model.Producto;
import com.example.bdget.model.Venta;
import com.example.bdget.service.VentaService;

@RestController
@RequestMapping("/tiendamascota")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAllVentas(){
        return ventaService.getAllVentas();
    }
        
    @GetMapping("/{id}")
    public Optional<Venta> getVentaById(@PathVariable Long id) {
        return ventaService.getVentaById(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto){
        return ventaService.crearProducto(producto);
    }

    @PostMapping("/venta")
    public Venta crearVenta(@RequestBody Venta venta){
        return ventaService.crearVenta(venta);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto){
        return ventaService.actualizarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id){
        ventaService.eliminarProducto(id);
    }
}
