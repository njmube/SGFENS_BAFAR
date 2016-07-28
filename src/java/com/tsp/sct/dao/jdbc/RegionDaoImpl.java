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

public class RegionDaoImpl extends AbstractDAO implements RegionDao
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
	protected final String SQL_SELECT = "SELECT ID_REGION, NOMBRE, DESCRIPCION, ID_EMPRESA, ID_ESTATUS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_REGION, NOMBRE, DESCRIPCION, ID_EMPRESA, ID_ESTATUS ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_REGION = ?, NOMBRE = ?, DESCRIPCION = ?, ID_EMPRESA = ?, ID_ESTATUS = ? WHERE ID_REGION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_REGION = ?";

	/** 
	 * Index of column ID_REGION
	 */
	protected static final int COLUMN_ID_REGION = 1;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 4;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column ID_REGION
	 */
	protected static final int PK_COLUMN_ID_REGION = 1;

	/** 
	 * Inserts a new row in the region table.
	 */
	public RegionPk insert(Region dto) throws RegionDaoException
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
			if (dto.isIdRegionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_REGION" );
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
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
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
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdRegionModified()) {
				stmt.setLong( index++, dto.getIdRegion() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setLong( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setLong( index++, dto.getIdEstatus() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdRegion( rs.getLong( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RegionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the region table.
	 */
	public void update(RegionPk pk, Region dto) throws RegionDaoException
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
			if (dto.isIdRegionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_REGION=?" );
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
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_REGION=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdRegionModified()) {
				stmt.setLong( index++, dto.getIdRegion() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setLong( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setLong( index++, dto.getIdEstatus() );
				}
		
			}
		
			stmt.setLong( index++, pk.getIdRegion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RegionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the region table.
	 */
	public void delete(RegionPk pk) throws RegionDaoException
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
			stmt.setLong( 1, pk.getIdRegion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RegionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the region table that matches the specified primary-key value.
	 */
	public Region findByPrimaryKey(RegionPk pk) throws RegionDaoException
	{
		return findByPrimaryKey( pk.getIdRegion() );
	}

	/** 
	 * Returns all rows from the region table that match the criteria 'ID_REGION = :idRegion'.
	 */
	public Region findByPrimaryKey(long idRegion) throws RegionDaoException
	{
		Region ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_REGION = ?", new Object[] {  new Long(idRegion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the region table that match the criteria ''.
	 */
	public Region[] findAll() throws RegionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_REGION", null );
	}

	/** 
	 * Returns all rows from the region table that match the criteria 'ID_REGION = :idRegion'.
	 */
	public Region[] findWhereIdRegionEquals(long idRegion) throws RegionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_REGION = ? ORDER BY ID_REGION", new Object[] {  new Long(idRegion) } );
	}

	/** 
	 * Returns all rows from the region table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Region[] findWhereNombreEquals(String nombre) throws RegionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the region table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Region[] findWhereDescripcionEquals(String descripcion) throws RegionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the region table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Region[] findWhereIdEmpresaEquals(long idEmpresa) throws RegionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Long(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the region table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Region[] findWhereIdEstatusEquals(long idEstatus) throws RegionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Long(idEstatus) } );
	}

	/**
	 * Method 'RegionDaoImpl'
	 * 
	 */
	public RegionDaoImpl()
	{
	}

	/**
	 * Method 'RegionDaoImpl'
	 * 
	 * @param userConn
	 */
	public RegionDaoImpl(final java.sql.Connection userConn)
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
		return "region";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Region fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Region dto = new Region();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Region[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Region dto = new Region();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Region ret[] = new Region[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Region dto, ResultSet rs) throws SQLException
	{
		dto.setIdRegion( rs.getLong( COLUMN_ID_REGION ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setIdEmpresa( rs.getLong( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setIdEstatus( rs.getLong( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Region dto)
	{
		dto.setIdRegionModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the region table that match the specified arbitrary SQL statement
	 */
	public Region[] findByDynamicSelect(String sql, Object[] sqlParams) throws RegionDaoException
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
			throw new RegionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the region table that match the specified arbitrary SQL statement
	 */
	public Region[] findByDynamicWhere(String sql, Object[] sqlParams) throws RegionDaoException
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
			throw new RegionDaoException( "Exception: " + _e.getMessage(), _e );
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
