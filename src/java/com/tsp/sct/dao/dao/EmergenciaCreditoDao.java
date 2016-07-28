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

public interface EmergenciaCreditoDao
{
	/** 
	 * Inserts a new row in the emergencia_credito table.
	 */
	public EmergenciaCreditoPk insert(EmergenciaCredito dto) throws EmergenciaCreditoDaoException;

	/** 
	 * Updates a single row in the emergencia_credito table.
	 */
	public void update(EmergenciaCreditoPk pk, EmergenciaCredito dto) throws EmergenciaCreditoDaoException;

	/** 
	 * Deletes a single row in the emergencia_credito table.
	 */
	public void delete(EmergenciaCreditoPk pk) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns the rows from the emergencia_credito table that matches the specified primary-key value.
	 */
	public EmergenciaCredito findByPrimaryKey(EmergenciaCreditoPk pk) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'ID_EMERGENCIA = :idEmergencia'.
	 */
	public EmergenciaCredito findByPrimaryKey(int idEmergencia) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria ''.
	 */
	public EmergenciaCredito[] findAll() throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'ID_EMERGENCIA = :idEmergencia'.
	 */
	public EmergenciaCredito[] findWhereIdEmergenciaEquals(int idEmergencia) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public EmergenciaCredito[] findWhereIdEmpresaEquals(int idEmpresa) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'FECHA_INICIO = :fechaInicio'.
	 */
	public EmergenciaCredito[] findWhereFechaInicioEquals(Date fechaInicio) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'FECHA_PAGO = :fechaPago'.
	 */
	public EmergenciaCredito[] findWhereFechaPagoEquals(Date fechaPago) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'MONTO_PAGADO = :montoPagado'.
	 */
	public EmergenciaCredito[] findWhereMontoPagadoEquals(double montoPagado) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'CREDITOS_OCUPADOS = :creditosOcupados'.
	 */
	public EmergenciaCredito[] findWhereCreditosOcupadosEquals(int creditosOcupados) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the criteria 'RFC_EMPRESA = :rfcEmpresa'.
	 */
	public EmergenciaCredito[] findWhereRfcEmpresaEquals(String rfcEmpresa) throws EmergenciaCreditoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the emergencia_credito table that match the specified arbitrary SQL statement
	 */
	public EmergenciaCredito[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmergenciaCreditoDaoException;

	/** 
	 * Returns all rows from the emergencia_credito table that match the specified arbitrary SQL statement
	 */
	public EmergenciaCredito[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmergenciaCreditoDaoException;

}
