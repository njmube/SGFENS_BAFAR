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

public interface SmsPlantillaDao
{
	/** 
	 * Inserts a new row in the sms_plantilla table.
	 */
	public SmsPlantillaPk insert(SmsPlantilla dto) throws SmsPlantillaDaoException;

	/** 
	 * Updates a single row in the sms_plantilla table.
	 */
	public void update(SmsPlantillaPk pk, SmsPlantilla dto) throws SmsPlantillaDaoException;

	/** 
	 * Deletes a single row in the sms_plantilla table.
	 */
	public void delete(SmsPlantillaPk pk) throws SmsPlantillaDaoException;

	/** 
	 * Returns the rows from the sms_plantilla table that matches the specified primary-key value.
	 */
	public SmsPlantilla findByPrimaryKey(SmsPlantillaPk pk) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'id_sms_plantilla = :idSmsPlantilla'.
	 */
	public SmsPlantilla findByPrimaryKey(int idSmsPlantilla) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria ''.
	 */
	public SmsPlantilla[] findAll() throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'id_sms_plantilla = :idSmsPlantilla'.
	 */
	public SmsPlantilla[] findWhereIdSmsPlantillaEquals(int idSmsPlantilla) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'alias_plantilla = :aliasPlantilla'.
	 */
	public SmsPlantilla[] findWhereAliasPlantillaEquals(String aliasPlantilla) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public SmsPlantilla[] findWhereIdEmpresaEquals(int idEmpresa) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public SmsPlantilla[] findWhereIdEstatusEquals(int idEstatus) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'asunto = :asunto'.
	 */
	public SmsPlantilla[] findWhereAsuntoEquals(String asunto) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'contenido = :contenido'.
	 */
	public SmsPlantilla[] findWhereContenidoEquals(String contenido) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'is_fijo_sistema = :isFijoSistema'.
	 */
	public SmsPlantilla[] findWhereIsFijoSistemaEquals(int isFijoSistema) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'id_usuario_preto = :idUsuarioPreto'.
	 */
	public SmsPlantilla[] findWhereIdUsuarioPretoEquals(int idUsuarioPreto) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'id_usuario_ventas = :idUsuarioVentas'.
	 */
	public SmsPlantilla[] findWhereIdUsuarioVentasEquals(int idUsuarioVentas) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the criteria 'fecha_hr_creado = :fechaHrCreado'.
	 */
	public SmsPlantilla[] findWhereFechaHrCreadoEquals(Date fechaHrCreado) throws SmsPlantillaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sms_plantilla table that match the specified arbitrary SQL statement
	 */
	public SmsPlantilla[] findByDynamicSelect(String sql, Object[] sqlParams) throws SmsPlantillaDaoException;

	/** 
	 * Returns all rows from the sms_plantilla table that match the specified arbitrary SQL statement
	 */
	public SmsPlantilla[] findByDynamicWhere(String sql, Object[] sqlParams) throws SmsPlantillaDaoException;

}
