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

public class GastosEvcDaoImpl extends AbstractDAO implements GastosEvcDao
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
	protected final String SQL_SELECT = "SELECT ID_GASTOS, ID_CONCEPTO, ID_EMPLEADO, COMENTARIO, FECHA, MONTO, LATITUD, LONGITUD, ID_ESTATUS, REFERENCIA, ID_EMPRESA, VALIDACION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_GASTOS, ID_CONCEPTO, ID_EMPLEADO, COMENTARIO, FECHA, MONTO, LATITUD, LONGITUD, ID_ESTATUS, REFERENCIA, ID_EMPRESA, VALIDACION ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_GASTOS = ?, ID_CONCEPTO = ?, ID_EMPLEADO = ?, COMENTARIO = ?, FECHA = ?, MONTO = ?, LATITUD = ?, LONGITUD = ?, ID_ESTATUS = ?, REFERENCIA = ?, ID_EMPRESA = ?, VALIDACION = ? WHERE ID_GASTOS = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_GASTOS = ?";

	/** 
	 * Index of column ID_GASTOS
	 */
	protected static final int COLUMN_ID_GASTOS = 1;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 2;

	/** 
	 * Index of column ID_EMPLEADO
	 */
	protected static final int COLUMN_ID_EMPLEADO = 3;

	/** 
	 * Index of column COMENTARIO
	 */
	protected static final int COLUMN_COMENTARIO = 4;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 5;

	/** 
	 * Index of column MONTO
	 */
	protected static final int COLUMN_MONTO = 6;

	/** 
	 * Index of column LATITUD
	 */
	protected static final int COLUMN_LATITUD = 7;

	/** 
	 * Index of column LONGITUD
	 */
	protected static final int COLUMN_LONGITUD = 8;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 9;

	/** 
	 * Index of column REFERENCIA
	 */
	protected static final int COLUMN_REFERENCIA = 10;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 11;

	/** 
	 * Index of column VALIDACION
	 */
	protected static final int COLUMN_VALIDACION = 12;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 12;

	/** 
	 * Index of primary-key column ID_GASTOS
	 */
	protected static final int PK_COLUMN_ID_GASTOS = 1;

	/** 
	 * Inserts a new row in the gastos_evc table.
	 */
	public GastosEvcPk insert(GastosEvc dto) throws GastosEvcDaoException
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
			if (dto.isIdGastosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_GASTOS" );
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
		
			if (dto.isIdEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isComentarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COMENTARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMontoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MONTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLatitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LATITUD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLongitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LONGITUD" );
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
		
			if (dto.isReferenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "REFERENCIA" );
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
		
			if (dto.isValidacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "VALIDACION" );
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
			if (dto.isIdGastosModified()) {
				stmt.setInt( index++, dto.getIdGastos() );
			}
		
			if (dto.isIdConceptoModified()) {
				stmt.setInt( index++, dto.getIdConcepto() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isComentarioModified()) {
				stmt.setString( index++, dto.getComentario() );
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			if (dto.isMontoModified()) {
				if (dto.isMontoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMonto() );
				}
		
			}
		
			if (dto.isLatitudModified()) {
				if (dto.isLatitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLatitud() );
				}
		
			}
		
			if (dto.isLongitudModified()) {
				if (dto.isLongitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLongitud() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isValidacionModified()) {
				if (dto.isValidacionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getValidacion() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdGastos( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GastosEvcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the gastos_evc table.
	 */
	public void update(GastosEvcPk pk, GastosEvc dto) throws GastosEvcDaoException
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
			if (dto.isIdGastosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_GASTOS=?" );
				modified=true;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO=?" );
				modified=true;
			}
		
			if (dto.isComentarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMENTARIO=?" );
				modified=true;
			}
		
			if (dto.isFechaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA=?" );
				modified=true;
			}
		
			if (dto.isMontoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MONTO=?" );
				modified=true;
			}
		
			if (dto.isLatitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LATITUD=?" );
				modified=true;
			}
		
			if (dto.isLongitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LONGITUD=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isReferenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "REFERENCIA=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isValidacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "VALIDACION=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_GASTOS=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdGastosModified()) {
				stmt.setInt( index++, dto.getIdGastos() );
			}
		
			if (dto.isIdConceptoModified()) {
				stmt.setInt( index++, dto.getIdConcepto() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isComentarioModified()) {
				stmt.setString( index++, dto.getComentario() );
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			if (dto.isMontoModified()) {
				if (dto.isMontoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMonto() );
				}
		
			}
		
			if (dto.isLatitudModified()) {
				if (dto.isLatitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLatitud() );
				}
		
			}
		
			if (dto.isLongitudModified()) {
				if (dto.isLongitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLongitud() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isValidacionModified()) {
				if (dto.isValidacionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getValidacion() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdGastos() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GastosEvcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the gastos_evc table.
	 */
	public void delete(GastosEvcPk pk) throws GastosEvcDaoException
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
			stmt.setInt( 1, pk.getIdGastos() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GastosEvcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the gastos_evc table that matches the specified primary-key value.
	 */
	public GastosEvc findByPrimaryKey(GastosEvcPk pk) throws GastosEvcDaoException
	{
		return findByPrimaryKey( pk.getIdGastos() );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'ID_GASTOS = :idGastos'.
	 */
	public GastosEvc findByPrimaryKey(int idGastos) throws GastosEvcDaoException
	{
		GastosEvc ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_GASTOS = ?", new Object[] {  new Integer(idGastos) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria ''.
	 */
	public GastosEvc[] findAll() throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_GASTOS", null );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'ID_GASTOS = :idGastos'.
	 */
	public GastosEvc[] findWhereIdGastosEquals(int idGastos) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_GASTOS = ? ORDER BY ID_GASTOS", new Object[] {  new Integer(idGastos) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public GastosEvc[] findWhereIdConceptoEquals(int idConcepto) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public GastosEvc[] findWhereIdEmpleadoEquals(int idEmpleado) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO = ? ORDER BY ID_EMPLEADO", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'COMENTARIO = :comentario'.
	 */
	public GastosEvc[] findWhereComentarioEquals(String comentario) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIO = ? ORDER BY COMENTARIO", new Object[] { comentario } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'FECHA = :fecha'.
	 */
	public GastosEvc[] findWhereFechaEquals(Date fecha) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'MONTO = :monto'.
	 */
	public GastosEvc[] findWhereMontoEquals(double monto) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MONTO = ? ORDER BY MONTO", new Object[] {  new Double(monto) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'LATITUD = :latitud'.
	 */
	public GastosEvc[] findWhereLatitudEquals(double latitud) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LATITUD = ? ORDER BY LATITUD", new Object[] {  new Double(latitud) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'LONGITUD = :longitud'.
	 */
	public GastosEvc[] findWhereLongitudEquals(double longitud) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LONGITUD = ? ORDER BY LONGITUD", new Object[] {  new Double(longitud) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public GastosEvc[] findWhereIdEstatusEquals(int idEstatus) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'REFERENCIA = :referencia'.
	 */
	public GastosEvc[] findWhereReferenciaEquals(String referencia) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REFERENCIA = ? ORDER BY REFERENCIA", new Object[] { referencia } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public GastosEvc[] findWhereIdEmpresaEquals(int idEmpresa) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the criteria 'VALIDACION = :validacion'.
	 */
	public GastosEvc[] findWhereValidacionEquals(int validacion) throws GastosEvcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VALIDACION = ? ORDER BY VALIDACION", new Object[] {  new Integer(validacion) } );
	}

	/**
	 * Method 'GastosEvcDaoImpl'
	 * 
	 */
	public GastosEvcDaoImpl()
	{
	}

	/**
	 * Method 'GastosEvcDaoImpl'
	 * 
	 * @param userConn
	 */
	public GastosEvcDaoImpl(final java.sql.Connection userConn)
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
		return "gastos_evc";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected GastosEvc fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			GastosEvc dto = new GastosEvc();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected GastosEvc[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			GastosEvc dto = new GastosEvc();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		GastosEvc ret[] = new GastosEvc[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(GastosEvc dto, ResultSet rs) throws SQLException
	{
		dto.setIdGastos( rs.getInt( COLUMN_ID_GASTOS ) );
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoNull( true );
		}
		
		dto.setComentario( rs.getString( COLUMN_COMENTARIO ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setMonto( rs.getDouble( COLUMN_MONTO ) );
		if (rs.wasNull()) {
			dto.setMontoNull( true );
		}
		
		dto.setLatitud( rs.getDouble( COLUMN_LATITUD ) );
		if (rs.wasNull()) {
			dto.setLatitudNull( true );
		}
		
		dto.setLongitud( rs.getDouble( COLUMN_LONGITUD ) );
		if (rs.wasNull()) {
			dto.setLongitudNull( true );
		}
		
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setReferencia( rs.getString( COLUMN_REFERENCIA ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setValidacion( rs.getInt( COLUMN_VALIDACION ) );
		if (rs.wasNull()) {
			dto.setValidacionNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(GastosEvc dto)
	{
		dto.setIdGastosModified( false );
		dto.setIdConceptoModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setComentarioModified( false );
		dto.setFechaModified( false );
		dto.setMontoModified( false );
		dto.setLatitudModified( false );
		dto.setLongitudModified( false );
		dto.setIdEstatusModified( false );
		dto.setReferenciaModified( false );
		dto.setIdEmpresaModified( false );
		dto.setValidacionModified( false );
	}

	/** 
	 * Returns all rows from the gastos_evc table that match the specified arbitrary SQL statement
	 */
	public GastosEvc[] findByDynamicSelect(String sql, Object[] sqlParams) throws GastosEvcDaoException
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
			throw new GastosEvcDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the gastos_evc table that match the specified arbitrary SQL statement
	 */
	public GastosEvc[] findByDynamicWhere(String sql, Object[] sqlParams) throws GastosEvcDaoException
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
			throw new GastosEvcDaoException( "Exception: " + _e.getMessage(), _e );
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
