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

public interface EmpresaConfigDao
{
	/** 
	 * Inserts a new row in the empresa_config table.
	 */
	public EmpresaConfigPk insert(EmpresaConfig dto) throws EmpresaConfigDaoException;

	/** 
	 * Updates a single row in the empresa_config table.
	 */
	public void update(EmpresaConfigPk pk, EmpresaConfig dto) throws EmpresaConfigDaoException;

	/** 
	 * Deletes a single row in the empresa_config table.
	 */
	public void delete(EmpresaConfigPk pk) throws EmpresaConfigDaoException;

	/** 
	 * Returns the rows from the empresa_config table that matches the specified primary-key value.
	 */
	public EmpresaConfig findByPrimaryKey(EmpresaConfigPk pk) throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public EmpresaConfig findByPrimaryKey(int idEmpresa) throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the criteria ''.
	 */
	public EmpresaConfig[] findAll() throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public EmpresaConfig[] findWhereIdEmpresaEquals(int idEmpresa) throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the criteria 'DIAS_CORTE = :diasCorte'.
	 */
	public EmpresaConfig[] findWhereDiasCorteEquals(String diasCorte) throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the criteria 'HORA_CORTE = :horaCorte'.
	 */
	public EmpresaConfig[] findWhereHoraCorteEquals(Date horaCorte) throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the criteria 'INVENTARIO_INICIAL_AUTO = :inventarioInicialAuto'.
	 */
	public EmpresaConfig[] findWhereInventarioInicialAutoEquals(int inventarioInicialAuto) throws EmpresaConfigDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the empresa_config table that match the specified arbitrary SQL statement
	 */
	public EmpresaConfig[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpresaConfigDaoException;

	/** 
	 * Returns all rows from the empresa_config table that match the specified arbitrary SQL statement
	 */
	public EmpresaConfig[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpresaConfigDaoException;

}
