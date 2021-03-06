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

public interface ImagenPersonalDao
{
	/** 
	 * Inserts a new row in the imagen_personal table.
	 */
	public ImagenPersonalPk insert(ImagenPersonal dto) throws ImagenPersonalDaoException;

	/** 
	 * Updates a single row in the imagen_personal table.
	 */
	public void update(ImagenPersonalPk pk, ImagenPersonal dto) throws ImagenPersonalDaoException;

	/** 
	 * Deletes a single row in the imagen_personal table.
	 */
	public void delete(ImagenPersonalPk pk) throws ImagenPersonalDaoException;

	/** 
	 * Returns the rows from the imagen_personal table that matches the specified primary-key value.
	 */
	public ImagenPersonal findByPrimaryKey(ImagenPersonalPk pk) throws ImagenPersonalDaoException;

	/** 
	 * Returns all rows from the imagen_personal table that match the criteria 'ID_IMAGEN_PERSONAL = :idImagenPersonal'.
	 */
	public ImagenPersonal findByPrimaryKey(int idImagenPersonal) throws ImagenPersonalDaoException;

	/** 
	 * Returns all rows from the imagen_personal table that match the criteria ''.
	 */
	public ImagenPersonal[] findAll() throws ImagenPersonalDaoException;

	/** 
	 * Returns all rows from the imagen_personal table that match the criteria 'ID_IMAGEN_PERSONAL = :idImagenPersonal'.
	 */
	public ImagenPersonal[] findWhereIdImagenPersonalEquals(int idImagenPersonal) throws ImagenPersonalDaoException;

	/** 
	 * Returns all rows from the imagen_personal table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ImagenPersonal[] findWhereIdEmpresaEquals(int idEmpresa) throws ImagenPersonalDaoException;

	/** 
	 * Returns all rows from the imagen_personal table that match the criteria 'NOMBRE_IMAGEN = :nombreImagen'.
	 */
	public ImagenPersonal[] findWhereNombreImagenEquals(String nombreImagen) throws ImagenPersonalDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the imagen_personal table that match the specified arbitrary SQL statement
	 */
	public ImagenPersonal[] findByDynamicSelect(String sql, Object[] sqlParams) throws ImagenPersonalDaoException;

	/** 
	 * Returns all rows from the imagen_personal table that match the specified arbitrary SQL statement
	 */
	public ImagenPersonal[] findByDynamicWhere(String sql, Object[] sqlParams) throws ImagenPersonalDaoException;

}
