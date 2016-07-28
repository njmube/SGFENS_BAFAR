/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface InventarioInicialVendedorDao
{
	/** 
	 * Inserts a new row in the inventario_inicial_vendedor table.
	 */
	public void insert(InventarioInicialVendedor dto) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria ''.
	 */
	public InventarioInicialVendedor[] findAll() throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public InventarioInicialVendedor[] findWhereIdEmpleadoEquals(int idEmpleado) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public InventarioInicialVendedor[] findWhereIdConceptoEquals(int idConcepto) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public InventarioInicialVendedor[] findWhereCantidadEquals(double cantidad) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public InventarioInicialVendedor[] findWhereFechaRegistroEquals(Date fechaRegistro) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria 'FECHA_HR_ULT_ADICION = :fechaHrUltAdicion'.
	 */
	public InventarioInicialVendedor[] findWhereFechaHrUltAdicionEquals(Date fechaHrUltAdicion) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the criteria 'OBSERVACION_ULT_ADICION = :observacionUltAdicion'.
	 */
	public InventarioInicialVendedor[] findWhereObservacionUltAdicionEquals(String observacionUltAdicion) throws InventarioInicialVendedorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the specified arbitrary SQL statement
	 */
	public InventarioInicialVendedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws InventarioInicialVendedorDaoException;

	/** 
	 * Returns all rows from the inventario_inicial_vendedor table that match the specified arbitrary SQL statement
	 */
	public InventarioInicialVendedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws InventarioInicialVendedorDaoException;

}
