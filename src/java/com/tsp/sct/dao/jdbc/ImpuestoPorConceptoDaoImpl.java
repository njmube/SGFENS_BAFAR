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

public class ImpuestoPorConceptoDaoImpl extends AbstractDAO implements ImpuestoPorConceptoDao
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
	protected final String SQL_SELECT = "SELECT ID_IMPUESTO_POR_CONCEPTO, ID_CONCEPTO, ID_IMPUESTO, ID_ESTATUS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_IMPUESTO_POR_CONCEPTO, ID_CONCEPTO, ID_IMPUESTO, ID_ESTATUS ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_IMPUESTO_POR_CONCEPTO = ?, ID_CONCEPTO = ?, ID_IMPUESTO = ?, ID_ESTATUS = ? WHERE ID_IMPUESTO_POR_CONCEPTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_IMPUESTO_POR_CONCEPTO = ?";

	/** 
	 * Index of column ID_IMPUESTO_POR_CONCEPTO
	 */
	protected static final int COLUMN_ID_IMPUESTO_POR_CONCEPTO = 1;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 2;

	/** 
	 * Index of column ID_IMPUESTO
	 */
	protected static final int COLUMN_ID_IMPUESTO = 3;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column ID_IMPUESTO_POR_CONCEPTO
	 */
	protected static final int PK_COLUMN_ID_IMPUESTO_POR_CONCEPTO = 1;

	/** 
	 * Inserts a new row in the impuesto_por_concepto table.
	 */
	public ImpuestoPorConceptoPk insert(ImpuestoPorConcepto dto) throws ImpuestoPorConceptoDaoException
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
			if (dto.isIdImpuestoPorConceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_IMPUESTO_POR_CONCEPTO" );
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
		
			if (dto.isIdImpuestoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_IMPUESTO" );
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
			if (dto.isIdImpuestoPorConceptoModified()) {
				stmt.setInt( index++, dto.getIdImpuestoPorConcepto() );
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			if (dto.isIdImpuestoModified()) {
				if (dto.isIdImpuestoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdImpuesto() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdImpuestoPorConcepto( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ImpuestoPorConceptoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the impuesto_por_concepto table.
	 */
	public void update(ImpuestoPorConceptoPk pk, ImpuestoPorConcepto dto) throws ImpuestoPorConceptoDaoException
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
			if (dto.isIdImpuestoPorConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_IMPUESTO_POR_CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isIdImpuestoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_IMPUESTO=?" );
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
		
			sql.append( " WHERE ID_IMPUESTO_POR_CONCEPTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdImpuestoPorConceptoModified()) {
				stmt.setInt( index++, dto.getIdImpuestoPorConcepto() );
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			if (dto.isIdImpuestoModified()) {
				if (dto.isIdImpuestoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdImpuesto() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			stmt.setInt( index++, pk.getIdImpuestoPorConcepto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ImpuestoPorConceptoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the impuesto_por_concepto table.
	 */
	public void delete(ImpuestoPorConceptoPk pk) throws ImpuestoPorConceptoDaoException
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
			stmt.setInt( 1, pk.getIdImpuestoPorConcepto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ImpuestoPorConceptoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the impuesto_por_concepto table that matches the specified primary-key value.
	 */
	public ImpuestoPorConcepto findByPrimaryKey(ImpuestoPorConceptoPk pk) throws ImpuestoPorConceptoDaoException
	{
		return findByPrimaryKey( pk.getIdImpuestoPorConcepto() );
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the criteria 'ID_IMPUESTO_POR_CONCEPTO = :idImpuestoPorConcepto'.
	 */
	public ImpuestoPorConcepto findByPrimaryKey(int idImpuestoPorConcepto) throws ImpuestoPorConceptoDaoException
	{
		ImpuestoPorConcepto ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_IMPUESTO_POR_CONCEPTO = ?", new Object[] {  new Integer(idImpuestoPorConcepto) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the criteria ''.
	 */
	public ImpuestoPorConcepto[] findAll() throws ImpuestoPorConceptoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_IMPUESTO_POR_CONCEPTO", null );
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the criteria 'ID_IMPUESTO_POR_CONCEPTO = :idImpuestoPorConcepto'.
	 */
	public ImpuestoPorConcepto[] findWhereIdImpuestoPorConceptoEquals(int idImpuestoPorConcepto) throws ImpuestoPorConceptoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_IMPUESTO_POR_CONCEPTO = ? ORDER BY ID_IMPUESTO_POR_CONCEPTO", new Object[] {  new Integer(idImpuestoPorConcepto) } );
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public ImpuestoPorConcepto[] findWhereIdConceptoEquals(int idConcepto) throws ImpuestoPorConceptoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the criteria 'ID_IMPUESTO = :idImpuesto'.
	 */
	public ImpuestoPorConcepto[] findWhereIdImpuestoEquals(int idImpuesto) throws ImpuestoPorConceptoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_IMPUESTO = ? ORDER BY ID_IMPUESTO", new Object[] {  new Integer(idImpuesto) } );
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public ImpuestoPorConcepto[] findWhereIdEstatusEquals(int idEstatus) throws ImpuestoPorConceptoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'ImpuestoPorConceptoDaoImpl'
	 * 
	 */
	public ImpuestoPorConceptoDaoImpl()
	{
	}

	/**
	 * Method 'ImpuestoPorConceptoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ImpuestoPorConceptoDaoImpl(final java.sql.Connection userConn)
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
		return "impuesto_por_concepto";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ImpuestoPorConcepto fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ImpuestoPorConcepto dto = new ImpuestoPorConcepto();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ImpuestoPorConcepto[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ImpuestoPorConcepto dto = new ImpuestoPorConcepto();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ImpuestoPorConcepto ret[] = new ImpuestoPorConcepto[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ImpuestoPorConcepto dto, ResultSet rs) throws SQLException
	{
		dto.setIdImpuestoPorConcepto( rs.getInt( COLUMN_ID_IMPUESTO_POR_CONCEPTO ) );
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		if (rs.wasNull()) {
			dto.setIdConceptoNull( true );
		}
		
		dto.setIdImpuesto( rs.getInt( COLUMN_ID_IMPUESTO ) );
		if (rs.wasNull()) {
			dto.setIdImpuestoNull( true );
		}
		
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ImpuestoPorConcepto dto)
	{
		dto.setIdImpuestoPorConceptoModified( false );
		dto.setIdConceptoModified( false );
		dto.setIdImpuestoModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the impuesto_por_concepto table that match the specified arbitrary SQL statement
	 */
	public ImpuestoPorConcepto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ImpuestoPorConceptoDaoException
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
			throw new ImpuestoPorConceptoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the impuesto_por_concepto table that match the specified arbitrary SQL statement
	 */
	public ImpuestoPorConcepto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ImpuestoPorConceptoDaoException
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
			throw new ImpuestoPorConceptoDaoException( "Exception: " + _e.getMessage(), _e );
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
