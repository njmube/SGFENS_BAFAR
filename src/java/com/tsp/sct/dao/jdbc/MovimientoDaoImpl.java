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

public class MovimientoDaoImpl extends AbstractDAO implements MovimientoDao
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
	protected final String SQL_SELECT = "SELECT ID_MOVIMIENTO, ID_EMPRESA, TIPO_MOVIMIENTO, NOMBRE_PRODUCTO, contabilidad, FECHA_REGISTRO, ID_PROVEEDOR, ORDEN_COMPRA, NUMERO_GUIA, ID_ALMACEN, CONCEPTO_MOVIMIENTO, ID_CONCEPTO, ID_ALMACEN_DESTINO, SINCRONIZACION_MICROSIP, idEmpleado, CONTABILIDAD_PESO, NUMERO_LOTE, FECHA_CADUCIDAD FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_MOVIMIENTO, ID_EMPRESA, TIPO_MOVIMIENTO, NOMBRE_PRODUCTO, contabilidad, FECHA_REGISTRO, ID_PROVEEDOR, ORDEN_COMPRA, NUMERO_GUIA, ID_ALMACEN, CONCEPTO_MOVIMIENTO, ID_CONCEPTO, ID_ALMACEN_DESTINO, SINCRONIZACION_MICROSIP, idEmpleado, CONTABILIDAD_PESO, NUMERO_LOTE, FECHA_CADUCIDAD ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_MOVIMIENTO = ?, ID_EMPRESA = ?, TIPO_MOVIMIENTO = ?, NOMBRE_PRODUCTO = ?, contabilidad = ?, FECHA_REGISTRO = ?, ID_PROVEEDOR = ?, ORDEN_COMPRA = ?, NUMERO_GUIA = ?, ID_ALMACEN = ?, CONCEPTO_MOVIMIENTO = ?, ID_CONCEPTO = ?, ID_ALMACEN_DESTINO = ?, SINCRONIZACION_MICROSIP = ?, idEmpleado = ?, CONTABILIDAD_PESO = ?, NUMERO_LOTE = ?, FECHA_CADUCIDAD = ? WHERE ID_MOVIMIENTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_MOVIMIENTO = ?";

	/** 
	 * Index of column ID_MOVIMIENTO
	 */
	protected static final int COLUMN_ID_MOVIMIENTO = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column TIPO_MOVIMIENTO
	 */
	protected static final int COLUMN_TIPO_MOVIMIENTO = 3;

	/** 
	 * Index of column NOMBRE_PRODUCTO
	 */
	protected static final int COLUMN_NOMBRE_PRODUCTO = 4;

	/** 
	 * Index of column contabilidad
	 */
	protected static final int COLUMN_CONTABILIDAD = 5;

	/** 
	 * Index of column FECHA_REGISTRO
	 */
	protected static final int COLUMN_FECHA_REGISTRO = 6;

	/** 
	 * Index of column ID_PROVEEDOR
	 */
	protected static final int COLUMN_ID_PROVEEDOR = 7;

	/** 
	 * Index of column ORDEN_COMPRA
	 */
	protected static final int COLUMN_ORDEN_COMPRA = 8;

	/** 
	 * Index of column NUMERO_GUIA
	 */
	protected static final int COLUMN_NUMERO_GUIA = 9;

	/** 
	 * Index of column ID_ALMACEN
	 */
	protected static final int COLUMN_ID_ALMACEN = 10;

	/** 
	 * Index of column CONCEPTO_MOVIMIENTO
	 */
	protected static final int COLUMN_CONCEPTO_MOVIMIENTO = 11;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 12;

	/** 
	 * Index of column ID_ALMACEN_DESTINO
	 */
	protected static final int COLUMN_ID_ALMACEN_DESTINO = 13;

	/** 
	 * Index of column SINCRONIZACION_MICROSIP
	 */
	protected static final int COLUMN_SINCRONIZACION_MICROSIP = 14;

	/** 
	 * Index of column idEmpleado
	 */
	protected static final int COLUMN_ID_EMPLEADO = 15;

	/** 
	 * Index of column CONTABILIDAD_PESO
	 */
	protected static final int COLUMN_CONTABILIDAD_PESO = 16;

	/** 
	 * Index of column NUMERO_LOTE
	 */
	protected static final int COLUMN_NUMERO_LOTE = 17;

	/** 
	 * Index of column FECHA_CADUCIDAD
	 */
	protected static final int COLUMN_FECHA_CADUCIDAD = 18;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 18;

	/** 
	 * Index of primary-key column ID_MOVIMIENTO
	 */
	protected static final int PK_COLUMN_ID_MOVIMIENTO = 1;

	/** 
	 * Inserts a new row in the movimiento table.
	 */
	public MovimientoPk insert(Movimiento dto) throws MovimientoDaoException
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
			if (dto.isIdMovimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_MOVIMIENTO" );
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
		
			if (dto.isTipoMovimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TIPO_MOVIMIENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreProductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_PRODUCTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isContabilidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "contabilidad" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaRegistroModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_REGISTRO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdProveedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PROVEEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isOrdenCompraModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ORDEN_COMPRA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroGuiaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO_GUIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdAlmacenModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ALMACEN" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isConceptoMovimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONCEPTO_MOVIMIENTO" );
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
		
			if (dto.isIdAlmacenDestinoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ALMACEN_DESTINO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "SINCRONIZACION_MICROSIP" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idEmpleado" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isContabilidadPesoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONTABILIDAD_PESO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroLoteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO_LOTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaCaducidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_CADUCIDAD" );
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
			if (dto.isIdMovimientoModified()) {
				stmt.setInt( index++, dto.getIdMovimiento() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isTipoMovimientoModified()) {
				stmt.setString( index++, dto.getTipoMovimiento() );
			}
		
			if (dto.isNombreProductoModified()) {
				stmt.setString( index++, dto.getNombreProducto() );
			}
		
			if (dto.isContabilidadModified()) {
				if (dto.isContabilidadNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getContabilidad() );
				}
		
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isIdProveedorModified()) {
				if (dto.isIdProveedorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdProveedor() );
				}
		
			}
		
			if (dto.isOrdenCompraModified()) {
				stmt.setString( index++, dto.getOrdenCompra() );
			}
		
			if (dto.isNumeroGuiaModified()) {
				stmt.setString( index++, dto.getNumeroGuia() );
			}
		
			if (dto.isIdAlmacenModified()) {
				if (dto.isIdAlmacenNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdAlmacen() );
				}
		
			}
		
			if (dto.isConceptoMovimientoModified()) {
				stmt.setString( index++, dto.getConceptoMovimiento() );
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			if (dto.isIdAlmacenDestinoModified()) {
				if (dto.isIdAlmacenDestinoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdAlmacenDestino() );
				}
		
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (dto.isSincronizacionMicrosipNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getSincronizacionMicrosip() );
				}
		
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isContabilidadPesoModified()) {
				if (dto.isContabilidadPesoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getContabilidadPeso() );
				}
		
			}
		
			if (dto.isNumeroLoteModified()) {
				stmt.setString( index++, dto.getNumeroLote() );
			}
		
			if (dto.isFechaCaducidadModified()) {
				stmt.setDate(index++, dto.getFechaCaducidad()==null ? null : new java.sql.Date( dto.getFechaCaducidad().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdMovimiento( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MovimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the movimiento table.
	 */
	public void update(MovimientoPk pk, Movimiento dto) throws MovimientoDaoException
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
			if (dto.isIdMovimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_MOVIMIENTO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isTipoMovimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TIPO_MOVIMIENTO=?" );
				modified=true;
			}
		
			if (dto.isNombreProductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_PRODUCTO=?" );
				modified=true;
			}
		
			if (dto.isContabilidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "contabilidad=?" );
				modified=true;
			}
		
			if (dto.isFechaRegistroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_REGISTRO=?" );
				modified=true;
			}
		
			if (dto.isIdProveedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PROVEEDOR=?" );
				modified=true;
			}
		
			if (dto.isOrdenCompraModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ORDEN_COMPRA=?" );
				modified=true;
			}
		
			if (dto.isNumeroGuiaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO_GUIA=?" );
				modified=true;
			}
		
			if (dto.isIdAlmacenModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ALMACEN=?" );
				modified=true;
			}
		
			if (dto.isConceptoMovimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONCEPTO_MOVIMIENTO=?" );
				modified=true;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isIdAlmacenDestinoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ALMACEN_DESTINO=?" );
				modified=true;
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SINCRONIZACION_MICROSIP=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idEmpleado=?" );
				modified=true;
			}
		
			if (dto.isContabilidadPesoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONTABILIDAD_PESO=?" );
				modified=true;
			}
		
			if (dto.isNumeroLoteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO_LOTE=?" );
				modified=true;
			}
		
			if (dto.isFechaCaducidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_CADUCIDAD=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_MOVIMIENTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMovimientoModified()) {
				stmt.setInt( index++, dto.getIdMovimiento() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isTipoMovimientoModified()) {
				stmt.setString( index++, dto.getTipoMovimiento() );
			}
		
			if (dto.isNombreProductoModified()) {
				stmt.setString( index++, dto.getNombreProducto() );
			}
		
			if (dto.isContabilidadModified()) {
				if (dto.isContabilidadNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getContabilidad() );
				}
		
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isIdProveedorModified()) {
				if (dto.isIdProveedorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdProveedor() );
				}
		
			}
		
			if (dto.isOrdenCompraModified()) {
				stmt.setString( index++, dto.getOrdenCompra() );
			}
		
			if (dto.isNumeroGuiaModified()) {
				stmt.setString( index++, dto.getNumeroGuia() );
			}
		
			if (dto.isIdAlmacenModified()) {
				if (dto.isIdAlmacenNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdAlmacen() );
				}
		
			}
		
			if (dto.isConceptoMovimientoModified()) {
				stmt.setString( index++, dto.getConceptoMovimiento() );
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			if (dto.isIdAlmacenDestinoModified()) {
				if (dto.isIdAlmacenDestinoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdAlmacenDestino() );
				}
		
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (dto.isSincronizacionMicrosipNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getSincronizacionMicrosip() );
				}
		
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isContabilidadPesoModified()) {
				if (dto.isContabilidadPesoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getContabilidadPeso() );
				}
		
			}
		
			if (dto.isNumeroLoteModified()) {
				stmt.setString( index++, dto.getNumeroLote() );
			}
		
			if (dto.isFechaCaducidadModified()) {
				stmt.setDate(index++, dto.getFechaCaducidad()==null ? null : new java.sql.Date( dto.getFechaCaducidad().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdMovimiento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MovimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the movimiento table.
	 */
	public void delete(MovimientoPk pk) throws MovimientoDaoException
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
			stmt.setInt( 1, pk.getIdMovimiento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MovimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the movimiento table that matches the specified primary-key value.
	 */
	public Movimiento findByPrimaryKey(MovimientoPk pk) throws MovimientoDaoException
	{
		return findByPrimaryKey( pk.getIdMovimiento() );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_MOVIMIENTO = :idMovimiento'.
	 */
	public Movimiento findByPrimaryKey(int idMovimiento) throws MovimientoDaoException
	{
		Movimiento ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_MOVIMIENTO = ?", new Object[] {  new Integer(idMovimiento) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria ''.
	 */
	public Movimiento[] findAll() throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_MOVIMIENTO", null );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_MOVIMIENTO = :idMovimiento'.
	 */
	public Movimiento[] findWhereIdMovimientoEquals(int idMovimiento) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_MOVIMIENTO = ? ORDER BY ID_MOVIMIENTO", new Object[] {  new Integer(idMovimiento) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Movimiento[] findWhereIdEmpresaEquals(int idEmpresa) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'TIPO_MOVIMIENTO = :tipoMovimiento'.
	 */
	public Movimiento[] findWhereTipoMovimientoEquals(String tipoMovimiento) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIPO_MOVIMIENTO = ? ORDER BY TIPO_MOVIMIENTO", new Object[] { tipoMovimiento } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'NOMBRE_PRODUCTO = :nombreProducto'.
	 */
	public Movimiento[] findWhereNombreProductoEquals(String nombreProducto) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_PRODUCTO = ? ORDER BY NOMBRE_PRODUCTO", new Object[] { nombreProducto } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'contabilidad = :contabilidad'.
	 */
	public Movimiento[] findWhereContabilidadEquals(double contabilidad) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE contabilidad = ? ORDER BY contabilidad", new Object[] {  new Double(contabilidad) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public Movimiento[] findWhereFechaRegistroEquals(Date fechaRegistro) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_REGISTRO = ? ORDER BY FECHA_REGISTRO", new Object[] { fechaRegistro==null ? null : new java.sql.Timestamp( fechaRegistro.getTime() ) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_PROVEEDOR = :idProveedor'.
	 */
	public Movimiento[] findWhereIdProveedorEquals(int idProveedor) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PROVEEDOR = ? ORDER BY ID_PROVEEDOR", new Object[] {  new Integer(idProveedor) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ORDEN_COMPRA = :ordenCompra'.
	 */
	public Movimiento[] findWhereOrdenCompraEquals(String ordenCompra) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ORDEN_COMPRA = ? ORDER BY ORDEN_COMPRA", new Object[] { ordenCompra } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'NUMERO_GUIA = :numeroGuia'.
	 */
	public Movimiento[] findWhereNumeroGuiaEquals(String numeroGuia) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_GUIA = ? ORDER BY NUMERO_GUIA", new Object[] { numeroGuia } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_ALMACEN = :idAlmacen'.
	 */
	public Movimiento[] findWhereIdAlmacenEquals(int idAlmacen) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ALMACEN = ? ORDER BY ID_ALMACEN", new Object[] {  new Integer(idAlmacen) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'CONCEPTO_MOVIMIENTO = :conceptoMovimiento'.
	 */
	public Movimiento[] findWhereConceptoMovimientoEquals(String conceptoMovimiento) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONCEPTO_MOVIMIENTO = ? ORDER BY CONCEPTO_MOVIMIENTO", new Object[] { conceptoMovimiento } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public Movimiento[] findWhereIdConceptoEquals(int idConcepto) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'ID_ALMACEN_DESTINO = :idAlmacenDestino'.
	 */
	public Movimiento[] findWhereIdAlmacenDestinoEquals(int idAlmacenDestino) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ALMACEN_DESTINO = ? ORDER BY ID_ALMACEN_DESTINO", new Object[] {  new Integer(idAlmacenDestino) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'SINCRONIZACION_MICROSIP = :sincronizacionMicrosip'.
	 */
	public Movimiento[] findWhereSincronizacionMicrosipEquals(int sincronizacionMicrosip) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SINCRONIZACION_MICROSIP = ? ORDER BY SINCRONIZACION_MICROSIP", new Object[] {  new Integer(sincronizacionMicrosip) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'idEmpleado = :idEmpleado'.
	 */
	public Movimiento[] findWhereIdEmpleadoEquals(int idEmpleado) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idEmpleado = ? ORDER BY idEmpleado", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'CONTABILIDAD_PESO = :contabilidadPeso'.
	 */
	public Movimiento[] findWhereContabilidadPesoEquals(double contabilidadPeso) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONTABILIDAD_PESO = ? ORDER BY CONTABILIDAD_PESO", new Object[] {  new Double(contabilidadPeso) } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'NUMERO_LOTE = :numeroLote'.
	 */
	public Movimiento[] findWhereNumeroLoteEquals(String numeroLote) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_LOTE = ? ORDER BY NUMERO_LOTE", new Object[] { numeroLote } );
	}

	/** 
	 * Returns all rows from the movimiento table that match the criteria 'FECHA_CADUCIDAD = :fechaCaducidad'.
	 */
	public Movimiento[] findWhereFechaCaducidadEquals(Date fechaCaducidad) throws MovimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_CADUCIDAD = ? ORDER BY FECHA_CADUCIDAD", new Object[] { fechaCaducidad==null ? null : new java.sql.Date( fechaCaducidad.getTime() ) } );
	}

	/**
	 * Method 'MovimientoDaoImpl'
	 * 
	 */
	public MovimientoDaoImpl()
	{
	}

	/**
	 * Method 'MovimientoDaoImpl'
	 * 
	 * @param userConn
	 */
	public MovimientoDaoImpl(final java.sql.Connection userConn)
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
		return "movimiento";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Movimiento fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Movimiento dto = new Movimiento();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Movimiento[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Movimiento dto = new Movimiento();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Movimiento ret[] = new Movimiento[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Movimiento dto, ResultSet rs) throws SQLException
	{
		dto.setIdMovimiento( rs.getInt( COLUMN_ID_MOVIMIENTO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setTipoMovimiento( rs.getString( COLUMN_TIPO_MOVIMIENTO ) );
		dto.setNombreProducto( rs.getString( COLUMN_NOMBRE_PRODUCTO ) );
		dto.setContabilidad( rs.getDouble( COLUMN_CONTABILIDAD ) );
		if (rs.wasNull()) {
			dto.setContabilidadNull( true );
		}
		
		dto.setFechaRegistro( rs.getTimestamp(COLUMN_FECHA_REGISTRO ) );
		dto.setIdProveedor( rs.getInt( COLUMN_ID_PROVEEDOR ) );
		if (rs.wasNull()) {
			dto.setIdProveedorNull( true );
		}
		
		dto.setOrdenCompra( rs.getString( COLUMN_ORDEN_COMPRA ) );
		dto.setNumeroGuia( rs.getString( COLUMN_NUMERO_GUIA ) );
		dto.setIdAlmacen( rs.getInt( COLUMN_ID_ALMACEN ) );
		if (rs.wasNull()) {
			dto.setIdAlmacenNull( true );
		}
		
		dto.setConceptoMovimiento( rs.getString( COLUMN_CONCEPTO_MOVIMIENTO ) );
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		if (rs.wasNull()) {
			dto.setIdConceptoNull( true );
		}
		
		dto.setIdAlmacenDestino( rs.getInt( COLUMN_ID_ALMACEN_DESTINO ) );
		if (rs.wasNull()) {
			dto.setIdAlmacenDestinoNull( true );
		}
		
		dto.setSincronizacionMicrosip( rs.getInt( COLUMN_SINCRONIZACION_MICROSIP ) );
		if (rs.wasNull()) {
			dto.setSincronizacionMicrosipNull( true );
		}
		
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoNull( true );
		}
		
		dto.setContabilidadPeso( rs.getDouble( COLUMN_CONTABILIDAD_PESO ) );
		if (rs.wasNull()) {
			dto.setContabilidadPesoNull( true );
		}
		
		dto.setNumeroLote( rs.getString( COLUMN_NUMERO_LOTE ) );
		dto.setFechaCaducidad( rs.getDate(COLUMN_FECHA_CADUCIDAD ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Movimiento dto)
	{
		dto.setIdMovimientoModified( false );
		dto.setIdEmpresaModified( false );
		dto.setTipoMovimientoModified( false );
		dto.setNombreProductoModified( false );
		dto.setContabilidadModified( false );
		dto.setFechaRegistroModified( false );
		dto.setIdProveedorModified( false );
		dto.setOrdenCompraModified( false );
		dto.setNumeroGuiaModified( false );
		dto.setIdAlmacenModified( false );
		dto.setConceptoMovimientoModified( false );
		dto.setIdConceptoModified( false );
		dto.setIdAlmacenDestinoModified( false );
		dto.setSincronizacionMicrosipModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setContabilidadPesoModified( false );
		dto.setNumeroLoteModified( false );
		dto.setFechaCaducidadModified( false );
	}

	/** 
	 * Returns all rows from the movimiento table that match the specified arbitrary SQL statement
	 */
	public Movimiento[] findByDynamicSelect(String sql, Object[] sqlParams) throws MovimientoDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			throw new MovimientoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the movimiento table that match the specified arbitrary SQL statement
	 */
	public Movimiento[] findByDynamicWhere(String sql, Object[] sqlParams) throws MovimientoDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			throw new MovimientoDaoException( "Exception: " + _e.getMessage(), _e );
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