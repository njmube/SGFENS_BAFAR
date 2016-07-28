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
 * This class represents the primary key of the folios_movil_empleado table.
 */
public class FoliosMovilEmpleadoPk implements Serializable
{
	protected int idFolioMovilEmpleado;

	/** 
	 * This attribute represents whether the primitive attribute idFolioMovilEmpleado is null.
	 */
	protected boolean idFolioMovilEmpleadoNull;

	/** 
	 * Sets the value of idFolioMovilEmpleado
	 */
	public void setIdFolioMovilEmpleado(int idFolioMovilEmpleado)
	{
		this.idFolioMovilEmpleado = idFolioMovilEmpleado;
	}

	/** 
	 * Gets the value of idFolioMovilEmpleado
	 */
	public int getIdFolioMovilEmpleado()
	{
		return idFolioMovilEmpleado;
	}

	/**
	 * Method 'FoliosMovilEmpleadoPk'
	 * 
	 */
	public FoliosMovilEmpleadoPk()
	{
	}

	/**
	 * Method 'FoliosMovilEmpleadoPk'
	 * 
	 * @param idFolioMovilEmpleado
	 */
	public FoliosMovilEmpleadoPk(final int idFolioMovilEmpleado)
	{
		this.idFolioMovilEmpleado = idFolioMovilEmpleado;
	}

	/** 
	 * Sets the value of idFolioMovilEmpleadoNull
	 */
	public void setIdFolioMovilEmpleadoNull(boolean idFolioMovilEmpleadoNull)
	{
		this.idFolioMovilEmpleadoNull = idFolioMovilEmpleadoNull;
	}

	/** 
	 * Gets the value of idFolioMovilEmpleadoNull
	 */
	public boolean isIdFolioMovilEmpleadoNull()
	{
		return idFolioMovilEmpleadoNull;
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
		
		if (!(_other instanceof FoliosMovilEmpleadoPk)) {
			return false;
		}
		
		final FoliosMovilEmpleadoPk _cast = (FoliosMovilEmpleadoPk) _other;
		if (idFolioMovilEmpleado != _cast.idFolioMovilEmpleado) {
			return false;
		}
		
		if (idFolioMovilEmpleadoNull != _cast.idFolioMovilEmpleadoNull) {
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
		_hashCode = 29 * _hashCode + idFolioMovilEmpleado;
		_hashCode = 29 * _hashCode + (idFolioMovilEmpleadoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.FoliosMovilEmpleadoPk: " );
		ret.append( "idFolioMovilEmpleado=" + idFolioMovilEmpleado );
		return ret.toString();
	}

}
