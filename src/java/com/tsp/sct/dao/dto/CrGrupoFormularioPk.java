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
 * This class represents the primary key of the cr_grupo_formulario table.
 */
public class CrGrupoFormularioPk implements Serializable
{
	protected int idGrupoFormulario;

	/** 
	 * This attribute represents whether the primitive attribute idGrupoFormulario is null.
	 */
	protected boolean idGrupoFormularioNull;

	/** 
	 * Sets the value of idGrupoFormulario
	 */
	public void setIdGrupoFormulario(int idGrupoFormulario)
	{
		this.idGrupoFormulario = idGrupoFormulario;
	}

	/** 
	 * Gets the value of idGrupoFormulario
	 */
	public int getIdGrupoFormulario()
	{
		return idGrupoFormulario;
	}

	/**
	 * Method 'CrGrupoFormularioPk'
	 * 
	 */
	public CrGrupoFormularioPk()
	{
	}

	/**
	 * Method 'CrGrupoFormularioPk'
	 * 
	 * @param idGrupoFormulario
	 */
	public CrGrupoFormularioPk(final int idGrupoFormulario)
	{
		this.idGrupoFormulario = idGrupoFormulario;
	}

	/** 
	 * Sets the value of idGrupoFormularioNull
	 */
	public void setIdGrupoFormularioNull(boolean idGrupoFormularioNull)
	{
		this.idGrupoFormularioNull = idGrupoFormularioNull;
	}

	/** 
	 * Gets the value of idGrupoFormularioNull
	 */
	public boolean isIdGrupoFormularioNull()
	{
		return idGrupoFormularioNull;
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
		
		if (!(_other instanceof CrGrupoFormularioPk)) {
			return false;
		}
		
		final CrGrupoFormularioPk _cast = (CrGrupoFormularioPk) _other;
		if (idGrupoFormulario != _cast.idGrupoFormulario) {
			return false;
		}
		
		if (idGrupoFormularioNull != _cast.idGrupoFormularioNull) {
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
		_hashCode = 29 * _hashCode + idGrupoFormulario;
		_hashCode = 29 * _hashCode + (idGrupoFormularioNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrGrupoFormularioPk: " );
		ret.append( "idGrupoFormulario=" + idGrupoFormulario );
		return ret.toString();
	}

}
