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

public class ZonaHoraria implements Serializable
{
	/** 
	 * This attribute maps to the column ID_EMPRESA in the zona_horaria table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ZONA_HORARIA_CATALOGO in the zona_horaria table.
	 */
	protected int idZonaHorariaCatalogo;

	/** 
	 * This attribute represents whether the attribute idZonaHorariaCatalogo has been modified since being read from the database.
	 */
	protected boolean idZonaHorariaCatalogoModified = false;

	/** 
	 * This attribute maps to the column FECHA in the zona_horaria table.
	 */
	protected Date fecha;

	/** 
	 * This attribute represents whether the attribute fecha has been modified since being read from the database.
	 */
	protected boolean fechaModified = false;

	/**
	 * Method 'ZonaHoraria'
	 * 
	 */
	public ZonaHoraria()
	{
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
	}

	/**
	 * Method 'getIdZonaHorariaCatalogo'
	 * 
	 * @return int
	 */
	public int getIdZonaHorariaCatalogo()
	{
		return idZonaHorariaCatalogo;
	}

	/**
	 * Method 'setIdZonaHorariaCatalogo'
	 * 
	 * @param idZonaHorariaCatalogo
	 */
	public void setIdZonaHorariaCatalogo(int idZonaHorariaCatalogo)
	{
		this.idZonaHorariaCatalogo = idZonaHorariaCatalogo;
		this.idZonaHorariaCatalogoModified = true;
	}

	/** 
	 * Sets the value of idZonaHorariaCatalogoModified
	 */
	public void setIdZonaHorariaCatalogoModified(boolean idZonaHorariaCatalogoModified)
	{
		this.idZonaHorariaCatalogoModified = idZonaHorariaCatalogoModified;
	}

	/** 
	 * Gets the value of idZonaHorariaCatalogoModified
	 */
	public boolean isIdZonaHorariaCatalogoModified()
	{
		return idZonaHorariaCatalogoModified;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
		this.fechaModified = true;
	}

	/** 
	 * Sets the value of fechaModified
	 */
	public void setFechaModified(boolean fechaModified)
	{
		this.fechaModified = fechaModified;
	}

	/** 
	 * Gets the value of fechaModified
	 */
	public boolean isFechaModified()
	{
		return fechaModified;
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
		
		if (!(_other instanceof ZonaHoraria)) {
			return false;
		}
		
		final ZonaHoraria _cast = (ZonaHoraria) _other;
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idZonaHorariaCatalogo != _cast.idZonaHorariaCatalogo) {
			return false;
		}
		
		if (idZonaHorariaCatalogoModified != _cast.idZonaHorariaCatalogoModified) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (fechaModified != _cast.fechaModified) {
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
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idZonaHorariaCatalogo;
		_hashCode = 29 * _hashCode + (idZonaHorariaCatalogoModified ? 1 : 0);
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ZonaHorariaPk
	 */
	public ZonaHorariaPk createPk()
	{
		return new ZonaHorariaPk(idEmpresa);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ZonaHoraria: " );
		ret.append( "idEmpresa=" + idEmpresa );
		ret.append( ", idZonaHorariaCatalogo=" + idZonaHorariaCatalogo );
		ret.append( ", fecha=" + fecha );
		return ret.toString();
	}

}
