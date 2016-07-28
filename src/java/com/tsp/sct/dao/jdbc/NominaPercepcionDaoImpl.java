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

public class NominaPercepcionDaoImpl extends AbstractDAO implements NominaPercepcionDao
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
	protected final String SQL_SELECT = "SELECT ID_NOMINA_PERCEPCION, ID_EMPRESA, ID_ESTATUS, ID_NOMINA_TIPO_PERCEPCION, CLAVE, CONCEPTO, IMPORTE_GRAVADO, IMPORTE_EXCEPTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_NOMINA_PERCEPCION, ID_EMPRESA, ID_ESTATUS, ID_NOMINA_TIPO_PERCEPCION, CLAVE, CONCEPTO, IMPORTE_GRAVADO, IMPORTE_EXCEPTO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_NOMINA_PERCEPCION = ?, ID_EMPRESA = ?, ID_ESTATUS = ?, ID_NOMINA_TIPO_PERCEPCION = ?, CLAVE = ?, CONCEPTO = ?, IMPORTE_GRAVADO = ?, IMPORTE_EXCEPTO = ? WHERE ID_NOMINA_PERCEPCION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_NOMINA_PERCEPCION = ?";

	/** 
	 * Index of column ID_NOMINA_PERCEPCION
	 */
	protected static final int COLUMN_ID_NOMINA_PERCEPCION = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 3;

	/** 
	 * Index of column ID_NOMINA_TIPO_PERCEPCION
	 */
	protected static final int COLUMN_ID_NOMINA_TIPO_PERCEPCION = 4;

	/** 
	 * Index of column CLAVE
	 */
	protected static final int COLUMN_CLAVE = 5;

	/** 
	 * Index of column CONCEPTO
	 */
	protected static final int COLUMN_CONCEPTO = 6;

	/** 
	 * Index of column IMPORTE_GRAVADO
	 */
	protected static final int COLUMN_IMPORTE_GRAVADO = 7;

	/** 
	 * Index of column IMPORTE_EXCEPTO
	 */
	protected static final int COLUMN_IMPORTE_EXCEPTO = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column ID_NOMINA_PERCEPCION
	 */
	protected static final int PK_COLUMN_ID_NOMINA_PERCEPCION = 1;

	/** 
	 * Inserts a new row in the nomina_percepcion table.
	 */
	public NominaPercepcionPk insert(NominaPercepcion dto) throws NominaPercepcionDaoException
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
			if (dto.isIdNominaPercepcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_NOMINA_PERCEPCION" );
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
		
			if (dto.isIdNominaTipoPercepcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_NOMINA_TIPO_PERCEPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isClaveModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CLAVE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isConceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONCEPTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImporteGravadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPORTE_GRAVADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImporteExceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPORTE_EXCEPTO" );
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
			if (dto.isIdNominaPercepcionModified()) {
				stmt.setInt( index++, dto.getIdNominaPercepcion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdNominaTipoPercepcionModified()) {
				if (dto.isIdNominaTipoPercepcionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdNominaTipoPercepcion() );
				}
		
			}
		
			if (dto.isClaveModified()) {
				stmt.setString( index++, dto.getClave() );
			}
		
			if (dto.isConceptoModified()) {
				stmt.setString( index++, dto.getConcepto() );
			}
		
			if (dto.isImporteGravadoModified()) {
				if (dto.isImporteGravadoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteGravado() );
				}
		
			}
		
			if (dto.isImporteExceptoModified()) {
				if (dto.isImporteExceptoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteExcepto() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdNominaPercepcion( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaPercepcionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the nomina_percepcion table.
	 */
	public void update(NominaPercepcionPk pk, NominaPercepcion dto) throws NominaPercepcionDaoException
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
			if (dto.isIdNominaPercepcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_NOMINA_PERCEPCION=?" );
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
		
			if (dto.isIdNominaTipoPercepcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_NOMINA_TIPO_PERCEPCION=?" );
				modified=true;
			}
		
			if (dto.isClaveModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CLAVE=?" );
				modified=true;
			}
		
			if (dto.isConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isImporteGravadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPORTE_GRAVADO=?" );
				modified=true;
			}
		
			if (dto.isImporteExceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPORTE_EXCEPTO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_NOMINA_PERCEPCION=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdNominaPercepcionModified()) {
				stmt.setInt( index++, dto.getIdNominaPercepcion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdNominaTipoPercepcionModified()) {
				if (dto.isIdNominaTipoPercepcionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdNominaTipoPercepcion() );
				}
		
			}
		
			if (dto.isClaveModified()) {
				stmt.setString( index++, dto.getClave() );
			}
		
			if (dto.isConceptoModified()) {
				stmt.setString( index++, dto.getConcepto() );
			}
		
			if (dto.isImporteGravadoModified()) {
				if (dto.isImporteGravadoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteGravado() );
				}
		
			}
		
			if (dto.isImporteExceptoModified()) {
				if (dto.isImporteExceptoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteExcepto() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdNominaPercepcion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaPercepcionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the nomina_percepcion table.
	 */
	public void delete(NominaPercepcionPk pk) throws NominaPercepcionDaoException
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
			stmt.setInt( 1, pk.getIdNominaPercepcion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaPercepcionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the nomina_percepcion table that matches the specified primary-key value.
	 */
	public NominaPercepcion findByPrimaryKey(NominaPercepcionPk pk) throws NominaPercepcionDaoException
	{
		return findByPrimaryKey( pk.getIdNominaPercepcion() );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'ID_NOMINA_PERCEPCION = :idNominaPercepcion'.
	 */
	public NominaPercepcion findByPrimaryKey(int idNominaPercepcion) throws NominaPercepcionDaoException
	{
		NominaPercepcion ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_NOMINA_PERCEPCION = ?", new Object[] {  new Integer(idNominaPercepcion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria ''.
	 */
	public NominaPercepcion[] findAll() throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_NOMINA_PERCEPCION", null );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'ID_NOMINA_PERCEPCION = :idNominaPercepcion'.
	 */
	public NominaPercepcion[] findWhereIdNominaPercepcionEquals(int idNominaPercepcion) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_NOMINA_PERCEPCION = ? ORDER BY ID_NOMINA_PERCEPCION", new Object[] {  new Integer(idNominaPercepcion) } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public NominaPercepcion[] findWhereIdEmpresaEquals(int idEmpresa) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public NominaPercepcion[] findWhereIdEstatusEquals(int idEstatus) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'ID_NOMINA_TIPO_PERCEPCION = :idNominaTipoPercepcion'.
	 */
	public NominaPercepcion[] findWhereIdNominaTipoPercepcionEquals(int idNominaTipoPercepcion) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_NOMINA_TIPO_PERCEPCION = ? ORDER BY ID_NOMINA_TIPO_PERCEPCION", new Object[] {  new Integer(idNominaTipoPercepcion) } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'CLAVE = :clave'.
	 */
	public NominaPercepcion[] findWhereClaveEquals(String clave) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CLAVE = ? ORDER BY CLAVE", new Object[] { clave } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'CONCEPTO = :concepto'.
	 */
	public NominaPercepcion[] findWhereConceptoEquals(String concepto) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONCEPTO = ? ORDER BY CONCEPTO", new Object[] { concepto } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'IMPORTE_GRAVADO = :importeGravado'.
	 */
	public NominaPercepcion[] findWhereImporteGravadoEquals(double importeGravado) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPORTE_GRAVADO = ? ORDER BY IMPORTE_GRAVADO", new Object[] {  new Double(importeGravado) } );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the criteria 'IMPORTE_EXCEPTO = :importeExcepto'.
	 */
	public NominaPercepcion[] findWhereImporteExceptoEquals(double importeExcepto) throws NominaPercepcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPORTE_EXCEPTO = ? ORDER BY IMPORTE_EXCEPTO", new Object[] {  new Double(importeExcepto) } );
	}

	/**
	 * Method 'NominaPercepcionDaoImpl'
	 * 
	 */
	public NominaPercepcionDaoImpl()
	{
	}

	/**
	 * Method 'NominaPercepcionDaoImpl'
	 * 
	 * @param userConn
	 */
	public NominaPercepcionDaoImpl(final java.sql.Connection userConn)
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
		return "nomina_percepcion";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected NominaPercepcion fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			NominaPercepcion dto = new NominaPercepcion();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected NominaPercepcion[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			NominaPercepcion dto = new NominaPercepcion();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		NominaPercepcion ret[] = new NominaPercepcion[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(NominaPercepcion dto, ResultSet rs) throws SQLException
	{
		dto.setIdNominaPercepcion( rs.getInt( COLUMN_ID_NOMINA_PERCEPCION ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setIdNominaTipoPercepcion( rs.getInt( COLUMN_ID_NOMINA_TIPO_PERCEPCION ) );
		if (rs.wasNull()) {
			dto.setIdNominaTipoPercepcionNull( true );
		}
		
		dto.setClave( rs.getString( COLUMN_CLAVE ) );
		dto.setConcepto( rs.getString( COLUMN_CONCEPTO ) );
		dto.setImporteGravado( rs.getDouble( COLUMN_IMPORTE_GRAVADO ) );
		if (rs.wasNull()) {
			dto.setImporteGravadoNull( true );
		}
		
		dto.setImporteExcepto( rs.getDouble( COLUMN_IMPORTE_EXCEPTO ) );
		if (rs.wasNull()) {
			dto.setImporteExceptoNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(NominaPercepcion dto)
	{
		dto.setIdNominaPercepcionModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdNominaTipoPercepcionModified( false );
		dto.setClaveModified( false );
		dto.setConceptoModified( false );
		dto.setImporteGravadoModified( false );
		dto.setImporteExceptoModified( false );
	}

	/** 
	 * Returns all rows from the nomina_percepcion table that match the specified arbitrary SQL statement
	 */
	public NominaPercepcion[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaPercepcionDaoException
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
			throw new NominaPercepcionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the nomina_percepcion table that match the specified arbitrary SQL statement
	 */
	public NominaPercepcion[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaPercepcionDaoException
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
			throw new NominaPercepcionDaoException( "Exception: " + _e.getMessage(), _e );
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