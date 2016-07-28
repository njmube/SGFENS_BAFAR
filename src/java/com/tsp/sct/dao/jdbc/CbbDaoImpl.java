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

public class CbbDaoImpl extends AbstractDAO implements CbbDao
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
	protected final String SQL_SELECT = "SELECT ID_CBB, ID_EMPRESA, NOMBRE_CBB FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CBB, ID_EMPRESA, NOMBRE_CBB ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CBB = ?, ID_EMPRESA = ?, NOMBRE_CBB = ? WHERE ID_CBB = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CBB = ?";

	/** 
	 * Index of column ID_CBB
	 */
	protected static final int COLUMN_ID_CBB = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column NOMBRE_CBB
	 */
	protected static final int COLUMN_NOMBRE_CBB = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_CBB
	 */
	protected static final int PK_COLUMN_ID_CBB = 1;

	/** 
	 * Inserts a new row in the cbb table.
	 */
	public CbbPk insert(Cbb dto) throws CbbDaoException
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
			if (dto.isIdCbbModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CBB" );
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
		
			if (dto.isNombreCbbModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_CBB" );
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
			if (dto.isIdCbbModified()) {
				stmt.setInt( index++, dto.getIdCbb() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isNombreCbbModified()) {
				stmt.setString( index++, dto.getNombreCbb() );
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
			throw new CbbDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cbb table.
	 */
	public void update(CbbPk pk, Cbb dto) throws CbbDaoException
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
			if (dto.isIdCbbModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CBB=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isNombreCbbModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_CBB=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_CBB=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdCbbModified()) {
				stmt.setInt( index++, dto.getIdCbb() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isNombreCbbModified()) {
				stmt.setString( index++, dto.getNombreCbb() );
			}
		
			stmt.setInt( index++, pk.getIdCbb() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CbbDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cbb table.
	 */
	public void delete(CbbPk pk) throws CbbDaoException
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
			stmt.setInt( 1, pk.getIdCbb() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CbbDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cbb table that matches the specified primary-key value.
	 */
	public Cbb findByPrimaryKey(CbbPk pk) throws CbbDaoException
	{
		return findByPrimaryKey( pk.getIdCbb() );
	}

	/** 
	 * Returns all rows from the cbb table that match the criteria 'ID_CBB = :idCbb'.
	 */
	public Cbb findByPrimaryKey(int idCbb) throws CbbDaoException
	{
		Cbb ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CBB = ?", new Object[] {  new Integer(idCbb) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cbb table that match the criteria ''.
	 */
	public Cbb[] findAll() throws CbbDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CBB", null );
	}

	/** 
	 * Returns all rows from the cbb table that match the criteria 'ID_CBB = :idCbb'.
	 */
	public Cbb[] findWhereIdCbbEquals(int idCbb) throws CbbDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CBB = ? ORDER BY ID_CBB", new Object[] {  new Integer(idCbb) } );
	}

	/** 
	 * Returns all rows from the cbb table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Cbb[] findWhereIdEmpresaEquals(int idEmpresa) throws CbbDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the cbb table that match the criteria 'NOMBRE_CBB = :nombreCbb'.
	 */
	public Cbb[] findWhereNombreCbbEquals(String nombreCbb) throws CbbDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_CBB = ? ORDER BY NOMBRE_CBB", new Object[] { nombreCbb } );
	}

	/**
	 * Method 'CbbDaoImpl'
	 * 
	 */
	public CbbDaoImpl()
	{
	}

	/**
	 * Method 'CbbDaoImpl'
	 * 
	 * @param userConn
	 */
	public CbbDaoImpl(final java.sql.Connection userConn)
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
		return "CBB";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Cbb fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Cbb dto = new Cbb();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Cbb[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Cbb dto = new Cbb();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Cbb ret[] = new Cbb[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Cbb dto, ResultSet rs) throws SQLException
	{
		dto.setIdCbb( rs.getInt( COLUMN_ID_CBB ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setNombreCbb( rs.getString( COLUMN_NOMBRE_CBB ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Cbb dto)
	{
		dto.setIdCbbModified( false );
		dto.setIdEmpresaModified( false );
		dto.setNombreCbbModified( false );
	}

	/** 
	 * Returns all rows from the cbb table that match the specified arbitrary SQL statement
	 */
	public Cbb[] findByDynamicSelect(String sql, Object[] sqlParams) throws CbbDaoException
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
			throw new CbbDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cbb table that match the specified arbitrary SQL statement
	 */
	public Cbb[] findByDynamicWhere(String sql, Object[] sqlParams) throws CbbDaoException
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
			throw new CbbDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
        
        protected final String SQL_SELECT_MAX = "SELECT ID_CBB, ID_EMPRESA, NOMBRE_CBB FROM " + getTableName() + " ORDER BY NOMBRE_CBB DESC LIMIT 1 ";
                
        public Cbb findLast() throws CbbDaoException	{
		Cbb ret[] = findByDynamicSelect( SQL_SELECT_MAX , new Object[0] );
		return ret.length==0 ? null : ret[0];
	}

}
