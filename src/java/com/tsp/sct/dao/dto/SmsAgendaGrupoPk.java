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
 * This class represents the primary key of the sms_agenda_grupo table.
 */
public class SmsAgendaGrupoPk implements Serializable
{
	protected int idSmsAgendaGrupo;

	/** 
	 * This attribute represents whether the primitive attribute idSmsAgendaGrupo is null.
	 */
	protected boolean idSmsAgendaGrupoNull;

	/** 
	 * Sets the value of idSmsAgendaGrupo
	 */
	public void setIdSmsAgendaGrupo(int idSmsAgendaGrupo)
	{
		this.idSmsAgendaGrupo = idSmsAgendaGrupo;
	}

	/** 
	 * Gets the value of idSmsAgendaGrupo
	 */
	public int getIdSmsAgendaGrupo()
	{
		return idSmsAgendaGrupo;
	}

	/**
	 * Method 'SmsAgendaGrupoPk'
	 * 
	 */
	public SmsAgendaGrupoPk()
	{
	}

	/**
	 * Method 'SmsAgendaGrupoPk'
	 * 
	 * @param idSmsAgendaGrupo
	 */
	public SmsAgendaGrupoPk(final int idSmsAgendaGrupo)
	{
		this.idSmsAgendaGrupo = idSmsAgendaGrupo;
	}

	/** 
	 * Sets the value of idSmsAgendaGrupoNull
	 */
	public void setIdSmsAgendaGrupoNull(boolean idSmsAgendaGrupoNull)
	{
		this.idSmsAgendaGrupoNull = idSmsAgendaGrupoNull;
	}

	/** 
	 * Gets the value of idSmsAgendaGrupoNull
	 */
	public boolean isIdSmsAgendaGrupoNull()
	{
		return idSmsAgendaGrupoNull;
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
		
		if (!(_other instanceof SmsAgendaGrupoPk)) {
			return false;
		}
		
		final SmsAgendaGrupoPk _cast = (SmsAgendaGrupoPk) _other;
		if (idSmsAgendaGrupo != _cast.idSmsAgendaGrupo) {
			return false;
		}
		
		if (idSmsAgendaGrupoNull != _cast.idSmsAgendaGrupoNull) {
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
		_hashCode = 29 * _hashCode + idSmsAgendaGrupo;
		_hashCode = 29 * _hashCode + (idSmsAgendaGrupoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SmsAgendaGrupoPk: " );
		ret.append( "idSmsAgendaGrupo=" + idSmsAgendaGrupo );
		return ret.toString();
	}

}