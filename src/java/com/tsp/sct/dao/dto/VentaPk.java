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
 * This class represents the primary key of the VENTA table.
 */
public class VentaPk implements Serializable
{
	protected int idVenta;

	/** 
	 * This attribute represents whether the primitive attribute idVenta is null.
	 */
	protected boolean idVentaNull;

	/** 
	 * Sets the value of idVenta
	 */
	public void setIdVenta(int idVenta)
	{
		this.idVenta = idVenta;
	}

	/** 
	 * Gets the value of idVenta
	 */
	public int getIdVenta()
	{
		return idVenta;
	}

	/**
	 * Method 'VentaPk'
	 * 
	 */
	public VentaPk()
	{
	}

	/**
	 * Method 'VentaPk'
	 * 
	 * @param idVenta
	 */
	public VentaPk(final int idVenta)
	{
		this.idVenta = idVenta;
	}

	/** 
	 * Sets the value of idVentaNull
	 */
	public void setIdVentaNull(boolean idVentaNull)
	{
		this.idVentaNull = idVentaNull;
	}

	/** 
	 * Gets the value of idVentaNull
	 */
	public boolean isIdVentaNull()
	{
		return idVentaNull;
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
		
		if (!(_other instanceof VentaPk)) {
			return false;
		}
		
		final VentaPk _cast = (VentaPk) _other;
		if (idVenta != _cast.idVenta) {
			return false;
		}
		
		if (idVentaNull != _cast.idVentaNull) {
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
		_hashCode = 29 * _hashCode + idVenta;
		_hashCode = 29 * _hashCode + (idVentaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.VentaPk: " );
		ret.append( "idVenta=" + idVenta );
		return ret.toString();
	}

}
