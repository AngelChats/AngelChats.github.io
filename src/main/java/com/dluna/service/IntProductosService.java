package com.dluna.service;

import java.util.List;

import com.dluna.model.Producto;

public interface IntProductosService {

	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void eliminar(Integer idProducto);
	public Producto buscarPorId(Integer idProducto);
}
