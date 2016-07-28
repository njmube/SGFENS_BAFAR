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
 * This class represents the primary key of the sms_agenda_destinatario table.
 */
public class SmsAgendaDestinatarioPk implements Serializable
{
	protected int idSmsAgendaDest;

	/** 
	 * This attribute represents whether the primitive attribute idSmsAgendaDest is null.
	 */
	protected boolean idSmsAgendaDestNull;

	/** 
	 * Sets the value of idSmsAgendaDest
	 */
	public void setIdSmsAgendaDest(int idSmsAgendaDest)
	{
		this.idSmsAgendaDest = idSmsAgendaDest;
	}

	/** 
	 * Gets the value of idSmsAgendaDest
	 */
	public int getIdSmsAgendaDest()
	{
		return idSmsAgendaDest;
	}

	/**
	 * Method 'SmsAgendaDestinatarioPk'
	 * 
	 */
	public SmsAgendaDestinatarioPk()
	{
	}

	/**
	 * Method 'SmsAgendaDestinatarioPk'
	 * 
	 * @param idSmsAgendaDest
	 */
	public SmsAgendaDestinatarioPk(final int idSmsAgendaDest)
	{
		this.idSmsAgendaDest = idSmsAgendaDest;
	}

	/** 
	 * Sets the value of idSmsAgendaDestNull
	 */
	public void setIdSmsAgendaDestNull(boolean idSmsAgendaDestNull)
	{
		this.idSmsAgendaDestNull = idSmsAgendaDestNull;
	}

	/** 
	 * Gets the value of idSmsAgendaDestNull
	 */
	public boolean isIdSmsAgendaDestNull()
	{
		return idSmsAgendaDestNull;
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
		
		if (!(_other instanceof SmsAgendaDestinatarioPk)) {
			return false;
		}
		
		final SmsAgendaDestinatarioPk _cast = (SmsAgendaDestinatarioPk) _other;
		if (idSmsAgendaDest != _cast.idSmsAgendaDest) {
			return false;
		}
		
		if (idSmsAgendaDestNull != _cast.idSmsAgendaDestNull) {
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
		_hashCode = 29 * _hashCode + idSmsAgendaDest;
		_hashCode = 29 * _hashCode + (idSmsAgendaDestNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SmsAgendaDestinatarioPk: " );
		ret.append( "idSmsAgendaDest=" + idSmsAgendaDest );
		return ret.toString();
	}

}
