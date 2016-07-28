/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class SgfensTopic implements Serializable
{
	/** 
	 * This attribute maps to the column id_topic in the SGFENS_TOPIC table.
	 */
	protected long idTopic;

	/** 
	 * This attribute represents whether the attribute idTopic has been modified since being read from the database.
	 */
	protected boolean idTopicModified = false;

	/** 
	 * This attribute maps to the column title_topic in the SGFENS_TOPIC table.
	 */
	protected String titleTopic;

	/** 
	 * This attribute represents whether the attribute titleTopic has been modified since being read from the database.
	 */
	protected boolean titleTopicModified = false;

	/** 
	 * This attribute maps to the column description_topic in the SGFENS_TOPIC table.
	 */
	protected String descriptionTopic;

	/** 
	 * This attribute represents whether the attribute descriptionTopic has been modified since being read from the database.
	 */
	protected boolean descriptionTopicModified = false;

	/** 
	 * This attribute maps to the column order_topic in the SGFENS_TOPIC table.
	 */
	protected String orderTopic;

	/** 
	 * This attribute represents whether the attribute orderTopic has been modified since being read from the database.
	 */
	protected boolean orderTopicModified = false;

	/** 
	 * This attribute maps to the column url_topic in the SGFENS_TOPIC table.
	 */
	protected String urlTopic;

	/** 
	 * This attribute represents whether the attribute urlTopic has been modified since being read from the database.
	 */
	protected boolean urlTopicModified = false;

	/** 
	 * This attribute maps to the column is_public_topic in the SGFENS_TOPIC table.
	 */
	protected short isPublicTopic;

	/** 
	 * This attribute represents whether the primitive attribute isPublicTopic is null.
	 */
	protected boolean isPublicTopicNull = true;

	/** 
	 * This attribute represents whether the attribute isPublicTopic has been modified since being read from the database.
	 */
	protected boolean isPublicTopicModified = false;

	/** 
	 * This attribute maps to the column id_parent_topic in the SGFENS_TOPIC table.
	 */
	protected long idParentTopic;

	/** 
	 * This attribute represents whether the primitive attribute idParentTopic is null.
	 */
	protected boolean idParentTopicNull = true;

	/** 
	 * This attribute represents whether the attribute idParentTopic has been modified since being read from the database.
	 */
	protected boolean idParentTopicModified = false;

	/** 
	 * This attribute maps to the column is_active_topic in the SGFENS_TOPIC table.
	 */
	protected short isActiveTopic;

	/** 
	 * This attribute represents whether the primitive attribute isActiveTopic is null.
	 */
	protected boolean isActiveTopicNull = true;

	/** 
	 * This attribute represents whether the attribute isActiveTopic has been modified since being read from the database.
	 */
	protected boolean isActiveTopicModified = false;

	/**
	 * Method 'SgfensTopic'
	 * 
	 */
	public SgfensTopic()
	{
	}

	/**
	 * Method 'getIdTopic'
	 * 
	 * @return long
	 */
	public long getIdTopic()
	{
		return idTopic;
	}

	/**
	 * Method 'setIdTopic'
	 * 
	 * @param idTopic
	 */
	public void setIdTopic(long idTopic)
	{
		this.idTopic = idTopic;
		this.idTopicModified = true;
	}

	/** 
	 * Sets the value of idTopicModified
	 */
	public void setIdTopicModified(boolean idTopicModified)
	{
		this.idTopicModified = idTopicModified;
	}

	/** 
	 * Gets the value of idTopicModified
	 */
	public boolean isIdTopicModified()
	{
		return idTopicModified;
	}

	/**
	 * Method 'getTitleTopic'
	 * 
	 * @return String
	 */
	public String getTitleTopic()
	{
		return titleTopic;
	}

	/**
	 * Method 'setTitleTopic'
	 * 
	 * @param titleTopic
	 */
	public void setTitleTopic(String titleTopic)
	{
		this.titleTopic = titleTopic;
		this.titleTopicModified = true;
	}

	/** 
	 * Sets the value of titleTopicModified
	 */
	public void setTitleTopicModified(boolean titleTopicModified)
	{
		this.titleTopicModified = titleTopicModified;
	}

	/** 
	 * Gets the value of titleTopicModified
	 */
	public boolean isTitleTopicModified()
	{
		return titleTopicModified;
	}

	/**
	 * Method 'getDescriptionTopic'
	 * 
	 * @return String
	 */
	public String getDescriptionTopic()
	{
		return descriptionTopic;
	}

	/**
	 * Method 'setDescriptionTopic'
	 * 
	 * @param descriptionTopic
	 */
	public void setDescriptionTopic(String descriptionTopic)
	{
		this.descriptionTopic = descriptionTopic;
		this.descriptionTopicModified = true;
	}

	/** 
	 * Sets the value of descriptionTopicModified
	 */
	public void setDescriptionTopicModified(boolean descriptionTopicModified)
	{
		this.descriptionTopicModified = descriptionTopicModified;
	}

	/** 
	 * Gets the value of descriptionTopicModified
	 */
	public boolean isDescriptionTopicModified()
	{
		return descriptionTopicModified;
	}

	/**
	 * Method 'getOrderTopic'
	 * 
	 * @return String
	 */
	public String getOrderTopic()
	{
		return orderTopic;
	}

	/**
	 * Method 'setOrderTopic'
	 * 
	 * @param orderTopic
	 */
	public void setOrderTopic(String orderTopic)
	{
		this.orderTopic = orderTopic;
		this.orderTopicModified = true;
	}

	/** 
	 * Sets the value of orderTopicModified
	 */
	public void setOrderTopicModified(boolean orderTopicModified)
	{
		this.orderTopicModified = orderTopicModified;
	}

	/** 
	 * Gets the value of orderTopicModified
	 */
	public boolean isOrderTopicModified()
	{
		return orderTopicModified;
	}

	/**
	 * Method 'getUrlTopic'
	 * 
	 * @return String
	 */
	public String getUrlTopic()
	{
		return urlTopic;
	}

	/**
	 * Method 'setUrlTopic'
	 * 
	 * @param urlTopic
	 */
	public void setUrlTopic(String urlTopic)
	{
		this.urlTopic = urlTopic;
		this.urlTopicModified = true;
	}

	/** 
	 * Sets the value of urlTopicModified
	 */
	public void setUrlTopicModified(boolean urlTopicModified)
	{
		this.urlTopicModified = urlTopicModified;
	}

	/** 
	 * Gets the value of urlTopicModified
	 */
	public boolean isUrlTopicModified()
	{
		return urlTopicModified;
	}

	/**
	 * Method 'getIsPublicTopic'
	 * 
	 * @return short
	 */
	public short getIsPublicTopic()
	{
		return isPublicTopic;
	}

	/**
	 * Method 'setIsPublicTopic'
	 * 
	 * @param isPublicTopic
	 */
	public void setIsPublicTopic(short isPublicTopic)
	{
		this.isPublicTopic = isPublicTopic;
		this.isPublicTopicNull = false;
		this.isPublicTopicModified = true;
	}

	/**
	 * Method 'setIsPublicTopicNull'
	 * 
	 * @param value
	 */
	public void setIsPublicTopicNull(boolean value)
	{
		this.isPublicTopicNull = value;
		this.isPublicTopicModified = true;
	}

	/**
	 * Method 'isIsPublicTopicNull'
	 * 
	 * @return boolean
	 */
	public boolean isIsPublicTopicNull()
	{
		return isPublicTopicNull;
	}

	/** 
	 * Sets the value of isPublicTopicModified
	 */
	public void setIsPublicTopicModified(boolean isPublicTopicModified)
	{
		this.isPublicTopicModified = isPublicTopicModified;
	}

	/** 
	 * Gets the value of isPublicTopicModified
	 */
	public boolean isIsPublicTopicModified()
	{
		return isPublicTopicModified;
	}

	/**
	 * Method 'getIdParentTopic'
	 * 
	 * @return long
	 */
	public long getIdParentTopic()
	{
		return idParentTopic;
	}

	/**
	 * Method 'setIdParentTopic'
	 * 
	 * @param idParentTopic
	 */
	public void setIdParentTopic(long idParentTopic)
	{
		this.idParentTopic = idParentTopic;
		this.idParentTopicNull = false;
		this.idParentTopicModified = true;
	}

	/**
	 * Method 'setIdParentTopicNull'
	 * 
	 * @param value
	 */
	public void setIdParentTopicNull(boolean value)
	{
		this.idParentTopicNull = value;
		this.idParentTopicModified = true;
	}

	/**
	 * Method 'isIdParentTopicNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdParentTopicNull()
	{
		return idParentTopicNull;
	}

	/** 
	 * Sets the value of idParentTopicModified
	 */
	public void setIdParentTopicModified(boolean idParentTopicModified)
	{
		this.idParentTopicModified = idParentTopicModified;
	}

	/** 
	 * Gets the value of idParentTopicModified
	 */
	public boolean isIdParentTopicModified()
	{
		return idParentTopicModified;
	}

	/**
	 * Method 'getIsActiveTopic'
	 * 
	 * @return short
	 */
	public short getIsActiveTopic()
	{
		return isActiveTopic;
	}

	/**
	 * Method 'setIsActiveTopic'
	 * 
	 * @param isActiveTopic
	 */
	public void setIsActiveTopic(short isActiveTopic)
	{
		this.isActiveTopic = isActiveTopic;
		this.isActiveTopicNull = false;
		this.isActiveTopicModified = true;
	}

	/**
	 * Method 'setIsActiveTopicNull'
	 * 
	 * @param value
	 */
	public void setIsActiveTopicNull(boolean value)
	{
		this.isActiveTopicNull = value;
		this.isActiveTopicModified = true;
	}

	/**
	 * Method 'isIsActiveTopicNull'
	 * 
	 * @return boolean
	 */
	public boolean isIsActiveTopicNull()
	{
		return isActiveTopicNull;
	}

	/** 
	 * Sets the value of isActiveTopicModified
	 */
	public void setIsActiveTopicModified(boolean isActiveTopicModified)
	{
		this.isActiveTopicModified = isActiveTopicModified;
	}

	/** 
	 * Gets the value of isActiveTopicModified
	 */
	public boolean isIsActiveTopicModified()
	{
		return isActiveTopicModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SgfensTopic)) {
			return false;
		}
		
		final SgfensTopic _cast = (SgfensTopic) _other;
		if (idTopic != _cast.idTopic) {
			return false;
		}
		
		if (idTopicModified != _cast.idTopicModified) {
			return false;
		}
		
		if (titleTopic == null ? _cast.titleTopic != titleTopic : !titleTopic.equals( _cast.titleTopic )) {
			return false;
		}
		
		if (titleTopicModified != _cast.titleTopicModified) {
			return false;
		}
		
		if (descriptionTopic == null ? _cast.descriptionTopic != descriptionTopic : !descriptionTopic.equals( _cast.descriptionTopic )) {
			return false;
		}
		
		if (descriptionTopicModified != _cast.descriptionTopicModified) {
			return false;
		}
		
		if (orderTopic == null ? _cast.orderTopic != orderTopic : !orderTopic.equals( _cast.orderTopic )) {
			return false;
		}
		
		if (orderTopicModified != _cast.orderTopicModified) {
			return false;
		}
		
		if (urlTopic == null ? _cast.urlTopic != urlTopic : !urlTopic.equals( _cast.urlTopic )) {
			return false;
		}
		
		if (urlTopicModified != _cast.urlTopicModified) {
			return false;
		}
		
		if (isPublicTopic != _cast.isPublicTopic) {
			return false;
		}
		
		if (isPublicTopicNull != _cast.isPublicTopicNull) {
			return false;
		}
		
		if (isPublicTopicModified != _cast.isPublicTopicModified) {
			return false;
		}
		
		if (idParentTopic != _cast.idParentTopic) {
			return false;
		}
		
		if (idParentTopicNull != _cast.idParentTopicNull) {
			return false;
		}
		
		if (idParentTopicModified != _cast.idParentTopicModified) {
			return false;
		}
		
		if (isActiveTopic != _cast.isActiveTopic) {
			return false;
		}
		
		if (isActiveTopicNull != _cast.isActiveTopicNull) {
			return false;
		}
		
		if (isActiveTopicModified != _cast.isActiveTopicModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (idTopic ^ (idTopic >>> 32));
		_hashCode = 29 * _hashCode + (idTopicModified ? 1 : 0);
		if (titleTopic != null) {
			_hashCode = 29 * _hashCode + titleTopic.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (titleTopicModified ? 1 : 0);
		if (descriptionTopic != null) {
			_hashCode = 29 * _hashCode + descriptionTopic.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descriptionTopicModified ? 1 : 0);
		if (orderTopic != null) {
			_hashCode = 29 * _hashCode + orderTopic.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (orderTopicModified ? 1 : 0);
		if (urlTopic != null) {
			_hashCode = 29 * _hashCode + urlTopic.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (urlTopicModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) isPublicTopic;
		_hashCode = 29 * _hashCode + (isPublicTopicNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (isPublicTopicModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (idParentTopic ^ (idParentTopic >>> 32));
		_hashCode = 29 * _hashCode + (idParentTopicNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idParentTopicModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) isActiveTopic;
		_hashCode = 29 * _hashCode + (isActiveTopicNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (isActiveTopicModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensTopicPk
	 */
	public SgfensTopicPk createPk()
	{
		return new SgfensTopicPk(idTopic);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensTopic: " );
		ret.append( "idTopic=" + idTopic );
		ret.append( ", titleTopic=" + titleTopic );
		ret.append( ", descriptionTopic=" + descriptionTopic );
		ret.append( ", orderTopic=" + orderTopic );
		ret.append( ", urlTopic=" + urlTopic );
		ret.append( ", isPublicTopic=" + isPublicTopic );
		ret.append( ", idParentTopic=" + idParentTopic );
		ret.append( ", isActiveTopic=" + isActiveTopic );
		return ret.toString();
	}

}
