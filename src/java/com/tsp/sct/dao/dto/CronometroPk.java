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
 * This class represents the primary key of the cronometro table.
 */
public class CronometroPk implements Serializable
{
	protected int idCronometro;

	/** 
	 * This attribute represents whether the primitive attribute idCronometro is null.
	 */
	protected boolean idCronometroNull;

	/** 
	 * Sets the value of idCronometro
	 */
	public void setIdCronometro(int idCronometro)
	{
		this.idCronometro = idCronometro;
	}

	/** 
	 * Gets the value of idCronometro
	 */
	public int getIdCronometro()
	{
		return idCronometro;
	}

	/**
	 * Method 'CronometroPk'
	 * 
	 */
	public CronometroPk()
	{
	}

	/**
	 * Method 'CronometroPk'
	 * 
	 * @param idCronometro
	 */
	public CronometroPk(final int idCronometro)
	{
		this.idCronometro = idCronometro;
	}

	/** 
	 * Sets the value of idCronometroNull
	 */
	public void setIdCronometroNull(boolean idCronometroNull)
	{
		this.idCronometroNull = idCronometroNull;
	}

	/** 
	 * Gets the value of idCronometroNull
	 */
	public boolean isIdCronometroNull()
	{
		return idCronometroNull;
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
		
		if (!(_other instanceof CronometroPk)) {
			return false;
		}
		
		final CronometroPk _cast = (CronometroPk) _other;
		if (idCronometro != _cast.idCronometro) {
			return false;
		}
		
		if (idCronometroNull != _cast.idCronometroNull) {
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
		_hashCode = 29 * _hashCode + idCronometro;
		_hashCode = 29 * _hashCode + (idCronometroNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CronometroPk: " );
		ret.append( "idCronometro=" + idCronometro );
		return ret.toString();
	}

}
