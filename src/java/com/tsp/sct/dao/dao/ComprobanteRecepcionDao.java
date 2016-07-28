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

public interface ComprobanteRecepcionDao
{
	/** 
	 * Inserts a new row in the comprobante_recepcion table.
	 */
	public ComprobanteRecepcionPk insert(ComprobanteRecepcion dto) throws ComprobanteRecepcionDaoException;

	/** 
	 * Updates a single row in the comprobante_recepcion table.
	 */
	public void update(ComprobanteRecepcionPk pk, ComprobanteRecepcion dto) throws ComprobanteRecepcionDaoException;

	/** 
	 * Deletes a single row in the comprobante_recepcion table.
	 */
	public void delete(ComprobanteRecepcionPk pk) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns the rows from the comprobante_recepcion table that matches the specified primary-key value.
	 */
	public ComprobanteRecepcion findByPrimaryKey(ComprobanteRecepcionPk pk) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'ID_COMPROBANTE_RECEPCION = :idComprobanteRecepcion'.
	 */
	public ComprobanteRecepcion findByPrimaryKey(int idComprobanteRecepcion) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria ''.
	 */
	public ComprobanteRecepcion[] findAll() throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'ID_COMPROBANTE_RECEPCION = :idComprobanteRecepcion'.
	 */
	public ComprobanteRecepcion[] findWhereIdComprobanteRecepcionEquals(int idComprobanteRecepcion) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ComprobanteRecepcion[] findWhereIdEmpresaEquals(int idEmpresa) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'ID_PROVEEDORES = :idProveedores'.
	 */
	public ComprobanteRecepcion[] findWhereIdProveedoresEquals(int idProveedores) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'FOLIO = :folio'.
	 */
	public ComprobanteRecepcion[] findWhereFolioEquals(String folio) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'TOTAL = :total'.
	 */
	public ComprobanteRecepcion[] findWhereTotalEquals(float total) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'ARCHIVO_XML = :archivoXml'.
	 */
	public ComprobanteRecepcion[] findWhereArchivoXmlEquals(String archivoXml) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'FECHA_INGRESO = :fechaIngreso'.
	 */
	public ComprobanteRecepcion[] findWhereFechaIngresoEquals(Date fechaIngreso) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'FECHA_EXPEDICION = :fechaExpedicion'.
	 */
	public ComprobanteRecepcion[] findWhereFechaExpedicionEquals(Date fechaExpedicion) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the criteria 'V3 = :v3'.
	 */
	public ComprobanteRecepcion[] findWhereV3Equals(String v3) throws ComprobanteRecepcionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the specified arbitrary SQL statement
	 */
	public ComprobanteRecepcion[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComprobanteRecepcionDaoException;

	/** 
	 * Returns all rows from the comprobante_recepcion table that match the specified arbitrary SQL statement
	 */
	public ComprobanteRecepcion[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComprobanteRecepcionDaoException;

}
