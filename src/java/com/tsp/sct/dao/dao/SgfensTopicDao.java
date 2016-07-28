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

public interface SgfensTopicDao
{
	/** 
	 * Inserts a new row in the SGFENS_TOPIC table.
	 */
	public SgfensTopicPk insert(SgfensTopic dto) throws SgfensTopicDaoException;

	/** 
	 * Updates a single row in the SGFENS_TOPIC table.
	 */
	public void update(SgfensTopicPk pk, SgfensTopic dto) throws SgfensTopicDaoException;

	/** 
	 * Deletes a single row in the SGFENS_TOPIC table.
	 */
	public void delete(SgfensTopicPk pk) throws SgfensTopicDaoException;

	/** 
	 * Returns the rows from the SGFENS_TOPIC table that matches the specified primary-key value.
	 */
	public SgfensTopic findByPrimaryKey(SgfensTopicPk pk) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'id_topic = :idTopic'.
	 */
	public SgfensTopic findByPrimaryKey(long idTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria ''.
	 */
	public SgfensTopic[] findAll() throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'id_topic = :idTopic'.
	 */
	public SgfensTopic[] findWhereIdTopicEquals(long idTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'title_topic = :titleTopic'.
	 */
	public SgfensTopic[] findWhereTitleTopicEquals(String titleTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'description_topic = :descriptionTopic'.
	 */
	public SgfensTopic[] findWhereDescriptionTopicEquals(String descriptionTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'order_topic = :orderTopic'.
	 */
	public SgfensTopic[] findWhereOrderTopicEquals(String orderTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'url_topic = :urlTopic'.
	 */
	public SgfensTopic[] findWhereUrlTopicEquals(String urlTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'is_public_topic = :isPublicTopic'.
	 */
	public SgfensTopic[] findWhereIsPublicTopicEquals(short isPublicTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'id_parent_topic = :idParentTopic'.
	 */
	public SgfensTopic[] findWhereIdParentTopicEquals(long idParentTopic) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the criteria 'is_active_topic = :isActiveTopic'.
	 */
	public SgfensTopic[] findWhereIsActiveTopicEquals(short isActiveTopic) throws SgfensTopicDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the specified arbitrary SQL statement
	 */
	public SgfensTopic[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensTopicDaoException;

	/** 
	 * Returns all rows from the SGFENS_TOPIC table that match the specified arbitrary SQL statement
	 */
	public SgfensTopic[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensTopicDaoException;

}
