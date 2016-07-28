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

public class ComodatoMantenimientoDaoImpl extends AbstractDAO implements ComodatoMantenimientoDao
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
	protected final String SQL_SELECT = "SELECT ID_COMODATO_MANTENIMIENTO, ID_COMODATO, ID_CLIENTE, ID_EMPRESA, TECNICO, DESCRIPCION, ESTATUS, NOMBRE_ATENDIO, FECHA_REALIZACION_MANTENIMIENTO, FECHA_PROX_MANTENIMIENTO, COSTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_COMODATO_MANTENIMIENTO, ID_COMODATO, ID_CLIENTE, ID_EMPRESA, TECNICO, DESCRIPCION, ESTATUS, NOMBRE_ATENDIO, FECHA_REALIZACION_MANTENIMIENTO, FECHA_PROX_MANTENIMIENTO, COSTO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_COMODATO_MANTENIMIENTO = ?, ID_COMODATO = ?, ID_CLIENTE = ?, ID_EMPRESA = ?, TECNICO = ?, DESCRIPCION = ?, ESTATUS = ?, NOMBRE_ATENDIO = ?, FECHA_REALIZACION_MANTENIMIENTO = ?, FECHA_PROX_MANTENIMIENTO = ?, COSTO = ? WHERE ID_COMODATO_MANTENIMIENTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_COMODATO_MANTENIMIENTO = ?";

	/** 
	 * Index of column ID_COMODATO_MANTENIMIENTO
	 */
	protected static final int COLUMN_ID_COMODATO_MANTENIMIENTO = 1;

	/** 
	 * Index of column ID_COMODATO
	 */
	protected static final int COLUMN_ID_COMODATO = 2;

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 3;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 4;

	/** 
	 * Index of column TECNICO
	 */
	protected static final int COLUMN_TECNICO = 5;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 6;

	/** 
	 * Index of column ESTATUS
	 */
	protected static final int COLUMN_ESTATUS = 7;

	/** 
	 * Index of column NOMBRE_ATENDIO
	 */
	protected static final int COLUMN_NOMBRE_ATENDIO = 8;

	/** 
	 * Index of column FECHA_REALIZACION_MANTENIMIENTO
	 */
	protected static final int COLUMN_FECHA_REALIZACION_MANTENIMIENTO = 9;

	/** 
	 * Index of column FECHA_PROX_MANTENIMIENTO
	 */
	protected static final int COLUMN_FECHA_PROX_MANTENIMIENTO = 10;

	/** 
	 * Index of column COSTO
	 */
	protected static final int COLUMN_COSTO = 11;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 11;

	/** 
	 * Index of primary-key column ID_COMODATO_MANTENIMIENTO
	 */
	protected static final int PK_COLUMN_ID_COMODATO_MANTENIMIENTO = 1;

	/** 
	 * Inserts a new row in the comodato_mantenimiento table.
	 */
	public ComodatoMantenimientoPk insert(ComodatoMantenimiento dto) throws ComodatoMantenimientoDaoException
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
			if (dto.isIdComodatoMantenimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMODATO_MANTENIMIENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdComodatoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMODATO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLIENTE" );
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
		
			if (dto.isTecnicoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TECNICO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreAtendioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_ATENDIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaRealizacionMantenimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_REALIZACION_MANTENIMIENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaProxMantenimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_PROX_MANTENIMIENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCostoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COSTO" );
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
			if (dto.isIdComodatoMantenimientoModified()) {
				stmt.setInt( index++, dto.getIdComodatoMantenimiento() );
			}
		
			if (dto.isIdComodatoModified()) {
				if (dto.isIdComodatoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdComodato() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isTecnicoModified()) {
				stmt.setString( index++, dto.getTecnico() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isEstatusModified()) {
				if (dto.isEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstatus() );
				}
		
			}
		
			if (dto.isNombreAtendioModified()) {
				stmt.setString( index++, dto.getNombreAtendio() );
			}
		
			if (dto.isFechaRealizacionMantenimientoModified()) {
				stmt.setDate(index++, dto.getFechaRealizacionMantenimiento()==null ? null : new java.sql.Date( dto.getFechaRealizacionMantenimiento().getTime() ) );
			}
		
			if (dto.isFechaProxMantenimientoModified()) {
				stmt.setDate(index++, dto.getFechaProxMantenimiento()==null ? null : new java.sql.Date( dto.getFechaProxMantenimiento().getTime() ) );
			}
		
			if (dto.isCostoModified()) {
				if (dto.isCostoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCosto() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdComodatoMantenimiento( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoMantenimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the comodato_mantenimiento table.
	 */
	public void update(ComodatoMantenimientoPk pk, ComodatoMantenimiento dto) throws ComodatoMantenimientoDaoException
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
			if (dto.isIdComodatoMantenimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMODATO_MANTENIMIENTO=?" );
				modified=true;
			}
		
			if (dto.isIdComodatoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMODATO=?" );
				modified=true;
			}
		
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isTecnicoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TECNICO=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isNombreAtendioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_ATENDIO=?" );
				modified=true;
			}
		
			if (dto.isFechaRealizacionMantenimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_REALIZACION_MANTENIMIENTO=?" );
				modified=true;
			}
		
			if (dto.isFechaProxMantenimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_PROX_MANTENIMIENTO=?" );
				modified=true;
			}
		
			if (dto.isCostoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COSTO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_COMODATO_MANTENIMIENTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdComodatoMantenimientoModified()) {
				stmt.setInt( index++, dto.getIdComodatoMantenimiento() );
			}
		
			if (dto.isIdComodatoModified()) {
				if (dto.isIdComodatoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdComodato() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isTecnicoModified()) {
				stmt.setString( index++, dto.getTecnico() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isEstatusModified()) {
				if (dto.isEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstatus() );
				}
		
			}
		
			if (dto.isNombreAtendioModified()) {
				stmt.setString( index++, dto.getNombreAtendio() );
			}
		
			if (dto.isFechaRealizacionMantenimientoModified()) {
				stmt.setDate(index++, dto.getFechaRealizacionMantenimiento()==null ? null : new java.sql.Date( dto.getFechaRealizacionMantenimiento().getTime() ) );
			}
		
			if (dto.isFechaProxMantenimientoModified()) {
				stmt.setDate(index++, dto.getFechaProxMantenimiento()==null ? null : new java.sql.Date( dto.getFechaProxMantenimiento().getTime() ) );
			}
		
			if (dto.isCostoModified()) {
				if (dto.isCostoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCosto() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdComodatoMantenimiento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoMantenimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the comodato_mantenimiento table.
	 */
	public void delete(ComodatoMantenimientoPk pk) throws ComodatoMantenimientoDaoException
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
			stmt.setInt( 1, pk.getIdComodatoMantenimiento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoMantenimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the comodato_mantenimiento table that matches the specified primary-key value.
	 */
	public ComodatoMantenimiento findByPrimaryKey(ComodatoMantenimientoPk pk) throws ComodatoMantenimientoDaoException
	{
		return findByPrimaryKey( pk.getIdComodatoMantenimiento() );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_COMODATO_MANTENIMIENTO = :idComodatoMantenimiento'.
	 */
	public ComodatoMantenimiento findByPrimaryKey(int idComodatoMantenimiento) throws ComodatoMantenimientoDaoException
	{
		ComodatoMantenimiento ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO_MANTENIMIENTO = ?", new Object[] {  new Integer(idComodatoMantenimiento) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria ''.
	 */
	public ComodatoMantenimiento[] findAll() throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_COMODATO_MANTENIMIENTO", null );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_COMODATO_MANTENIMIENTO = :idComodatoMantenimiento'.
	 */
	public ComodatoMantenimiento[] findWhereIdComodatoMantenimientoEquals(int idComodatoMantenimiento) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO_MANTENIMIENTO = ? ORDER BY ID_COMODATO_MANTENIMIENTO", new Object[] {  new Integer(idComodatoMantenimiento) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public ComodatoMantenimiento[] findWhereIdComodatoEquals(int idComodato) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO = ? ORDER BY ID_COMODATO", new Object[] {  new Integer(idComodato) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public ComodatoMantenimiento[] findWhereIdClienteEquals(int idCliente) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ComodatoMantenimiento[] findWhereIdEmpresaEquals(int idEmpresa) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'TECNICO = :tecnico'.
	 */
	public ComodatoMantenimiento[] findWhereTecnicoEquals(String tecnico) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TECNICO = ? ORDER BY TECNICO", new Object[] { tecnico } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public ComodatoMantenimiento[] findWhereDescripcionEquals(String descripcion) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'ESTATUS = :estatus'.
	 */
	public ComodatoMantenimiento[] findWhereEstatusEquals(int estatus) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTATUS = ? ORDER BY ESTATUS", new Object[] {  new Integer(estatus) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'NOMBRE_ATENDIO = :nombreAtendio'.
	 */
	public ComodatoMantenimiento[] findWhereNombreAtendioEquals(String nombreAtendio) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_ATENDIO = ? ORDER BY NOMBRE_ATENDIO", new Object[] { nombreAtendio } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'FECHA_REALIZACION_MANTENIMIENTO = :fechaRealizacionMantenimiento'.
	 */
	public ComodatoMantenimiento[] findWhereFechaRealizacionMantenimientoEquals(Date fechaRealizacionMantenimiento) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_REALIZACION_MANTENIMIENTO = ? ORDER BY FECHA_REALIZACION_MANTENIMIENTO", new Object[] { fechaRealizacionMantenimiento==null ? null : new java.sql.Date( fechaRealizacionMantenimiento.getTime() ) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'FECHA_PROX_MANTENIMIENTO = :fechaProxMantenimiento'.
	 */
	public ComodatoMantenimiento[] findWhereFechaProxMantenimientoEquals(Date fechaProxMantenimiento) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_PROX_MANTENIMIENTO = ? ORDER BY FECHA_PROX_MANTENIMIENTO", new Object[] { fechaProxMantenimiento==null ? null : new java.sql.Date( fechaProxMantenimiento.getTime() ) } );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the criteria 'COSTO = :costo'.
	 */
	public ComodatoMantenimiento[] findWhereCostoEquals(double costo) throws ComodatoMantenimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COSTO = ? ORDER BY COSTO", new Object[] {  new Double(costo) } );
	}

	/**
	 * Method 'ComodatoMantenimientoDaoImpl'
	 * 
	 */
	public ComodatoMantenimientoDaoImpl()
	{
	}

	/**
	 * Method 'ComodatoMantenimientoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ComodatoMantenimientoDaoImpl(final java.sql.Connection userConn)
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
		return "comodato_mantenimiento";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ComodatoMantenimiento fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ComodatoMantenimiento dto = new ComodatoMantenimiento();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ComodatoMantenimiento[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ComodatoMantenimiento dto = new ComodatoMantenimiento();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ComodatoMantenimiento ret[] = new ComodatoMantenimiento[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ComodatoMantenimiento dto, ResultSet rs) throws SQLException
	{
		dto.setIdComodatoMantenimiento( rs.getInt( COLUMN_ID_COMODATO_MANTENIMIENTO ) );
		dto.setIdComodato( rs.getInt( COLUMN_ID_COMODATO ) );
		if (rs.wasNull()) {
			dto.setIdComodatoNull( true );
		}
		
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		if (rs.wasNull()) {
			dto.setIdClienteNull( true );
		}
		
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setTecnico( rs.getString( COLUMN_TECNICO ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setEstatus( rs.getInt( COLUMN_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setEstatusNull( true );
		}
		
		dto.setNombreAtendio( rs.getString( COLUMN_NOMBRE_ATENDIO ) );
		dto.setFechaRealizacionMantenimiento( rs.getDate(COLUMN_FECHA_REALIZACION_MANTENIMIENTO ) );
		dto.setFechaProxMantenimiento( rs.getDate(COLUMN_FECHA_PROX_MANTENIMIENTO ) );
		dto.setCosto( rs.getDouble( COLUMN_COSTO ) );
		if (rs.wasNull()) {
			dto.setCostoNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ComodatoMantenimiento dto)
	{
		dto.setIdComodatoMantenimientoModified( false );
		dto.setIdComodatoModified( false );
		dto.setIdClienteModified( false );
		dto.setIdEmpresaModified( false );
		dto.setTecnicoModified( false );
		dto.setDescripcionModified( false );
		dto.setEstatusModified( false );
		dto.setNombreAtendioModified( false );
		dto.setFechaRealizacionMantenimientoModified( false );
		dto.setFechaProxMantenimientoModified( false );
		dto.setCostoModified( false );
	}

	/** 
	 * Returns all rows from the comodato_mantenimiento table that match the specified arbitrary SQL statement
	 */
	public ComodatoMantenimiento[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComodatoMantenimientoDaoException
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
			throw new ComodatoMantenimientoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the comodato_mantenimiento table that match the specified arbitrary SQL statement
	 */
	public ComodatoMantenimiento[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComodatoMantenimientoDaoException
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
			throw new ComodatoMantenimientoDaoException( "Exception: " + _e.getMessage(), _e );
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
