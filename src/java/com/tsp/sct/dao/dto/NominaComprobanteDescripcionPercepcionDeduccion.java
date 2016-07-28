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

public class NominaComprobanteDescripcionPercepcionDeduccion implements Serializable
{
	/** 
	 * This attribute maps to the column ID_NOMINA_COMPROBANTE_DESCRIPCION in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected int idNominaComprobanteDescripcion;

	/** 
	 * This attribute represents whether the attribute idNominaComprobanteDescripcion has been modified since being read from the database.
	 */
	protected boolean idNominaComprobanteDescripcionModified = false;

	/** 
	 * This attribute maps to the column ID_CROMPROBANTE_FISCAL in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected int idCromprobanteFiscal;

	/** 
	 * This attribute represents whether the primitive attribute idCromprobanteFiscal is null.
	 */
	protected boolean idCromprobanteFiscalNull = true;

	/** 
	 * This attribute represents whether the attribute idCromprobanteFiscal has been modified since being read from the database.
	 */
	protected boolean idCromprobanteFiscalModified = false;

	/** 
	 * This attribute maps to the column ID_PERCEPCION_DEDUCCION in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected int idPercepcionDeduccion;

	/** 
	 * This attribute represents whether the primitive attribute idPercepcionDeduccion is null.
	 */
	protected boolean idPercepcionDeduccionNull = true;

	/** 
	 * This attribute represents whether the attribute idPercepcionDeduccion has been modified since being read from the database.
	 */
	protected boolean idPercepcionDeduccionModified = false;

	/** 
	 * This attribute maps to the column TIPO_CLAVE in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected String tipoClave;

	/** 
	 * This attribute represents whether the attribute tipoClave has been modified since being read from the database.
	 */
	protected boolean tipoClaveModified = false;

	/** 
	 * This attribute maps to the column CLAVE_PATRON in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected String clavePatron;

	/** 
	 * This attribute represents whether the attribute clavePatron has been modified since being read from the database.
	 */
	protected boolean clavePatronModified = false;

	/** 
	 * This attribute maps to the column CONCEPTO_DESCRIPCION in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected String conceptoDescripcion;

	/** 
	 * This attribute represents whether the attribute conceptoDescripcion has been modified since being read from the database.
	 */
	protected boolean conceptoDescripcionModified = false;

	/** 
	 * This attribute maps to the column IMPORTE_GRAVADO in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected double importeGravado;

	/** 
	 * This attribute represents whether the primitive attribute importeGravado is null.
	 */
	protected boolean importeGravadoNull = true;

	/** 
	 * This attribute represents whether the attribute importeGravado has been modified since being read from the database.
	 */
	protected boolean importeGravadoModified = false;

	/** 
	 * This attribute maps to the column IMPORTE_EXCEPTO in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected double importeExcepto;

	/** 
	 * This attribute represents whether the primitive attribute importeExcepto is null.
	 */
	protected boolean importeExceptoNull = true;

	/** 
	 * This attribute represents whether the attribute importeExcepto has been modified since being read from the database.
	 */
	protected boolean importeExceptoModified = false;

	/** 
	 * This attribute maps to the column ID_DE_LA_PERCEPCION_DEDUCCION in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	protected int idDeLaPercepcionDeduccion;

	/** 
	 * This attribute represents whether the primitive attribute idDeLaPercepcionDeduccion is null.
	 */
	protected boolean idDeLaPercepcionDeduccionNull = true;

	/** 
	 * This attribute represents whether the attribute idDeLaPercepcionDeduccion has been modified since being read from the database.
	 */
	protected boolean idDeLaPercepcionDeduccionModified = false;

	/**
	 * Method 'NominaComprobanteDescripcionPercepcionDeduccion'
	 * 
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion()
	{
	}

	/**
	 * Method 'getIdNominaComprobanteDescripcion'
	 * 
	 * @return int
	 */
	public int getIdNominaComprobanteDescripcion()
	{
		return idNominaComprobanteDescripcion;
	}

	/**
	 * Method 'setIdNominaComprobanteDescripcion'
	 * 
	 * @param idNominaComprobanteDescripcion
	 */
	public void setIdNominaComprobanteDescripcion(int idNominaComprobanteDescripcion)
	{
		this.idNominaComprobanteDescripcion = idNominaComprobanteDescripcion;
		this.idNominaComprobanteDescripcionModified = true;
	}

	/** 
	 * Sets the value of idNominaComprobanteDescripcionModified
	 */
	public void setIdNominaComprobanteDescripcionModified(boolean idNominaComprobanteDescripcionModified)
	{
		this.idNominaComprobanteDescripcionModified = idNominaComprobanteDescripcionModified;
	}

	/** 
	 * Gets the value of idNominaComprobanteDescripcionModified
	 */
	public boolean isIdNominaComprobanteDescripcionModified()
	{
		return idNominaComprobanteDescripcionModified;
	}

	/**
	 * Method 'getIdCromprobanteFiscal'
	 * 
	 * @return int
	 */
	public int getIdCromprobanteFiscal()
	{
		return idCromprobanteFiscal;
	}

	/**
	 * Method 'setIdCromprobanteFiscal'
	 * 
	 * @param idCromprobanteFiscal
	 */
	public void setIdCromprobanteFiscal(int idCromprobanteFiscal)
	{
		this.idCromprobanteFiscal = idCromprobanteFiscal;
		this.idCromprobanteFiscalNull = false;
		this.idCromprobanteFiscalModified = true;
	}

	/**
	 * Method 'setIdCromprobanteFiscalNull'
	 * 
	 * @param value
	 */
	public void setIdCromprobanteFiscalNull(boolean value)
	{
		this.idCromprobanteFiscalNull = value;
		this.idCromprobanteFiscalModified = true;
	}

	/**
	 * Method 'isIdCromprobanteFiscalNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCromprobanteFiscalNull()
	{
		return idCromprobanteFiscalNull;
	}

	/** 
	 * Sets the value of idCromprobanteFiscalModified
	 */
	public void setIdCromprobanteFiscalModified(boolean idCromprobanteFiscalModified)
	{
		this.idCromprobanteFiscalModified = idCromprobanteFiscalModified;
	}

	/** 
	 * Gets the value of idCromprobanteFiscalModified
	 */
	public boolean isIdCromprobanteFiscalModified()
	{
		return idCromprobanteFiscalModified;
	}

	/**
	 * Method 'getIdPercepcionDeduccion'
	 * 
	 * @return int
	 */
	public int getIdPercepcionDeduccion()
	{
		return idPercepcionDeduccion;
	}

	/**
	 * Method 'setIdPercepcionDeduccion'
	 * 
	 * @param idPercepcionDeduccion
	 */
	public void setIdPercepcionDeduccion(int idPercepcionDeduccion)
	{
		this.idPercepcionDeduccion = idPercepcionDeduccion;
		this.idPercepcionDeduccionNull = false;
		this.idPercepcionDeduccionModified = true;
	}

	/**
	 * Method 'setIdPercepcionDeduccionNull'
	 * 
	 * @param value
	 */
	public void setIdPercepcionDeduccionNull(boolean value)
	{
		this.idPercepcionDeduccionNull = value;
		this.idPercepcionDeduccionModified = true;
	}

	/**
	 * Method 'isIdPercepcionDeduccionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdPercepcionDeduccionNull()
	{
		return idPercepcionDeduccionNull;
	}

	/** 
	 * Sets the value of idPercepcionDeduccionModified
	 */
	public void setIdPercepcionDeduccionModified(boolean idPercepcionDeduccionModified)
	{
		this.idPercepcionDeduccionModified = idPercepcionDeduccionModified;
	}

	/** 
	 * Gets the value of idPercepcionDeduccionModified
	 */
	public boolean isIdPercepcionDeduccionModified()
	{
		return idPercepcionDeduccionModified;
	}

	/**
	 * Method 'getTipoClave'
	 * 
	 * @return String
	 */
	public String getTipoClave()
	{
		return tipoClave;
	}

	/**
	 * Method 'setTipoClave'
	 * 
	 * @param tipoClave
	 */
	public void setTipoClave(String tipoClave)
	{
		this.tipoClave = tipoClave;
		this.tipoClaveModified = true;
	}

	/** 
	 * Sets the value of tipoClaveModified
	 */
	public void setTipoClaveModified(boolean tipoClaveModified)
	{
		this.tipoClaveModified = tipoClaveModified;
	}

	/** 
	 * Gets the value of tipoClaveModified
	 */
	public boolean isTipoClaveModified()
	{
		return tipoClaveModified;
	}

	/**
	 * Method 'getClavePatron'
	 * 
	 * @return String
	 */
	public String getClavePatron()
	{
		return clavePatron;
	}

	/**
	 * Method 'setClavePatron'
	 * 
	 * @param clavePatron
	 */
	public void setClavePatron(String clavePatron)
	{
		this.clavePatron = clavePatron;
		this.clavePatronModified = true;
	}

	/** 
	 * Sets the value of clavePatronModified
	 */
	public void setClavePatronModified(boolean clavePatronModified)
	{
		this.clavePatronModified = clavePatronModified;
	}

	/** 
	 * Gets the value of clavePatronModified
	 */
	public boolean isClavePatronModified()
	{
		return clavePatronModified;
	}

	/**
	 * Method 'getConceptoDescripcion'
	 * 
	 * @return String
	 */
	public String getConceptoDescripcion()
	{
		return conceptoDescripcion;
	}

	/**
	 * Method 'setConceptoDescripcion'
	 * 
	 * @param conceptoDescripcion
	 */
	public void setConceptoDescripcion(String conceptoDescripcion)
	{
		this.conceptoDescripcion = conceptoDescripcion;
		this.conceptoDescripcionModified = true;
	}

	/** 
	 * Sets the value of conceptoDescripcionModified
	 */
	public void setConceptoDescripcionModified(boolean conceptoDescripcionModified)
	{
		this.conceptoDescripcionModified = conceptoDescripcionModified;
	}

	/** 
	 * Gets the value of conceptoDescripcionModified
	 */
	public boolean isConceptoDescripcionModified()
	{
		return conceptoDescripcionModified;
	}

	/**
	 * Method 'getImporteGravado'
	 * 
	 * @return double
	 */
	public double getImporteGravado()
	{
		return importeGravado;
	}

	/**
	 * Method 'setImporteGravado'
	 * 
	 * @param importeGravado
	 */
	public void setImporteGravado(double importeGravado)
	{
		this.importeGravado = importeGravado;
		this.importeGravadoNull = false;
		this.importeGravadoModified = true;
	}

	/**
	 * Method 'setImporteGravadoNull'
	 * 
	 * @param value
	 */
	public void setImporteGravadoNull(boolean value)
	{
		this.importeGravadoNull = value;
		this.importeGravadoModified = true;
	}

	/**
	 * Method 'isImporteGravadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isImporteGravadoNull()
	{
		return importeGravadoNull;
	}

	/** 
	 * Sets the value of importeGravadoModified
	 */
	public void setImporteGravadoModified(boolean importeGravadoModified)
	{
		this.importeGravadoModified = importeGravadoModified;
	}

	/** 
	 * Gets the value of importeGravadoModified
	 */
	public boolean isImporteGravadoModified()
	{
		return importeGravadoModified;
	}

	/**
	 * Method 'getImporteExcepto'
	 * 
	 * @return double
	 */
	public double getImporteExcepto()
	{
		return importeExcepto;
	}

	/**
	 * Method 'setImporteExcepto'
	 * 
	 * @param importeExcepto
	 */
	public void setImporteExcepto(double importeExcepto)
	{
		this.importeExcepto = importeExcepto;
		this.importeExceptoNull = false;
		this.importeExceptoModified = true;
	}

	/**
	 * Method 'setImporteExceptoNull'
	 * 
	 * @param value
	 */
	public void setImporteExceptoNull(boolean value)
	{
		this.importeExceptoNull = value;
		this.importeExceptoModified = true;
	}

	/**
	 * Method 'isImporteExceptoNull'
	 * 
	 * @return boolean
	 */
	public boolean isImporteExceptoNull()
	{
		return importeExceptoNull;
	}

	/** 
	 * Sets the value of importeExceptoModified
	 */
	public void setImporteExceptoModified(boolean importeExceptoModified)
	{
		this.importeExceptoModified = importeExceptoModified;
	}

	/** 
	 * Gets the value of importeExceptoModified
	 */
	public boolean isImporteExceptoModified()
	{
		return importeExceptoModified;
	}

	/**
	 * Method 'getIdDeLaPercepcionDeduccion'
	 * 
	 * @return int
	 */
	public int getIdDeLaPercepcionDeduccion()
	{
		return idDeLaPercepcionDeduccion;
	}

	/**
	 * Method 'setIdDeLaPercepcionDeduccion'
	 * 
	 * @param idDeLaPercepcionDeduccion
	 */
	public void setIdDeLaPercepcionDeduccion(int idDeLaPercepcionDeduccion)
	{
		this.idDeLaPercepcionDeduccion = idDeLaPercepcionDeduccion;
		this.idDeLaPercepcionDeduccionNull = false;
		this.idDeLaPercepcionDeduccionModified = true;
	}

	/**
	 * Method 'setIdDeLaPercepcionDeduccionNull'
	 * 
	 * @param value
	 */
	public void setIdDeLaPercepcionDeduccionNull(boolean value)
	{
		this.idDeLaPercepcionDeduccionNull = value;
		this.idDeLaPercepcionDeduccionModified = true;
	}

	/**
	 * Method 'isIdDeLaPercepcionDeduccionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdDeLaPercepcionDeduccionNull()
	{
		return idDeLaPercepcionDeduccionNull;
	}

	/** 
	 * Sets the value of idDeLaPercepcionDeduccionModified
	 */
	public void setIdDeLaPercepcionDeduccionModified(boolean idDeLaPercepcionDeduccionModified)
	{
		this.idDeLaPercepcionDeduccionModified = idDeLaPercepcionDeduccionModified;
	}

	/** 
	 * Gets the value of idDeLaPercepcionDeduccionModified
	 */
	public boolean isIdDeLaPercepcionDeduccionModified()
	{
		return idDeLaPercepcionDeduccionModified;
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
		
		if (!(_other instanceof NominaComprobanteDescripcionPercepcionDeduccion)) {
			return false;
		}
		
		final NominaComprobanteDescripcionPercepcionDeduccion _cast = (NominaComprobanteDescripcionPercepcionDeduccion) _other;
		if (idNominaComprobanteDescripcion != _cast.idNominaComprobanteDescripcion) {
			return false;
		}
		
		if (idNominaComprobanteDescripcionModified != _cast.idNominaComprobanteDescripcionModified) {
			return false;
		}
		
		if (idCromprobanteFiscal != _cast.idCromprobanteFiscal) {
			return false;
		}
		
		if (idCromprobanteFiscalNull != _cast.idCromprobanteFiscalNull) {
			return false;
		}
		
		if (idCromprobanteFiscalModified != _cast.idCromprobanteFiscalModified) {
			return false;
		}
		
		if (idPercepcionDeduccion != _cast.idPercepcionDeduccion) {
			return false;
		}
		
		if (idPercepcionDeduccionNull != _cast.idPercepcionDeduccionNull) {
			return false;
		}
		
		if (idPercepcionDeduccionModified != _cast.idPercepcionDeduccionModified) {
			return false;
		}
		
		if (tipoClave == null ? _cast.tipoClave != tipoClave : !tipoClave.equals( _cast.tipoClave )) {
			return false;
		}
		
		if (tipoClaveModified != _cast.tipoClaveModified) {
			return false;
		}
		
		if (clavePatron == null ? _cast.clavePatron != clavePatron : !clavePatron.equals( _cast.clavePatron )) {
			return false;
		}
		
		if (clavePatronModified != _cast.clavePatronModified) {
			return false;
		}
		
		if (conceptoDescripcion == null ? _cast.conceptoDescripcion != conceptoDescripcion : !conceptoDescripcion.equals( _cast.conceptoDescripcion )) {
			return false;
		}
		
		if (conceptoDescripcionModified != _cast.conceptoDescripcionModified) {
			return false;
		}
		
		if (importeGravado != _cast.importeGravado) {
			return false;
		}
		
		if (importeGravadoNull != _cast.importeGravadoNull) {
			return false;
		}
		
		if (importeGravadoModified != _cast.importeGravadoModified) {
			return false;
		}
		
		if (importeExcepto != _cast.importeExcepto) {
			return false;
		}
		
		if (importeExceptoNull != _cast.importeExceptoNull) {
			return false;
		}
		
		if (importeExceptoModified != _cast.importeExceptoModified) {
			return false;
		}
		
		if (idDeLaPercepcionDeduccion != _cast.idDeLaPercepcionDeduccion) {
			return false;
		}
		
		if (idDeLaPercepcionDeduccionNull != _cast.idDeLaPercepcionDeduccionNull) {
			return false;
		}
		
		if (idDeLaPercepcionDeduccionModified != _cast.idDeLaPercepcionDeduccionModified) {
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
		_hashCode = 29 * _hashCode + idNominaComprobanteDescripcion;
		_hashCode = 29 * _hashCode + (idNominaComprobanteDescripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCromprobanteFiscal;
		_hashCode = 29 * _hashCode + (idCromprobanteFiscalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCromprobanteFiscalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idPercepcionDeduccion;
		_hashCode = 29 * _hashCode + (idPercepcionDeduccionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idPercepcionDeduccionModified ? 1 : 0);
		if (tipoClave != null) {
			_hashCode = 29 * _hashCode + tipoClave.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (tipoClaveModified ? 1 : 0);
		if (clavePatron != null) {
			_hashCode = 29 * _hashCode + clavePatron.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (clavePatronModified ? 1 : 0);
		if (conceptoDescripcion != null) {
			_hashCode = 29 * _hashCode + conceptoDescripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (conceptoDescripcionModified ? 1 : 0);
		long temp_importeGravado = Double.doubleToLongBits(importeGravado);
		_hashCode = 29 * _hashCode + (int) (temp_importeGravado ^ (temp_importeGravado >>> 32));
		_hashCode = 29 * _hashCode + (importeGravadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (importeGravadoModified ? 1 : 0);
		long temp_importeExcepto = Double.doubleToLongBits(importeExcepto);
		_hashCode = 29 * _hashCode + (int) (temp_importeExcepto ^ (temp_importeExcepto >>> 32));
		_hashCode = 29 * _hashCode + (importeExceptoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (importeExceptoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idDeLaPercepcionDeduccion;
		_hashCode = 29 * _hashCode + (idDeLaPercepcionDeduccionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idDeLaPercepcionDeduccionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NominaComprobanteDescripcionPercepcionDeduccionPk
	 */
	public NominaComprobanteDescripcionPercepcionDeduccionPk createPk()
	{
		return new NominaComprobanteDescripcionPercepcionDeduccionPk(idNominaComprobanteDescripcion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.NominaComprobanteDescripcionPercepcionDeduccion: " );
		ret.append( "idNominaComprobanteDescripcion=" + idNominaComprobanteDescripcion );
		ret.append( ", idCromprobanteFiscal=" + idCromprobanteFiscal );
		ret.append( ", idPercepcionDeduccion=" + idPercepcionDeduccion );
		ret.append( ", tipoClave=" + tipoClave );
		ret.append( ", clavePatron=" + clavePatron );
		ret.append( ", conceptoDescripcion=" + conceptoDescripcion );
		ret.append( ", importeGravado=" + importeGravado );
		ret.append( ", importeExcepto=" + importeExcepto );
		ret.append( ", idDeLaPercepcionDeduccion=" + idDeLaPercepcionDeduccion );
		return ret.toString();
	}

}
