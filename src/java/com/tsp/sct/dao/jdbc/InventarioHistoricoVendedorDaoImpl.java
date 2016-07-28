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

public class InventarioHistoricoVendedorDaoImpl extends AbstractDAO implements InventarioHistoricoVendedorDao
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
	protected final String SQL_SELECT = "SELECT ID_EMPLEADO, ID_CONCEPTO, CANTIDAD_ASIGNADA, CANTIDAD_TERMINNO, FECHA_REGISTRO, FECHA_INICIAL_CORTE, FECHA_FINAL_CORTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_EMPLEADO, ID_CONCEPTO, CANTIDAD_ASIGNADA, CANTIDAD_TERMINNO, FECHA_REGISTRO, FECHA_INICIAL_CORTE, FECHA_FINAL_CORTE ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * Index of column ID_EMPLEADO
	 */
	protected static final int COLUMN_ID_EMPLEADO = 1;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 2;

	/** 
	 * Index of column CANTIDAD_ASIGNADA
	 */
	protected static final int COLUMN_CANTIDAD_ASIGNADA = 3;

	/** 
	 * Index of column CANTIDAD_TERMINNO
	 */
	protected static final int COLUMN_CANTIDAD_TERMINNO = 4;

	/** 
	 * Index of column FECHA_REGISTRO
	 */
	protected static final int COLUMN_FECHA_REGISTRO = 5;

	/** 
	 * Index of column FECHA_INICIAL_CORTE
	 */
	protected static final int COLUMN_FECHA_INICIAL_CORTE = 6;

	/** 
	 * Index of column FECHA_FINAL_CORTE
	 */
	protected static final int COLUMN_FECHA_FINAL_CORTE = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Inserts a new row in the inventario_historico_vendedor table.
	 */
	public void insert(InventarioHistoricoVendedor dto) throws InventarioHistoricoVendedorDaoException
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
		
			if (dto.isCantidadAsignadaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CANTIDAD_ASIGNADA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCantidadTerminnoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CANTIDAD_TERMINNO" );
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
		
			if (dto.isFechaInicialCorteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_INICIAL_CORTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaFinalCorteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_FINAL_CORTE" );
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
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
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
		
			if (dto.isCantidadAsignadaModified()) {
				if (dto.isCantidadAsignadaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCantidadAsignada() );
				}
		
			}
		
			if (dto.isCantidadTerminnoModified()) {
				if (dto.isCantidadTerminnoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCantidadTerminno() );
				}
		
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isFechaInicialCorteModified()) {
				stmt.setTimestamp(index++, dto.getFechaInicialCorte()==null ? null : new java.sql.Timestamp( dto.getFechaInicialCorte().getTime() ) );
			}
		
			if (dto.isFechaFinalCorteModified()) {
				stmt.setTimestamp(index++, dto.getFechaFinalCorte()==null ? null : new java.sql.Timestamp( dto.getFechaFinalCorte().getTime() ) );
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			reset(dto);
		}
		catch (Exception _e) {
			throw new InventarioHistoricoVendedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria ''.
	 */
	public InventarioHistoricoVendedor[] findAll() throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public InventarioHistoricoVendedor[] findWhereIdEmpleadoEquals(int idEmpleado) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO = ? ORDER BY ID_EMPLEADO", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public InventarioHistoricoVendedor[] findWhereIdConceptoEquals(int idConcepto) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'CANTIDAD_ASIGNADA = :cantidadAsignada'.
	 */
	public InventarioHistoricoVendedor[] findWhereCantidadAsignadaEquals(double cantidadAsignada) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD_ASIGNADA = ? ORDER BY CANTIDAD_ASIGNADA", new Object[] {  new Double(cantidadAsignada) } );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'CANTIDAD_TERMINNO = :cantidadTerminno'.
	 */
	public InventarioHistoricoVendedor[] findWhereCantidadTerminnoEquals(double cantidadTerminno) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD_TERMINNO = ? ORDER BY CANTIDAD_TERMINNO", new Object[] {  new Double(cantidadTerminno) } );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public InventarioHistoricoVendedor[] findWhereFechaRegistroEquals(Date fechaRegistro) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_REGISTRO = ? ORDER BY FECHA_REGISTRO", new Object[] { fechaRegistro==null ? null : new java.sql.Timestamp( fechaRegistro.getTime() ) } );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'FECHA_INICIAL_CORTE = :fechaInicialCorte'.
	 */
	public InventarioHistoricoVendedor[] findWhereFechaInicialCorteEquals(Date fechaInicialCorte) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_INICIAL_CORTE = ? ORDER BY FECHA_INICIAL_CORTE", new Object[] { fechaInicialCorte==null ? null : new java.sql.Timestamp( fechaInicialCorte.getTime() ) } );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the criteria 'FECHA_FINAL_CORTE = :fechaFinalCorte'.
	 */
	public InventarioHistoricoVendedor[] findWhereFechaFinalCorteEquals(Date fechaFinalCorte) throws InventarioHistoricoVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_FINAL_CORTE = ? ORDER BY FECHA_FINAL_CORTE", new Object[] { fechaFinalCorte==null ? null : new java.sql.Timestamp( fechaFinalCorte.getTime() ) } );
	}

	/**
	 * Method 'InventarioHistoricoVendedorDaoImpl'
	 * 
	 */
	public InventarioHistoricoVendedorDaoImpl()
	{
	}

	/**
	 * Method 'InventarioHistoricoVendedorDaoImpl'
	 * 
	 * @param userConn
	 */
	public InventarioHistoricoVendedorDaoImpl(final java.sql.Connection userConn)
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
		return "inventario_historico_vendedor";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected InventarioHistoricoVendedor fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			InventarioHistoricoVendedor dto = new InventarioHistoricoVendedor();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected InventarioHistoricoVendedor[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			InventarioHistoricoVendedor dto = new InventarioHistoricoVendedor();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		InventarioHistoricoVendedor ret[] = new InventarioHistoricoVendedor[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(InventarioHistoricoVendedor dto, ResultSet rs) throws SQLException
	{
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoNull( true );
		}
		
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		if (rs.wasNull()) {
			dto.setIdConceptoNull( true );
		}
		
		dto.setCantidadAsignada( rs.getDouble( COLUMN_CANTIDAD_ASIGNADA ) );
		if (rs.wasNull()) {
			dto.setCantidadAsignadaNull( true );
		}
		
		dto.setCantidadTerminno( rs.getDouble( COLUMN_CANTIDAD_TERMINNO ) );
		if (rs.wasNull()) {
			dto.setCantidadTerminnoNull( true );
		}
		
		dto.setFechaRegistro( rs.getTimestamp(COLUMN_FECHA_REGISTRO ) );
		dto.setFechaInicialCorte( rs.getTimestamp(COLUMN_FECHA_INICIAL_CORTE ) );
		dto.setFechaFinalCorte( rs.getTimestamp(COLUMN_FECHA_FINAL_CORTE ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(InventarioHistoricoVendedor dto)
	{
		dto.setIdEmpleadoModified( false );
		dto.setIdConceptoModified( false );
		dto.setCantidadAsignadaModified( false );
		dto.setCantidadTerminnoModified( false );
		dto.setFechaRegistroModified( false );
		dto.setFechaInicialCorteModified( false );
		dto.setFechaFinalCorteModified( false );
	}

	/** 
	 * Returns all rows from the inventario_historico_vendedor table that match the specified arbitrary SQL statement
	 */
	public InventarioHistoricoVendedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws InventarioHistoricoVendedorDaoException
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
			throw new InventarioHistoricoVendedorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the inventario_historico_vendedor table that match the specified arbitrary SQL statement
	 */
	public InventarioHistoricoVendedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws InventarioHistoricoVendedorDaoException
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
			throw new InventarioHistoricoVendedorDaoException( "Exception: " + _e.getMessage(), _e );
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
