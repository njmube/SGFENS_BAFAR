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

public class RelDemopruebas implements Serializable
{
	/** 
	 * This attribute maps to the column ID_USUARIO_DEMO in the rel_demopruebas table.
	 */
	protected int idUsuarioDemo;

	/** 
	 * This attribute represents whether the primitive attribute idUsuarioDemo is null.
	 */
	protected boolean idUsuarioDemoNull = true;

	/** 
	 * This attribute represents whether the attribute idUsuarioDemo has been modified since being read from the database.
	 */
	protected boolean idUsuarioDemoModified = false;

	/** 
	 * This attribute maps to the column ID_USUARIO_PRUEBAS in the rel_demopruebas table.
	 */
	protected int idUsuarioPruebas;

	/** 
	 * This attribute represents whether the primitive attribute idUsuarioPruebas is null.
	 */
	protected boolean idUsuarioPruebasNull = true;

	/** 
	 * This attribute represents whether the attribute idUsuarioPruebas has been modified since being read from the database.
	 */
	protected boolean idUsuarioPruebasModified = false;

	/**
	 * Method 'RelDemopruebas'
	 * 
	 */
	public RelDemopruebas()
	{
	}

	/**
	 * Method 'getIdUsuarioDemo'
	 * 
	 * @return int
	 */
	public int getIdUsuarioDemo()
	{
		return idUsuarioDemo;
	}

	/**
	 * Method 'setIdUsuarioDemo'
	 * 
	 * @param idUsuarioDemo
	 */
	public void setIdUsuarioDemo(int idUsuarioDemo)
	{
		this.idUsuarioDemo = idUsuarioDemo;
		this.idUsuarioDemoNull = false;
		this.idUsuarioDemoModified = true;
	}

	/**
	 * Method 'setIdUsuarioDemoNull'
	 * 
	 * @param value
	 */
	public void setIdUsuarioDemoNull(boolean value)
	{
		this.idUsuarioDemoNull = value;
		this.idUsuarioDemoModified = true;
	}

	/**
	 * Method 'isIdUsuarioDemoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUsuarioDemoNull()
	{
		return idUsuarioDemoNull;
	}

	/** 
	 * Sets the value of idUsuarioDemoModified
	 */
	public void setIdUsuarioDemoModified(boolean idUsuarioDemoModified)
	{
		this.idUsuarioDemoModified = idUsuarioDemoModified;
	}

	/** 
	 * Gets the value of idUsuarioDemoModified
	 */
	public boolean isIdUsuarioDemoModified()
	{
		return idUsuarioDemoModified;
	}

	/**
	 * Method 'getIdUsuarioPruebas'
	 * 
	 * @return int
	 */
	public int getIdUsuarioPruebas()
	{
		return idUsuarioPruebas;
	}

	/**
	 * Method 'setIdUsuarioPruebas'
	 * 
	 * @param idUsuarioPruebas
	 */
	public void setIdUsuarioPruebas(int idUsuarioPruebas)
	{
		this.idUsuarioPruebas = idUsuarioPruebas;
		this.idUsuarioPruebasNull = false;
		this.idUsuarioPruebasModified = true;
	}

	/**
	 * Method 'setIdUsuarioPruebasNull'
	 * 
	 * @param value
	 */
	public void setIdUsuarioPruebasNull(boolean value)
	{
		this.idUsuarioPruebasNull = value;
		this.idUsuarioPruebasModified = true;
	}

	/**
	 * Method 'isIdUsuarioPruebasNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUsuarioPruebasNull()
	{
		return idUsuarioPruebasNull;
	}

	/** 
	 * Sets the value of idUsuarioPruebasModified
	 */
	public void setIdUsuarioPruebasModified(boolean idUsuarioPruebasModified)
	{
		this.idUsuarioPruebasModified = idUsuarioPruebasModified;
	}

	/** 
	 * Gets the value of idUsuarioPruebasModified
	 */
	public boolean isIdUsuarioPruebasModified()
	{
		return idUsuarioPruebasModified;
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
		
		if (!(_other instanceof RelDemopruebas)) {
			return false;
		}
		
		final RelDemopruebas _cast = (RelDemopruebas) _other;
		if (idUsuarioDemo != _cast.idUsuarioDemo) {
			return false;
		}
		
		if (idUsuarioDemoNull != _cast.idUsuarioDemoNull) {
			return false;
		}
		
		if (idUsuarioDemoModified != _cast.idUsuarioDemoModified) {
			return false;
		}
		
		if (idUsuarioPruebas != _cast.idUsuarioPruebas) {
			return false;
		}
		
		if (idUsuarioPruebasNull != _cast.idUsuarioPruebasNull) {
			return false;
		}
		
		if (idUsuarioPruebasModified != _cast.idUsuarioPruebasModified) {
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
		_hashCode = 29 * _hashCode + idUsuarioDemo;
		_hashCode = 29 * _hashCode + (idUsuarioDemoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioDemoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioPruebas;
		_hashCode = 29 * _hashCode + (idUsuarioPruebasNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioPruebasModified ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.RelDemopruebas: " );
		ret.append( "idUsuarioDemo=" + idUsuarioDemo );
		ret.append( ", idUsuarioPruebas=" + idUsuarioPruebas );
		return ret.toString();
	}

}
