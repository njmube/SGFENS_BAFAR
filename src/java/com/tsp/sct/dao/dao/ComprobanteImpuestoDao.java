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

public interface ComprobanteImpuestoDao
{
	/** 
	 * Inserts a new row in the comprobante_impuesto table.
	 */
	public ComprobanteImpuestoPk insert(ComprobanteImpuesto dto) throws ComprobanteImpuestoDaoException;

	/** 
	 * Updates a single row in the comprobante_impuesto table.
	 */
	public void update(ComprobanteImpuestoPk pk, ComprobanteImpuesto dto) throws ComprobanteImpuestoDaoException;

	/** 
	 * Deletes a single row in the comprobante_impuesto table.
	 */
	public void delete(ComprobanteImpuestoPk pk) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns the rows from the comprobante_impuesto table that matches the specified primary-key value.
	 */
	public ComprobanteImpuesto findByPrimaryKey(ComprobanteImpuestoPk pk) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the criteria 'ID_IMPUESTO = :idImpuesto AND ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public ComprobanteImpuesto findByPrimaryKey(int idImpuesto, int idComprobanteFiscal) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the criteria ''.
	 */
	public ComprobanteImpuesto[] findAll() throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the criteria 'ID_IMPUESTO = :idImpuesto'.
	 */
	public ComprobanteImpuesto[] findWhereIdImpuestoEquals(int idImpuesto) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public ComprobanteImpuesto[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the criteria 'ID_COMPROBANTE_IMPUESTO = :idComprobanteImpuesto'.
	 */
	public ComprobanteImpuesto[] findWhereIdComprobanteImpuestoEquals(int idComprobanteImpuesto) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the criteria 'ORDEN = :orden'.
	 */
	public ComprobanteImpuesto[] findWhereOrdenEquals(int orden) throws ComprobanteImpuestoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the specified arbitrary SQL statement
	 */
	public ComprobanteImpuesto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComprobanteImpuestoDaoException;

	/** 
	 * Returns all rows from the comprobante_impuesto table that match the specified arbitrary SQL statement
	 */
	public ComprobanteImpuesto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComprobanteImpuestoDaoException;

}
