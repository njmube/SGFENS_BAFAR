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

public interface PaqueteDao
{
	/** 
	 * Inserts a new row in the paquete table.
	 */
	public PaquetePk insert(Paquete dto) throws PaqueteDaoException;

	/** 
	 * Updates a single row in the paquete table.
	 */
	public void update(PaquetePk pk, Paquete dto) throws PaqueteDaoException;

	/** 
	 * Deletes a single row in the paquete table.
	 */
	public void delete(PaquetePk pk) throws PaqueteDaoException;

	/** 
	 * Returns the rows from the paquete table that matches the specified primary-key value.
	 */
	public Paquete findByPrimaryKey(PaquetePk pk) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria 'ID_PAQUETE = :idPaquete'.
	 */
	public Paquete findByPrimaryKey(int idPaquete) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria ''.
	 */
	public Paquete[] findAll() throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria 'ID_PAQUETE = :idPaquete'.
	 */
	public Paquete[] findWhereIdPaqueteEquals(int idPaquete) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Paquete[] findWhereIdEstatusEquals(int idEstatus) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Paquete[] findWhereIdEmpresaEquals(int idEmpresa) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Paquete[] findWhereNombreEquals(String nombre) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Paquete[] findWhereDescripcionEquals(String descripcion) throws PaqueteDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the paquete table that match the specified arbitrary SQL statement
	 */
	public Paquete[] findByDynamicSelect(String sql, Object[] sqlParams) throws PaqueteDaoException;

	/** 
	 * Returns all rows from the paquete table that match the specified arbitrary SQL statement
	 */
	public Paquete[] findByDynamicWhere(String sql, Object[] sqlParams) throws PaqueteDaoException;

}
