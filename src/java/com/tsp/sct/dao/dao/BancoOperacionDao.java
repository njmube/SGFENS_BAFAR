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

public interface BancoOperacionDao
{
	/** 
	 * Inserts a new row in the banco_operacion table.
	 */
	public BancoOperacionPk insert(BancoOperacion dto) throws BancoOperacionDaoException;

	/** 
	 * Updates a single row in the banco_operacion table.
	 */
	public void update(BancoOperacionPk pk, BancoOperacion dto) throws BancoOperacionDaoException;

	/** 
	 * Deletes a single row in the banco_operacion table.
	 */
	public void delete(BancoOperacionPk pk) throws BancoOperacionDaoException;

	/** 
	 * Returns the rows from the banco_operacion table that matches the specified primary-key value.
	 */
	public BancoOperacion findByPrimaryKey(BancoOperacionPk pk) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'ID_OPERACION_BANCARIA = :idOperacionBancaria'.
	 */
	public BancoOperacion findByPrimaryKey(int idOperacionBancaria) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria ''.
	 */
	public BancoOperacion[] findAll() throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'ID_OPERACION_BANCARIA = :idOperacionBancaria'.
	 */
	public BancoOperacion[] findWhereIdOperacionBancariaEquals(int idOperacionBancaria) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public BancoOperacion[] findWhereIdEmpresaEquals(int idEmpresa) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'NO_TARJETA = :noTarjeta'.
	 */
	public BancoOperacion[] findWhereNoTarjetaEquals(String noTarjeta) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'NOMBRE_TITULAR = :nombreTitular'.
	 */
	public BancoOperacion[] findWhereNombreTitularEquals(String nombreTitular) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'MONTO = :monto'.
	 */
	public BancoOperacion[] findWhereMontoEquals(double monto) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'BANCO_AUTH = :bancoAuth'.
	 */
	public BancoOperacion[] findWhereBancoAuthEquals(String bancoAuth) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'BANCO_ORDER_ID = :bancoOrderId'.
	 */
	public BancoOperacion[] findWhereBancoOrderIdEquals(String bancoOrderId) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'BANCO_OPER_FECHA = :bancoOperFecha'.
	 */
	public BancoOperacion[] findWhereBancoOperFechaEquals(String bancoOperFecha) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'BANCO_OPER_TYPE = :bancoOperType'.
	 */
	public BancoOperacion[] findWhereBancoOperTypeEquals(String bancoOperType) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'BANCO_OPER_ISSUING_BANK = :bancoOperIssuingBank'.
	 */
	public BancoOperacion[] findWhereBancoOperIssuingBankEquals(String bancoOperIssuingBank) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public BancoOperacion[] findWhereIdEstatusEquals(int idEstatus) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'NOMBRE_ARCHIVO_IMG_IFE = :nombreArchivoImgIfe'.
	 */
	public BancoOperacion[] findWhereNombreArchivoImgIfeEquals(String nombreArchivoImgIfe) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'NOMBRE_ARCHIVO_IMG_TDC = :nombreArchivoImgTdc'.
	 */
	public BancoOperacion[] findWhereNombreArchivoImgTdcEquals(String nombreArchivoImgTdc) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'DATA_ARQC = :dataArqc'.
	 */
	public BancoOperacion[] findWhereDataArqcEquals(String dataArqc) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'DATA_AID = :dataAid'.
	 */
	public BancoOperacion[] findWhereDataAidEquals(String dataAid) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'DATA_TSI = :dataTsi'.
	 */
	public BancoOperacion[] findWhereDataTsiEquals(String dataTsi) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'DATA_REF = :dataRef'.
	 */
	public BancoOperacion[] findWhereDataRefEquals(String dataRef) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'DATA_EXTRA1 = :dataExtra1'.
	 */
	public BancoOperacion[] findWhereDataExtra1Equals(String dataExtra1) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the criteria 'DATA_EXTRA2 = :dataExtra2'.
	 */
	public BancoOperacion[] findWhereDataExtra2Equals(String dataExtra2) throws BancoOperacionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the banco_operacion table that match the specified arbitrary SQL statement
	 */
	public BancoOperacion[] findByDynamicSelect(String sql, Object[] sqlParams) throws BancoOperacionDaoException;

	/** 
	 * Returns all rows from the banco_operacion table that match the specified arbitrary SQL statement
	 */
	public BancoOperacion[] findByDynamicWhere(String sql, Object[] sqlParams) throws BancoOperacionDaoException;

}
