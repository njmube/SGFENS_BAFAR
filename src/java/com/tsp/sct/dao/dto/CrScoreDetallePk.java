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
 * This class represents the primary key of the cr_score_detalle table.
 */
public class CrScoreDetallePk implements Serializable
{
	protected int idScoreDetalle;

	/** 
	 * This attribute represents whether the primitive attribute idScoreDetalle is null.
	 */
	protected boolean idScoreDetalleNull;

	/** 
	 * Sets the value of idScoreDetalle
	 */
	public void setIdScoreDetalle(int idScoreDetalle)
	{
		this.idScoreDetalle = idScoreDetalle;
	}

	/** 
	 * Gets the value of idScoreDetalle
	 */
	public int getIdScoreDetalle()
	{
		return idScoreDetalle;
	}

	/**
	 * Method 'CrScoreDetallePk'
	 * 
	 */
	public CrScoreDetallePk()
	{
	}

	/**
	 * Method 'CrScoreDetallePk'
	 * 
	 * @param idScoreDetalle
	 */
	public CrScoreDetallePk(final int idScoreDetalle)
	{
		this.idScoreDetalle = idScoreDetalle;
	}

	/** 
	 * Sets the value of idScoreDetalleNull
	 */
	public void setIdScoreDetalleNull(boolean idScoreDetalleNull)
	{
		this.idScoreDetalleNull = idScoreDetalleNull;
	}

	/** 
	 * Gets the value of idScoreDetalleNull
	 */
	public boolean isIdScoreDetalleNull()
	{
		return idScoreDetalleNull;
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
		
		if (!(_other instanceof CrScoreDetallePk)) {
			return false;
		}
		
		final CrScoreDetallePk _cast = (CrScoreDetallePk) _other;
		if (idScoreDetalle != _cast.idScoreDetalle) {
			return false;
		}
		
		if (idScoreDetalleNull != _cast.idScoreDetalleNull) {
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
		_hashCode = 29 * _hashCode + idScoreDetalle;
		_hashCode = 29 * _hashCode + (idScoreDetalleNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrScoreDetallePk: " );
		ret.append( "idScoreDetalle=" + idScoreDetalle );
		return ret.toString();
	}

}
