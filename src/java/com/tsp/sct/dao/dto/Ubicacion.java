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

public class Ubicacion implements Serializable
{
	/** 
	 * This attribute maps to the column ID_UBICACION in the ubicacion table.
	 */
	protected int idUbicacion;

	/** 
	 * This attribute maps to the column CALLE in the ubicacion table.
	 */
	protected String calle;

	/** 
	 * This attribute maps to the column NUM_INT in the ubicacion table.
	 */
	protected String numInt;

	/** 
	 * This attribute maps to the column NUM_EXT in the ubicacion table.
	 */
	protected String numExt;

	/** 
	 * This attribute maps to the column COLONIA in the ubicacion table.
	 */
	protected String colonia;

	/** 
	 * This attribute maps to the column CODIGO_POSTAL in the ubicacion table.
	 */
	protected String codigoPostal;

	/** 
	 * This attribute maps to the column PAIS in the ubicacion table.
	 */
	protected String pais;

	/** 
	 * This attribute maps to the column ESTADO in the ubicacion table.
	 */
	protected String estado;

	/** 
	 * This attribute maps to the column MUNICIPIO in the ubicacion table.
	 */
	protected String municipio;

	/**
	 * Method 'Ubicacion'
	 * 
	 */
	public Ubicacion()
	{
	}

	/**
	 * Method 'getIdUbicacion'
	 * 
	 * @return int
	 */
	public int getIdUbicacion()
	{
		return idUbicacion;
	}

	/**
	 * Method 'setIdUbicacion'
	 * 
	 * @param idUbicacion
	 */
	public void setIdUbicacion(int idUbicacion)
	{
		this.idUbicacion = idUbicacion;
	}

	/**
	 * Method 'getCalle'
	 * 
	 * @return String
	 */
	public String getCalle()
	{
		return calle;
	}

	/**
	 * Method 'setCalle'
	 * 
	 * @param calle
	 */
	public void setCalle(String calle)
	{
		this.calle = calle;
	}

	/**
	 * Method 'getNumInt'
	 * 
	 * @return String
	 */
	public String getNumInt()
	{
		return numInt;
	}

	/**
	 * Method 'setNumInt'
	 * 
	 * @param numInt
	 */
	public void setNumInt(String numInt)
	{
		this.numInt = numInt;
	}

	/**
	 * Method 'getNumExt'
	 * 
	 * @return String
	 */
	public String getNumExt()
	{
		return numExt;
	}

	/**
	 * Method 'setNumExt'
	 * 
	 * @param numExt
	 */
	public void setNumExt(String numExt)
	{
		this.numExt = numExt;
	}

	/**
	 * Method 'getColonia'
	 * 
	 * @return String
	 */
	public String getColonia()
	{
		return colonia;
	}

	/**
	 * Method 'setColonia'
	 * 
	 * @param colonia
	 */
	public void setColonia(String colonia)
	{
		this.colonia = colonia;
	}

	/**
	 * Method 'getCodigoPostal'
	 * 
	 * @return String
	 */
	public String getCodigoPostal()
	{
		return codigoPostal;
	}

	/**
	 * Method 'setCodigoPostal'
	 * 
	 * @param codigoPostal
	 */
	public void setCodigoPostal(String codigoPostal)
	{
		this.codigoPostal = codigoPostal;
	}

	/**
	 * Method 'getPais'
	 * 
	 * @return String
	 */
	public String getPais()
	{
		return pais;
	}

	/**
	 * Method 'setPais'
	 * 
	 * @param pais
	 */
	public void setPais(String pais)
	{
		this.pais = pais;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	/**
	 * Method 'getMunicipio'
	 * 
	 * @return String
	 */
	public String getMunicipio()
	{
		return municipio;
	}

	/**
	 * Method 'setMunicipio'
	 * 
	 * @param municipio
	 */
	public void setMunicipio(String municipio)
	{
		this.municipio = municipio;
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
		
		if (!(_other instanceof Ubicacion)) {
			return false;
		}
		
		final Ubicacion _cast = (Ubicacion) _other;
		if (idUbicacion != _cast.idUbicacion) {
			return false;
		}
		
		if (calle == null ? _cast.calle != calle : !calle.equals( _cast.calle )) {
			return false;
		}
		
		if (numInt == null ? _cast.numInt != numInt : !numInt.equals( _cast.numInt )) {
			return false;
		}
		
		if (numExt == null ? _cast.numExt != numExt : !numExt.equals( _cast.numExt )) {
			return false;
		}
		
		if (colonia == null ? _cast.colonia != colonia : !colonia.equals( _cast.colonia )) {
			return false;
		}
		
		if (codigoPostal == null ? _cast.codigoPostal != codigoPostal : !codigoPostal.equals( _cast.codigoPostal )) {
			return false;
		}
		
		if (pais == null ? _cast.pais != pais : !pais.equals( _cast.pais )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (municipio == null ? _cast.municipio != municipio : !municipio.equals( _cast.municipio )) {
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
		_hashCode = 29 * _hashCode + idUbicacion;
		if (calle != null) {
			_hashCode = 29 * _hashCode + calle.hashCode();
		}
		
		if (numInt != null) {
			_hashCode = 29 * _hashCode + numInt.hashCode();
		}
		
		if (numExt != null) {
			_hashCode = 29 * _hashCode + numExt.hashCode();
		}
		
		if (colonia != null) {
			_hashCode = 29 * _hashCode + colonia.hashCode();
		}
		
		if (codigoPostal != null) {
			_hashCode = 29 * _hashCode + codigoPostal.hashCode();
		}
		
		if (pais != null) {
			_hashCode = 29 * _hashCode + pais.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		if (municipio != null) {
			_hashCode = 29 * _hashCode + municipio.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UbicacionPk
	 */
	public UbicacionPk createPk()
	{
		return new UbicacionPk(idUbicacion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Ubicacion: " );
		ret.append( "idUbicacion=" + idUbicacion );
		ret.append( ", calle=" + calle );
		ret.append( ", numInt=" + numInt );
		ret.append( ", numExt=" + numExt );
		ret.append( ", colonia=" + colonia );
		ret.append( ", codigoPostal=" + codigoPostal );
		ret.append( ", pais=" + pais );
		ret.append( ", estado=" + estado );
		ret.append( ", municipio=" + municipio );
		return ret.toString();
	}

}
