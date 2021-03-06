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
 * This class represents the primary key of the sms_dispositivo_movil table.
 */
public class SmsDispositivoMovilPk implements Serializable
{
	protected int idSmsDispositivoMovil;

	/** 
	 * This attribute represents whether the primitive attribute idSmsDispositivoMovil is null.
	 */
	protected boolean idSmsDispositivoMovilNull;

	/** 
	 * Sets the value of idSmsDispositivoMovil
	 */
	public void setIdSmsDispositivoMovil(int idSmsDispositivoMovil)
	{
		this.idSmsDispositivoMovil = idSmsDispositivoMovil;
	}

	/** 
	 * Gets the value of idSmsDispositivoMovil
	 */
	public int getIdSmsDispositivoMovil()
	{
		return idSmsDispositivoMovil;
	}

	/**
	 * Method 'SmsDispositivoMovilPk'
	 * 
	 */
	public SmsDispositivoMovilPk()
	{
	}

	/**
	 * Method 'SmsDispositivoMovilPk'
	 * 
	 * @param idSmsDispositivoMovil
	 */
	public SmsDispositivoMovilPk(final int idSmsDispositivoMovil)
	{
		this.idSmsDispositivoMovil = idSmsDispositivoMovil;
	}

	/** 
	 * Sets the value of idSmsDispositivoMovilNull
	 */
	public void setIdSmsDispositivoMovilNull(boolean idSmsDispositivoMovilNull)
	{
		this.idSmsDispositivoMovilNull = idSmsDispositivoMovilNull;
	}

	/** 
	 * Gets the value of idSmsDispositivoMovilNull
	 */
	public boolean isIdSmsDispositivoMovilNull()
	{
		return idSmsDispositivoMovilNull;
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
		
		if (!(_other instanceof SmsDispositivoMovilPk)) {
			return false;
		}
		
		final SmsDispositivoMovilPk _cast = (SmsDispositivoMovilPk) _other;
		if (idSmsDispositivoMovil != _cast.idSmsDispositivoMovil) {
			return false;
		}
		
		if (idSmsDispositivoMovilNull != _cast.idSmsDispositivoMovilNull) {
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
		_hashCode = 29 * _hashCode + idSmsDispositivoMovil;
		_hashCode = 29 * _hashCode + (idSmsDispositivoMovilNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SmsDispositivoMovilPk: " );
		ret.append( "idSmsDispositivoMovil=" + idSmsDispositivoMovil );
		return ret.toString();
	}

}
