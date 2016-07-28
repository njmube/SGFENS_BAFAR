/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class TipoUnidad implements Serializable
{
	/** 
	 * This attribute maps to the column ID_TIPO_UNIDAD in the tipo_unidad table.
	 */
	protected int idTipoUnidad;

	/** 
	 * This attribute maps to the column DESC_TIPO_UNIDAD in the tipo_unidad table.
	 */
	protected String descTipoUnidad;

	/**
	 * Method 'TipoUnidad'
	 * 
	 */
	public TipoUnidad()
	{
	}

	/**
	 * Method 'getIdTipoUnidad'
	 * 
	 * @return int
	 */
	public int getIdTipoUnidad()
	{
		return idTipoUnidad;
	}

	/**
	 * Method 'setIdTipoUnidad'
	 * 
	 * @param idTipoUnidad
	 */
	public void setIdTipoUnidad(int idTipoUnidad)
	{
		this.idTipoUnidad = idTipoUnidad;
	}

	/**
	 * Method 'getDescTipoUnidad'
	 * 
	 * @return String
	 */
	public String getDescTipoUnidad()
	{
		return descTipoUnidad;
	}

	/**
	 * Method 'setDescTipoUnidad'
	 * 
	 * @param descTipoUnidad
	 */
	public void setDescTipoUnidad(String descTipoUnidad)
	{
		this.descTipoUnidad = descTipoUnidad;
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
		
		if (!(_other instanceof TipoUnidad)) {
			return false;
		}
		
		final TipoUnidad _cast = (TipoUnidad) _other;
		if (idTipoUnidad != _cast.idTipoUnidad) {
			return false;
		}
		
		if (descTipoUnidad == null ? _cast.descTipoUnidad != descTipoUnidad : !descTipoUnidad.equals( _cast.descTipoUnidad )) {
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
		_hashCode = 29 * _hashCode + idTipoUnidad;
		if (descTipoUnidad != null) {
			_hashCode = 29 * _hashCode + descTipoUnidad.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoUnidadPk
	 */
	public TipoUnidadPk createPk()
	{
		return new TipoUnidadPk(idTipoUnidad);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.TipoUnidad: " );
		ret.append( "idTipoUnidad=" + idTipoUnidad );
		ret.append( ", descTipoUnidad=" + descTipoUnidad );
		return ret.toString();
	}

}
