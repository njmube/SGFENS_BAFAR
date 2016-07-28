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

public class UsuariosDaoImpl extends AbstractDAO implements UsuariosDao
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
	protected final String SQL_SELECT = "SELECT ID_USUARIOS, ID_EMPRESA, ID_DATOS_USUARIO, ID_ESTATUS, ID_ROLES, USER_NAME, FECHA_ALTA, FECHA_VIGENCIA, FECHA_ULTIMO_ACCESO, INTENTOS, CONTRATO, FECHA_CONTRATO, LOGIN FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_USUARIOS, ID_EMPRESA, ID_DATOS_USUARIO, ID_ESTATUS, ID_ROLES, USER_NAME, FECHA_ALTA, FECHA_VIGENCIA, FECHA_ULTIMO_ACCESO, INTENTOS, CONTRATO, FECHA_CONTRATO, LOGIN ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_USUARIOS = ?, ID_EMPRESA = ?, ID_DATOS_USUARIO = ?, ID_ESTATUS = ?, ID_ROLES = ?, USER_NAME = ?, FECHA_ALTA = ?, FECHA_VIGENCIA = ?, FECHA_ULTIMO_ACCESO = ?, INTENTOS = ?, CONTRATO = ?, FECHA_CONTRATO = ?, LOGIN = ? WHERE ID_USUARIOS = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_USUARIOS = ?";

	/** 
	 * Index of column ID_USUARIOS
	 */
	protected static final int COLUMN_ID_USUARIOS = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_DATOS_USUARIO
	 */
	protected static final int COLUMN_ID_DATOS_USUARIO = 3;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 4;

	/** 
	 * Index of column ID_ROLES
	 */
	protected static final int COLUMN_ID_ROLES = 5;

	/** 
	 * Index of column USER_NAME
	 */
	protected static final int COLUMN_USER_NAME = 6;

	/** 
	 * Index of column FECHA_ALTA
	 */
	protected static final int COLUMN_FECHA_ALTA = 7;

	/** 
	 * Index of column FECHA_VIGENCIA
	 */
	protected static final int COLUMN_FECHA_VIGENCIA = 8;

	/** 
	 * Index of column FECHA_ULTIMO_ACCESO
	 */
	protected static final int COLUMN_FECHA_ULTIMO_ACCESO = 9;

	/** 
	 * Index of column INTENTOS
	 */
	protected static final int COLUMN_INTENTOS = 10;

	/** 
	 * Index of column CONTRATO
	 */
	protected static final int COLUMN_CONTRATO = 11;

	/** 
	 * Index of column FECHA_CONTRATO
	 */
	protected static final int COLUMN_FECHA_CONTRATO = 12;

	/** 
	 * Index of column LOGIN
	 */
	protected static final int COLUMN_LOGIN = 13;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 13;

	/** 
	 * Index of primary-key column ID_USUARIOS
	 */
	protected static final int PK_COLUMN_ID_USUARIOS = 1;

	/** 
	 * Inserts a new row in the usuarios table.
	 */
	public UsuariosPk insert(Usuarios dto) throws UsuariosDaoException
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
			if (dto.isIdUsuariosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIOS" );
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
		
			if (dto.isIdDatosUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_DATOS_USUARIO" );
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
		
			if (dto.isIdRolesModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ROLES" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUserNameModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "USER_NAME" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaAltaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_ALTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaVigenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_VIGENCIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaUltimoAccesoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_ULTIMO_ACCESO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIntentosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "INTENTOS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isContratoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONTRATO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaContratoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_CONTRATO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLoginModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LOGIN" );
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
			if (dto.isIdUsuariosModified()) {
				stmt.setInt( index++, dto.getIdUsuarios() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdDatosUsuarioModified()) {
				stmt.setInt( index++, dto.getIdDatosUsuario() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIdRolesModified()) {
				stmt.setInt( index++, dto.getIdRoles() );
			}
		
			if (dto.isUserNameModified()) {
				stmt.setString( index++, dto.getUserName() );
			}
		
			if (dto.isFechaAltaModified()) {
				stmt.setDate(index++, dto.getFechaAlta()==null ? null : new java.sql.Date( dto.getFechaAlta().getTime() ) );
			}
		
			if (dto.isFechaVigenciaModified()) {
				stmt.setDate(index++, dto.getFechaVigencia()==null ? null : new java.sql.Date( dto.getFechaVigencia().getTime() ) );
			}
		
			if (dto.isFechaUltimoAccesoModified()) {
				stmt.setTimestamp(index++, dto.getFechaUltimoAcceso()==null ? null : new java.sql.Timestamp( dto.getFechaUltimoAcceso().getTime() ) );
			}
		
			if (dto.isIntentosModified()) {
				if (dto.isIntentosNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIntentos() );
				}
		
			}
		
			if (dto.isContratoModified()) {
				if (dto.isContratoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getContrato() );
				}
		
			}
		
			if (dto.isFechaContratoModified()) {
				stmt.setDate(index++, dto.getFechaContrato()==null ? null : new java.sql.Date( dto.getFechaContrato().getTime() ) );
			}
		
			if (dto.isLoginModified()) {
				if (dto.isLoginNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setShort( index++, dto.getLogin() );
				}
		
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
			throw new UsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the usuarios table.
	 */
	public void update(UsuariosPk pk, Usuarios dto) throws UsuariosDaoException
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
			if (dto.isIdUsuariosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIOS=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdDatosUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_DATOS_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdRolesModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ROLES=?" );
				modified=true;
			}
		
			if (dto.isUserNameModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "USER_NAME=?" );
				modified=true;
			}
		
			if (dto.isFechaAltaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_ALTA=?" );
				modified=true;
			}
		
			if (dto.isFechaVigenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_VIGENCIA=?" );
				modified=true;
			}
		
			if (dto.isFechaUltimoAccesoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_ULTIMO_ACCESO=?" );
				modified=true;
			}
		
			if (dto.isIntentosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "INTENTOS=?" );
				modified=true;
			}
		
			if (dto.isContratoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONTRATO=?" );
				modified=true;
			}
		
			if (dto.isFechaContratoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_CONTRATO=?" );
				modified=true;
			}
		
			if (dto.isLoginModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LOGIN=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_USUARIOS=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdUsuariosModified()) {
				stmt.setInt( index++, dto.getIdUsuarios() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdDatosUsuarioModified()) {
				stmt.setInt( index++, dto.getIdDatosUsuario() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIdRolesModified()) {
				stmt.setInt( index++, dto.getIdRoles() );
			}
		
			if (dto.isUserNameModified()) {
				stmt.setString( index++, dto.getUserName() );
			}
		
			if (dto.isFechaAltaModified()) {
				stmt.setDate(index++, dto.getFechaAlta()==null ? null : new java.sql.Date( dto.getFechaAlta().getTime() ) );
			}
		
			if (dto.isFechaVigenciaModified()) {
				stmt.setDate(index++, dto.getFechaVigencia()==null ? null : new java.sql.Date( dto.getFechaVigencia().getTime() ) );
			}
		
			if (dto.isFechaUltimoAccesoModified()) {
				stmt.setTimestamp(index++, dto.getFechaUltimoAcceso()==null ? null : new java.sql.Timestamp( dto.getFechaUltimoAcceso().getTime() ) );
			}
		
			if (dto.isIntentosModified()) {
				if (dto.isIntentosNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIntentos() );
				}
		
			}
		
			if (dto.isContratoModified()) {
				if (dto.isContratoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getContrato() );
				}
		
			}
		
			if (dto.isFechaContratoModified()) {
				stmt.setDate(index++, dto.getFechaContrato()==null ? null : new java.sql.Date( dto.getFechaContrato().getTime() ) );
			}
		
			if (dto.isLoginModified()) {
				if (dto.isLoginNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setShort( index++, dto.getLogin() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdUsuarios() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the usuarios table.
	 */
	public void delete(UsuariosPk pk) throws UsuariosDaoException
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
			stmt.setInt( 1, pk.getIdUsuarios() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the usuarios table that matches the specified primary-key value.
	 */
	public Usuarios findByPrimaryKey(UsuariosPk pk) throws UsuariosDaoException
	{
		return findByPrimaryKey( pk.getIdUsuarios() );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'ID_USUARIOS = :idUsuarios'.
	 */
	public Usuarios findByPrimaryKey(int idUsuarios) throws UsuariosDaoException
	{
		Usuarios ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIOS = ?", new Object[] {  new Integer(idUsuarios) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria ''.
	 */
	public Usuarios[] findAll() throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_USUARIOS", null );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'ID_USUARIOS = :idUsuarios'.
	 */
	public Usuarios[] findWhereIdUsuariosEquals(int idUsuarios) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIOS = ? ORDER BY ID_USUARIOS", new Object[] {  new Integer(idUsuarios) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Usuarios[] findWhereIdEmpresaEquals(int idEmpresa) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'ID_DATOS_USUARIO = :idDatosUsuario'.
	 */
	public Usuarios[] findWhereIdDatosUsuarioEquals(int idDatosUsuario) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DATOS_USUARIO = ? ORDER BY ID_DATOS_USUARIO", new Object[] {  new Integer(idDatosUsuario) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Usuarios[] findWhereIdEstatusEquals(int idEstatus) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'ID_ROLES = :idRoles'.
	 */
	public Usuarios[] findWhereIdRolesEquals(int idRoles) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ROLES = ? ORDER BY ID_ROLES", new Object[] {  new Integer(idRoles) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'USER_NAME = :userName'.
	 */
	public Usuarios[] findWhereUserNameEquals(String userName) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE USER_NAME = ? ORDER BY USER_NAME", new Object[] { userName } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'FECHA_ALTA = :fechaAlta'.
	 */
	public Usuarios[] findWhereFechaAltaEquals(Date fechaAlta) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ALTA = ? ORDER BY FECHA_ALTA", new Object[] { fechaAlta==null ? null : new java.sql.Date( fechaAlta.getTime() ) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'FECHA_VIGENCIA = :fechaVigencia'.
	 */
	public Usuarios[] findWhereFechaVigenciaEquals(Date fechaVigencia) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_VIGENCIA = ? ORDER BY FECHA_VIGENCIA", new Object[] { fechaVigencia==null ? null : new java.sql.Date( fechaVigencia.getTime() ) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'FECHA_ULTIMO_ACCESO = :fechaUltimoAcceso'.
	 */
	public Usuarios[] findWhereFechaUltimoAccesoEquals(Date fechaUltimoAcceso) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ULTIMO_ACCESO = ? ORDER BY FECHA_ULTIMO_ACCESO", new Object[] { fechaUltimoAcceso==null ? null : new java.sql.Timestamp( fechaUltimoAcceso.getTime() ) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'INTENTOS = :intentos'.
	 */
	public Usuarios[] findWhereIntentosEquals(int intentos) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE INTENTOS = ? ORDER BY INTENTOS", new Object[] {  new Integer(intentos) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'CONTRATO = :contrato'.
	 */
	public Usuarios[] findWhereContratoEquals(int contrato) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONTRATO = ? ORDER BY CONTRATO", new Object[] {  new Integer(contrato) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'FECHA_CONTRATO = :fechaContrato'.
	 */
	public Usuarios[] findWhereFechaContratoEquals(Date fechaContrato) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_CONTRATO = ? ORDER BY FECHA_CONTRATO", new Object[] { fechaContrato==null ? null : new java.sql.Date( fechaContrato.getTime() ) } );
	}

	/** 
	 * Returns all rows from the usuarios table that match the criteria 'LOGIN = :login'.
	 */
	public Usuarios[] findWhereLoginEquals(short login) throws UsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LOGIN = ? ORDER BY LOGIN", new Object[] {  new Short(login) } );
	}

	/**
	 * Method 'UsuariosDaoImpl'
	 * 
	 */
	public UsuariosDaoImpl()
	{
	}

	/**
	 * Method 'UsuariosDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsuariosDaoImpl(final java.sql.Connection userConn)
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
		return "usuarios";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Usuarios fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Usuarios dto = new Usuarios();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Usuarios[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Usuarios dto = new Usuarios();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Usuarios ret[] = new Usuarios[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Usuarios dto, ResultSet rs) throws SQLException
	{
		dto.setIdUsuarios( rs.getInt( COLUMN_ID_USUARIOS ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdDatosUsuario( rs.getInt( COLUMN_ID_DATOS_USUARIO ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setIdRoles( rs.getInt( COLUMN_ID_ROLES ) );
		dto.setUserName( rs.getString( COLUMN_USER_NAME ) );
		dto.setFechaAlta( rs.getDate(COLUMN_FECHA_ALTA ) );
		dto.setFechaVigencia( rs.getDate(COLUMN_FECHA_VIGENCIA ) );
		dto.setFechaUltimoAcceso( rs.getTimestamp(COLUMN_FECHA_ULTIMO_ACCESO ) );
		dto.setIntentos( rs.getInt( COLUMN_INTENTOS ) );
		if (rs.wasNull()) {
			dto.setIntentosNull( true );
		}
		
		dto.setContrato( rs.getInt( COLUMN_CONTRATO ) );
		if (rs.wasNull()) {
			dto.setContratoNull( true );
		}
		
		dto.setFechaContrato( rs.getDate(COLUMN_FECHA_CONTRATO ) );
		dto.setLogin( rs.getShort( COLUMN_LOGIN ) );
		if (rs.wasNull()) {
			dto.setLoginNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Usuarios dto)
	{
		dto.setIdUsuariosModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdDatosUsuarioModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdRolesModified( false );
		dto.setUserNameModified( false );
		dto.setFechaAltaModified( false );
		dto.setFechaVigenciaModified( false );
		dto.setFechaUltimoAccesoModified( false );
		dto.setIntentosModified( false );
		dto.setContratoModified( false );
		dto.setFechaContratoModified( false );
		dto.setLoginModified( false );
	}

	/** 
	 * Returns all rows from the usuarios table that match the specified arbitrary SQL statement
	 */
	public Usuarios[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsuariosDaoException
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
			throw new UsuariosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the usuarios table that match the specified arbitrary SQL statement
	 */
	public Usuarios[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsuariosDaoException
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
			throw new UsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
        
        protected final String SQL_SELECT_MAX = "SELECT ID_USUARIOS, ID_EMPRESA, ID_DATOS_USUARIO, ID_ESTATUS, ID_ROLES, USER_NAME, FECHA_ALTA, FECHA_VIGENCIA, FECHA_ULTIMO_ACCESO, INTENTOS, CONTRATO, FECHA_CONTRATO, LOGIN FROM " + getTableName() + " ORDER BY ID_USUARIOS DESC LIMIT 1 ";
        
        public Usuarios findLast() throws UsuariosDaoException
	{
		Usuarios ret[] = findByDynamicSelect( SQL_SELECT_MAX , new Object[0] );
		return ret.length==0 ? null : ret[0];
	}

}
