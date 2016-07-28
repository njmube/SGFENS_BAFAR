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

public class CrFormularioCampoDaoImpl extends AbstractDAO implements CrFormularioCampoDao
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
	protected final String SQL_SELECT = "SELECT id_formulario_campo, id_formulario, id_tipo_campo, orden_formulario, no_seccion, etiqueta, descripcion, valor_defecto, valor_sugerencia, opciones, is_requerido, id_formulario_validacion, variable_formula, id_estatus, id_empresa FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_formulario_campo, id_formulario, id_tipo_campo, orden_formulario, no_seccion, etiqueta, descripcion, valor_defecto, valor_sugerencia, opciones, is_requerido, id_formulario_validacion, variable_formula, id_estatus, id_empresa ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_formulario_campo = ?, id_formulario = ?, id_tipo_campo = ?, orden_formulario = ?, no_seccion = ?, etiqueta = ?, descripcion = ?, valor_defecto = ?, valor_sugerencia = ?, opciones = ?, is_requerido = ?, id_formulario_validacion = ?, variable_formula = ?, id_estatus = ?, id_empresa = ? WHERE id_formulario_campo = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_formulario_campo = ?";

	/** 
	 * Index of column id_formulario_campo
	 */
	protected static final int COLUMN_ID_FORMULARIO_CAMPO = 1;

	/** 
	 * Index of column id_formulario
	 */
	protected static final int COLUMN_ID_FORMULARIO = 2;

	/** 
	 * Index of column id_tipo_campo
	 */
	protected static final int COLUMN_ID_TIPO_CAMPO = 3;

	/** 
	 * Index of column orden_formulario
	 */
	protected static final int COLUMN_ORDEN_FORMULARIO = 4;

	/** 
	 * Index of column no_seccion
	 */
	protected static final int COLUMN_NO_SECCION = 5;

	/** 
	 * Index of column etiqueta
	 */
	protected static final int COLUMN_ETIQUETA = 6;

	/** 
	 * Index of column descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 7;

	/** 
	 * Index of column valor_defecto
	 */
	protected static final int COLUMN_VALOR_DEFECTO = 8;

	/** 
	 * Index of column valor_sugerencia
	 */
	protected static final int COLUMN_VALOR_SUGERENCIA = 9;

	/** 
	 * Index of column opciones
	 */
	protected static final int COLUMN_OPCIONES = 10;

	/** 
	 * Index of column is_requerido
	 */
	protected static final int COLUMN_IS_REQUERIDO = 11;

	/** 
	 * Index of column id_formulario_validacion
	 */
	protected static final int COLUMN_ID_FORMULARIO_VALIDACION = 12;

	/** 
	 * Index of column variable_formula
	 */
	protected static final int COLUMN_VARIABLE_FORMULA = 13;

	/** 
	 * Index of column id_estatus
	 */
	protected static final int COLUMN_ID_ESTATUS = 14;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 15;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 15;

	/** 
	 * Index of primary-key column id_formulario_campo
	 */
	protected static final int PK_COLUMN_ID_FORMULARIO_CAMPO = 1;

	/** 
	 * Inserts a new row in the cr_formulario_campo table.
	 */
	public CrFormularioCampoPk insert(CrFormularioCampo dto) throws CrFormularioCampoDaoException
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
			if (dto.isIdFormularioCampoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_formulario_campo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdFormularioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_formulario" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdTipoCampoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_tipo_campo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isOrdenFormularioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "orden_formulario" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNoSeccionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "no_seccion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEtiquetaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "etiqueta" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "descripcion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isValorDefectoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "valor_defecto" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isValorSugerenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "valor_sugerencia" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isOpcionesModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "opciones" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIsRequeridoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "is_requerido" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdFormularioValidacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_formulario_validacion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isVariableFormulaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "variable_formula" );
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
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_empresa" );
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
			if (dto.isIdFormularioCampoModified()) {
				stmt.setInt( index++, dto.getIdFormularioCampo() );
			}
		
			if (dto.isIdFormularioModified()) {
				stmt.setInt( index++, dto.getIdFormulario() );
			}
		
			if (dto.isIdTipoCampoModified()) {
				stmt.setInt( index++, dto.getIdTipoCampo() );
			}
		
			if (dto.isOrdenFormularioModified()) {
				if (dto.isOrdenFormularioNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getOrdenFormulario() );
				}
		
			}
		
			if (dto.isNoSeccionModified()) {
				stmt.setInt( index++, dto.getNoSeccion() );
			}
		
			if (dto.isEtiquetaModified()) {
				stmt.setString( index++, dto.getEtiqueta() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isValorDefectoModified()) {
				stmt.setString( index++, dto.getValorDefecto() );
			}
		
			if (dto.isValorSugerenciaModified()) {
				stmt.setString( index++, dto.getValorSugerencia() );
			}
		
			if (dto.isOpcionesModified()) {
				stmt.setString( index++, dto.getOpciones() );
			}
		
			if (dto.isIsRequeridoModified()) {
				stmt.setInt( index++, dto.getIsRequerido() );
			}
		
			if (dto.isIdFormularioValidacionModified()) {
				if (dto.isIdFormularioValidacionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdFormularioValidacion() );
				}
		
			}
		
			if (dto.isVariableFormulaModified()) {
				stmt.setString( index++, dto.getVariableFormula() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdFormularioCampo( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrFormularioCampoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cr_formulario_campo table.
	 */
	public void update(CrFormularioCampoPk pk, CrFormularioCampo dto) throws CrFormularioCampoDaoException
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
			if (dto.isIdFormularioCampoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_formulario_campo=?" );
				modified=true;
			}
		
			if (dto.isIdFormularioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_formulario=?" );
				modified=true;
			}
		
			if (dto.isIdTipoCampoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_tipo_campo=?" );
				modified=true;
			}
		
			if (dto.isOrdenFormularioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "orden_formulario=?" );
				modified=true;
			}
		
			if (dto.isNoSeccionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "no_seccion=?" );
				modified=true;
			}
		
			if (dto.isEtiquetaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "etiqueta=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descripcion=?" );
				modified=true;
			}
		
			if (dto.isValorDefectoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "valor_defecto=?" );
				modified=true;
			}
		
			if (dto.isValorSugerenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "valor_sugerencia=?" );
				modified=true;
			}
		
			if (dto.isOpcionesModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "opciones=?" );
				modified=true;
			}
		
			if (dto.isIsRequeridoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "is_requerido=?" );
				modified=true;
			}
		
			if (dto.isIdFormularioValidacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_formulario_validacion=?" );
				modified=true;
			}
		
			if (dto.isVariableFormulaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "variable_formula=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_estatus=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_formulario_campo=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdFormularioCampoModified()) {
				stmt.setInt( index++, dto.getIdFormularioCampo() );
			}
		
			if (dto.isIdFormularioModified()) {
				stmt.setInt( index++, dto.getIdFormulario() );
			}
		
			if (dto.isIdTipoCampoModified()) {
				stmt.setInt( index++, dto.getIdTipoCampo() );
			}
		
			if (dto.isOrdenFormularioModified()) {
				if (dto.isOrdenFormularioNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getOrdenFormulario() );
				}
		
			}
		
			if (dto.isNoSeccionModified()) {
				stmt.setInt( index++, dto.getNoSeccion() );
			}
		
			if (dto.isEtiquetaModified()) {
				stmt.setString( index++, dto.getEtiqueta() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isValorDefectoModified()) {
				stmt.setString( index++, dto.getValorDefecto() );
			}
		
			if (dto.isValorSugerenciaModified()) {
				stmt.setString( index++, dto.getValorSugerencia() );
			}
		
			if (dto.isOpcionesModified()) {
				stmt.setString( index++, dto.getOpciones() );
			}
		
			if (dto.isIsRequeridoModified()) {
				stmt.setInt( index++, dto.getIsRequerido() );
			}
		
			if (dto.isIdFormularioValidacionModified()) {
				if (dto.isIdFormularioValidacionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdFormularioValidacion() );
				}
		
			}
		
			if (dto.isVariableFormulaModified()) {
				stmt.setString( index++, dto.getVariableFormula() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			stmt.setInt( index++, pk.getIdFormularioCampo() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrFormularioCampoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cr_formulario_campo table.
	 */
	public void delete(CrFormularioCampoPk pk) throws CrFormularioCampoDaoException
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
			stmt.setInt( 1, pk.getIdFormularioCampo() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrFormularioCampoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cr_formulario_campo table that matches the specified primary-key value.
	 */
	public CrFormularioCampo findByPrimaryKey(CrFormularioCampoPk pk) throws CrFormularioCampoDaoException
	{
		return findByPrimaryKey( pk.getIdFormularioCampo() );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_formulario_campo = :idFormularioCampo'.
	 */
	public CrFormularioCampo findByPrimaryKey(int idFormularioCampo) throws CrFormularioCampoDaoException
	{
		CrFormularioCampo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_formulario_campo = ?", new Object[] {  new Integer(idFormularioCampo) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria ''.
	 */
	public CrFormularioCampo[] findAll() throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_formulario_campo", null );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_formulario_campo = :idFormularioCampo'.
	 */
	public CrFormularioCampo[] findWhereIdFormularioCampoEquals(int idFormularioCampo) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_formulario_campo = ? ORDER BY id_formulario_campo", new Object[] {  new Integer(idFormularioCampo) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_formulario = :idFormulario'.
	 */
	public CrFormularioCampo[] findWhereIdFormularioEquals(int idFormulario) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_formulario = ? ORDER BY id_formulario", new Object[] {  new Integer(idFormulario) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_tipo_campo = :idTipoCampo'.
	 */
	public CrFormularioCampo[] findWhereIdTipoCampoEquals(int idTipoCampo) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_tipo_campo = ? ORDER BY id_tipo_campo", new Object[] {  new Integer(idTipoCampo) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'orden_formulario = :ordenFormulario'.
	 */
	public CrFormularioCampo[] findWhereOrdenFormularioEquals(int ordenFormulario) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE orden_formulario = ? ORDER BY orden_formulario", new Object[] {  new Integer(ordenFormulario) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'no_seccion = :noSeccion'.
	 */
	public CrFormularioCampo[] findWhereNoSeccionEquals(int noSeccion) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE no_seccion = ? ORDER BY no_seccion", new Object[] {  new Integer(noSeccion) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'etiqueta = :etiqueta'.
	 */
	public CrFormularioCampo[] findWhereEtiquetaEquals(String etiqueta) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE etiqueta = ? ORDER BY etiqueta", new Object[] { etiqueta } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'descripcion = :descripcion'.
	 */
	public CrFormularioCampo[] findWhereDescripcionEquals(String descripcion) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion = ? ORDER BY descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'valor_defecto = :valorDefecto'.
	 */
	public CrFormularioCampo[] findWhereValorDefectoEquals(String valorDefecto) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE valor_defecto = ? ORDER BY valor_defecto", new Object[] { valorDefecto } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'valor_sugerencia = :valorSugerencia'.
	 */
	public CrFormularioCampo[] findWhereValorSugerenciaEquals(String valorSugerencia) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE valor_sugerencia = ? ORDER BY valor_sugerencia", new Object[] { valorSugerencia } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'opciones = :opciones'.
	 */
	public CrFormularioCampo[] findWhereOpcionesEquals(String opciones) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE opciones = ? ORDER BY opciones", new Object[] { opciones } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'is_requerido = :isRequerido'.
	 */
	public CrFormularioCampo[] findWhereIsRequeridoEquals(int isRequerido) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE is_requerido = ? ORDER BY is_requerido", new Object[] {  new Integer(isRequerido) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_formulario_validacion = :idFormularioValidacion'.
	 */
	public CrFormularioCampo[] findWhereIdFormularioValidacionEquals(int idFormularioValidacion) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_formulario_validacion = ? ORDER BY id_formulario_validacion", new Object[] {  new Integer(idFormularioValidacion) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'variable_formula = :variableFormula'.
	 */
	public CrFormularioCampo[] findWhereVariableFormulaEquals(String variableFormula) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE variable_formula = ? ORDER BY variable_formula", new Object[] { variableFormula } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrFormularioCampo[] findWhereIdEstatusEquals(int idEstatus) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_estatus = ? ORDER BY id_estatus", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrFormularioCampo[] findWhereIdEmpresaEquals(int idEmpresa) throws CrFormularioCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/**
	 * Method 'CrFormularioCampoDaoImpl'
	 * 
	 */
	public CrFormularioCampoDaoImpl()
	{
	}

	/**
	 * Method 'CrFormularioCampoDaoImpl'
	 * 
	 * @param userConn
	 */
	public CrFormularioCampoDaoImpl(final java.sql.Connection userConn)
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
		return "cr_formulario_campo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CrFormularioCampo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CrFormularioCampo dto = new CrFormularioCampo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CrFormularioCampo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CrFormularioCampo dto = new CrFormularioCampo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CrFormularioCampo ret[] = new CrFormularioCampo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CrFormularioCampo dto, ResultSet rs) throws SQLException
	{
		dto.setIdFormularioCampo( rs.getInt( COLUMN_ID_FORMULARIO_CAMPO ) );
		dto.setIdFormulario( rs.getInt( COLUMN_ID_FORMULARIO ) );
		dto.setIdTipoCampo( rs.getInt( COLUMN_ID_TIPO_CAMPO ) );
		dto.setOrdenFormulario( rs.getInt( COLUMN_ORDEN_FORMULARIO ) );
		if (rs.wasNull()) {
			dto.setOrdenFormularioNull( true );
		}
		
		dto.setNoSeccion( rs.getInt( COLUMN_NO_SECCION ) );
		dto.setEtiqueta( rs.getString( COLUMN_ETIQUETA ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setValorDefecto( rs.getString( COLUMN_VALOR_DEFECTO ) );
		dto.setValorSugerencia( rs.getString( COLUMN_VALOR_SUGERENCIA ) );
		dto.setOpciones( rs.getString( COLUMN_OPCIONES ) );
		dto.setIsRequerido( rs.getInt( COLUMN_IS_REQUERIDO ) );
		dto.setIdFormularioValidacion( rs.getInt( COLUMN_ID_FORMULARIO_VALIDACION ) );
		if (rs.wasNull()) {
			dto.setIdFormularioValidacionNull( true );
		}
		
		dto.setVariableFormula( rs.getString( COLUMN_VARIABLE_FORMULA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CrFormularioCampo dto)
	{
		dto.setIdFormularioCampoModified( false );
		dto.setIdFormularioModified( false );
		dto.setIdTipoCampoModified( false );
		dto.setOrdenFormularioModified( false );
		dto.setNoSeccionModified( false );
		dto.setEtiquetaModified( false );
		dto.setDescripcionModified( false );
		dto.setValorDefectoModified( false );
		dto.setValorSugerenciaModified( false );
		dto.setOpcionesModified( false );
		dto.setIsRequeridoModified( false );
		dto.setIdFormularioValidacionModified( false );
		dto.setVariableFormulaModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdEmpresaModified( false );
	}

	/** 
	 * Returns all rows from the cr_formulario_campo table that match the specified arbitrary SQL statement
	 */
	public CrFormularioCampo[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrFormularioCampoDaoException
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
			throw new CrFormularioCampoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cr_formulario_campo table that match the specified arbitrary SQL statement
	 */
	public CrFormularioCampo[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrFormularioCampoDaoException
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
			throw new CrFormularioCampoDaoException( "Exception: " + _e.getMessage(), _e );
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
