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

public interface CxpValeAzulDao
{
	/** 
	 * Inserts a new row in the cxp_vale_azul table.
	 */
	public CxpValeAzulPk insert(CxpValeAzul dto) throws CxpValeAzulDaoException;

	/** 
	 * Updates a single row in the cxp_vale_azul table.
	 */
	public void update(CxpValeAzulPk pk, CxpValeAzul dto) throws CxpValeAzulDaoException;

	/** 
	 * Deletes a single row in the cxp_vale_azul table.
	 */
	public void delete(CxpValeAzulPk pk) throws CxpValeAzulDaoException;

	/** 
	 * Returns the rows from the cxp_vale_azul table that matches the specified primary-key value.
	 */
	public CxpValeAzul findByPrimaryKey(CxpValeAzulPk pk) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_CXP_VALE_AZUL = :idCxpValeAzul'.
	 */
	public CxpValeAzul findByPrimaryKey(int idCxpValeAzul) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria ''.
	 */
	public CxpValeAzul[] findAll() throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_CXP_VALE_AZUL = :idCxpValeAzul'.
	 */
	public CxpValeAzul[] findWhereIdCxpValeAzulEquals(int idCxpValeAzul) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public CxpValeAzul[] findWhereIdEmpresaEquals(int idEmpresa) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_FOLIO = :idFolio'.
	 */
	public CxpValeAzul[] findWhereIdFolioEquals(int idFolio) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FOLIO_GENERADO = :folioGenerado'.
	 */
	public CxpValeAzul[] findWhereFolioGeneradoEquals(String folioGenerado) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'IMPORTE = :importe'.
	 */
	public CxpValeAzul[] findWhereImporteEquals(double importe) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'IMPORTE_PAGADO = :importePagado'.
	 */
	public CxpValeAzul[] findWhereImportePagadoEquals(double importePagado) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'CONCEPTO = :concepto'.
	 */
	public CxpValeAzul[] findWhereConceptoEquals(String concepto) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FECHA_HORA_CAPTURA = :fechaHoraCaptura'.
	 */
	public CxpValeAzul[] findWhereFechaHoraCapturaEquals(Date fechaHoraCaptura) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FECHA_HORA_CONTROL = :fechaHoraControl'.
	 */
	public CxpValeAzul[] findWhereFechaHoraControlEquals(Date fechaHoraControl) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FECHA_TENTATIVA_PAGO = :fechaTentativaPago'.
	 */
	public CxpValeAzul[] findWhereFechaTentativaPagoEquals(Date fechaTentativaPago) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public CxpValeAzul[] findWhereIdEstatusEquals(int idEstatus) throws CxpValeAzulDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the specified arbitrary SQL statement
	 */
	public CxpValeAzul[] findByDynamicSelect(String sql, Object[] sqlParams) throws CxpValeAzulDaoException;

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the specified arbitrary SQL statement
	 */
	public CxpValeAzul[] findByDynamicWhere(String sql, Object[] sqlParams) throws CxpValeAzulDaoException;

}
