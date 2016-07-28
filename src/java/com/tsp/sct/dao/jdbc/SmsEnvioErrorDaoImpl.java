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

public class SmsEnvioErrorDaoImpl extends AbstractDAO implements SmsEnvioErrorDao
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
	protected final String SQL_SELECT = "SELECT id_sms_envio_error, id_sms_envio_detalle, desc_error, fecha_hr_error, id_sms_dispositivo, id_empresa, id_estatus FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_sms_envio_error, id_sms_envio_detalle, desc_error, fecha_hr_error, id_sms_dispositivo, id_empresa, id_estatus ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_sms_envio_error = ?, id_sms_envio_detalle = ?, desc_error = ?, fecha_hr_error = ?, id_sms_dispositivo = ?, id_empresa = ?, id_estatus = ? WHERE id_sms_envio_error = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_sms_envio_error = ?";

	/** 
	 * Index of column id_sms_envio_error
	 */
	protected static final int COLUMN_ID_SMS_ENVIO_ERROR = 1;

	/** 
	 * Index of column id_sms_envio_detalle
	 */
	protected static final int COLUMN_ID_SMS_ENVIO_DETALLE = 2;

	/** 
	 * Index of column desc_error
	 */
	protected static final int COLUMN_DESC_ERROR = 3;

	/** 
	 * Index of column fecha_hr_error
	 */
	protected static final int COLUMN_FECHA_HR_ERROR = 4;

	/** 
	 * Index of column id_sms_dispositivo
	 */
	protected static final int COLUMN_ID_SMS_DISPOSITIVO = 5;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 6;

	/** 
	 * Index of column id_estatus
	 */
	protected static final int COLUMN_ID_ESTATUS = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column id_sms_envio_error
	 */
	protected static final int PK_COLUMN_ID_SMS_ENVIO_ERROR = 1;

	/** 
	 * Inserts a new row in the sms_envio_error table.
	 */
	public SmsEnvioErrorPk insert(SmsEnvioError dto) throws SmsEnvioErrorDaoException
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
			if (dto.isIdSmsEnvioErrorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_sms_envio_error" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdSmsEnvioDetalleModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_sms_envio_detalle" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescErrorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "desc_error" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaHrErrorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha_hr_error" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdSmsDispositivoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_sms_dispositivo" );
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
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_estatus" );
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
			if (dto.isIdSmsEnvioErrorModified()) {
				stmt.setInt( index++, dto.getIdSmsEnvioError() );
			}
		
			if (dto.isIdSmsEnvioDetalleModified()) {
				stmt.setInt( index++, dto.getIdSmsEnvioDetalle() );
			}
		
			if (dto.isDescErrorModified()) {
				stmt.setString( index++, dto.getDescError() );
			}
		
			if (dto.isFechaHrErrorModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrError()==null ? null : new java.sql.Timestamp( dto.getFechaHrError().getTime() ) );
			}
		
			if (dto.isIdSmsDispositivoModified()) {
				if (dto.isIdSmsDispositivoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdSmsDispositivo() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
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
				dto.setIdSmsEnvioError( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SmsEnvioErrorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sms_envio_error table.
	 */
	public void update(SmsEnvioErrorPk pk, SmsEnvioError dto) throws SmsEnvioErrorDaoException
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
			if (dto.isIdSmsEnvioErrorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_sms_envio_error=?" );
				modified=true;
			}
		
			if (dto.isIdSmsEnvioDetalleModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_sms_envio_detalle=?" );
				modified=true;
			}
		
			if (dto.isDescErrorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "desc_error=?" );
				modified=true;
			}
		
			if (dto.isFechaHrErrorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha_hr_error=?" );
				modified=true;
			}
		
			if (dto.isIdSmsDispositivoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_sms_dispositivo=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_estatus=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_sms_envio_error=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdSmsEnvioErrorModified()) {
				stmt.setInt( index++, dto.getIdSmsEnvioError() );
			}
		
			if (dto.isIdSmsEnvioDetalleModified()) {
				stmt.setInt( index++, dto.getIdSmsEnvioDetalle() );
			}
		
			if (dto.isDescErrorModified()) {
				stmt.setString( index++, dto.getDescError() );
			}
		
			if (dto.isFechaHrErrorModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrError()==null ? null : new java.sql.Timestamp( dto.getFechaHrError().getTime() ) );
			}
		
			if (dto.isIdSmsDispositivoModified()) {
				if (dto.isIdSmsDispositivoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdSmsDispositivo() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			stmt.setInt( index++, pk.getIdSmsEnvioError() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SmsEnvioErrorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sms_envio_error table.
	 */
	public void delete(SmsEnvioErrorPk pk) throws SmsEnvioErrorDaoException
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
			stmt.setInt( 1, pk.getIdSmsEnvioError() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SmsEnvioErrorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sms_envio_error table that matches the specified primary-key value.
	 */
	public SmsEnvioError findByPrimaryKey(SmsEnvioErrorPk pk) throws SmsEnvioErrorDaoException
	{
		return findByPrimaryKey( pk.getIdSmsEnvioError() );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_envio_error = :idSmsEnvioError'.
	 */
	public SmsEnvioError findByPrimaryKey(int idSmsEnvioError) throws SmsEnvioErrorDaoException
	{
		SmsEnvioError ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_sms_envio_error = ?", new Object[] {  new Integer(idSmsEnvioError) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria ''.
	 */
	public SmsEnvioError[] findAll() throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_sms_envio_error", null );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_envio_error = :idSmsEnvioError'.
	 */
	public SmsEnvioError[] findWhereIdSmsEnvioErrorEquals(int idSmsEnvioError) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_sms_envio_error = ? ORDER BY id_sms_envio_error", new Object[] {  new Integer(idSmsEnvioError) } );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_envio_detalle = :idSmsEnvioDetalle'.
	 */
	public SmsEnvioError[] findWhereIdSmsEnvioDetalleEquals(int idSmsEnvioDetalle) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_sms_envio_detalle = ? ORDER BY id_sms_envio_detalle", new Object[] {  new Integer(idSmsEnvioDetalle) } );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'desc_error = :descError'.
	 */
	public SmsEnvioError[] findWhereDescErrorEquals(String descError) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE desc_error = ? ORDER BY desc_error", new Object[] { descError } );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'fecha_hr_error = :fechaHrError'.
	 */
	public SmsEnvioError[] findWhereFechaHrErrorEquals(Date fechaHrError) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha_hr_error = ? ORDER BY fecha_hr_error", new Object[] { fechaHrError==null ? null : new java.sql.Timestamp( fechaHrError.getTime() ) } );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_dispositivo = :idSmsDispositivo'.
	 */
	public SmsEnvioError[] findWhereIdSmsDispositivoEquals(int idSmsDispositivo) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_sms_dispositivo = ? ORDER BY id_sms_dispositivo", new Object[] {  new Integer(idSmsDispositivo) } );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public SmsEnvioError[] findWhereIdEmpresaEquals(int idEmpresa) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public SmsEnvioError[] findWhereIdEstatusEquals(int idEstatus) throws SmsEnvioErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_estatus = ? ORDER BY id_estatus", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'SmsEnvioErrorDaoImpl'
	 * 
	 */
	public SmsEnvioErrorDaoImpl()
	{
	}

	/**
	 * Method 'SmsEnvioErrorDaoImpl'
	 * 
	 * @param userConn
	 */
	public SmsEnvioErrorDaoImpl(final java.sql.Connection userConn)
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
		return "sms_envio_error";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SmsEnvioError fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SmsEnvioError dto = new SmsEnvioError();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SmsEnvioError[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SmsEnvioError dto = new SmsEnvioError();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SmsEnvioError ret[] = new SmsEnvioError[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SmsEnvioError dto, ResultSet rs) throws SQLException
	{
		dto.setIdSmsEnvioError( rs.getInt( COLUMN_ID_SMS_ENVIO_ERROR ) );
		dto.setIdSmsEnvioDetalle( rs.getInt( COLUMN_ID_SMS_ENVIO_DETALLE ) );
		dto.setDescError( rs.getString( COLUMN_DESC_ERROR ) );
		dto.setFechaHrError( rs.getTimestamp(COLUMN_FECHA_HR_ERROR ) );
		dto.setIdSmsDispositivo( rs.getInt( COLUMN_ID_SMS_DISPOSITIVO ) );
		if (rs.wasNull()) {
			dto.setIdSmsDispositivoNull( true );
		}
		
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SmsEnvioError dto)
	{
		dto.setIdSmsEnvioErrorModified( false );
		dto.setIdSmsEnvioDetalleModified( false );
		dto.setDescErrorModified( false );
		dto.setFechaHrErrorModified( false );
		dto.setIdSmsDispositivoModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the sms_envio_error table that match the specified arbitrary SQL statement
	 */
	public SmsEnvioError[] findByDynamicSelect(String sql, Object[] sqlParams) throws SmsEnvioErrorDaoException
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
			throw new SmsEnvioErrorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the sms_envio_error table that match the specified arbitrary SQL statement
	 */
	public SmsEnvioError[] findByDynamicWhere(String sql, Object[] sqlParams) throws SmsEnvioErrorDaoException
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
			throw new SmsEnvioErrorDaoException( "Exception: " + _e.getMessage(), _e );
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