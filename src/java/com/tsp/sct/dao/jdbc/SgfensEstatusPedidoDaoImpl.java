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

public class SgfensEstatusPedidoDaoImpl extends AbstractDAO implements SgfensEstatusPedidoDao
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
	protected final String SQL_SELECT = "SELECT ID_ESTATUS_PEDIDO, NOMBRE, DESCRIPCION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_ESTATUS_PEDIDO, NOMBRE, DESCRIPCION ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_ESTATUS_PEDIDO = ?, NOMBRE = ?, DESCRIPCION = ? WHERE ID_ESTATUS_PEDIDO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_ESTATUS_PEDIDO = ?";

	/** 
	 * Index of column ID_ESTATUS_PEDIDO
	 */
	protected static final int COLUMN_ID_ESTATUS_PEDIDO = 1;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_ESTATUS_PEDIDO
	 */
	protected static final int PK_COLUMN_ID_ESTATUS_PEDIDO = 1;

	/** 
	 * Inserts a new row in the SGFENS_ESTATUS_PEDIDO table.
	 */
	public SgfensEstatusPedidoPk insert(SgfensEstatusPedido dto) throws SgfensEstatusPedidoDaoException
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
			if (dto.isIdEstatusPedidoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS_PEDIDO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE" );
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
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdEstatusPedidoModified()) {
				stmt.setInt( index++, dto.getIdEstatusPedido() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensEstatusPedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the SGFENS_ESTATUS_PEDIDO table.
	 */
	public void update(SgfensEstatusPedidoPk pk, SgfensEstatusPedido dto) throws SgfensEstatusPedidoDaoException
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
			if (dto.isIdEstatusPedidoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS_PEDIDO=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_ESTATUS_PEDIDO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdEstatusPedidoModified()) {
				stmt.setInt( index++, dto.getIdEstatusPedido() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			stmt.setInt( index++, pk.getIdEstatusPedido() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensEstatusPedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the SGFENS_ESTATUS_PEDIDO table.
	 */
	public void delete(SgfensEstatusPedidoPk pk) throws SgfensEstatusPedidoDaoException
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
			stmt.setInt( 1, pk.getIdEstatusPedido() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensEstatusPedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the SGFENS_ESTATUS_PEDIDO table that matches the specified primary-key value.
	 */
	public SgfensEstatusPedido findByPrimaryKey(SgfensEstatusPedidoPk pk) throws SgfensEstatusPedidoDaoException
	{
		return findByPrimaryKey( pk.getIdEstatusPedido() );
	}

	/** 
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the criteria 'ID_ESTATUS_PEDIDO = :idEstatusPedido'.
	 */
	public SgfensEstatusPedido findByPrimaryKey(int idEstatusPedido) throws SgfensEstatusPedidoDaoException
	{
		SgfensEstatusPedido ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS_PEDIDO = ?", new Object[] {  new Integer(idEstatusPedido) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the criteria ''.
	 */
	public SgfensEstatusPedido[] findAll() throws SgfensEstatusPedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_ESTATUS_PEDIDO", null );
	}

	/** 
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the criteria 'ID_ESTATUS_PEDIDO = :idEstatusPedido'.
	 */
	public SgfensEstatusPedido[] findWhereIdEstatusPedidoEquals(int idEstatusPedido) throws SgfensEstatusPedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS_PEDIDO = ? ORDER BY ID_ESTATUS_PEDIDO", new Object[] {  new Integer(idEstatusPedido) } );
	}

	/** 
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the criteria 'NOMBRE = :nombre'.
	 */
	public SgfensEstatusPedido[] findWhereNombreEquals(String nombre) throws SgfensEstatusPedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public SgfensEstatusPedido[] findWhereDescripcionEquals(String descripcion) throws SgfensEstatusPedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/**
	 * Method 'SgfensEstatusPedidoDaoImpl'
	 * 
	 */
	public SgfensEstatusPedidoDaoImpl()
	{
	}

	/**
	 * Method 'SgfensEstatusPedidoDaoImpl'
	 * 
	 * @param userConn
	 */
	public SgfensEstatusPedidoDaoImpl(final java.sql.Connection userConn)
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
		return "SGFENS_ESTATUS_PEDIDO";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SgfensEstatusPedido fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SgfensEstatusPedido dto = new SgfensEstatusPedido();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SgfensEstatusPedido[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SgfensEstatusPedido dto = new SgfensEstatusPedido();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SgfensEstatusPedido ret[] = new SgfensEstatusPedido[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SgfensEstatusPedido dto, ResultSet rs) throws SQLException
	{
		dto.setIdEstatusPedido( rs.getInt( COLUMN_ID_ESTATUS_PEDIDO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SgfensEstatusPedido dto)
	{
		dto.setIdEstatusPedidoModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
	}

	/** 
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the specified arbitrary SQL statement
	 */
	public SgfensEstatusPedido[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensEstatusPedidoDaoException
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
			throw new SgfensEstatusPedidoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the SGFENS_ESTATUS_PEDIDO table that match the specified arbitrary SQL statement
	 */
	public SgfensEstatusPedido[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensEstatusPedidoDaoException
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
			throw new SgfensEstatusPedidoDaoException( "Exception: " + _e.getMessage(), _e );
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
