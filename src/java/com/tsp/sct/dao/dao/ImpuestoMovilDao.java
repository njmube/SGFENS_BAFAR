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

public interface ImpuestoMovilDao
{
	/** 
	 * Inserts a new row in the impuesto_movil table.
	 */
	public ImpuestoMovilPk insert(ImpuestoMovil dto) throws ImpuestoMovilDaoException;

	/** 
	 * Updates a single row in the impuesto_movil table.
	 */
	public void update(ImpuestoMovilPk pk, ImpuestoMovil dto) throws ImpuestoMovilDaoException;

	/** 
	 * Deletes a single row in the impuesto_movil table.
	 */
	public void delete(ImpuestoMovilPk pk) throws ImpuestoMovilDaoException;

	/** 
	 * Returns the rows from the impuesto_movil table that matches the specified primary-key value.
	 */
	public ImpuestoMovil findByPrimaryKey(ImpuestoMovilPk pk) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'ID_IMPUESTO = :idImpuesto'.
	 */
	public ImpuestoMovil findByPrimaryKey(int idImpuesto) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria ''.
	 */
	public ImpuestoMovil[] findAll() throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'ID_IMPUESTO = :idImpuesto'.
	 */
	public ImpuestoMovil[] findWhereIdImpuestoEquals(int idImpuesto) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ImpuestoMovil[] findWhereIdEmpresaEquals(int idEmpresa) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'NOMBRE = :nombre'.
	 */
	public ImpuestoMovil[] findWhereNombreEquals(String nombre) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public ImpuestoMovil[] findWhereDescripcionEquals(String descripcion) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'PORCENTAJE = :porcentaje'.
	 */
	public ImpuestoMovil[] findWherePorcentajeEquals(float porcentaje) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'TRASLADADO = :trasladado'.
	 */
	public ImpuestoMovil[] findWhereTrasladadoEquals(short trasladado) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public ImpuestoMovil[] findWhereIdEstatusEquals(int idEstatus) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the criteria 'IMPUESTO_LOCAL = :impuestoLocal'.
	 */
	public ImpuestoMovil[] findWhereImpuestoLocalEquals(short impuestoLocal) throws ImpuestoMovilDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the impuesto_movil table that match the specified arbitrary SQL statement
	 */
	public ImpuestoMovil[] findByDynamicSelect(String sql, Object[] sqlParams) throws ImpuestoMovilDaoException;

	/** 
	 * Returns all rows from the impuesto_movil table that match the specified arbitrary SQL statement
	 */
	public ImpuestoMovil[] findByDynamicWhere(String sql, Object[] sqlParams) throws ImpuestoMovilDaoException;

}
