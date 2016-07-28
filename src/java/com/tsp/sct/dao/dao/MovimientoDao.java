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

public interface MovimientoDao
{
	/** 
	 * Inserts a new row in the movimiento table.
	 */
	public MovimientoPk insert(Movimiento dto) throws MovimientoDaoException;

	/** 
	 * Updates a single row in the movimiento table.
	 */
	public void update(MovimientoPk pk, Movimiento dto) throws MovimientoDaoException;

	/** 
	 * Deletes a single row in the movimiento table.
	 */
	public void delete(MovimientoPk pk) throws MovimientoDaoException;

	/** 
	 * Returns the rows from the movimiento table that matches the specified primary-key value.
	 */
	public Movimiento findByPrimaryKey(MovimientoPk pk) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_MOVIMIENTO = :idMovimiento'.
	 */
	public Movimiento findByPrimaryKey(int idMovimiento) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria ''.
	 */
	public Movimiento[] findAll() throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_MOVIMIENTO = :idMovimiento'.
	 */
	public Movimiento[] findWhereIdMovimientoEquals(int idMovimiento) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Movimiento[] findWhereIdEmpresaEquals(int idEmpresa) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'TIPO_MOVIMIENTO = :tipoMovimiento'.
	 */
	public Movimiento[] findWhereTipoMovimientoEquals(String tipoMovimiento) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'NOMBRE_PRODUCTO = :nombreProducto'.
	 */
	public Movimiento[] findWhereNombreProductoEquals(String nombreProducto) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'contabilidad = :contabilidad'.
	 */
	public Movimiento[] findWhereContabilidadEquals(double contabilidad) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public Movimiento[] findWhereFechaRegistroEquals(Date fechaRegistro) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_PROVEEDOR = :idProveedor'.
	 */
	public Movimiento[] findWhereIdProveedorEquals(int idProveedor) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ORDEN_COMPRA = :ordenCompra'.
	 */
	public Movimiento[] findWhereOrdenCompraEquals(String ordenCompra) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'NUMERO_GUIA = :numeroGuia'.
	 */
	public Movimiento[] findWhereNumeroGuiaEquals(String numeroGuia) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_ALMACEN = :idAlmacen'.
	 */
	public Movimiento[] findWhereIdAlmacenEquals(int idAlmacen) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'CONCEPTO_MOVIMIENTO = :conceptoMovimiento'.
	 */
	public Movimiento[] findWhereConceptoMovimientoEquals(String conceptoMovimiento) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public Movimiento[] findWhereIdConceptoEquals(int idConcepto) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_ALMACEN_DESTINO = :idAlmacenDestino'.
	 */
	public Movimiento[] findWhereIdAlmacenDestinoEquals(int idAlmacenDestino) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'SINCRONIZACION_MICROSIP = :sincronizacionMicrosip'.
	 */
	public Movimiento[] findWhereSincronizacionMicrosipEquals(int sincronizacionMicrosip) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'idEmpleado = :idEmpleado'.
	 */
	public Movimiento[] findWhereIdEmpleadoEquals(int idEmpleado) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'CONTABILIDAD_PESO = :contabilidadPeso'.
	 */
	public Movimiento[] findWhereContabilidadPesoEquals(double contabilidadPeso) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'NUMERO_LOTE = :numeroLote'.
	 */
	public Movimiento[] findWhereNumeroLoteEquals(String numeroLote) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'FECHA_CADUCIDAD = :fechaCaducidad'.
	 */
	public Movimiento[] findWhereFechaCaducidadEquals(Date fechaCaducidad) throws MovimientoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the movimiento table that match the specified arbitrary SQL statement
	 */
	public Movimiento[] findByDynamicSelect(String sql, Object[] sqlParams) throws MovimientoDaoException;

	/** 
	 * Returns all rows from the movimiento table that match the specified arbitrary SQL statement
	 */
	public Movimiento[] findByDynamicWhere(String sql, Object[] sqlParams) throws MovimientoDaoException;

}
