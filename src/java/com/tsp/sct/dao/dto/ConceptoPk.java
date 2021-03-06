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
 * This class represents the primary key of the concepto table.
 */
public class ConceptoPk implements Serializable
{
	protected int idConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idConcepto is null.
	 */
	protected boolean idConceptoNull;

	/** 
	 * Sets the value of idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
	}

	/** 
	 * Gets the value of idConcepto
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'ConceptoPk'
	 * 
	 */
	public ConceptoPk()
	{
	}

	/**
	 * Method 'ConceptoPk'
	 * 
	 * @param idConcepto
	 */
	public ConceptoPk(final int idConcepto)
	{
		this.idConcepto = idConcepto;
	}

	/** 
	 * Sets the value of idConceptoNull
	 */
	public void setIdConceptoNull(boolean idConceptoNull)
	{
		this.idConceptoNull = idConceptoNull;
	}

	/** 
	 * Gets the value of idConceptoNull
	 */
	public boolean isIdConceptoNull()
	{
		return idConceptoNull;
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
		
		if (!(_other instanceof ConceptoPk)) {
			return false;
		}
		
		final ConceptoPk _cast = (ConceptoPk) _other;
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idConceptoNull != _cast.idConceptoNull) {
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
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idConceptoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ConceptoPk: " );
		ret.append( "idConcepto=" + idConcepto );
		return ret.toString();
	}

}
