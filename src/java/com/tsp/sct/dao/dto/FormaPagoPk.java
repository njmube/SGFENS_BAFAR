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
 * This class represents the primary key of the forma_pago table.
 */
public class FormaPagoPk implements Serializable
{
	protected int idFormaPago;

	/** 
	 * This attribute represents whether the primitive attribute idFormaPago is null.
	 */
	protected boolean idFormaPagoNull;

	/** 
	 * Sets the value of idFormaPago
	 */
	public void setIdFormaPago(int idFormaPago)
	{
		this.idFormaPago = idFormaPago;
	}

	/** 
	 * Gets the value of idFormaPago
	 */
	public int getIdFormaPago()
	{
		return idFormaPago;
	}

	/**
	 * Method 'FormaPagoPk'
	 * 
	 */
	public FormaPagoPk()
	{
	}

	/**
	 * Method 'FormaPagoPk'
	 * 
	 * @param idFormaPago
	 */
	public FormaPagoPk(final int idFormaPago)
	{
		this.idFormaPago = idFormaPago;
	}

	/** 
	 * Sets the value of idFormaPagoNull
	 */
	public void setIdFormaPagoNull(boolean idFormaPagoNull)
	{
		this.idFormaPagoNull = idFormaPagoNull;
	}

	/** 
	 * Gets the value of idFormaPagoNull
	 */
	public boolean isIdFormaPagoNull()
	{
		return idFormaPagoNull;
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
		
		if (!(_other instanceof FormaPagoPk)) {
			return false;
		}
		
		final FormaPagoPk _cast = (FormaPagoPk) _other;
		if (idFormaPago != _cast.idFormaPago) {
			return false;
		}
		
		if (idFormaPagoNull != _cast.idFormaPagoNull) {
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
		_hashCode = 29 * _hashCode + idFormaPago;
		_hashCode = 29 * _hashCode + (idFormaPagoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.FormaPagoPk: " );
		ret.append( "idFormaPago=" + idFormaPago );
		return ret.toString();
	}

}
