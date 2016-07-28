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
 * This class represents the primary key of the donatarias table.
 */
public class DonatariasPk implements Serializable
{
	protected int idDonataria;

	/** 
	 * This attribute represents whether the primitive attribute idDonataria is null.
	 */
	protected boolean idDonatariaNull;

	/** 
	 * Sets the value of idDonataria
	 */
	public void setIdDonataria(int idDonataria)
	{
		this.idDonataria = idDonataria;
	}

	/** 
	 * Gets the value of idDonataria
	 */
	public int getIdDonataria()
	{
		return idDonataria;
	}

	/**
	 * Method 'DonatariasPk'
	 * 
	 */
	public DonatariasPk()
	{
	}

	/**
	 * Method 'DonatariasPk'
	 * 
	 * @param idDonataria
	 */
	public DonatariasPk(final int idDonataria)
	{
		this.idDonataria = idDonataria;
	}

	/** 
	 * Sets the value of idDonatariaNull
	 */
	public void setIdDonatariaNull(boolean idDonatariaNull)
	{
		this.idDonatariaNull = idDonatariaNull;
	}

	/** 
	 * Gets the value of idDonatariaNull
	 */
	public boolean isIdDonatariaNull()
	{
		return idDonatariaNull;
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
		
		if (!(_other instanceof DonatariasPk)) {
			return false;
		}
		
		final DonatariasPk _cast = (DonatariasPk) _other;
		if (idDonataria != _cast.idDonataria) {
			return false;
		}
		
		if (idDonatariaNull != _cast.idDonatariaNull) {
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
		_hashCode = 29 * _hashCode + idDonataria;
		_hashCode = 29 * _hashCode + (idDonatariaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.DonatariasPk: " );
		ret.append( "idDonataria=" + idDonataria );
		return ret.toString();
	}

}
