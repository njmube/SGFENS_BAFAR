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

public interface QuartzViaEmbarqueDao
{
	/** 
	 * Inserts a new row in the quartz_via_embarque table.
	 */
	public QuartzViaEmbarquePk insert(QuartzViaEmbarque dto) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Updates a single row in the quartz_via_embarque table.
	 */
	public void update(QuartzViaEmbarquePk pk, QuartzViaEmbarque dto) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Deletes a single row in the quartz_via_embarque table.
	 */
	public void delete(QuartzViaEmbarquePk pk) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns the rows from the quartz_via_embarque table that matches the specified primary-key value.
	 */
	public QuartzViaEmbarque findByPrimaryKey(QuartzViaEmbarquePk pk) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'ID_QUARTZ = :idQuartz'.
	 */
	public QuartzViaEmbarque findByPrimaryKey(int idQuartz) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria ''.
	 */
	public QuartzViaEmbarque[] findAll() throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'ID_QUARTZ = :idQuartz'.
	 */
	public QuartzViaEmbarque[] findWhereIdQuartzEquals(int idQuartz) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'ID_VIA_EMBARQUE_EVC = :idViaEmbarqueEvc'.
	 */
	public QuartzViaEmbarque[] findWhereIdViaEmbarqueEvcEquals(int idViaEmbarqueEvc) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'ID_VIA_EMBARQUE_SISTEM_TERCERO = :idViaEmbarqueSistemTercero'.
	 */
	public QuartzViaEmbarque[] findWhereIdViaEmbarqueSistemTerceroEquals(int idViaEmbarqueSistemTercero) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'CLAVE = :clave'.
	 */
	public QuartzViaEmbarque[] findWhereClaveEquals(String clave) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'ID_SISTEMA_TERCERO = :idSistemaTercero'.
	 */
	public QuartzViaEmbarque[] findWhereIdSistemaTerceroEquals(int idSistemaTercero) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public QuartzViaEmbarque[] findWhereIdEmpresaEquals(int idEmpresa) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the specified arbitrary SQL statement
	 */
	public QuartzViaEmbarque[] findByDynamicSelect(String sql, Object[] sqlParams) throws QuartzViaEmbarqueDaoException;

	/** 
	 * Returns all rows from the quartz_via_embarque table that match the specified arbitrary SQL statement
	 */
	public QuartzViaEmbarque[] findByDynamicWhere(String sql, Object[] sqlParams) throws QuartzViaEmbarqueDaoException;

}
