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

public interface AduanaDao
{
	/** 
	 * Inserts a new row in the aduana table.
	 */
	public AduanaPk insert(Aduana dto) throws AduanaDaoException;

	/** 
	 * Updates a single row in the aduana table.
	 */
	public void update(AduanaPk pk, Aduana dto) throws AduanaDaoException;

	/** 
	 * Deletes a single row in the aduana table.
	 */
	public void delete(AduanaPk pk) throws AduanaDaoException;

	/** 
	 * Returns the rows from the aduana table that matches the specified primary-key value.
	 */
	public Aduana findByPrimaryKey(AduanaPk pk) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'ID_ADUANA = :idAduana'.
	 */
	public Aduana findByPrimaryKey(int idAduana) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria ''.
	 */
	public Aduana[] findAll() throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'ID_ADUANA = :idAduana'.
	 */
	public Aduana[] findWhereIdAduanaEquals(int idAduana) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'ID_COMPROBANTE_DESCRIPCION = :idComprobanteDescripcion'.
	 */
	public Aduana[] findWhereIdComprobanteDescripcionEquals(int idComprobanteDescripcion) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public Aduana[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'NUM_DOCUMENTO = :numDocumento'.
	 */
	public Aduana[] findWhereNumDocumentoEquals(String numDocumento) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'FECHA_EXPEDICION = :fechaExpedicion'.
	 */
	public Aduana[] findWhereFechaExpedicionEquals(Date fechaExpedicion) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'ADUANA = :aduana'.
	 */
	public Aduana[] findWhereAduanaEquals(String aduana) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the criteria 'ORDEN = :orden'.
	 */
	public Aduana[] findWhereOrdenEquals(int orden) throws AduanaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the aduana table that match the specified arbitrary SQL statement
	 */
	public Aduana[] findByDynamicSelect(String sql, Object[] sqlParams) throws AduanaDaoException;

	/** 
	 * Returns all rows from the aduana table that match the specified arbitrary SQL statement
	 */
	public Aduana[] findByDynamicWhere(String sql, Object[] sqlParams) throws AduanaDaoException;

}
