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
import java.util.Date;

public class Pais implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PAIS in the pais table.
	 */
	protected long idPais;

	/** 
	 * This attribute maps to the column ID_CLAVE in the pais table.
	 */
	protected int idClave;

	/** 
	 * This attribute maps to the column PAIS_DESCRIPCION in the pais table.
	 */
	protected String paisDescripcion;

	/** 
	 * This attribute maps to the column ACTIVO in the pais table.
	 */
	protected int activo;

	/** 
	 * This attribute represents whether the primitive attribute activo is null.
	 */
	protected boolean activoNull = true;

	/** 
	 * This attribute maps to the column FECHA_DESACTIVACION in the pais table.
	 */
	protected Date fechaDesactivacion;

	/**
	 * Method 'Pais'
	 * 
	 */
	public Pais()
	{
	}

	/**
	 * Method 'getIdPais'
	 * 
	 * @return long
	 */
	public long getIdPais()
	{
		return idPais;
	}

	/**
	 * Method 'setIdPais'
	 * 
	 * @param idPais
	 */
	public void setIdPais(long idPais)
	{
		this.idPais = idPais;
	}

	/**
	 * Method 'getIdClave'
	 * 
	 * @return int
	 */
	public int getIdClave()
	{
		return idClave;
	}

	/**
	 * Method 'setIdClave'
	 * 
	 * @param idClave
	 */
	public void setIdClave(int idClave)
	{
		this.idClave = idClave;
	}

	/**
	 * Method 'getPaisDescripcion'
	 * 
	 * @return String
	 */
	public String getPaisDescripcion()
	{
		return paisDescripcion;
	}

	/**
	 * Method 'setPaisDescripcion'
	 * 
	 * @param paisDescripcion
	 */
	public void setPaisDescripcion(String paisDescripcion)
	{
		this.paisDescripcion = paisDescripcion;
	}

	/**
	 * Method 'getActivo'
	 * 
	 * @return int
	 */
	public int getActivo()
	{
		return activo;
	}

	/**
	 * Method 'setActivo'
	 * 
	 * @param activo
	 */
	public void setActivo(int activo)
	{
		this.activo = activo;
		this.activoNull = false;
	}

	/**
	 * Method 'setActivoNull'
	 * 
	 * @param value
	 */
	public void setActivoNull(boolean value)
	{
		this.activoNull = value;
	}

	/**
	 * Method 'isActivoNull'
	 * 
	 * @return boolean
	 */
	public boolean isActivoNull()
	{
		return activoNull;
	}

	/**
	 * Method 'getFechaDesactivacion'
	 * 
	 * @return Date
	 */
	public Date getFechaDesactivacion()
	{
		return fechaDesactivacion;
	}

	/**
	 * Method 'setFechaDesactivacion'
	 * 
	 * @param fechaDesactivacion
	 */
	public void setFechaDesactivacion(Date fechaDesactivacion)
	{
		this.fechaDesactivacion = fechaDesactivacion;
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
		
		if (!(_other instanceof Pais)) {
			return false;
		}
		
		final Pais _cast = (Pais) _other;
		if (idPais != _cast.idPais) {
			return false;
		}
		
		if (idClave != _cast.idClave) {
			return false;
		}
		
		if (paisDescripcion == null ? _cast.paisDescripcion != paisDescripcion : !paisDescripcion.equals( _cast.paisDescripcion )) {
			return false;
		}
		
		if (activo != _cast.activo) {
			return false;
		}
		
		if (activoNull != _cast.activoNull) {
			return false;
		}
		
		if (fechaDesactivacion == null ? _cast.fechaDesactivacion != fechaDesactivacion : !fechaDesactivacion.equals( _cast.fechaDesactivacion )) {
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
		_hashCode = 29 * _hashCode + (int) (idPais ^ (idPais >>> 32));
		_hashCode = 29 * _hashCode + idClave;
		if (paisDescripcion != null) {
			_hashCode = 29 * _hashCode + paisDescripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + activo;
		_hashCode = 29 * _hashCode + (activoNull ? 1 : 0);
		if (fechaDesactivacion != null) {
			_hashCode = 29 * _hashCode + fechaDesactivacion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PaisPk
	 */
	public PaisPk createPk()
	{
		return new PaisPk(idPais);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Pais: " );
		ret.append( "idPais=" + idPais );
		ret.append( ", idClave=" + idClave );
		ret.append( ", paisDescripcion=" + paisDescripcion );
		ret.append( ", activo=" + activo );
		ret.append( ", fechaDesactivacion=" + fechaDesactivacion );
		return ret.toString();
	}

}
