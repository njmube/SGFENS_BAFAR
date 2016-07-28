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
 * This class represents the primary key of the cr_doc_imp_parametro table.
 */
public class CrDocImpParametroPk implements Serializable
{
	protected int idDocImpParametro;

	/** 
	 * This attribute represents whether the primitive attribute idDocImpParametro is null.
	 */
	protected boolean idDocImpParametroNull;

	/** 
	 * Sets the value of idDocImpParametro
	 */
	public void setIdDocImpParametro(int idDocImpParametro)
	{
		this.idDocImpParametro = idDocImpParametro;
	}

	/** 
	 * Gets the value of idDocImpParametro
	 */
	public int getIdDocImpParametro()
	{
		return idDocImpParametro;
	}

	/**
	 * Method 'CrDocImpParametroPk'
	 * 
	 */
	public CrDocImpParametroPk()
	{
	}

	/**
	 * Method 'CrDocImpParametroPk'
	 * 
	 * @param idDocImpParametro
	 */
	public CrDocImpParametroPk(final int idDocImpParametro)
	{
		this.idDocImpParametro = idDocImpParametro;
	}

	/** 
	 * Sets the value of idDocImpParametroNull
	 */
	public void setIdDocImpParametroNull(boolean idDocImpParametroNull)
	{
		this.idDocImpParametroNull = idDocImpParametroNull;
	}

	/** 
	 * Gets the value of idDocImpParametroNull
	 */
	public boolean isIdDocImpParametroNull()
	{
		return idDocImpParametroNull;
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
		
		if (!(_other instanceof CrDocImpParametroPk)) {
			return false;
		}
		
		final CrDocImpParametroPk _cast = (CrDocImpParametroPk) _other;
		if (idDocImpParametro != _cast.idDocImpParametro) {
			return false;
		}
		
		if (idDocImpParametroNull != _cast.idDocImpParametroNull) {
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
		_hashCode = 29 * _hashCode + idDocImpParametro;
		_hashCode = 29 * _hashCode + (idDocImpParametroNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrDocImpParametroPk: " );
		ret.append( "idDocImpParametro=" + idDocImpParametro );
		return ret.toString();
	}

}
