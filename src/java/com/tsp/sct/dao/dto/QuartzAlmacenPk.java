/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the quartz_almacen table.
 */
public class QuartzAlmacenPk implements Serializable
{
	protected int idQuartz;

	/** 
	 * This attribute represents whether the primitive attribute idQuartz is null.
	 */
	protected boolean idQuartzNull;

	/** 
	 * Sets the value of idQuartz
	 */
	public void setIdQuartz(int idQuartz)
	{
		this.idQuartz = idQuartz;
	}

	/** 
	 * Gets the value of idQuartz
	 */
	public int getIdQuartz()
	{
		return idQuartz;
	}

	/**
	 * Method 'QuartzAlmacenPk'
	 * 
	 */
	public QuartzAlmacenPk()
	{
	}

	/**
	 * Method 'QuartzAlmacenPk'
	 * 
	 * @param idQuartz
	 */
	public QuartzAlmacenPk(final int idQuartz)
	{
		this.idQuartz = idQuartz;
	}

	/** 
	 * Sets the value of idQuartzNull
	 */
	public void setIdQuartzNull(boolean idQuartzNull)
	{
		this.idQuartzNull = idQuartzNull;
	}

	/** 
	 * Gets the value of idQuartzNull
	 */
	public boolean isIdQuartzNull()
	{
		return idQuartzNull;
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
		
		if (!(_other instanceof QuartzAlmacenPk)) {
			return false;
		}
		
		final QuartzAlmacenPk _cast = (QuartzAlmacenPk) _other;
		if (idQuartz != _cast.idQuartz) {
			return false;
		}
		
		if (idQuartzNull != _cast.idQuartzNull) {
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
		_hashCode = 29 * _hashCode + idQuartz;
		_hashCode = 29 * _hashCode + (idQuartzNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.QuartzAlmacenPk: " );
		ret.append( "idQuartz=" + idQuartz );
		return ret.toString();
	}

}
