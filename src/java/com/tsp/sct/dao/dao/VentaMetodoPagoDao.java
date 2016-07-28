/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface VentaMetodoPagoDao
{
	/** 
	 * Inserts a new row in the VENTA_METODO_PAGO table.
	 */
	public VentaMetodoPagoPk insert(VentaMetodoPago dto) throws VentaMetodoPagoDaoException;

	/** 
	 * Updates a single row in the VENTA_METODO_PAGO table.
	 */
	public void update(VentaMetodoPagoPk pk, VentaMetodoPago dto) throws VentaMetodoPagoDaoException;

	/** 
	 * Deletes a single row in the VENTA_METODO_PAGO table.
	 */
	public void delete(VentaMetodoPagoPk pk) throws VentaMetodoPagoDaoException;

	/** 
	 * Returns the rows from the VENTA_METODO_PAGO table that matches the specified primary-key value.
	 */
	public VentaMetodoPago findByPrimaryKey(VentaMetodoPagoPk pk) throws VentaMetodoPagoDaoException;

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the criteria 'id_venta_metodo_pago = :idVentaMetodoPago'.
	 */
	public VentaMetodoPago findByPrimaryKey(int idVentaMetodoPago) throws VentaMetodoPagoDaoException;

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the criteria ''.
	 */
	public VentaMetodoPago[] findAll() throws VentaMetodoPagoDaoException;

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the criteria 'id_venta_metodo_pago = :idVentaMetodoPago'.
	 */
	public VentaMetodoPago[] findWhereIdVentaMetodoPagoEquals(int idVentaMetodoPago) throws VentaMetodoPagoDaoException;

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the criteria 'nombre_metodo_pago = :nombreMetodoPago'.
	 */
	public VentaMetodoPago[] findWhereNombreMetodoPagoEquals(String nombreMetodoPago) throws VentaMetodoPagoDaoException;

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the criteria 'descripcion_metodo_pago = :descripcionMetodoPago'.
	 */
	public VentaMetodoPago[] findWhereDescripcionMetodoPagoEquals(String descripcionMetodoPago) throws VentaMetodoPagoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the specified arbitrary SQL statement
	 */
	public VentaMetodoPago[] findByDynamicSelect(String sql, Object[] sqlParams) throws VentaMetodoPagoDaoException;

	/** 
	 * Returns all rows from the VENTA_METODO_PAGO table that match the specified arbitrary SQL statement
	 */
	public VentaMetodoPago[] findByDynamicWhere(String sql, Object[] sqlParams) throws VentaMetodoPagoDaoException;

}
