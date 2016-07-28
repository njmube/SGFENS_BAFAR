/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface SgfensProveedorProductoDao
{
	/** 
	 * Inserts a new row in the sgfens_proveedor_producto table.
	 */
	public SgfensProveedorProductoPk insert(SgfensProveedorProducto dto) throws SgfensProveedorProductoDaoException;

	/** 
	 * Updates a single row in the sgfens_proveedor_producto table.
	 */
	public void update(SgfensProveedorProductoPk pk, SgfensProveedorProducto dto) throws SgfensProveedorProductoDaoException;

	/** 
	 * Deletes a single row in the sgfens_proveedor_producto table.
	 */
	public void delete(SgfensProveedorProductoPk pk) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns the rows from the sgfens_proveedor_producto table that matches the specified primary-key value.
	 */
	public SgfensProveedorProducto findByPrimaryKey(SgfensProveedorProductoPk pk) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_PROVEEDOR_PRODUCTO = :idProveedorProducto'.
	 */
	public SgfensProveedorProducto findByPrimaryKey(int idProveedorProducto) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria ''.
	 */
	public SgfensProveedorProducto[] findAll() throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_PROVEEDOR_PRODUCTO = :idProveedorProducto'.
	 */
	public SgfensProveedorProducto[] findWhereIdProveedorProductoEquals(int idProveedorProducto) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_SGFENS_PRODUCTO_SERVICIO = :idSgfensProductoServicio'.
	 */
	public SgfensProveedorProducto[] findWhereIdSgfensProductoServicioEquals(int idSgfensProductoServicio) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_SGFENS_PRODUCTO_PROVEEDOR = :idSgfensProductoProveedor'.
	 */
	public SgfensProveedorProducto[] findWhereIdSgfensProductoProveedorEquals(int idSgfensProductoProveedor) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'VOLUMEN_DISPONIBLE = :volumenDisponible'.
	 */
	public SgfensProveedorProducto[] findWhereVolumenDisponibleEquals(double volumenDisponible) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'CADUCIDAD = :caducidad'.
	 */
	public SgfensProveedorProducto[] findWhereCaducidadEquals(Date caducidad) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'FECHA_DISPONIBILIDAD = :fechaDisponibilidad'.
	 */
	public SgfensProveedorProducto[] findWhereFechaDisponibilidadEquals(Date fechaDisponibilidad) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'UNIDAD = :unidad'.
	 */
	public SgfensProveedorProducto[] findWhereUnidadEquals(String unidad) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'PRECIO_MEDIO_MAYOREO = :precioMedioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWherePrecioMedioMayoreoEquals(double precioMedioMayoreo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MIN_MEDIO_MAYOREO = :minMedioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWhereMinMedioMayoreoEquals(double minMedioMayoreo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MAX_MEDIO_MAYOREO = :maxMedioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWhereMaxMedioMayoreoEquals(double maxMedioMayoreo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'PRECIO_MENUDEO = :precioMenudeo'.
	 */
	public SgfensProveedorProducto[] findWherePrecioMenudeoEquals(double precioMenudeo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MAX_MENUDEO = :maxMenudeo'.
	 */
	public SgfensProveedorProducto[] findWhereMaxMenudeoEquals(double maxMenudeo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'PRECIO_MAYOREO = :precioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWherePrecioMayoreoEquals(double precioMayoreo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MIN_MAYOREO = :minMayoreo'.
	 */
	public SgfensProveedorProducto[] findWhereMinMayoreoEquals(double minMayoreo) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_CATEGORIA = :idCategoria'.
	 */
	public SgfensProveedorProducto[] findWhereIdCategoriaEquals(int idCategoria) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'NOMBRE_IMAGEN_PRODUCTO_SERVICIO = :nombreImagenProductoServicio'.
	 */
	public SgfensProveedorProducto[] findWhereNombreImagenProductoServicioEquals(String nombreImagenProductoServicio) throws SgfensProveedorProductoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the specified arbitrary SQL statement
	 */
	public SgfensProveedorProducto[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensProveedorProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the specified arbitrary SQL statement
	 */
	public SgfensProveedorProducto[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensProveedorProductoDaoException;

}
