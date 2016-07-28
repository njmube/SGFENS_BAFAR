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

public class SgfensVendedorDatos implements Serializable
{
	/** 
	 * This attribute maps to the column ID_USUARIO in the SGFENS_VENDEDOR_DATOS table.
	 */
	protected int idUsuario;

	/** 
	 * This attribute represents whether the attribute idUsuario has been modified since being read from the database.
	 */
	protected boolean idUsuarioModified = false;

	/** 
	 * This attribute maps to the column SUELDO_MENSUAL in the SGFENS_VENDEDOR_DATOS table.
	 */
	protected double sueldoMensual;

	/** 
	 * This attribute represents whether the attribute sueldoMensual has been modified since being read from the database.
	 */
	protected boolean sueldoMensualModified = false;

	/** 
	 * This attribute maps to the column PORCENTAJE_COMISIONES in the SGFENS_VENDEDOR_DATOS table.
	 */
	protected double porcentajeComisiones;

	/** 
	 * This attribute represents whether the attribute porcentajeComisiones has been modified since being read from the database.
	 */
	protected boolean porcentajeComisionesModified = false;

	/**
	 * Method 'SgfensVendedorDatos'
	 * 
	 */
	public SgfensVendedorDatos()
	{
	}

	/**
	 * Method 'getIdUsuario'
	 * 
	 * @return int
	 */
	public int getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario)
	{
		this.idUsuario = idUsuario;
		this.idUsuarioModified = true;
	}

	/** 
	 * Sets the value of idUsuarioModified
	 */
	public void setIdUsuarioModified(boolean idUsuarioModified)
	{
		this.idUsuarioModified = idUsuarioModified;
	}

	/** 
	 * Gets the value of idUsuarioModified
	 */
	public boolean isIdUsuarioModified()
	{
		return idUsuarioModified;
	}

	/**
	 * Method 'getSueldoMensual'
	 * 
	 * @return double
	 */
	public double getSueldoMensual()
	{
		return sueldoMensual;
	}

	/**
	 * Method 'setSueldoMensual'
	 * 
	 * @param sueldoMensual
	 */
	public void setSueldoMensual(double sueldoMensual)
	{
		this.sueldoMensual = sueldoMensual;
		this.sueldoMensualModified = true;
	}

	/** 
	 * Sets the value of sueldoMensualModified
	 */
	public void setSueldoMensualModified(boolean sueldoMensualModified)
	{
		this.sueldoMensualModified = sueldoMensualModified;
	}

	/** 
	 * Gets the value of sueldoMensualModified
	 */
	public boolean isSueldoMensualModified()
	{
		return sueldoMensualModified;
	}

	/**
	 * Method 'getPorcentajeComisiones'
	 * 
	 * @return double
	 */
	public double getPorcentajeComisiones()
	{
		return porcentajeComisiones;
	}

	/**
	 * Method 'setPorcentajeComisiones'
	 * 
	 * @param porcentajeComisiones
	 */
	public void setPorcentajeComisiones(double porcentajeComisiones)
	{
		this.porcentajeComisiones = porcentajeComisiones;
		this.porcentajeComisionesModified = true;
	}

	/** 
	 * Sets the value of porcentajeComisionesModified
	 */
	public void setPorcentajeComisionesModified(boolean porcentajeComisionesModified)
	{
		this.porcentajeComisionesModified = porcentajeComisionesModified;
	}

	/** 
	 * Gets the value of porcentajeComisionesModified
	 */
	public boolean isPorcentajeComisionesModified()
	{
		return porcentajeComisionesModified;
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
		
		if (!(_other instanceof SgfensVendedorDatos)) {
			return false;
		}
		
		final SgfensVendedorDatos _cast = (SgfensVendedorDatos) _other;
		if (idUsuario != _cast.idUsuario) {
			return false;
		}
		
		if (idUsuarioModified != _cast.idUsuarioModified) {
			return false;
		}
		
		if (sueldoMensual != _cast.sueldoMensual) {
			return false;
		}
		
		if (sueldoMensualModified != _cast.sueldoMensualModified) {
			return false;
		}
		
		if (porcentajeComisiones != _cast.porcentajeComisiones) {
			return false;
		}
		
		if (porcentajeComisionesModified != _cast.porcentajeComisionesModified) {
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
		_hashCode = 29 * _hashCode + idUsuario;
		_hashCode = 29 * _hashCode + (idUsuarioModified ? 1 : 0);
		long temp_sueldoMensual = Double.doubleToLongBits(sueldoMensual);
		_hashCode = 29 * _hashCode + (int) (temp_sueldoMensual ^ (temp_sueldoMensual >>> 32));
		_hashCode = 29 * _hashCode + (sueldoMensualModified ? 1 : 0);
		long temp_porcentajeComisiones = Double.doubleToLongBits(porcentajeComisiones);
		_hashCode = 29 * _hashCode + (int) (temp_porcentajeComisiones ^ (temp_porcentajeComisiones >>> 32));
		_hashCode = 29 * _hashCode + (porcentajeComisionesModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensVendedorDatosPk
	 */
	public SgfensVendedorDatosPk createPk()
	{
		return new SgfensVendedorDatosPk(idUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensVendedorDatos: " );
		ret.append( "idUsuario=" + idUsuario );
		ret.append( ", sueldoMensual=" + sueldoMensual );
		ret.append( ", porcentajeComisiones=" + porcentajeComisiones );
		return ret.toString();
	}

}
