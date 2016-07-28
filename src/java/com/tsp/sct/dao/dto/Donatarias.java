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

public class Donatarias implements Serializable
{
	/** 
	 * This attribute maps to the column ID_DONATARIA in the donatarias table.
	 */
	protected int idDonataria;

	/** 
	 * This attribute maps to the column NO_AUTORIZACION in the donatarias table.
	 */
	protected String noAutorizacion;

	/** 
	 * This attribute maps to the column FECHA_AUTORIZACION in the donatarias table.
	 */
	protected Date fechaAutorizacion;

	/** 
	 * This attribute maps to the column ID_COMPROBANTE_FISCAL in the donatarias table.
	 */
	protected int idComprobanteFiscal;

	/**
	 * Method 'Donatarias'
	 * 
	 */
	public Donatarias()
	{
	}

	/**
	 * Method 'getIdDonataria'
	 * 
	 * @return int
	 */
	public int getIdDonataria()
	{
		return idDonataria;
	}

	/**
	 * Method 'setIdDonataria'
	 * 
	 * @param idDonataria
	 */
	public void setIdDonataria(int idDonataria)
	{
		this.idDonataria = idDonataria;
	}

	/**
	 * Method 'getNoAutorizacion'
	 * 
	 * @return String
	 */
	public String getNoAutorizacion()
	{
		return noAutorizacion;
	}

	/**
	 * Method 'setNoAutorizacion'
	 * 
	 * @param noAutorizacion
	 */
	public void setNoAutorizacion(String noAutorizacion)
	{
		this.noAutorizacion = noAutorizacion;
	}

	/**
	 * Method 'getFechaAutorizacion'
	 * 
	 * @return Date
	 */
	public Date getFechaAutorizacion()
	{
		return fechaAutorizacion;
	}

	/**
	 * Method 'setFechaAutorizacion'
	 * 
	 * @param fechaAutorizacion
	 */
	public void setFechaAutorizacion(Date fechaAutorizacion)
	{
		this.fechaAutorizacion = fechaAutorizacion;
	}

	/**
	 * Method 'getIdComprobanteFiscal'
	 * 
	 * @return int
	 */
	public int getIdComprobanteFiscal()
	{
		return idComprobanteFiscal;
	}

	/**
	 * Method 'setIdComprobanteFiscal'
	 * 
	 * @param idComprobanteFiscal
	 */
	public void setIdComprobanteFiscal(int idComprobanteFiscal)
	{
		this.idComprobanteFiscal = idComprobanteFiscal;
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
		
		if (!(_other instanceof Donatarias)) {
			return false;
		}
		
		final Donatarias _cast = (Donatarias) _other;
		if (idDonataria != _cast.idDonataria) {
			return false;
		}
		
		if (noAutorizacion == null ? _cast.noAutorizacion != noAutorizacion : !noAutorizacion.equals( _cast.noAutorizacion )) {
			return false;
		}
		
		if (fechaAutorizacion == null ? _cast.fechaAutorizacion != fechaAutorizacion : !fechaAutorizacion.equals( _cast.fechaAutorizacion )) {
			return false;
		}
		
		if (idComprobanteFiscal != _cast.idComprobanteFiscal) {
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
		_hashCode = 29 * _hashCode + idDonataria;
		if (noAutorizacion != null) {
			_hashCode = 29 * _hashCode + noAutorizacion.hashCode();
		}
		
		if (fechaAutorizacion != null) {
			_hashCode = 29 * _hashCode + fechaAutorizacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + idComprobanteFiscal;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DonatariasPk
	 */
	public DonatariasPk createPk()
	{
		return new DonatariasPk(idDonataria);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Donatarias: " );
		ret.append( "idDonataria=" + idDonataria );
		ret.append( ", noAutorizacion=" + noAutorizacion );
		ret.append( ", fechaAutorizacion=" + fechaAutorizacion );
		ret.append( ", idComprobanteFiscal=" + idComprobanteFiscal );
		return ret.toString();
	}

}
