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
 * This class represents the primary key of the geocercas_notificaciones table.
 */
public class GeocercasNotificacionesPk implements Serializable
{
	protected int idGeoNotificacion;

	/** 
	 * This attribute represents whether the primitive attribute idGeoNotificacion is null.
	 */
	protected boolean idGeoNotificacionNull;

	/** 
	 * Sets the value of idGeoNotificacion
	 */
	public void setIdGeoNotificacion(int idGeoNotificacion)
	{
		this.idGeoNotificacion = idGeoNotificacion;
	}

	/** 
	 * Gets the value of idGeoNotificacion
	 */
	public int getIdGeoNotificacion()
	{
		return idGeoNotificacion;
	}

	/**
	 * Method 'GeocercasNotificacionesPk'
	 * 
	 */
	public GeocercasNotificacionesPk()
	{
	}

	/**
	 * Method 'GeocercasNotificacionesPk'
	 * 
	 * @param idGeoNotificacion
	 */
	public GeocercasNotificacionesPk(final int idGeoNotificacion)
	{
		this.idGeoNotificacion = idGeoNotificacion;
	}

	/** 
	 * Sets the value of idGeoNotificacionNull
	 */
	public void setIdGeoNotificacionNull(boolean idGeoNotificacionNull)
	{
		this.idGeoNotificacionNull = idGeoNotificacionNull;
	}

	/** 
	 * Gets the value of idGeoNotificacionNull
	 */
	public boolean isIdGeoNotificacionNull()
	{
		return idGeoNotificacionNull;
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
		
		if (!(_other instanceof GeocercasNotificacionesPk)) {
			return false;
		}
		
		final GeocercasNotificacionesPk _cast = (GeocercasNotificacionesPk) _other;
		if (idGeoNotificacion != _cast.idGeoNotificacion) {
			return false;
		}
		
		if (idGeoNotificacionNull != _cast.idGeoNotificacionNull) {
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
		_hashCode = 29 * _hashCode + idGeoNotificacion;
		_hashCode = 29 * _hashCode + (idGeoNotificacionNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.GeocercasNotificacionesPk: " );
		ret.append( "idGeoNotificacion=" + idGeoNotificacion );
		return ret.toString();
	}

}
