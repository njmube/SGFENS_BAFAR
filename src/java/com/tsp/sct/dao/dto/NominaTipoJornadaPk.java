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
 * This class represents the primary key of the nomina_tipo_jornada table.
 */
public class NominaTipoJornadaPk implements Serializable
{
	protected int idTipoJornada;

	/** 
	 * This attribute represents whether the primitive attribute idTipoJornada is null.
	 */
	protected boolean idTipoJornadaNull;

	/** 
	 * Sets the value of idTipoJornada
	 */
	public void setIdTipoJornada(int idTipoJornada)
	{
		this.idTipoJornada = idTipoJornada;
	}

	/** 
	 * Gets the value of idTipoJornada
	 */
	public int getIdTipoJornada()
	{
		return idTipoJornada;
	}

	/**
	 * Method 'NominaTipoJornadaPk'
	 * 
	 */
	public NominaTipoJornadaPk()
	{
	}

	/**
	 * Method 'NominaTipoJornadaPk'
	 * 
	 * @param idTipoJornada
	 */
	public NominaTipoJornadaPk(final int idTipoJornada)
	{
		this.idTipoJornada = idTipoJornada;
	}

	/** 
	 * Sets the value of idTipoJornadaNull
	 */
	public void setIdTipoJornadaNull(boolean idTipoJornadaNull)
	{
		this.idTipoJornadaNull = idTipoJornadaNull;
	}

	/** 
	 * Gets the value of idTipoJornadaNull
	 */
	public boolean isIdTipoJornadaNull()
	{
		return idTipoJornadaNull;
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
		
		if (!(_other instanceof NominaTipoJornadaPk)) {
			return false;
		}
		
		final NominaTipoJornadaPk _cast = (NominaTipoJornadaPk) _other;
		if (idTipoJornada != _cast.idTipoJornada) {
			return false;
		}
		
		if (idTipoJornadaNull != _cast.idTipoJornadaNull) {
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
		_hashCode = 29 * _hashCode + idTipoJornada;
		_hashCode = 29 * _hashCode + (idTipoJornadaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaTipoJornadaPk: " );
		ret.append( "idTipoJornada=" + idTipoJornada );
		return ret.toString();
	}

}
