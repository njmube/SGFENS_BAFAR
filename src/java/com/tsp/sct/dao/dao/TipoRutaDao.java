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

public interface TipoRutaDao
{
	/** 
	 * Inserts a new row in the tipo_ruta table.
	 */
	public TipoRutaPk insert(TipoRuta dto) throws TipoRutaDaoException;

	/** 
	 * Updates a single row in the tipo_ruta table.
	 */
	public void update(TipoRutaPk pk, TipoRuta dto) throws TipoRutaDaoException;

	/** 
	 * Deletes a single row in the tipo_ruta table.
	 */
	public void delete(TipoRutaPk pk) throws TipoRutaDaoException;

	/** 
	 * Returns the rows from the tipo_ruta table that matches the specified primary-key value.
	 */
	public TipoRuta findByPrimaryKey(TipoRutaPk pk) throws TipoRutaDaoException;

	/** 
	 * Returns all rows from the tipo_ruta table that match the criteria 'ID_TIPO_RUTA = :idTipoRuta'.
	 */
	public TipoRuta findByPrimaryKey(int idTipoRuta) throws TipoRutaDaoException;

	/** 
	 * Returns all rows from the tipo_ruta table that match the criteria ''.
	 */
	public TipoRuta[] findAll() throws TipoRutaDaoException;

	/** 
	 * Returns all rows from the tipo_ruta table that match the criteria 'ID_TIPO_RUTA = :idTipoRuta'.
	 */
	public TipoRuta[] findWhereIdTipoRutaEquals(int idTipoRuta) throws TipoRutaDaoException;

	/** 
	 * Returns all rows from the tipo_ruta table that match the criteria 'TIPO_RUTA = :tipoRuta'.
	 */
	public TipoRuta[] findWhereTipoRutaEquals(String tipoRuta) throws TipoRutaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipo_ruta table that match the specified arbitrary SQL statement
	 */
	public TipoRuta[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoRutaDaoException;

	/** 
	 * Returns all rows from the tipo_ruta table that match the specified arbitrary SQL statement
	 */
	public TipoRuta[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoRutaDaoException;

}
