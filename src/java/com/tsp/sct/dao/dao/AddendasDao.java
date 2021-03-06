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

public interface AddendasDao
{
	/** 
	 * Inserts a new row in the addendas table.
	 */
	public AddendasPk insert(Addendas dto) throws AddendasDaoException;

	/** 
	 * Updates a single row in the addendas table.
	 */
	public void update(AddendasPk pk, Addendas dto) throws AddendasDaoException;

	/** 
	 * Deletes a single row in the addendas table.
	 */
	public void delete(AddendasPk pk) throws AddendasDaoException;

	/** 
	 * Returns the rows from the addendas table that matches the specified primary-key value.
	 */
	public Addendas findByPrimaryKey(AddendasPk pk) throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the criteria 'ID_ADDENDAS = :idAddendas'.
	 */
	public Addendas findByPrimaryKey(int idAddendas) throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the criteria ''.
	 */
	public Addendas[] findAll() throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the criteria 'ID_ADDENDAS = :idAddendas'.
	 */
	public Addendas[] findWhereIdAddendasEquals(int idAddendas) throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Addendas[] findWhereIdEstatusEquals(int idEstatus) throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the criteria 'NOMBRE_XML = :nombreXml'.
	 */
	public Addendas[] findWhereNombreXmlEquals(String nombreXml) throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the criteria 'NOMBRE_CLIENTE = :nombreCliente'.
	 */
	public Addendas[] findWhereNombreClienteEquals(String nombreCliente) throws AddendasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the addendas table that match the specified arbitrary SQL statement
	 */
	public Addendas[] findByDynamicSelect(String sql, Object[] sqlParams) throws AddendasDaoException;

	/** 
	 * Returns all rows from the addendas table that match the specified arbitrary SQL statement
	 */
	public Addendas[] findByDynamicWhere(String sql, Object[] sqlParams) throws AddendasDaoException;

}
