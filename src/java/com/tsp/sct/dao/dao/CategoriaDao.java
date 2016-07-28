/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface CategoriaDao
{
	/** 
	 * Inserts a new row in the CATEGORIA table.
	 */
	public CategoriaPk insert(Categoria dto) throws CategoriaDaoException;

	/** 
	 * Updates a single row in the CATEGORIA table.
	 */
	public void update(CategoriaPk pk, Categoria dto) throws CategoriaDaoException;

	/** 
	 * Deletes a single row in the CATEGORIA table.
	 */
	public void delete(CategoriaPk pk) throws CategoriaDaoException;

	/** 
	 * Returns the rows from the CATEGORIA table that matches the specified primary-key value.
	 */
	public Categoria findByPrimaryKey(CategoriaPk pk) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'id_categoria = :idCategoria'.
	 */
	public Categoria findByPrimaryKey(int idCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria ''.
	 */
	public Categoria[] findAll() throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'id_categoria = :idCategoria'.
	 */
	public Categoria[] findWhereIdCategoriaEquals(int idCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'nombre_categoria = :nombreCategoria'.
	 */
	public Categoria[] findWhereNombreCategoriaEquals(String nombreCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'descripcion_categoria = :descripcionCategoria'.
	 */
	public Categoria[] findWhereDescripcionCategoriaEquals(String descripcionCategoria) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'id_categoria_padre = :idCategoriaPadre'.
	 */
	public Categoria[] findWhereIdCategoriaPadreEquals(int idCategoriaPadre) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public Categoria[] findWhereIdEmpresaEquals(int idEmpresa) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Categoria[] findWhereIdEstatusEquals(int idEstatus) throws CategoriaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the CATEGORIA table that match the specified arbitrary SQL statement
	 */
	public Categoria[] findByDynamicSelect(String sql, Object[] sqlParams) throws CategoriaDaoException;

	/** 
	 * Returns all rows from the CATEGORIA table that match the specified arbitrary SQL statement
	 */
	public Categoria[] findByDynamicWhere(String sql, Object[] sqlParams) throws CategoriaDaoException;

}
