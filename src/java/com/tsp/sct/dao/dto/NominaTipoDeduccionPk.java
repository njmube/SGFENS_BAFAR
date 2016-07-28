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
 * This class represents the primary key of the nomina_tipo_deduccion table.
 */
public class NominaTipoDeduccionPk implements Serializable
{
	protected int idTipoDeduccion;

	/** 
	 * This attribute represents whether the primitive attribute idTipoDeduccion is null.
	 */
	protected boolean idTipoDeduccionNull;

	/** 
	 * Sets the value of idTipoDeduccion
	 */
	public void setIdTipoDeduccion(int idTipoDeduccion)
	{
		this.idTipoDeduccion = idTipoDeduccion;
	}

	/** 
	 * Gets the value of idTipoDeduccion
	 */
	public int getIdTipoDeduccion()
	{
		return idTipoDeduccion;
	}

	/**
	 * Method 'NominaTipoDeduccionPk'
	 * 
	 */
	public NominaTipoDeduccionPk()
	{
	}

	/**
	 * Method 'NominaTipoDeduccionPk'
	 * 
	 * @param idTipoDeduccion
	 */
	public NominaTipoDeduccionPk(final int idTipoDeduccion)
	{
		this.idTipoDeduccion = idTipoDeduccion;
	}

	/** 
	 * Sets the value of idTipoDeduccionNull
	 */
	public void setIdTipoDeduccionNull(boolean idTipoDeduccionNull)
	{
		this.idTipoDeduccionNull = idTipoDeduccionNull;
	}

	/** 
	 * Gets the value of idTipoDeduccionNull
	 */
	public boolean isIdTipoDeduccionNull()
	{
		return idTipoDeduccionNull;
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
		
		if (!(_other instanceof NominaTipoDeduccionPk)) {
			return false;
		}
		
		final NominaTipoDeduccionPk _cast = (NominaTipoDeduccionPk) _other;
		if (idTipoDeduccion != _cast.idTipoDeduccion) {
			return false;
		}
		
		if (idTipoDeduccionNull != _cast.idTipoDeduccionNull) {
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
		_hashCode = 29 * _hashCode + idTipoDeduccion;
		_hashCode = 29 * _hashCode + (idTipoDeduccionNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaTipoDeduccionPk: " );
		ret.append( "idTipoDeduccion=" + idTipoDeduccion );
		return ret.toString();
	}

}
