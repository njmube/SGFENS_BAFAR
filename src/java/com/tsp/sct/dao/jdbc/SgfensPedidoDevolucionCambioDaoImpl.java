/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.jdbc;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class SgfensPedidoDevolucionCambioDaoImpl extends AbstractDAO implements SgfensPedidoDevolucionCambioDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_PEDIDO_DEVOL_CAMBIO, ID_ESTATUS, ID_EMPRESA, ID_EMPLEADO, ID_CONCEPTO, ID_PEDIDO, ID_TIPO, APTO_PARA_VENTA, NO_APTO_PARA_VENTA, ID_CLASIFICACION, DESCRIPCION_CLASIFICACION, ID_CONCEPTO_ENTREGADO, MONTO_RESULTANTE, DIFERENCIA_FAVOR, FECHA, CANTIDAD_DEVUELTA, FOLIO_MOVIL, DEVOLUCION_EFCTIVO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PEDIDO_DEVOL_CAMBIO, ID_ESTATUS, ID_EMPRESA, ID_EMPLEADO, ID_CONCEPTO, ID_PEDIDO, ID_TIPO, APTO_PARA_VENTA, NO_APTO_PARA_VENTA, ID_CLASIFICACION, DESCRIPCION_CLASIFICACION, ID_CONCEPTO_ENTREGADO, MONTO_RESULTANTE, DIFERENCIA_FAVOR, FECHA, CANTIDAD_DEVUELTA, FOLIO_MOVIL, DEVOLUCION_EFCTIVO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PEDIDO_DEVOL_CAMBIO = ?, ID_ESTATUS = ?, ID_EMPRESA = ?, ID_EMPLEADO = ?, ID_CONCEPTO = ?, ID_PEDIDO = ?, ID_TIPO = ?, APTO_PARA_VENTA = ?, NO_APTO_PARA_VENTA = ?, ID_CLASIFICACION = ?, DESCRIPCION_CLASIFICACION = ?, ID_CONCEPTO_ENTREGADO = ?, MONTO_RESULTANTE = ?, DIFERENCIA_FAVOR = ?, FECHA = ?, CANTIDAD_DEVUELTA = ?, FOLIO_MOVIL = ?, DEVOLUCION_EFCTIVO = ? WHERE ID_PEDIDO_DEVOL_CAMBIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_PEDIDO_DEVOL_CAMBIO = ?";

	/** 
	 * Index of column ID_PEDIDO_DEVOL_CAMBIO
	 */
	protected static final int COLUMN_ID_PEDIDO_DEVOL_CAMBIO = 1;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 2;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 3;

	/** 
	 * Index of column ID_EMPLEADO
	 */
	protected static final int COLUMN_ID_EMPLEADO = 4;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 5;

	/** 
	 * Index of column ID_PEDIDO
	 */
	protected static final int COLUMN_ID_PEDIDO = 6;

	/** 
	 * Index of column ID_TIPO
	 */
	protected static final int COLUMN_ID_TIPO = 7;

	/** 
	 * Index of column APTO_PARA_VENTA
	 */
	protected static final int COLUMN_APTO_PARA_VENTA = 8;

	/** 
	 * Index of column NO_APTO_PARA_VENTA
	 */
	protected static final int COLUMN_NO_APTO_PARA_VENTA = 9;

	/** 
	 * Index of column ID_CLASIFICACION
	 */
	protected static final int COLUMN_ID_CLASIFICACION = 10;

	/** 
	 * Index of column DESCRIPCION_CLASIFICACION
	 */
	protected static final int COLUMN_DESCRIPCION_CLASIFICACION = 11;

	/** 
	 * Index of column ID_CONCEPTO_ENTREGADO
	 */
	protected static final int COLUMN_ID_CONCEPTO_ENTREGADO = 12;

	/** 
	 * Index of column MONTO_RESULTANTE
	 */
	protected static final int COLUMN_MONTO_RESULTANTE = 13;

	/** 
	 * Index of column DIFERENCIA_FAVOR
	 */
	protected static final int COLUMN_DIFERENCIA_FAVOR = 14;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 15;

	/** 
	 * Index of column CANTIDAD_DEVUELTA
	 */
	protected static final int COLUMN_CANTIDAD_DEVUELTA = 16;

	/** 
	 * Index of column FOLIO_MOVIL
	 */
	protected static final int COLUMN_FOLIO_MOVIL = 17;

	/** 
	 * Index of column DEVOLUCION_EFCTIVO
	 */
	protected static final int COLUMN_DEVOLUCION_EFCTIVO = 18;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 18;

	/** 
	 * Index of primary-key column ID_PEDIDO_DEVOL_CAMBIO
	 */
	protected static final int PK_COLUMN_ID_PEDIDO_DEVOL_CAMBIO = 1;

	/** 
	 * Inserts a new row in the sgfens_pedido_devolucion_cambio table.
	 */
	public SgfensPedidoDevolucionCambioPk insert(SgfensPedidoDevolucionCambio dto) throws SgfensPedidoDevolucionCambioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdPedidoDevolCambioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PEDIDO_DEVOL_CAMBIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdPedidoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PEDIDO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_TIPO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAptoParaVentaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APTO_PARA_VENTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNoAptoParaVentaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NO_APTO_PARA_VENTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdClasificacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLASIFICACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionClasificacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION_CLASIFICACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdConceptoEntregadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO_ENTREGADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMontoResultanteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MONTO_RESULTANTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDiferenciaFavorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIFERENCIA_FAVOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCantidadDevueltaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CANTIDAD_DEVUELTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFolioMovilModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FOLIO_MOVIL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDevolucionEfctivoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DEVOLUCION_EFCTIVO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdPedidoDevolCambioModified()) {
				stmt.setInt( index++, dto.getIdPedidoDevolCambio() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			if (dto.isIdPedidoModified()) {
				if (dto.isIdPedidoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdPedido() );
				}
		
			}
		
			if (dto.isIdTipoModified()) {
				if (dto.isIdTipoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdTipo() );
				}
		
			}
		
			if (dto.isAptoParaVentaModified()) {
				if (dto.isAptoParaVentaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getAptoParaVenta() );
				}
		
			}
		
			if (dto.isNoAptoParaVentaModified()) {
				if (dto.isNoAptoParaVentaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getNoAptoParaVenta() );
				}
		
			}
		
			if (dto.isIdClasificacionModified()) {
				if (dto.isIdClasificacionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdClasificacion() );
				}
		
			}
		
			if (dto.isDescripcionClasificacionModified()) {
				stmt.setString( index++, dto.getDescripcionClasificacion() );
			}
		
			if (dto.isIdConceptoEntregadoModified()) {
				if (dto.isIdConceptoEntregadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConceptoEntregado() );
				}
		
			}
		
			if (dto.isMontoResultanteModified()) {
				if (dto.isMontoResultanteNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMontoResultante() );
				}
		
			}
		
			if (dto.isDiferenciaFavorModified()) {
				if (dto.isDiferenciaFavorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getDiferenciaFavor() );
				}
		
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			if (dto.isCantidadDevueltaModified()) {
				if (dto.isCantidadDevueltaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCantidadDevuelta() );
				}
		
			}
		
			if (dto.isFolioMovilModified()) {
				stmt.setString( index++, dto.getFolioMovil() );
			}
		
			if (dto.isDevolucionEfctivoModified()) {
				if (dto.isDevolucionEfctivoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getDevolucionEfctivo() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdPedidoDevolCambio( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensPedidoDevolucionCambioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sgfens_pedido_devolucion_cambio table.
	 */
	public void update(SgfensPedidoDevolucionCambioPk pk, SgfensPedidoDevolucionCambio dto) throws SgfensPedidoDevolucionCambioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdPedidoDevolCambioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PEDIDO_DEVOL_CAMBIO=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO=?" );
				modified=true;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isIdPedidoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PEDIDO=?" );
				modified=true;
			}
		
			if (dto.isIdTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_TIPO=?" );
				modified=true;
			}
		
			if (dto.isAptoParaVentaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APTO_PARA_VENTA=?" );
				modified=true;
			}
		
			if (dto.isNoAptoParaVentaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NO_APTO_PARA_VENTA=?" );
				modified=true;
			}
		
			if (dto.isIdClasificacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLASIFICACION=?" );
				modified=true;
			}
		
			if (dto.isDescripcionClasificacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION_CLASIFICACION=?" );
				modified=true;
			}
		
			if (dto.isIdConceptoEntregadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO_ENTREGADO=?" );
				modified=true;
			}
		
			if (dto.isMontoResultanteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MONTO_RESULTANTE=?" );
				modified=true;
			}
		
			if (dto.isDiferenciaFavorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIFERENCIA_FAVOR=?" );
				modified=true;
			}
		
			if (dto.isFechaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA=?" );
				modified=true;
			}
		
			if (dto.isCantidadDevueltaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CANTIDAD_DEVUELTA=?" );
				modified=true;
			}
		
			if (dto.isFolioMovilModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FOLIO_MOVIL=?" );
				modified=true;
			}
		
			if (dto.isDevolucionEfctivoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DEVOLUCION_EFCTIVO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_PEDIDO_DEVOL_CAMBIO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdPedidoDevolCambioModified()) {
				stmt.setInt( index++, dto.getIdPedidoDevolCambio() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			if (dto.isIdPedidoModified()) {
				if (dto.isIdPedidoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdPedido() );
				}
		
			}
		
			if (dto.isIdTipoModified()) {
				if (dto.isIdTipoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdTipo() );
				}
		
			}
		
			if (dto.isAptoParaVentaModified()) {
				if (dto.isAptoParaVentaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getAptoParaVenta() );
				}
		
			}
		
			if (dto.isNoAptoParaVentaModified()) {
				if (dto.isNoAptoParaVentaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getNoAptoParaVenta() );
				}
		
			}
		
			if (dto.isIdClasificacionModified()) {
				if (dto.isIdClasificacionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdClasificacion() );
				}
		
			}
		
			if (dto.isDescripcionClasificacionModified()) {
				stmt.setString( index++, dto.getDescripcionClasificacion() );
			}
		
			if (dto.isIdConceptoEntregadoModified()) {
				if (dto.isIdConceptoEntregadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConceptoEntregado() );
				}
		
			}
		
			if (dto.isMontoResultanteModified()) {
				if (dto.isMontoResultanteNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMontoResultante() );
				}
		
			}
		
			if (dto.isDiferenciaFavorModified()) {
				if (dto.isDiferenciaFavorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getDiferenciaFavor() );
				}
		
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			if (dto.isCantidadDevueltaModified()) {
				if (dto.isCantidadDevueltaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCantidadDevuelta() );
				}
		
			}
		
			if (dto.isFolioMovilModified()) {
				stmt.setString( index++, dto.getFolioMovil() );
			}
		
			if (dto.isDevolucionEfctivoModified()) {
				if (dto.isDevolucionEfctivoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getDevolucionEfctivo() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdPedidoDevolCambio() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensPedidoDevolucionCambioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sgfens_pedido_devolucion_cambio table.
	 */
	public void delete(SgfensPedidoDevolucionCambioPk pk) throws SgfensPedidoDevolucionCambioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdPedidoDevolCambio() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensPedidoDevolucionCambioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sgfens_pedido_devolucion_cambio table that matches the specified primary-key value.
	 */
	public SgfensPedidoDevolucionCambio findByPrimaryKey(SgfensPedidoDevolucionCambioPk pk) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByPrimaryKey( pk.getIdPedidoDevolCambio() );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_PEDIDO_DEVOL_CAMBIO = :idPedidoDevolCambio'.
	 */
	public SgfensPedidoDevolucionCambio findByPrimaryKey(int idPedidoDevolCambio) throws SgfensPedidoDevolucionCambioDaoException
	{
		SgfensPedidoDevolucionCambio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_PEDIDO_DEVOL_CAMBIO = ?", new Object[] {  new Integer(idPedidoDevolCambio) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria ''.
	 */
	public SgfensPedidoDevolucionCambio[] findAll() throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_PEDIDO_DEVOL_CAMBIO", null );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_PEDIDO_DEVOL_CAMBIO = :idPedidoDevolCambio'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdPedidoDevolCambioEquals(int idPedidoDevolCambio) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PEDIDO_DEVOL_CAMBIO = ? ORDER BY ID_PEDIDO_DEVOL_CAMBIO", new Object[] {  new Integer(idPedidoDevolCambio) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdEstatusEquals(int idEstatus) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdEmpresaEquals(int idEmpresa) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdEmpleadoEquals(int idEmpleado) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO = ? ORDER BY ID_EMPLEADO", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdConceptoEquals(int idConcepto) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdPedidoEquals(int idPedido) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PEDIDO = ? ORDER BY ID_PEDIDO", new Object[] {  new Integer(idPedido) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_TIPO = :idTipo'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdTipoEquals(int idTipo) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO = ? ORDER BY ID_TIPO", new Object[] {  new Integer(idTipo) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'APTO_PARA_VENTA = :aptoParaVenta'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereAptoParaVentaEquals(double aptoParaVenta) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APTO_PARA_VENTA = ? ORDER BY APTO_PARA_VENTA", new Object[] {  new Double(aptoParaVenta) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'NO_APTO_PARA_VENTA = :noAptoParaVenta'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereNoAptoParaVentaEquals(double noAptoParaVenta) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NO_APTO_PARA_VENTA = ? ORDER BY NO_APTO_PARA_VENTA", new Object[] {  new Double(noAptoParaVenta) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_CLASIFICACION = :idClasificacion'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdClasificacionEquals(int idClasificacion) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLASIFICACION = ? ORDER BY ID_CLASIFICACION", new Object[] {  new Integer(idClasificacion) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'DESCRIPCION_CLASIFICACION = :descripcionClasificacion'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereDescripcionClasificacionEquals(String descripcionClasificacion) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION_CLASIFICACION = ? ORDER BY DESCRIPCION_CLASIFICACION", new Object[] { descripcionClasificacion } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_CONCEPTO_ENTREGADO = :idConceptoEntregado'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdConceptoEntregadoEquals(int idConceptoEntregado) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO_ENTREGADO = ? ORDER BY ID_CONCEPTO_ENTREGADO", new Object[] {  new Integer(idConceptoEntregado) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'MONTO_RESULTANTE = :montoResultante'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereMontoResultanteEquals(double montoResultante) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MONTO_RESULTANTE = ? ORDER BY MONTO_RESULTANTE", new Object[] {  new Double(montoResultante) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'DIFERENCIA_FAVOR = :diferenciaFavor'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereDiferenciaFavorEquals(int diferenciaFavor) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIFERENCIA_FAVOR = ? ORDER BY DIFERENCIA_FAVOR", new Object[] {  new Integer(diferenciaFavor) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'FECHA = :fecha'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereFechaEquals(Date fecha) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'CANTIDAD_DEVUELTA = :cantidadDevuelta'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereCantidadDevueltaEquals(double cantidadDevuelta) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD_DEVUELTA = ? ORDER BY CANTIDAD_DEVUELTA", new Object[] {  new Double(cantidadDevuelta) } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'FOLIO_MOVIL = :folioMovil'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereFolioMovilEquals(String folioMovil) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_MOVIL = ? ORDER BY FOLIO_MOVIL", new Object[] { folioMovil } );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'DEVOLUCION_EFCTIVO = :devolucionEfctivo'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereDevolucionEfctivoEquals(double devolucionEfctivo) throws SgfensPedidoDevolucionCambioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DEVOLUCION_EFCTIVO = ? ORDER BY DEVOLUCION_EFCTIVO", new Object[] {  new Double(devolucionEfctivo) } );
	}

	/**
	 * Method 'SgfensPedidoDevolucionCambioDaoImpl'
	 * 
	 */
	public SgfensPedidoDevolucionCambioDaoImpl()
	{
	}

	/**
	 * Method 'SgfensPedidoDevolucionCambioDaoImpl'
	 * 
	 * @param userConn
	 */
	public SgfensPedidoDevolucionCambioDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "sgfens_pedido_devolucion_cambio";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SgfensPedidoDevolucionCambio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SgfensPedidoDevolucionCambio dto = new SgfensPedidoDevolucionCambio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SgfensPedidoDevolucionCambio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SgfensPedidoDevolucionCambio dto = new SgfensPedidoDevolucionCambio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SgfensPedidoDevolucionCambio ret[] = new SgfensPedidoDevolucionCambio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SgfensPedidoDevolucionCambio dto, ResultSet rs) throws SQLException
	{
		dto.setIdPedidoDevolCambio( rs.getInt( COLUMN_ID_PEDIDO_DEVOL_CAMBIO ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoNull( true );
		}
		
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		if (rs.wasNull()) {
			dto.setIdConceptoNull( true );
		}
		
		dto.setIdPedido( rs.getInt( COLUMN_ID_PEDIDO ) );
		if (rs.wasNull()) {
			dto.setIdPedidoNull( true );
		}
		
		dto.setIdTipo( rs.getInt( COLUMN_ID_TIPO ) );
		if (rs.wasNull()) {
			dto.setIdTipoNull( true );
		}
		
		dto.setAptoParaVenta( rs.getDouble( COLUMN_APTO_PARA_VENTA ) );
		if (rs.wasNull()) {
			dto.setAptoParaVentaNull( true );
		}
		
		dto.setNoAptoParaVenta( rs.getDouble( COLUMN_NO_APTO_PARA_VENTA ) );
		if (rs.wasNull()) {
			dto.setNoAptoParaVentaNull( true );
		}
		
		dto.setIdClasificacion( rs.getInt( COLUMN_ID_CLASIFICACION ) );
		if (rs.wasNull()) {
			dto.setIdClasificacionNull( true );
		}
		
		dto.setDescripcionClasificacion( rs.getString( COLUMN_DESCRIPCION_CLASIFICACION ) );
		dto.setIdConceptoEntregado( rs.getInt( COLUMN_ID_CONCEPTO_ENTREGADO ) );
		if (rs.wasNull()) {
			dto.setIdConceptoEntregadoNull( true );
		}
		
		dto.setMontoResultante( rs.getDouble( COLUMN_MONTO_RESULTANTE ) );
		if (rs.wasNull()) {
			dto.setMontoResultanteNull( true );
		}
		
		dto.setDiferenciaFavor( rs.getInt( COLUMN_DIFERENCIA_FAVOR ) );
		if (rs.wasNull()) {
			dto.setDiferenciaFavorNull( true );
		}
		
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setCantidadDevuelta( rs.getDouble( COLUMN_CANTIDAD_DEVUELTA ) );
		if (rs.wasNull()) {
			dto.setCantidadDevueltaNull( true );
		}
		
		dto.setFolioMovil( rs.getString( COLUMN_FOLIO_MOVIL ) );
		dto.setDevolucionEfctivo( rs.getDouble( COLUMN_DEVOLUCION_EFCTIVO ) );
		if (rs.wasNull()) {
			dto.setDevolucionEfctivoNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SgfensPedidoDevolucionCambio dto)
	{
		dto.setIdPedidoDevolCambioModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setIdConceptoModified( false );
		dto.setIdPedidoModified( false );
		dto.setIdTipoModified( false );
		dto.setAptoParaVentaModified( false );
		dto.setNoAptoParaVentaModified( false );
		dto.setIdClasificacionModified( false );
		dto.setDescripcionClasificacionModified( false );
		dto.setIdConceptoEntregadoModified( false );
		dto.setMontoResultanteModified( false );
		dto.setDiferenciaFavorModified( false );
		dto.setFechaModified( false );
		dto.setCantidadDevueltaModified( false );
		dto.setFolioMovilModified( false );
		dto.setDevolucionEfctivoModified( false );
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the specified arbitrary SQL statement
	 */
	public SgfensPedidoDevolucionCambio[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensPedidoDevolucionCambioDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			//System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensPedidoDevolucionCambioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the specified arbitrary SQL statement
	 */
	public SgfensPedidoDevolucionCambio[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensPedidoDevolucionCambioDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			//System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensPedidoDevolucionCambioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
