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

public interface ComodatoMantenimientoDao
{
	/** 
	 * Inserts a new row in the comodato_mantenimiento table.
	 */
	public ComodatoMantenimientoPk insert(ComodatoMantenimiento dto) throws ComodatoMantenimientoDaoException;

	/** 
	 * Updates a single row in the comodato_mantenimiento table.
	 */
	public void update(ComodatoMantenimientoPk pk, ComodatoMantenimiento dto) throws ComodatoMantenimientoDaoException;

	/** 
	 * Deletes a single row in the comodato_mantenimiento table.
	 */
	public void delete(ComodatoMantenimientoPk pk) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns the rows from the comodato_mantenimiento table that matches the specified primary-key value.
	 */
	public ComodatoMantenimiento findByPrimaryKey(ComodatoMantenimientoPk pk) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_COMODATO_MANTENIMIENTO = :idComodatoMantenimiento'.
	 */
	public ComodatoMantenimiento findByPrimaryKey(int idComodatoMantenimiento) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria ''.
	 */
	public ComodatoMantenimiento[] findAll() throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_COMODATO_MANTENIMIENTO = :idComodatoMantenimiento'.
	 */
	public ComodatoMantenimiento[] findWhereIdComodatoMantenimientoEquals(int idComodatoMantenimiento) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public ComodatoMantenimiento[] findWhereIdComodatoEquals(int idComodato) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public ComodatoMantenimiento[] findWhereIdClienteEquals(int idCliente) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ComodatoMantenimiento[] findWhereIdEmpresaEquals(int idEmpresa) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'TECNICO = :tecnico'.
	 */
	public ComodatoMantenimiento[] findWhereTecnicoEquals(String tecnico) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public ComodatoMantenimiento[] findWhereDescripcionEquals(String descripcion) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ESTATUS = :estatus'.
	 */
	public ComodatoMantenimiento[] findWhereEstatusEquals(int estatus) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'NOMBRE_ATENDIO = :nombreAtendio'.
	 */
	public ComodatoMantenimiento[] findWhereNombreAtendioEquals(String nombreAtendio) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'FECHA_REALIZACION_MANTENIMIENTO = :fechaRealizacionMantenimiento'.
	 */
	public ComodatoMantenimiento[] findWhereFechaRealizacionMantenimientoEquals(Date fechaRealizacionMantenimiento) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'FECHA_PROX_MANTENIMIENTO = :fechaProxMantenimiento'.
	 */
	public ComodatoMantenimiento[] findWhereFechaProxMantenimientoEquals(Date fechaProxMantenimiento) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'COSTO = :costo'.
	 */
	public ComodatoMantenimiento[] findWhereCostoEquals(double costo) throws ComodatoMantenimientoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the specified arbitrary SQL statement
	 */
	public ComodatoMantenimiento[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComodatoMantenimientoDaoException;

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the specified arbitrary SQL statement
	 */
	public ComodatoMantenimiento[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComodatoMantenimientoDaoException;

}
