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
 * This class represents the primary key of the SGFENS_COTIZACION_IMPUESTO table.
 */
public class SgfensCotizacionImpuestoPk implements Serializable
{
	protected int idCotizacion;

	protected int idImpuesto;

	/** 
	 * This attribute represents whether the primitive attribute idCotizacion is null.
	 */
	protected boolean idCotizacionNull;

	/** 
	 * This attribute represents whether the primitive attribute idImpuesto is null.
	 */
	protected boolean idImpuestoNull;

	/** 
	 * Sets the value of idCotizacion
	 */
	public void setIdCotizacion(int idCotizacion)
	{
		this.idCotizacion = idCotizacion;
	}

	/** 
	 * Gets the value of idCotizacion
	 */
	public int getIdCotizacion()
	{
		return idCotizacion;
	}

	/** 
	 * Sets the value of idImpuesto
	 */
	public void setIdImpuesto(int idImpuesto)
	{
		this.idImpuesto = idImpuesto;
	}

	/** 
	 * Gets the value of idImpuesto
	 */
	public int getIdImpuesto()
	{
		return idImpuesto;
	}

	/**
	 * Method 'SgfensCotizacionImpuestoPk'
	 * 
	 */
	public SgfensCotizacionImpuestoPk()
	{
	}

	/**
	 * Method 'SgfensCotizacionImpuestoPk'
	 * 
	 * @param idCotizacion
	 * @param idImpuesto
	 */
	public SgfensCotizacionImpuestoPk(final int idCotizacion, final int idImpuesto)
	{
		this.idCotizacion = idCotizacion;
		this.idImpuesto = idImpuesto;
	}

	/** 
	 * Sets the value of idCotizacionNull
	 */
	public void setIdCotizacionNull(boolean idCotizacionNull)
	{
		this.idCotizacionNull = idCotizacionNull;
	}

	/** 
	 * Gets the value of idCotizacionNull
	 */
	public boolean isIdCotizacionNull()
	{
		return idCotizacionNull;
	}

	/** 
	 * Sets the value of idImpuestoNull
	 */
	public void setIdImpuestoNull(boolean idImpuestoNull)
	{
		this.idImpuestoNull = idImpuestoNull;
	}

	/** 
	 * Gets the value of idImpuestoNull
	 */
	public boolean isIdImpuestoNull()
	{
		return idImpuestoNull;
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
		
		if (!(_other instanceof SgfensCotizacionImpuestoPk)) {
			return false;
		}
		
		final SgfensCotizacionImpuestoPk _cast = (SgfensCotizacionImpuestoPk) _other;
		if (idCotizacion != _cast.idCotizacion) {
			return false;
		}
		
		if (idImpuesto != _cast.idImpuesto) {
			return false;
		}
		
		if (idCotizacionNull != _cast.idCotizacionNull) {
			return false;
		}
		
		if (idImpuestoNull != _cast.idImpuestoNull) {
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
		_hashCode = 29 * _hashCode + idCotizacion;
		_hashCode = 29 * _hashCode + idImpuesto;
		_hashCode = 29 * _hashCode + (idCotizacionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idImpuestoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SgfensCotizacionImpuestoPk: " );
		ret.append( "idCotizacion=" + idCotizacion );
		ret.append( ", idImpuesto=" + idImpuesto );
		return ret.toString();
	}

}
