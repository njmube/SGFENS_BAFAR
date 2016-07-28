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

public class NominaRegistroPatronalDaoImpl extends AbstractDAO implements NominaRegistroPatronalDao
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
	protected final String SQL_SELECT = "SELECT id_nomina_reg_patronal, id_empresa, registro_patronal FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_nomina_reg_patronal, id_empresa, registro_patronal ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_nomina_reg_patronal = ?, id_empresa = ?, registro_patronal = ? WHERE id_nomina_reg_patronal = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_nomina_reg_patronal = ?";

	/** 
	 * Index of column id_nomina_reg_patronal
	 */
	protected static final int COLUMN_ID_NOMINA_REG_PATRONAL = 1;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column registro_patronal
	 */
	protected static final int COLUMN_REGISTRO_PATRONAL = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column id_nomina_reg_patronal
	 */
	protected static final int PK_COLUMN_ID_NOMINA_REG_PATRONAL = 1;

	/** 
	 * Inserts a new row in the nomina_registro_patronal table.
	 */
	public NominaRegistroPatronalPk insert(NominaRegistroPatronal dto) throws NominaRegistroPatronalDaoException
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
			if (dto.isIdNominaRegPatronalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_nomina_reg_patronal" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_empresa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isRegistroPatronalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "registro_patronal" );
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
			if (dto.isIdNominaRegPatronalModified()) {
				stmt.setInt( index++, dto.getIdNominaRegPatronal() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isRegistroPatronalModified()) {
				stmt.setString( index++, dto.getRegistroPatronal() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdNominaRegPatronal( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaRegistroPatronalDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the nomina_registro_patronal table.
	 */
	public void update(NominaRegistroPatronalPk pk, NominaRegistroPatronal dto) throws NominaRegistroPatronalDaoException
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
			if (dto.isIdNominaRegPatronalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_nomina_reg_patronal=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isRegistroPatronalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "registro_patronal=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_nomina_reg_patronal=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdNominaRegPatronalModified()) {
				stmt.setInt( index++, dto.getIdNominaRegPatronal() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isRegistroPatronalModified()) {
				stmt.setString( index++, dto.getRegistroPatronal() );
			}
		
			stmt.setInt( index++, pk.getIdNominaRegPatronal() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaRegistroPatronalDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the nomina_registro_patronal table.
	 */
	public void delete(NominaRegistroPatronalPk pk) throws NominaRegistroPatronalDaoException
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
			stmt.setInt( 1, pk.getIdNominaRegPatronal() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaRegistroPatronalDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the nomina_registro_patronal table that matches the specified primary-key value.
	 */
	public NominaRegistroPatronal findByPrimaryKey(NominaRegistroPatronalPk pk) throws NominaRegistroPatronalDaoException
	{
		return findByPrimaryKey( pk.getIdNominaRegPatronal() );
	}

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'id_nomina_reg_patronal = :idNominaRegPatronal'.
	 */
	public NominaRegistroPatronal findByPrimaryKey(int idNominaRegPatronal) throws NominaRegistroPatronalDaoException
	{
		NominaRegistroPatronal ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_nomina_reg_patronal = ?", new Object[] {  new Integer(idNominaRegPatronal) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria ''.
	 */
	public NominaRegistroPatronal[] findAll() throws NominaRegistroPatronalDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_nomina_reg_patronal", null );
	}

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'id_nomina_reg_patronal = :idNominaRegPatronal'.
	 */
	public NominaRegistroPatronal[] findWhereIdNominaRegPatronalEquals(int idNominaRegPatronal) throws NominaRegistroPatronalDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_nomina_reg_patronal = ? ORDER BY id_nomina_reg_patronal", new Object[] {  new Integer(idNominaRegPatronal) } );
	}

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public NominaRegistroPatronal[] findWhereIdEmpresaEquals(int idEmpresa) throws NominaRegistroPatronalDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'registro_patronal = :registroPatronal'.
	 */
	public NominaRegistroPatronal[] findWhereRegistroPatronalEquals(String registroPatronal) throws NominaRegistroPatronalDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE registro_patronal = ? ORDER BY registro_patronal", new Object[] { registroPatronal } );
	}

	/**
	 * Method 'NominaRegistroPatronalDaoImpl'
	 * 
	 */
	public NominaRegistroPatronalDaoImpl()
	{
	}

	/**
	 * Method 'NominaRegistroPatronalDaoImpl'
	 * 
	 * @param userConn
	 */
	public NominaRegistroPatronalDaoImpl(final java.sql.Connection userConn)
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
		return "nomina_registro_patronal";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected NominaRegistroPatronal fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			NominaRegistroPatronal dto = new NominaRegistroPatronal();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected NominaRegistroPatronal[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			NominaRegistroPatronal dto = new NominaRegistroPatronal();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		NominaRegistroPatronal ret[] = new NominaRegistroPatronal[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(NominaRegistroPatronal dto, ResultSet rs) throws SQLException
	{
		dto.setIdNominaRegPatronal( rs.getInt( COLUMN_ID_NOMINA_REG_PATRONAL ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setRegistroPatronal( rs.getString( COLUMN_REGISTRO_PATRONAL ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(NominaRegistroPatronal dto)
	{
		dto.setIdNominaRegPatronalModified( false );
		dto.setIdEmpresaModified( false );
		dto.setRegistroPatronalModified( false );
	}

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the specified arbitrary SQL statement
	 */
	public NominaRegistroPatronal[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaRegistroPatronalDaoException
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
			throw new NominaRegistroPatronalDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the nomina_registro_patronal table that match the specified arbitrary SQL statement
	 */
	public NominaRegistroPatronal[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaRegistroPatronalDaoException
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
			throw new NominaRegistroPatronalDaoException( "Exception: " + _e.getMessage(), _e );
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
