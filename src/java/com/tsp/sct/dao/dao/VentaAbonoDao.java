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

public interface VentaAbonoDao
{
	/** 
	 * Inserts a new row in the VENTA_ABONO table.
	 */
	public VentaAbonoPk insert(VentaAbono dto) throws VentaAbonoDaoException;

	/** 
	 * Updates a single row in the VENTA_ABONO table.
	 */
	public void update(VentaAbonoPk pk, VentaAbono dto) throws VentaAbonoDaoException;

	/** 
	 * Deletes a single row in the VENTA_ABONO table.
	 */
	public void delete(VentaAbonoPk pk) throws VentaAbonoDaoException;

	/** 
	 * Returns the rows from the VENTA_ABONO table that matches the specified primary-key value.
	 */
	public VentaAbono findByPrimaryKey(VentaAbonoPk pk) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta_abono = :idVentaAbono'.
	 */
	public VentaAbono findByPrimaryKey(int idVentaAbono) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria ''.
	 */
	public VentaAbono[] findAll() throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta_abono = :idVentaAbono'.
	 */
	public VentaAbono[] findWhereIdVentaAbonoEquals(int idVentaAbono) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta = :idVenta'.
	 */
	public VentaAbono[] findWhereIdVentaEquals(int idVenta) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'monto_abono = :montoAbono'.
	 */
	public VentaAbono[] findWhereMontoAbonoEquals(double montoAbono) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'fecha_abono = :fechaAbono'.
	 */
	public VentaAbono[] findWhereFechaAbonoEquals(Date fechaAbono) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_estatus_abono = :idEstatusAbono'.
	 */
	public VentaAbono[] findWhereIdEstatusAbonoEquals(int idEstatusAbono) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta_metodo_pago = :idVentaMetodoPago'.
	 */
	public VentaAbono[] findWhereIdVentaMetodoPagoEquals(int idVentaMetodoPago) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_operacion_bancaria = :idOperacionBancaria'.
	 */
	public VentaAbono[] findWhereIdOperacionBancariaEquals(int idOperacionBancaria) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'documento_numero = :documentoNumero'.
	 */
	public VentaAbono[] findWhereDocumentoNumeroEquals(String documentoNumero) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'observaciones = :observaciones'.
	 */
	public VentaAbono[] findWhereObservacionesEquals(String observaciones) throws VentaAbonoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the specified arbitrary SQL statement
	 */
	public VentaAbono[] findByDynamicSelect(String sql, Object[] sqlParams) throws VentaAbonoDaoException;

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the specified arbitrary SQL statement
	 */
	public VentaAbono[] findByDynamicWhere(String sql, Object[] sqlParams) throws VentaAbonoDaoException;

}
