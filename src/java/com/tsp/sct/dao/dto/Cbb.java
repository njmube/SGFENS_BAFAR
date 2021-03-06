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

public class Cbb implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CBB in the cbb table.
	 */
	protected int idCbb;

	/** 
	 * This attribute represents whether the attribute idCbb has been modified since being read from the database.
	 */
	protected boolean idCbbModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the cbb table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_CBB in the cbb table.
	 */
	protected String nombreCbb;

	/** 
	 * This attribute represents whether the attribute nombreCbb has been modified since being read from the database.
	 */
	protected boolean nombreCbbModified = false;

	/**
	 * Method 'Cbb'
	 * 
	 */
	public Cbb()
	{
	}

	/**
	 * Method 'getIdCbb'
	 * 
	 * @return int
	 */
	public int getIdCbb()
	{
		return idCbb;
	}

	/**
	 * Method 'setIdCbb'
	 * 
	 * @param idCbb
	 */
	public void setIdCbb(int idCbb)
	{
		this.idCbb = idCbb;
		this.idCbbModified = true;
	}

	/** 
	 * Sets the value of idCbbModified
	 */
	public void setIdCbbModified(boolean idCbbModified)
	{
		this.idCbbModified = idCbbModified;
	}

	/** 
	 * Gets the value of idCbbModified
	 */
	public boolean isIdCbbModified()
	{
		return idCbbModified;
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
		this.idEmpresaNull = false;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'setIdEmpresaNull'
	 * 
	 * @param value
	 */
	public void setIdEmpresaNull(boolean value)
	{
		this.idEmpresaNull = value;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'isIdEmpresaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
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
	 * Method 'getNombreCbb'
	 * 
	 * @return String
	 */
	public String getNombreCbb()
	{
		return nombreCbb;
	}

	/**
	 * Method 'setNombreCbb'
	 * 
	 * @param nombreCbb
	 */
	public void setNombreCbb(String nombreCbb)
	{
		this.nombreCbb = nombreCbb;
		this.nombreCbbModified = true;
	}

	/** 
	 * Sets the value of nombreCbbModified
	 */
	public void setNombreCbbModified(boolean nombreCbbModified)
	{
		this.nombreCbbModified = nombreCbbModified;
	}

	/** 
	 * Gets the value of nombreCbbModified
	 */
	public boolean isNombreCbbModified()
	{
		return nombreCbbModified;
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
		
		if (!(_other instanceof Cbb)) {
			return false;
		}
		
		final Cbb _cast = (Cbb) _other;
		if (idCbb != _cast.idCbb) {
			return false;
		}
		
		if (idCbbModified != _cast.idCbbModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (nombreCbb == null ? _cast.nombreCbb != nombreCbb : !nombreCbb.equals( _cast.nombreCbb )) {
			return false;
		}
		
		if (nombreCbbModified != _cast.nombreCbbModified) {
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
		_hashCode = 29 * _hashCode + idCbb;
		_hashCode = 29 * _hashCode + (idCbbModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (nombreCbb != null) {
			_hashCode = 29 * _hashCode + nombreCbb.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreCbbModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CbbPk
	 */
	public CbbPk createPk()
	{
		return new CbbPk(idCbb);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Cbb: " );
		ret.append( "idCbb=" + idCbb );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", nombreCbb=" + nombreCbb );
		return ret.toString();
	}

}
