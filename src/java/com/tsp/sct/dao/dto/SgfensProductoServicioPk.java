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
 * This class represents the primary key of the sgfens_producto_servicio table.
 */
public class SgfensProductoServicioPk implements Serializable
{
	protected int idProductoServicio;

	/** 
	 * This attribute represents whether the primitive attribute idProductoServicio is null.
	 */
	protected boolean idProductoServicioNull;

	/** 
	 * Sets the value of idProductoServicio
	 */
	public void setIdProductoServicio(int idProductoServicio)
	{
		this.idProductoServicio = idProductoServicio;
	}

	/** 
	 * Gets the value of idProductoServicio
	 */
	public int getIdProductoServicio()
	{
		return idProductoServicio;
	}

	/**
	 * Method 'SgfensProductoServicioPk'
	 * 
	 */
	public SgfensProductoServicioPk()
	{
	}

	/**
	 * Method 'SgfensProductoServicioPk'
	 * 
	 * @param idProductoServicio
	 */
	public SgfensProductoServicioPk(final int idProductoServicio)
	{
		this.idProductoServicio = idProductoServicio;
	}

	/** 
	 * Sets the value of idProductoServicioNull
	 */
	public void setIdProductoServicioNull(boolean idProductoServicioNull)
	{
		this.idProductoServicioNull = idProductoServicioNull;
	}

	/** 
	 * Gets the value of idProductoServicioNull
	 */
	public boolean isIdProductoServicioNull()
	{
		return idProductoServicioNull;
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
		
		if (!(_other instanceof SgfensProductoServicioPk)) {
			return false;
		}
		
		final SgfensProductoServicioPk _cast = (SgfensProductoServicioPk) _other;
		if (idProductoServicio != _cast.idProductoServicio) {
			return false;
		}
		
		if (idProductoServicioNull != _cast.idProductoServicioNull) {
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
		_hashCode = 29 * _hashCode + idProductoServicio;
		_hashCode = 29 * _hashCode + (idProductoServicioNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SgfensProductoServicioPk: " );
		ret.append( "idProductoServicio=" + idProductoServicio );
		return ret.toString();
	}

}
