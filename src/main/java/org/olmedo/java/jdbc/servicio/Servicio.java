package org.olmedo.java.jdbc.servicio;

import org.olmedo.java.jdbc.models.Categoria;
import org.olmedo.java.jdbc.models.Producto;

import javax.sound.sampled.Port;
import java.sql.SQLException;
import java.util.List;

public interface Servicio {
    // el service es una fachada para acceder a los repositorios
    List<Producto> listar() throws SQLException;
    Producto porId(Long id) throws SQLException;

    Producto guardar(Producto producto) throws SQLException;

    void eliminar(Long id) throws SQLException;

    List<Categoria> listarCategoria() throws SQLException;

    Categoria porIdCategoria(Long id) throws SQLException;
    Categoria guardarCategoria(Categoria categoria) throws SQLException;

    void eliminarCategoria(Long id) throws SQLException;
    void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException;

}
