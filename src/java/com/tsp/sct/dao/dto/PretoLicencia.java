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

public class PretoLicencia implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PRETO_LICENCIA in the preto_licencia table.
	 */
	protected int idPretoLicencia;

	/** 
	 * This attribute represents whether the attribute idPretoLicencia has been modified since being read from the database.
	 */
	protected boolean idPretoLicenciaModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_LICENCIA in the preto_licencia table.
	 */
	protected String nombreLicencia;

	/** 
	 * This attribute represents whether the attribute nombreLicencia has been modified since being read from the database.
	 */
	protected boolean nombreLicenciaModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION_LICENCIA in the preto_licencia table.
	 */
	protected String descripcionLicencia;

	/** 
	 * This attribute represents whether the attribute descripcionLicencia has been modified since being read from the database.
	 */
	protected boolean descripcionLicenciaModified = false;

	/**
	 * Method 'PretoLicencia'
	 * 
	 */
	public PretoLicencia()
	{
	}

	/**
	 * Method 'getIdPretoLicencia'
	 * 
	 * @return int
	 */
	public int getIdPretoLicencia()
	{
		return idPretoLicencia;
	}

	/**
	 * Method 'setIdPretoLicencia'
	 * 
	 * @param idPretoLicencia
	 */
	public void setIdPretoLicencia(int idPretoLicencia)
	{
		this.idPretoLicencia = idPretoLicencia;
		this.idPretoLicenciaModified = true;
	}

	/** 
	 * Sets the value of idPretoLicenciaModified
	 */
	public void setIdPretoLicenciaModified(boolean idPretoLicenciaModified)
	{
		this.idPretoLicenciaModified = idPretoLicenciaModified;
	}

	/** 
	 * Gets the value of idPretoLicenciaModified
	 */
	public boolean isIdPretoLicenciaModified()
	{
		return idPretoLicenciaModified;
	}

	/**
	 * Method 'getNombreLicencia'
	 * 
	 * @return String
	 */
	public String getNombreLicencia()
	{
		return nombreLicencia;
	}

	/**
	 * Method 'setNombreLicencia'
	 * 
	 * @param nombreLicencia
	 */
	public void setNombreLicencia(String nombreLicencia)
	{
		this.nombreLicencia = nombreLicencia;
		this.nombreLicenciaModified = true;
	}

	/** 
	 * Sets the value of nombreLicenciaModified
	 */
	public void setNombreLicenciaModified(boolean nombreLicenciaModified)
	{
		this.nombreLicenciaModified = nombreLicenciaModified;
	}

	/** 
	 * Gets the value of nombreLicenciaModified
	 */
	public boolean isNombreLicenciaModified()
	{
		return nombreLicenciaModified;
	}

	/**
	 * Method 'getDescripcionLicencia'
	 * 
	 * @return String
	 */
	public String getDescripcionLicencia()
	{
		return descripcionLicencia;
	}

	/**
	 * Method 'setDescripcionLicencia'
	 * 
	 * @param descripcionLicencia
	 */
	public void setDescripcionLicencia(String descripcionLicencia)
	{
		this.descripcionLicencia = descripcionLicencia;
		this.descripcionLicenciaModified = true;
	}

	/** 
	 * Sets the value of descripcionLicenciaModified
	 */
	public void setDescripcionLicenciaModified(boolean descripcionLicenciaModified)
	{
		this.descripcionLicenciaModified = descripcionLicenciaModified;
	}

	/** 
	 * Gets the value of descripcionLicenciaModified
	 */
	public boolean isDescripcionLicenciaModified()
	{
		return descripcionLicenciaModified;
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
		
		if (!(_other instanceof PretoLicencia)) {
			return false;
		}
		
		final PretoLicencia _cast = (PretoLicencia) _other;
		if (idPretoLicencia != _cast.idPretoLicencia) {
			return false;
		}
		
		if (idPretoLicenciaModified != _cast.idPretoLicenciaModified) {
			return false;
		}
		
		if (nombreLicencia == null ? _cast.nombreLicencia != nombreLicencia : !nombreLicencia.equals( _cast.nombreLicencia )) {
			return false;
		}
		
		if (nombreLicenciaModified != _cast.nombreLicenciaModified) {
			return false;
		}
		
		if (descripcionLicencia == null ? _cast.descripcionLicencia != descripcionLicencia : !descripcionLicencia.equals( _cast.descripcionLicencia )) {
			return false;
		}
		
		if (descripcionLicenciaModified != _cast.descripcionLicenciaModified) {
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
		_hashCode = 29 * _hashCode + idPretoLicencia;
		_hashCode = 29 * _hashCode + (idPretoLicenciaModified ? 1 : 0);
		if (nombreLicencia != null) {
			_hashCode = 29 * _hashCode + nombreLicencia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreLicenciaModified ? 1 : 0);
		if (descripcionLicencia != null) {
			_hashCode = 29 * _hashCode + descripcionLicencia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionLicenciaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PretoLicenciaPk
	 */
	public PretoLicenciaPk createPk()
	{
		return new PretoLicenciaPk(idPretoLicencia);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.PretoLicencia: " );
		ret.append( "idPretoLicencia=" + idPretoLicencia );
		ret.append( ", nombreLicencia=" + nombreLicencia );
		ret.append( ", descripcionLicencia=" + descripcionLicencia );
		return ret.toString();
	}

}
