package com.techlab.pedidos;

import com.techlab.Utilidad;
import com.techlab.productos.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

  //Atributos

  private List<Producto> productos = new ArrayList<>();

  //Getters y Setters

  public List<Producto> getProductos() {
    return productos;
  }

  //Metodos
  public void agregarProducto(Producto producto) {

    //1. Si la ID ya existe, sumar los stock
    for(Producto p : productos) {
      if (p.getId() == producto.getId()) {
        p.setStock(p.getStock() + producto.getStock());
        return;
      }
    }

    // Si la ID no existe, crear un nuevo pedido
    productos.add(producto);
  }
}
