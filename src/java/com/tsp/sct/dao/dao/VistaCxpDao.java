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

public interface VistaCxpDao
{
	/** 
	 * Returns all rows from the vista_cxp table that match the criteria ''.
	 */
	public VistaCxp[] findAll() throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'ID_CXP_COMPROBANTE_FISCAL = :idCxpComprobanteFiscal'.
	 */
	public VistaCxp[] findWhereIdCxpComprobanteFiscalEquals(int idCxpComprobanteFiscal) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'cf_id_empresa = :cfIdEmpresa'.
	 */
	public VistaCxp[] findWhereCfIdEmpresaEquals(int cfIdEmpresa) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'ID_VALIDACION = :idValidacion'.
	 */
	public VistaCxp[] findWhereIdValidacionEquals(int idValidacion) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'EMISOR_RFC = :emisorRfc'.
	 */
	public VistaCxp[] findWhereEmisorRfcEquals(String emisorRfc) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'EMISOR_NOMBRE = :emisorNombre'.
	 */
	public VistaCxp[] findWhereEmisorNombreEquals(String emisorNombre) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'SERIE = :serie'.
	 */
	public VistaCxp[] findWhereSerieEquals(String serie) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'FOLIO = :folio'.
	 */
	public VistaCxp[] findWhereFolioEquals(String folio) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'TOTAL = :total'.
	 */
	public VistaCxp[] findWhereTotalEquals(double total) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'cf_importe_pagado = :cfImportePagado'.
	 */
	public VistaCxp[] findWhereCfImportePagadoEquals(double cfImportePagado) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'cf_fecha_hora_captura = :cfFechaHoraCaptura'.
	 */
	public VistaCxp[] findWhereCfFechaHoraCapturaEquals(Date cfFechaHoraCaptura) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'FECHA_HORA_SELLO = :fechaHoraSello'.
	 */
	public VistaCxp[] findWhereFechaHoraSelloEquals(Date fechaHoraSello) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'cf_fecha_tentativa_pago = :cfFechaTentativaPago'.
	 */
	public VistaCxp[] findWhereCfFechaTentativaPagoEquals(Date cfFechaTentativaPago) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'SELLO_EMISOR = :selloEmisor'.
	 */
	public VistaCxp[] findWhereSelloEmisorEquals(String selloEmisor) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'CFDI_UUID = :cfdiUuid'.
	 */
	public VistaCxp[] findWhereCfdiUuidEquals(String cfdiUuid) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'cf_id_estatus = :cfIdEstatus'.
	 */
	public VistaCxp[] findWhereCfIdEstatusEquals(int cfIdEstatus) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'ID_CXP_VALE_AZUL = :idCxpValeAzul'.
	 */
	public VistaCxp[] findWhereIdCxpValeAzulEquals(int idCxpValeAzul) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public VistaCxp[] findWhereIdEmpresaEquals(int idEmpresa) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'ID_FOLIO = :idFolio'.
	 */
	public VistaCxp[] findWhereIdFolioEquals(int idFolio) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'FOLIO_GENERADO = :folioGenerado'.
	 */
	public VistaCxp[] findWhereFolioGeneradoEquals(String folioGenerado) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'IMPORTE = :importe'.
	 */
	public VistaCxp[] findWhereImporteEquals(double importe) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'IMPORTE_PAGADO = :importePagado'.
	 */
	public VistaCxp[] findWhereImportePagadoEquals(double importePagado) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'CONCEPTO = :concepto'.
	 */
	public VistaCxp[] findWhereConceptoEquals(String concepto) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'FECHA_HORA_CAPTURA = :fechaHoraCaptura'.
	 */
	public VistaCxp[] findWhereFechaHoraCapturaEquals(Date fechaHoraCaptura) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'FECHA_HORA_CONTROL = :fechaHoraControl'.
	 */
	public VistaCxp[] findWhereFechaHoraControlEquals(Date fechaHoraControl) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'FECHA_TENTATIVA_PAGO = :fechaTentativaPago'.
	 */
	public VistaCxp[] findWhereFechaTentativaPagoEquals(Date fechaTentativaPago) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public VistaCxp[] findWhereIdEstatusEquals(int idEstatus) throws VistaCxpDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vista_cxp table that match the specified arbitrary SQL statement
	 */
	public VistaCxp[] findByDynamicSelect(String sql, Object[] sqlParams) throws VistaCxpDaoException;

	/** 
	 * Returns all rows from the vista_cxp table that match the specified arbitrary SQL statement
	 */
	public VistaCxp[] findByDynamicWhere(String sql, Object[] sqlParams) throws VistaCxpDaoException;

}
