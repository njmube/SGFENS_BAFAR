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

public interface NominaTipoContratoDao
{
	/** 
	 * Inserts a new row in the nomina_tipo_contrato table.
	 */
	public NominaTipoContratoPk insert(NominaTipoContrato dto) throws NominaTipoContratoDaoException;

	/** 
	 * Updates a single row in the nomina_tipo_contrato table.
	 */
	public void update(NominaTipoContratoPk pk, NominaTipoContrato dto) throws NominaTipoContratoDaoException;

	/** 
	 * Deletes a single row in the nomina_tipo_contrato table.
	 */
	public void delete(NominaTipoContratoPk pk) throws NominaTipoContratoDaoException;

	/** 
	 * Returns the rows from the nomina_tipo_contrato table that matches the specified primary-key value.
	 */
	public NominaTipoContrato findByPrimaryKey(NominaTipoContratoPk pk) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria 'ID_TIPO_CONTRATO = :idTipoContrato'.
	 */
	public NominaTipoContrato findByPrimaryKey(int idTipoContrato) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria ''.
	 */
	public NominaTipoContrato[] findAll() throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria 'ID_TIPO_CONTRATO = :idTipoContrato'.
	 */
	public NominaTipoContrato[] findWhereIdTipoContratoEquals(int idTipoContrato) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public NominaTipoContrato[] findWhereIdEmpresaEquals(int idEmpresa) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria 'NOMBRE = :nombre'.
	 */
	public NominaTipoContrato[] findWhereNombreEquals(String nombre) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public NominaTipoContrato[] findWhereDescripcionEquals(String descripcion) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public NominaTipoContrato[] findWhereIdEstatusEquals(int idEstatus) throws NominaTipoContratoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the specified arbitrary SQL statement
	 */
	public NominaTipoContrato[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaTipoContratoDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_contrato table that match the specified arbitrary SQL statement
	 */
	public NominaTipoContrato[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaTipoContratoDaoException;

}
