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

public class EstatusComprobante implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ESTATUS_COMPROBANTE in the estatus_comprobante table.
	 */
	protected int idEstatusComprobante;

	/** 
	 * This attribute maps to the column NOMBRE in the estatus_comprobante table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column DESCRIPCION in the estatus_comprobante table.
	 */
	protected String descripcion;

	/**
	 * Method 'EstatusComprobante'
	 * 
	 */
	public EstatusComprobante()
	{
	}

	/**
	 * Method 'getIdEstatusComprobante'
	 * 
	 * @return int
	 */
	public int getIdEstatusComprobante()
	{
		return idEstatusComprobante;
	}

	/**
	 * Method 'setIdEstatusComprobante'
	 * 
	 * @param idEstatusComprobante
	 */
	public void setIdEstatusComprobante(int idEstatusComprobante)
	{
		this.idEstatusComprobante = idEstatusComprobante;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
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
		
		if (!(_other instanceof EstatusComprobante)) {
			return false;
		}
		
		final EstatusComprobante _cast = (EstatusComprobante) _other;
		if (idEstatusComprobante != _cast.idEstatusComprobante) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
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
		_hashCode = 29 * _hashCode + idEstatusComprobante;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EstatusComprobantePk
	 */
	public EstatusComprobantePk createPk()
	{
		return new EstatusComprobantePk(idEstatusComprobante);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.EstatusComprobante: " );
		ret.append( "idEstatusComprobante=" + idEstatusComprobante );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
