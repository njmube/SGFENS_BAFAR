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

public interface RelDemopruebasDao
{
	/** 
	 * Inserts a new row in the rel_demopruebas table.
	 */
	public void insert(RelDemopruebas dto) throws RelDemopruebasDaoException;

	/** 
	 * Returns all rows from the rel_demopruebas table that match the criteria ''.
	 */
	public RelDemopruebas[] findAll() throws RelDemopruebasDaoException;

	/** 
	 * Returns all rows from the rel_demopruebas table that match the criteria 'ID_USUARIO_DEMO = :idUsuarioDemo'.
	 */
	public RelDemopruebas[] findWhereIdUsuarioDemoEquals(int idUsuarioDemo) throws RelDemopruebasDaoException;

	/** 
	 * Returns all rows from the rel_demopruebas table that match the criteria 'ID_USUARIO_PRUEBAS = :idUsuarioPruebas'.
	 */
	public RelDemopruebas[] findWhereIdUsuarioPruebasEquals(int idUsuarioPruebas) throws RelDemopruebasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the rel_demopruebas table that match the specified arbitrary SQL statement
	 */
	public RelDemopruebas[] findByDynamicSelect(String sql, Object[] sqlParams) throws RelDemopruebasDaoException;

	/** 
	 * Returns all rows from the rel_demopruebas table that match the specified arbitrary SQL statement
	 */
	public RelDemopruebas[] findByDynamicWhere(String sql, Object[] sqlParams) throws RelDemopruebasDaoException;

}
