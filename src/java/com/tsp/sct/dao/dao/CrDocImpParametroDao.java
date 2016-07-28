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

public interface CrDocImpParametroDao
{
	/** 
	 * Inserts a new row in the cr_doc_imp_parametro table.
	 */
	public CrDocImpParametroPk insert(CrDocImpParametro dto) throws CrDocImpParametroDaoException;

	/** 
	 * Updates a single row in the cr_doc_imp_parametro table.
	 */
	public void update(CrDocImpParametroPk pk, CrDocImpParametro dto) throws CrDocImpParametroDaoException;

	/** 
	 * Deletes a single row in the cr_doc_imp_parametro table.
	 */
	public void delete(CrDocImpParametroPk pk) throws CrDocImpParametroDaoException;

	/** 
	 * Returns the rows from the cr_doc_imp_parametro table that matches the specified primary-key value.
	 */
	public CrDocImpParametro findByPrimaryKey(CrDocImpParametroPk pk) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'id_doc_imp_parametro = :idDocImpParametro'.
	 */
	public CrDocImpParametro findByPrimaryKey(int idDocImpParametro) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria ''.
	 */
	public CrDocImpParametro[] findAll() throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'id_doc_imp_parametro = :idDocImpParametro'.
	 */
	public CrDocImpParametro[] findWhereIdDocImpParametroEquals(int idDocImpParametro) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'id_doc_imprimible = :idDocImprimible'.
	 */
	public CrDocImpParametro[] findWhereIdDocImprimibleEquals(int idDocImprimible) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'parametro_clave = :parametroClave'.
	 */
	public CrDocImpParametro[] findWhereParametroClaveEquals(String parametroClave) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'descripcion = :descripcion'.
	 */
	public CrDocImpParametro[] findWhereDescripcionEquals(String descripcion) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'valor_defecto = :valorDefecto'.
	 */
	public CrDocImpParametro[] findWhereValorDefectoEquals(String valorDefecto) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'asocia_variable_formula = :asociaVariableFormula'.
	 */
	public CrDocImpParametro[] findWhereAsociaVariableFormulaEquals(String asociaVariableFormula) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrDocImpParametro[] findWhereIdEmpresaEquals(int idEmpresa) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrDocImpParametro[] findWhereIdEstatusEquals(int idEstatus) throws CrDocImpParametroDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the specified arbitrary SQL statement
	 */
	public CrDocImpParametro[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrDocImpParametroDaoException;

	/** 
	 * Returns all rows from the cr_doc_imp_parametro table that match the specified arbitrary SQL statement
	 */
	public CrDocImpParametro[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrDocImpParametroDaoException;

}
