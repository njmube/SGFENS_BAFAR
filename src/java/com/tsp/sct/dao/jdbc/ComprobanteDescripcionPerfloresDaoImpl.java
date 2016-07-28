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

public class ComprobanteDescripcionPerfloresDaoImpl extends AbstractDAO implements ComprobanteDescripcionPerfloresDao
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
	protected final String SQL_SELECT = "SELECT ID_COMPROBANTE_DESCRIPCION, ID_COMPROBANTE_FISCAL, ID_CONCEPTO, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO, UNIDAD, PORCENTAJE, TOTAL_OBRA, AMORTIZACION, SUMA, SUBTOTAL1, INSP_Y_VIGI, CAPA_ICIC, FONDO_SEGURIDAD, SUBTOTAL2, ALCANCE_LIQUIDO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_COMPROBANTE_DESCRIPCION, ID_COMPROBANTE_FISCAL, ID_CONCEPTO, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO, UNIDAD, PORCENTAJE, TOTAL_OBRA, AMORTIZACION, SUMA, SUBTOTAL1, INSP_Y_VIGI, CAPA_ICIC, FONDO_SEGURIDAD, SUBTOTAL2, ALCANCE_LIQUIDO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_COMPROBANTE_DESCRIPCION = ?, ID_COMPROBANTE_FISCAL = ?, ID_CONCEPTO = ?, DESCRIPCION = ?, CANTIDAD = ?, PRECIO_UNITARIO = ?, UNIDAD = ?, PORCENTAJE = ?, TOTAL_OBRA = ?, AMORTIZACION = ?, SUMA = ?, SUBTOTAL1 = ?, INSP_Y_VIGI = ?, CAPA_ICIC = ?, FONDO_SEGURIDAD = ?, SUBTOTAL2 = ?, ALCANCE_LIQUIDO = ? WHERE ID_COMPROBANTE_DESCRIPCION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_COMPROBANTE_DESCRIPCION = ?";

	/** 
	 * Index of column ID_COMPROBANTE_DESCRIPCION
	 */
	protected static final int COLUMN_ID_COMPROBANTE_DESCRIPCION = 1;

	/** 
	 * Index of column ID_COMPROBANTE_FISCAL
	 */
	protected static final int COLUMN_ID_COMPROBANTE_FISCAL = 2;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 3;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 4;

	/** 
	 * Index of column CANTIDAD
	 */
	protected static final int COLUMN_CANTIDAD = 5;

	/** 
	 * Index of column PRECIO_UNITARIO
	 */
	protected static final int COLUMN_PRECIO_UNITARIO = 6;

	/** 
	 * Index of column UNIDAD
	 */
	protected static final int COLUMN_UNIDAD = 7;

	/** 
	 * Index of column PORCENTAJE
	 */
	protected static final int COLUMN_PORCENTAJE = 8;

	/** 
	 * Index of column TOTAL_OBRA
	 */
	protected static final int COLUMN_TOTAL_OBRA = 9;

	/** 
	 * Index of column AMORTIZACION
	 */
	protected static final int COLUMN_AMORTIZACION = 10;

	/** 
	 * Index of column SUMA
	 */
	protected static final int COLUMN_SUMA = 11;

	/** 
	 * Index of column SUBTOTAL1
	 */
	protected static final int COLUMN_SUBTOTAL1 = 12;

	/** 
	 * Index of column INSP_Y_VIGI
	 */
	protected static final int COLUMN_INSP_Y_VIGI = 13;

	/** 
	 * Index of column CAPA_ICIC
	 */
	protected static final int COLUMN_CAPA_ICIC = 14;

	/** 
	 * Index of column FONDO_SEGURIDAD
	 */
	protected static final int COLUMN_FONDO_SEGURIDAD = 15;

	/** 
	 * Index of column SUBTOTAL2
	 */
	protected static final int COLUMN_SUBTOTAL2 = 16;

	/** 
	 * Index of column ALCANCE_LIQUIDO
	 */
	protected static final int COLUMN_ALCANCE_LIQUIDO = 17;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 17;

	/** 
	 * Index of primary-key column ID_COMPROBANTE_DESCRIPCION
	 */
	protected static final int PK_COLUMN_ID_COMPROBANTE_DESCRIPCION = 1;

	/** 
	 * Inserts a new row in the comprobante_descripcion_perflores table.
	 */
	public ComprobanteDescripcionPerfloresPk insert(ComprobanteDescripcionPerflores dto) throws ComprobanteDescripcionPerfloresDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getIdComprobanteDescripcion() );
			stmt.setInt( index++, dto.getIdComprobanteFiscal() );
			stmt.setInt( index++, dto.getIdConcepto() );
			stmt.setString( index++, dto.getDescripcion() );
			if (dto.isCantidadNull()) {
				stmt.setNull( index++, java.sql.Types.FLOAT );
			} else {
				stmt.setFloat( index++, dto.getCantidad() );
			}
		
			if (dto.isPrecioUnitarioNull()) {
				stmt.setNull( index++, java.sql.Types.FLOAT );
			} else {
				stmt.setFloat( index++, dto.getPrecioUnitario() );
			}
		
			stmt.setString( index++, dto.getUnidad() );
			stmt.setString( index++, dto.getPorcentaje() );
			stmt.setString( index++, dto.getTotalObra() );
			stmt.setString( index++, dto.getAmortizacion() );
			stmt.setString( index++, dto.getSuma() );
			stmt.setString( index++, dto.getSubtotal1() );
			stmt.setString( index++, dto.getInspYVigi() );
			stmt.setString( index++, dto.getCapaIcic() );
			stmt.setString( index++, dto.getFondoSeguridad() );
			stmt.setString( index++, dto.getSubtotal2() );
			stmt.setString( index++, dto.getAlcanceLiquido() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComprobanteDescripcionPerfloresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the comprobante_descripcion_perflores table.
	 */
	public void update(ComprobanteDescripcionPerfloresPk pk, ComprobanteDescripcionPerflores dto) throws ComprobanteDescripcionPerfloresDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdComprobanteDescripcion() );
			stmt.setInt( index++, dto.getIdComprobanteFiscal() );
			stmt.setInt( index++, dto.getIdConcepto() );
			stmt.setString( index++, dto.getDescripcion() );
			if (dto.isCantidadNull()) {
				stmt.setNull( index++, java.sql.Types.FLOAT );
			} else {
				stmt.setFloat( index++, dto.getCantidad() );
			}
		
			if (dto.isPrecioUnitarioNull()) {
				stmt.setNull( index++, java.sql.Types.FLOAT );
			} else {
				stmt.setFloat( index++, dto.getPrecioUnitario() );
			}
		
			stmt.setString( index++, dto.getUnidad() );
			stmt.setString( index++, dto.getPorcentaje() );
			stmt.setString( index++, dto.getTotalObra() );
			stmt.setString( index++, dto.getAmortizacion() );
			stmt.setString( index++, dto.getSuma() );
			stmt.setString( index++, dto.getSubtotal1() );
			stmt.setString( index++, dto.getInspYVigi() );
			stmt.setString( index++, dto.getCapaIcic() );
			stmt.setString( index++, dto.getFondoSeguridad() );
			stmt.setString( index++, dto.getSubtotal2() );
			stmt.setString( index++, dto.getAlcanceLiquido() );
			stmt.setInt( 18, pk.getIdComprobanteDescripcion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComprobanteDescripcionPerfloresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the comprobante_descripcion_perflores table.
	 */
	public void delete(ComprobanteDescripcionPerfloresPk pk) throws ComprobanteDescripcionPerfloresDaoException
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
			stmt.setInt( 1, pk.getIdComprobanteDescripcion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComprobanteDescripcionPerfloresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the comprobante_descripcion_perflores table that matches the specified primary-key value.
	 */
	public ComprobanteDescripcionPerflores findByPrimaryKey(ComprobanteDescripcionPerfloresPk pk) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByPrimaryKey( pk.getIdComprobanteDescripcion() );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ID_COMPROBANTE_DESCRIPCION = :idComprobanteDescripcion'.
	 */
	public ComprobanteDescripcionPerflores findByPrimaryKey(int idComprobanteDescripcion) throws ComprobanteDescripcionPerfloresDaoException
	{
		ComprobanteDescripcionPerflores ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_DESCRIPCION = ?", new Object[] {  new Integer(idComprobanteDescripcion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria ''.
	 */
	public ComprobanteDescripcionPerflores[] findAll() throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_COMPROBANTE_DESCRIPCION", null );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public ComprobanteDescripcionPerflores[] findByComprobanteFiscal(int idComprobanteFiscal) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_FISCAL = ?", new Object[] {  new Integer(idComprobanteFiscal) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public ComprobanteDescripcionPerflores[] findByConcepto(int idConcepto) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ?", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ID_COMPROBANTE_DESCRIPCION = :idComprobanteDescripcion'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereIdComprobanteDescripcionEquals(int idComprobanteDescripcion) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_DESCRIPCION = ? ORDER BY ID_COMPROBANTE_DESCRIPCION", new Object[] {  new Integer(idComprobanteDescripcion) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_FISCAL = ? ORDER BY ID_COMPROBANTE_FISCAL", new Object[] {  new Integer(idComprobanteFiscal) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereIdConceptoEquals(int idConcepto) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereDescripcionEquals(String descripcion) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereCantidadEquals(float cantidad) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD = ? ORDER BY CANTIDAD", new Object[] {  new Float(cantidad) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'PRECIO_UNITARIO = :precioUnitario'.
	 */
	public ComprobanteDescripcionPerflores[] findWherePrecioUnitarioEquals(float precioUnitario) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO_UNITARIO = ? ORDER BY PRECIO_UNITARIO", new Object[] {  new Float(precioUnitario) } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'UNIDAD = :unidad'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereUnidadEquals(String unidad) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UNIDAD = ? ORDER BY UNIDAD", new Object[] { unidad } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'PORCENTAJE = :porcentaje'.
	 */
	public ComprobanteDescripcionPerflores[] findWherePorcentajeEquals(String porcentaje) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PORCENTAJE = ? ORDER BY PORCENTAJE", new Object[] { porcentaje } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'TOTAL_OBRA = :totalObra'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereTotalObraEquals(String totalObra) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TOTAL_OBRA = ? ORDER BY TOTAL_OBRA", new Object[] { totalObra } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'AMORTIZACION = :amortizacion'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereAmortizacionEquals(String amortizacion) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE AMORTIZACION = ? ORDER BY AMORTIZACION", new Object[] { amortizacion } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'SUMA = :suma'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereSumaEquals(String suma) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SUMA = ? ORDER BY SUMA", new Object[] { suma } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'SUBTOTAL1 = :subtotal1'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereSubtotal1Equals(String subtotal1) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SUBTOTAL1 = ? ORDER BY SUBTOTAL1", new Object[] { subtotal1 } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'INSP_Y_VIGI = :inspYVigi'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereInspYVigiEquals(String inspYVigi) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE INSP_Y_VIGI = ? ORDER BY INSP_Y_VIGI", new Object[] { inspYVigi } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'CAPA_ICIC = :capaIcic'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereCapaIcicEquals(String capaIcic) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CAPA_ICIC = ? ORDER BY CAPA_ICIC", new Object[] { capaIcic } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'FONDO_SEGURIDAD = :fondoSeguridad'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereFondoSeguridadEquals(String fondoSeguridad) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FONDO_SEGURIDAD = ? ORDER BY FONDO_SEGURIDAD", new Object[] { fondoSeguridad } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'SUBTOTAL2 = :subtotal2'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereSubtotal2Equals(String subtotal2) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SUBTOTAL2 = ? ORDER BY SUBTOTAL2", new Object[] { subtotal2 } );
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the criteria 'ALCANCE_LIQUIDO = :alcanceLiquido'.
	 */
	public ComprobanteDescripcionPerflores[] findWhereAlcanceLiquidoEquals(String alcanceLiquido) throws ComprobanteDescripcionPerfloresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ALCANCE_LIQUIDO = ? ORDER BY ALCANCE_LIQUIDO", new Object[] { alcanceLiquido } );
	}

	/**
	 * Method 'ComprobanteDescripcionPerfloresDaoImpl'
	 * 
	 */
	public ComprobanteDescripcionPerfloresDaoImpl()
	{
	}

	/**
	 * Method 'ComprobanteDescripcionPerfloresDaoImpl'
	 * 
	 * @param userConn
	 */
	public ComprobanteDescripcionPerfloresDaoImpl(final java.sql.Connection userConn)
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
		return "comprobante_descripcion_perflores";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ComprobanteDescripcionPerflores fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ComprobanteDescripcionPerflores dto = new ComprobanteDescripcionPerflores();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ComprobanteDescripcionPerflores[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ComprobanteDescripcionPerflores dto = new ComprobanteDescripcionPerflores();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ComprobanteDescripcionPerflores ret[] = new ComprobanteDescripcionPerflores[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ComprobanteDescripcionPerflores dto, ResultSet rs) throws SQLException
	{
		dto.setIdComprobanteDescripcion( rs.getInt( COLUMN_ID_COMPROBANTE_DESCRIPCION ) );
		dto.setIdComprobanteFiscal( rs.getInt( COLUMN_ID_COMPROBANTE_FISCAL ) );
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setCantidad( rs.getFloat( COLUMN_CANTIDAD ) );
		if (rs.wasNull()) {
			dto.setCantidadNull( true );
		}
		
		dto.setPrecioUnitario( rs.getFloat( COLUMN_PRECIO_UNITARIO ) );
		if (rs.wasNull()) {
			dto.setPrecioUnitarioNull( true );
		}
		
		dto.setUnidad( rs.getString( COLUMN_UNIDAD ) );
		dto.setPorcentaje( rs.getString( COLUMN_PORCENTAJE ) );
		dto.setTotalObra( rs.getString( COLUMN_TOTAL_OBRA ) );
		dto.setAmortizacion( rs.getString( COLUMN_AMORTIZACION ) );
		dto.setSuma( rs.getString( COLUMN_SUMA ) );
		dto.setSubtotal1( rs.getString( COLUMN_SUBTOTAL1 ) );
		dto.setInspYVigi( rs.getString( COLUMN_INSP_Y_VIGI ) );
		dto.setCapaIcic( rs.getString( COLUMN_CAPA_ICIC ) );
		dto.setFondoSeguridad( rs.getString( COLUMN_FONDO_SEGURIDAD ) );
		dto.setSubtotal2( rs.getString( COLUMN_SUBTOTAL2 ) );
		dto.setAlcanceLiquido( rs.getString( COLUMN_ALCANCE_LIQUIDO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ComprobanteDescripcionPerflores dto)
	{
	}

	/** 
	 * Returns all rows from the comprobante_descripcion_perflores table that match the specified arbitrary SQL statement
	 */
	public ComprobanteDescripcionPerflores[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComprobanteDescripcionPerfloresDaoException
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
			throw new ComprobanteDescripcionPerfloresDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the comprobante_descripcion_perflores table that match the specified arbitrary SQL statement
	 */
	public ComprobanteDescripcionPerflores[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComprobanteDescripcionPerfloresDaoException
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
			throw new ComprobanteDescripcionPerfloresDaoException( "Exception: " + _e.getMessage(), _e );
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
