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

public class UsuariosdemoDaoImpl extends AbstractDAO implements UsuariosdemoDao
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
	protected final String SQL_SELECT = "SELECT ID_USUARIO_DEMO, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, NOMBRE_EMPRESA, EMAIL, TELEFONO, IMEI, MARCA_CELULAR, MODELO_CELULAR, FECHA_REGISTRO, ID_ESTATUS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_USUARIO_DEMO, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, NOMBRE_EMPRESA, EMAIL, TELEFONO, IMEI, MARCA_CELULAR, MODELO_CELULAR, FECHA_REGISTRO, ID_ESTATUS ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_USUARIO_DEMO = ?, NOMBRE = ?, APELLIDO_PATERNO = ?, APELLIDO_MATERNO = ?, NOMBRE_EMPRESA = ?, EMAIL = ?, TELEFONO = ?, IMEI = ?, MARCA_CELULAR = ?, MODELO_CELULAR = ?, FECHA_REGISTRO = ?, ID_ESTATUS = ? WHERE ID_USUARIO_DEMO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_USUARIO_DEMO = ?";

	/** 
	 * Index of column ID_USUARIO_DEMO
	 */
	protected static final int COLUMN_ID_USUARIO_DEMO = 1;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column APELLIDO_PATERNO
	 */
	protected static final int COLUMN_APELLIDO_PATERNO = 3;

	/** 
	 * Index of column APELLIDO_MATERNO
	 */
	protected static final int COLUMN_APELLIDO_MATERNO = 4;

	/** 
	 * Index of column NOMBRE_EMPRESA
	 */
	protected static final int COLUMN_NOMBRE_EMPRESA = 5;

	/** 
	 * Index of column EMAIL
	 */
	protected static final int COLUMN_EMAIL = 6;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 7;

	/** 
	 * Index of column IMEI
	 */
	protected static final int COLUMN_IMEI = 8;

	/** 
	 * Index of column MARCA_CELULAR
	 */
	protected static final int COLUMN_MARCA_CELULAR = 9;

	/** 
	 * Index of column MODELO_CELULAR
	 */
	protected static final int COLUMN_MODELO_CELULAR = 10;

	/** 
	 * Index of column FECHA_REGISTRO
	 */
	protected static final int COLUMN_FECHA_REGISTRO = 11;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 12;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 12;

	/** 
	 * Index of primary-key column ID_USUARIO_DEMO
	 */
	protected static final int PK_COLUMN_ID_USUARIO_DEMO = 1;

	/** 
	 * Inserts a new row in the usuariosdemo table.
	 */
	public UsuariosdemoPk insert(Usuariosdemo dto) throws UsuariosdemoDaoException
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
			if (dto.isIdUsuarioDemoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_DEMO" );
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
		
			if (dto.isApellidoPaternoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APELLIDO_PATERNO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isApellidoMaternoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APELLIDO_MATERNO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEmailModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EMAIL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTelefonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TELEFONO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImeiModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMEI" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMarcaCelularModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MARCA_CELULAR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isModeloCelularModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MODELO_CELULAR" );
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
			if (dto.isIdUsuarioDemoModified()) {
				stmt.setInt( index++, dto.getIdUsuarioDemo() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isApellidoPaternoModified()) {
				stmt.setString( index++, dto.getApellidoPaterno() );
			}
		
			if (dto.isApellidoMaternoModified()) {
				stmt.setString( index++, dto.getApellidoMaterno() );
			}
		
			if (dto.isNombreEmpresaModified()) {
				stmt.setString( index++, dto.getNombreEmpresa() );
			}
		
			if (dto.isEmailModified()) {
				stmt.setString( index++, dto.getEmail() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isImeiModified()) {
				stmt.setString( index++, dto.getImei() );
			}
		
			if (dto.isMarcaCelularModified()) {
				stmt.setString( index++, dto.getMarcaCelular() );
			}
		
			if (dto.isModeloCelularModified()) {
				stmt.setString( index++, dto.getModeloCelular() );
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdUsuarioDemo( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuariosdemoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the usuariosdemo table.
	 */
	public void update(UsuariosdemoPk pk, Usuariosdemo dto) throws UsuariosdemoDaoException
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
			if (dto.isIdUsuarioDemoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_DEMO=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isApellidoPaternoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APELLIDO_PATERNO=?" );
				modified=true;
			}
		
			if (dto.isApellidoMaternoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APELLIDO_MATERNO=?" );
				modified=true;
			}
		
			if (dto.isNombreEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isEmailModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EMAIL=?" );
				modified=true;
			}
		
			if (dto.isTelefonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TELEFONO=?" );
				modified=true;
			}
		
			if (dto.isImeiModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMEI=?" );
				modified=true;
			}
		
			if (dto.isMarcaCelularModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MARCA_CELULAR=?" );
				modified=true;
			}
		
			if (dto.isModeloCelularModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MODELO_CELULAR=?" );
				modified=true;
			}
		
			if (dto.isFechaRegistroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_REGISTRO=?" );
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
		
			sql.append( " WHERE ID_USUARIO_DEMO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdUsuarioDemoModified()) {
				stmt.setInt( index++, dto.getIdUsuarioDemo() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isApellidoPaternoModified()) {
				stmt.setString( index++, dto.getApellidoPaterno() );
			}
		
			if (dto.isApellidoMaternoModified()) {
				stmt.setString( index++, dto.getApellidoMaterno() );
			}
		
			if (dto.isNombreEmpresaModified()) {
				stmt.setString( index++, dto.getNombreEmpresa() );
			}
		
			if (dto.isEmailModified()) {
				stmt.setString( index++, dto.getEmail() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isImeiModified()) {
				stmt.setString( index++, dto.getImei() );
			}
		
			if (dto.isMarcaCelularModified()) {
				stmt.setString( index++, dto.getMarcaCelular() );
			}
		
			if (dto.isModeloCelularModified()) {
				stmt.setString( index++, dto.getModeloCelular() );
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdUsuarioDemo() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuariosdemoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the usuariosdemo table.
	 */
	public void delete(UsuariosdemoPk pk) throws UsuariosdemoDaoException
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
			stmt.setInt( 1, pk.getIdUsuarioDemo() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuariosdemoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the usuariosdemo table that matches the specified primary-key value.
	 */
	public Usuariosdemo findByPrimaryKey(UsuariosdemoPk pk) throws UsuariosdemoDaoException
	{
		return findByPrimaryKey( pk.getIdUsuarioDemo() );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'ID_USUARIO_DEMO = :idUsuarioDemo'.
	 */
	public Usuariosdemo findByPrimaryKey(int idUsuarioDemo) throws UsuariosdemoDaoException
	{
		Usuariosdemo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_DEMO = ?", new Object[] {  new Integer(idUsuarioDemo) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria ''.
	 */
	public Usuariosdemo[] findAll() throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_USUARIO_DEMO", null );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'ID_USUARIO_DEMO = :idUsuarioDemo'.
	 */
	public Usuariosdemo[] findWhereIdUsuarioDemoEquals(int idUsuarioDemo) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_DEMO = ? ORDER BY ID_USUARIO_DEMO", new Object[] {  new Integer(idUsuarioDemo) } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Usuariosdemo[] findWhereNombreEquals(String nombre) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'APELLIDO_PATERNO = :apellidoPaterno'.
	 */
	public Usuariosdemo[] findWhereApellidoPaternoEquals(String apellidoPaterno) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APELLIDO_PATERNO = ? ORDER BY APELLIDO_PATERNO", new Object[] { apellidoPaterno } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'APELLIDO_MATERNO = :apellidoMaterno'.
	 */
	public Usuariosdemo[] findWhereApellidoMaternoEquals(String apellidoMaterno) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APELLIDO_MATERNO = ? ORDER BY APELLIDO_MATERNO", new Object[] { apellidoMaterno } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'NOMBRE_EMPRESA = :nombreEmpresa'.
	 */
	public Usuariosdemo[] findWhereNombreEmpresaEquals(String nombreEmpresa) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_EMPRESA = ? ORDER BY NOMBRE_EMPRESA", new Object[] { nombreEmpresa } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'EMAIL = :email'.
	 */
	public Usuariosdemo[] findWhereEmailEquals(String email) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMAIL = ? ORDER BY EMAIL", new Object[] { email } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Usuariosdemo[] findWhereTelefonoEquals(String telefono) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'IMEI = :imei'.
	 */
	public Usuariosdemo[] findWhereImeiEquals(String imei) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMEI = ? ORDER BY IMEI", new Object[] { imei } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'MARCA_CELULAR = :marcaCelular'.
	 */
	public Usuariosdemo[] findWhereMarcaCelularEquals(String marcaCelular) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MARCA_CELULAR = ? ORDER BY MARCA_CELULAR", new Object[] { marcaCelular } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'MODELO_CELULAR = :modeloCelular'.
	 */
	public Usuariosdemo[] findWhereModeloCelularEquals(String modeloCelular) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MODELO_CELULAR = ? ORDER BY MODELO_CELULAR", new Object[] { modeloCelular } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public Usuariosdemo[] findWhereFechaRegistroEquals(Date fechaRegistro) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_REGISTRO = ? ORDER BY FECHA_REGISTRO", new Object[] { fechaRegistro==null ? null : new java.sql.Timestamp( fechaRegistro.getTime() ) } );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Usuariosdemo[] findWhereIdEstatusEquals(int idEstatus) throws UsuariosdemoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'UsuariosdemoDaoImpl'
	 * 
	 */
	public UsuariosdemoDaoImpl()
	{
	}

	/**
	 * Method 'UsuariosdemoDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsuariosdemoDaoImpl(final java.sql.Connection userConn)
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
		return "usuariosdemo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Usuariosdemo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Usuariosdemo dto = new Usuariosdemo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Usuariosdemo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Usuariosdemo dto = new Usuariosdemo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Usuariosdemo ret[] = new Usuariosdemo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Usuariosdemo dto, ResultSet rs) throws SQLException
	{
		dto.setIdUsuarioDemo( rs.getInt( COLUMN_ID_USUARIO_DEMO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setApellidoPaterno( rs.getString( COLUMN_APELLIDO_PATERNO ) );
		dto.setApellidoMaterno( rs.getString( COLUMN_APELLIDO_MATERNO ) );
		dto.setNombreEmpresa( rs.getString( COLUMN_NOMBRE_EMPRESA ) );
		dto.setEmail( rs.getString( COLUMN_EMAIL ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setImei( rs.getString( COLUMN_IMEI ) );
		dto.setMarcaCelular( rs.getString( COLUMN_MARCA_CELULAR ) );
		dto.setModeloCelular( rs.getString( COLUMN_MODELO_CELULAR ) );
		dto.setFechaRegistro( rs.getTimestamp(COLUMN_FECHA_REGISTRO ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Usuariosdemo dto)
	{
		dto.setIdUsuarioDemoModified( false );
		dto.setNombreModified( false );
		dto.setApellidoPaternoModified( false );
		dto.setApellidoMaternoModified( false );
		dto.setNombreEmpresaModified( false );
		dto.setEmailModified( false );
		dto.setTelefonoModified( false );
		dto.setImeiModified( false );
		dto.setMarcaCelularModified( false );
		dto.setModeloCelularModified( false );
		dto.setFechaRegistroModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the usuariosdemo table that match the specified arbitrary SQL statement
	 */
	public Usuariosdemo[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsuariosdemoDaoException
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
			throw new UsuariosdemoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the usuariosdemo table that match the specified arbitrary SQL statement
	 */
	public Usuariosdemo[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsuariosdemoDaoException
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
			throw new UsuariosdemoDaoException( "Exception: " + _e.getMessage(), _e );
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
