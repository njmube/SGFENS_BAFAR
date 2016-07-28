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
 * This class represents the primary key of the sar_usuario_proveedor table.
 */
public class SarUsuarioProveedorPk implements Serializable
{
	protected int idSarUsuario;

	/** 
	 * This attribute represents whether the primitive attribute idSarUsuario is null.
	 */
	protected boolean idSarUsuarioNull;

	/** 
	 * Sets the value of idSarUsuario
	 */
	public void setIdSarUsuario(int idSarUsuario)
	{
		this.idSarUsuario = idSarUsuario;
	}

	/** 
	 * Gets the value of idSarUsuario
	 */
	public int getIdSarUsuario()
	{
		return idSarUsuario;
	}

	/**
	 * Method 'SarUsuarioProveedorPk'
	 * 
	 */
	public SarUsuarioProveedorPk()
	{
	}

	/**
	 * Method 'SarUsuarioProveedorPk'
	 * 
	 * @param idSarUsuario
	 */
	public SarUsuarioProveedorPk(final int idSarUsuario)
	{
		this.idSarUsuario = idSarUsuario;
	}

	/** 
	 * Sets the value of idSarUsuarioNull
	 */
	public void setIdSarUsuarioNull(boolean idSarUsuarioNull)
	{
		this.idSarUsuarioNull = idSarUsuarioNull;
	}

	/** 
	 * Gets the value of idSarUsuarioNull
	 */
	public boolean isIdSarUsuarioNull()
	{
		return idSarUsuarioNull;
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
		
		if (!(_other instanceof SarUsuarioProveedorPk)) {
			return false;
		}
		
		final SarUsuarioProveedorPk _cast = (SarUsuarioProveedorPk) _other;
		if (idSarUsuario != _cast.idSarUsuario) {
			return false;
		}
		
		if (idSarUsuarioNull != _cast.idSarUsuarioNull) {
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
		_hashCode = 29 * _hashCode + idSarUsuario;
		_hashCode = 29 * _hashCode + (idSarUsuarioNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SarUsuarioProveedorPk: " );
		ret.append( "idSarUsuario=" + idSarUsuario );
		return ret.toString();
	}

}
