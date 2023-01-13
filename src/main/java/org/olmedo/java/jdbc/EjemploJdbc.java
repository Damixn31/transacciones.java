package org.olmedo.java.jdbc;

import org.olmedo.java.jdbc.models.Categoria;
import org.olmedo.java.jdbc.models.Producto;
import org.olmedo.java.jdbc.servicio.CatalogoServicio;
import org.olmedo.java.jdbc.servicio.Servicio;


import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("============= listar =============");
        servicio.listar().forEach(System.out::println);
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminacion");

        Producto producto = new Producto();
        producto.setNombre("Lampara Led escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductoConCategoria(producto, categoria);
        System.out.println("producto guardado con exito: " + producto.getId());
        servicio.listar().forEach(System.out::println);

    }
}
