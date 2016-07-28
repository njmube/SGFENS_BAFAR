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

public interface SmsAgendaDestinatarioDao
{
	/** 
	 * Inserts a new row in the sms_agenda_destinatario table.
	 */
	public SmsAgendaDestinatarioPk insert(SmsAgendaDestinatario dto) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Updates a single row in the sms_agenda_destinatario table.
	 */
	public void update(SmsAgendaDestinatarioPk pk, SmsAgendaDestinatario dto) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Deletes a single row in the sms_agenda_destinatario table.
	 */
	public void delete(SmsAgendaDestinatarioPk pk) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns the rows from the sms_agenda_destinatario table that matches the specified primary-key value.
	 */
	public SmsAgendaDestinatario findByPrimaryKey(SmsAgendaDestinatarioPk pk) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'id_sms_agenda_dest = :idSmsAgendaDest'.
	 */
	public SmsAgendaDestinatario findByPrimaryKey(int idSmsAgendaDest) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria ''.
	 */
	public SmsAgendaDestinatario[] findAll() throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'id_sms_agenda_dest = :idSmsAgendaDest'.
	 */
	public SmsAgendaDestinatario[] findWhereIdSmsAgendaDestEquals(int idSmsAgendaDest) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'numero_celular = :numeroCelular'.
	 */
	public SmsAgendaDestinatario[] findWhereNumeroCelularEquals(String numeroCelular) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'nombre = :nombre'.
	 */
	public SmsAgendaDestinatario[] findWhereNombreEquals(String nombre) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'campo_extra_1 = :campoExtra1'.
	 */
	public SmsAgendaDestinatario[] findWhereCampoExtra1Equals(String campoExtra1) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'campo_extra_2 = :campoExtra2'.
	 */
	public SmsAgendaDestinatario[] findWhereCampoExtra2Equals(String campoExtra2) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'campo_extra_3 = :campoExtra3'.
	 */
	public SmsAgendaDestinatario[] findWhereCampoExtra3Equals(String campoExtra3) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'campo_extra_4 = :campoExtra4'.
	 */
	public SmsAgendaDestinatario[] findWhereCampoExtra4Equals(String campoExtra4) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'id_sms_agenda_grupo = :idSmsAgendaGrupo'.
	 */
	public SmsAgendaDestinatario[] findWhereIdSmsAgendaGrupoEquals(int idSmsAgendaGrupo) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public SmsAgendaDestinatario[] findWhereIdEmpresaEquals(int idEmpresa) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public SmsAgendaDestinatario[] findWhereIdEstatusEquals(int idEstatus) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the specified arbitrary SQL statement
	 */
	public SmsAgendaDestinatario[] findByDynamicSelect(String sql, Object[] sqlParams) throws SmsAgendaDestinatarioDaoException;

	/** 
	 * Returns all rows from the sms_agenda_destinatario table that match the specified arbitrary SQL statement
	 */
	public SmsAgendaDestinatario[] findByDynamicWhere(String sql, Object[] sqlParams) throws SmsAgendaDestinatarioDaoException;

}
