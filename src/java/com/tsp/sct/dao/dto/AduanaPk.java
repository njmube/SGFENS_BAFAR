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
 * This class represents the primary key of the aduana table.
 */
public class AduanaPk implements Serializable
{
	protected int idAduana;

	/** 
	 * This attribute represents whether the primitive attribute idAduana is null.
	 */
	protected boolean idAduanaNull;

	/** 
	 * Sets the value of idAduana
	 */
	public void setIdAduana(int idAduana)
	{
		this.idAduana = idAduana;
	}

	/** 
	 * Gets the value of idAduana
	 */
	public int getIdAduana()
	{
		return idAduana;
	}

	/**
	 * Method 'AduanaPk'
	 * 
	 */
	public AduanaPk()
	{
	}

	/**
	 * Method 'AduanaPk'
	 * 
	 * @param idAduana
	 */
	public AduanaPk(final int idAduana)
	{
		this.idAduana = idAduana;
	}

	/** 
	 * Sets the value of idAduanaNull
	 */
	public void setIdAduanaNull(boolean idAduanaNull)
	{
		this.idAduanaNull = idAduanaNull;
	}

	/** 
	 * Gets the value of idAduanaNull
	 */
	public boolean isIdAduanaNull()
	{
		return idAduanaNull;
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
		
		if (!(_other instanceof AduanaPk)) {
			return false;
		}
		
		final AduanaPk _cast = (AduanaPk) _other;
		if (idAduana != _cast.idAduana) {
			return false;
		}
		
		if (idAduanaNull != _cast.idAduanaNull) {
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
		_hashCode = 29 * _hashCode + idAduana;
		_hashCode = 29 * _hashCode + (idAduanaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.AduanaPk: " );
		ret.append( "idAduana=" + idAduana );
		return ret.toString();
	}

}
