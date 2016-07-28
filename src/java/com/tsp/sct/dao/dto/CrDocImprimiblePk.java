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
 * This class represents the primary key of the cr_doc_imprimible table.
 */
public class CrDocImprimiblePk implements Serializable
{
	protected int idDocImprimible;

	/** 
	 * This attribute represents whether the primitive attribute idDocImprimible is null.
	 */
	protected boolean idDocImprimibleNull;

	/** 
	 * Sets the value of idDocImprimible
	 */
	public void setIdDocImprimible(int idDocImprimible)
	{
		this.idDocImprimible = idDocImprimible;
	}

	/** 
	 * Gets the value of idDocImprimible
	 */
	public int getIdDocImprimible()
	{
		return idDocImprimible;
	}

	/**
	 * Method 'CrDocImprimiblePk'
	 * 
	 */
	public CrDocImprimiblePk()
	{
	}

	/**
	 * Method 'CrDocImprimiblePk'
	 * 
	 * @param idDocImprimible
	 */
	public CrDocImprimiblePk(final int idDocImprimible)
	{
		this.idDocImprimible = idDocImprimible;
	}

	/** 
	 * Sets the value of idDocImprimibleNull
	 */
	public void setIdDocImprimibleNull(boolean idDocImprimibleNull)
	{
		this.idDocImprimibleNull = idDocImprimibleNull;
	}

	/** 
	 * Gets the value of idDocImprimibleNull
	 */
	public boolean isIdDocImprimibleNull()
	{
		return idDocImprimibleNull;
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
		
		if (!(_other instanceof CrDocImprimiblePk)) {
			return false;
		}
		
		final CrDocImprimiblePk _cast = (CrDocImprimiblePk) _other;
		if (idDocImprimible != _cast.idDocImprimible) {
			return false;
		}
		
		if (idDocImprimibleNull != _cast.idDocImprimibleNull) {
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
		_hashCode = 29 * _hashCode + idDocImprimible;
		_hashCode = 29 * _hashCode + (idDocImprimibleNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrDocImprimiblePk: " );
		ret.append( "idDocImprimible=" + idDocImprimible );
		return ret.toString();
	}

}
