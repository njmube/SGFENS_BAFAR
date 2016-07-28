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
 * This class represents the primary key of the tipo_pago table.
 */
public class TipoPagoPk implements Serializable
{
	protected int idTipoPago;

	/** 
	 * This attribute represents whether the primitive attribute idTipoPago is null.
	 */
	protected boolean idTipoPagoNull;

	/** 
	 * Sets the value of idTipoPago
	 */
	public void setIdTipoPago(int idTipoPago)
	{
		this.idTipoPago = idTipoPago;
	}

	/** 
	 * Gets the value of idTipoPago
	 */
	public int getIdTipoPago()
	{
		return idTipoPago;
	}

	/**
	 * Method 'TipoPagoPk'
	 * 
	 */
	public TipoPagoPk()
	{
	}

	/**
	 * Method 'TipoPagoPk'
	 * 
	 * @param idTipoPago
	 */
	public TipoPagoPk(final int idTipoPago)
	{
		this.idTipoPago = idTipoPago;
	}

	/** 
	 * Sets the value of idTipoPagoNull
	 */
	public void setIdTipoPagoNull(boolean idTipoPagoNull)
	{
		this.idTipoPagoNull = idTipoPagoNull;
	}

	/** 
	 * Gets the value of idTipoPagoNull
	 */
	public boolean isIdTipoPagoNull()
	{
		return idTipoPagoNull;
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
		
		if (!(_other instanceof TipoPagoPk)) {
			return false;
		}
		
		final TipoPagoPk _cast = (TipoPagoPk) _other;
		if (idTipoPago != _cast.idTipoPago) {
			return false;
		}
		
		if (idTipoPagoNull != _cast.idTipoPagoNull) {
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
		_hashCode = 29 * _hashCode + idTipoPago;
		_hashCode = 29 * _hashCode + (idTipoPagoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.TipoPagoPk: " );
		ret.append( "idTipoPago=" + idTipoPago );
		return ret.toString();
	}

}
