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
import java.util.Date;

public class NominaComprobanteDescripcion implements Serializable
{
	/** 
	 * This attribute maps to the column ID_NOMINA_COMPROBANTE_DESCRIPCION in the nomina_comprobante_descripcion table.
	 */
	protected int idNominaComprobanteDescripcion;

	/** 
	 * This attribute represents whether the attribute idNominaComprobanteDescripcion has been modified since being read from the database.
	 */
	protected boolean idNominaComprobanteDescripcionModified = false;

	/** 
	 * This attribute maps to the column ID_CROMPROBANTE_FISCAL in the nomina_comprobante_descripcion table.
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
	 * This attribute maps to the column FECHA_PAGO in the nomina_comprobante_descripcion table.
	 */
	protected Date fechaPago;

	/** 
	 * This attribute represents whether the attribute fechaPago has been modified since being read from the database.
	 */
	protected boolean fechaPagoModified = false;

	/** 
	 * This attribute maps to the column FECHA_INICIAL_PAGO in the nomina_comprobante_descripcion table.
	 */
	protected Date fechaInicialPago;

	/** 
	 * This attribute represents whether the attribute fechaInicialPago has been modified since being read from the database.
	 */
	protected boolean fechaInicialPagoModified = false;

	/** 
	 * This attribute maps to the column FECHA_FIN_PAGO in the nomina_comprobante_descripcion table.
	 */
	protected Date fechaFinPago;

	/** 
	 * This attribute represents whether the attribute fechaFinPago has been modified since being read from the database.
	 */
	protected boolean fechaFinPagoModified = false;

	/** 
	 * This attribute maps to the column NUM_DIAS_PAGADOS in the nomina_comprobante_descripcion table.
	 */
	protected double numDiasPagados;

	/** 
	 * This attribute represents whether the primitive attribute numDiasPagados is null.
	 */
	protected boolean numDiasPagadosNull = true;

	/** 
	 * This attribute represents whether the attribute numDiasPagados has been modified since being read from the database.
	 */
	protected boolean numDiasPagadosModified = false;

	/** 
	 * This attribute maps to the column ISR_IMPUESTO_PORCENTAJE in the nomina_comprobante_descripcion table.
	 */
	protected double isrImpuestoPorcentaje;

	/** 
	 * This attribute represents whether the primitive attribute isrImpuestoPorcentaje is null.
	 */
	protected boolean isrImpuestoPorcentajeNull = true;

	/** 
	 * This attribute represents whether the attribute isrImpuestoPorcentaje has been modified since being read from the database.
	 */
	protected boolean isrImpuestoPorcentajeModified = false;

	/** 
	 * This attribute maps to the column ISR_MONTO_IMPUESTO in the nomina_comprobante_descripcion table.
	 */
	protected double isrMontoImpuesto;

	/** 
	 * This attribute represents whether the primitive attribute isrMontoImpuesto is null.
	 */
	protected boolean isrMontoImpuestoNull = true;

	/** 
	 * This attribute represents whether the attribute isrMontoImpuesto has been modified since being read from the database.
	 */
	protected boolean isrMontoImpuestoModified = false;

	/** 
	 * This attribute maps to the column ID_NOMINA_REG_PATRONAL in the nomina_comprobante_descripcion table.
	 */
	protected int idNominaRegPatronal;

	/** 
	 * This attribute represents whether the primitive attribute idNominaRegPatronal is null.
	 */
	protected boolean idNominaRegPatronalNull = true;

	/** 
	 * This attribute represents whether the attribute idNominaRegPatronal has been modified since being read from the database.
	 */
	protected boolean idNominaRegPatronalModified = false;

	/**
	 * Method 'NominaComprobanteDescripcion'
	 * 
	 */
	public NominaComprobanteDescripcion()
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
	 * Method 'getFechaPago'
	 * 
	 * @return Date
	 */
	public Date getFechaPago()
	{
		return fechaPago;
	}

	/**
	 * Method 'setFechaPago'
	 * 
	 * @param fechaPago
	 */
	public void setFechaPago(Date fechaPago)
	{
		this.fechaPago = fechaPago;
		this.fechaPagoModified = true;
	}

	/** 
	 * Sets the value of fechaPagoModified
	 */
	public void setFechaPagoModified(boolean fechaPagoModified)
	{
		this.fechaPagoModified = fechaPagoModified;
	}

	/** 
	 * Gets the value of fechaPagoModified
	 */
	public boolean isFechaPagoModified()
	{
		return fechaPagoModified;
	}

	/**
	 * Method 'getFechaInicialPago'
	 * 
	 * @return Date
	 */
	public Date getFechaInicialPago()
	{
		return fechaInicialPago;
	}

	/**
	 * Method 'setFechaInicialPago'
	 * 
	 * @param fechaInicialPago
	 */
	public void setFechaInicialPago(Date fechaInicialPago)
	{
		this.fechaInicialPago = fechaInicialPago;
		this.fechaInicialPagoModified = true;
	}

	/** 
	 * Sets the value of fechaInicialPagoModified
	 */
	public void setFechaInicialPagoModified(boolean fechaInicialPagoModified)
	{
		this.fechaInicialPagoModified = fechaInicialPagoModified;
	}

	/** 
	 * Gets the value of fechaInicialPagoModified
	 */
	public boolean isFechaInicialPagoModified()
	{
		return fechaInicialPagoModified;
	}

	/**
	 * Method 'getFechaFinPago'
	 * 
	 * @return Date
	 */
	public Date getFechaFinPago()
	{
		return fechaFinPago;
	}

	/**
	 * Method 'setFechaFinPago'
	 * 
	 * @param fechaFinPago
	 */
	public void setFechaFinPago(Date fechaFinPago)
	{
		this.fechaFinPago = fechaFinPago;
		this.fechaFinPagoModified = true;
	}

	/** 
	 * Sets the value of fechaFinPagoModified
	 */
	public void setFechaFinPagoModified(boolean fechaFinPagoModified)
	{
		this.fechaFinPagoModified = fechaFinPagoModified;
	}

	/** 
	 * Gets the value of fechaFinPagoModified
	 */
	public boolean isFechaFinPagoModified()
	{
		return fechaFinPagoModified;
	}

	/**
	 * Method 'getNumDiasPagados'
	 * 
	 * @return double
	 */
	public double getNumDiasPagados()
	{
		return numDiasPagados;
	}

	/**
	 * Method 'setNumDiasPagados'
	 * 
	 * @param numDiasPagados
	 */
	public void setNumDiasPagados(double numDiasPagados)
	{
		this.numDiasPagados = numDiasPagados;
		this.numDiasPagadosNull = false;
		this.numDiasPagadosModified = true;
	}

	/**
	 * Method 'setNumDiasPagadosNull'
	 * 
	 * @param value
	 */
	public void setNumDiasPagadosNull(boolean value)
	{
		this.numDiasPagadosNull = value;
		this.numDiasPagadosModified = true;
	}

	/**
	 * Method 'isNumDiasPagadosNull'
	 * 
	 * @return boolean
	 */
	public boolean isNumDiasPagadosNull()
	{
		return numDiasPagadosNull;
	}

	/** 
	 * Sets the value of numDiasPagadosModified
	 */
	public void setNumDiasPagadosModified(boolean numDiasPagadosModified)
	{
		this.numDiasPagadosModified = numDiasPagadosModified;
	}

	/** 
	 * Gets the value of numDiasPagadosModified
	 */
	public boolean isNumDiasPagadosModified()
	{
		return numDiasPagadosModified;
	}

	/**
	 * Method 'getIsrImpuestoPorcentaje'
	 * 
	 * @return double
	 */
	public double getIsrImpuestoPorcentaje()
	{
		return isrImpuestoPorcentaje;
	}

	/**
	 * Method 'setIsrImpuestoPorcentaje'
	 * 
	 * @param isrImpuestoPorcentaje
	 */
	public void setIsrImpuestoPorcentaje(double isrImpuestoPorcentaje)
	{
		this.isrImpuestoPorcentaje = isrImpuestoPorcentaje;
		this.isrImpuestoPorcentajeNull = false;
		this.isrImpuestoPorcentajeModified = true;
	}

	/**
	 * Method 'setIsrImpuestoPorcentajeNull'
	 * 
	 * @param value
	 */
	public void setIsrImpuestoPorcentajeNull(boolean value)
	{
		this.isrImpuestoPorcentajeNull = value;
		this.isrImpuestoPorcentajeModified = true;
	}

	/**
	 * Method 'isIsrImpuestoPorcentajeNull'
	 * 
	 * @return boolean
	 */
	public boolean isIsrImpuestoPorcentajeNull()
	{
		return isrImpuestoPorcentajeNull;
	}

	/** 
	 * Sets the value of isrImpuestoPorcentajeModified
	 */
	public void setIsrImpuestoPorcentajeModified(boolean isrImpuestoPorcentajeModified)
	{
		this.isrImpuestoPorcentajeModified = isrImpuestoPorcentajeModified;
	}

	/** 
	 * Gets the value of isrImpuestoPorcentajeModified
	 */
	public boolean isIsrImpuestoPorcentajeModified()
	{
		return isrImpuestoPorcentajeModified;
	}

	/**
	 * Method 'getIsrMontoImpuesto'
	 * 
	 * @return double
	 */
	public double getIsrMontoImpuesto()
	{
		return isrMontoImpuesto;
	}

	/**
	 * Method 'setIsrMontoImpuesto'
	 * 
	 * @param isrMontoImpuesto
	 */
	public void setIsrMontoImpuesto(double isrMontoImpuesto)
	{
		this.isrMontoImpuesto = isrMontoImpuesto;
		this.isrMontoImpuestoNull = false;
		this.isrMontoImpuestoModified = true;
	}

	/**
	 * Method 'setIsrMontoImpuestoNull'
	 * 
	 * @param value
	 */
	public void setIsrMontoImpuestoNull(boolean value)
	{
		this.isrMontoImpuestoNull = value;
		this.isrMontoImpuestoModified = true;
	}

	/**
	 * Method 'isIsrMontoImpuestoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIsrMontoImpuestoNull()
	{
		return isrMontoImpuestoNull;
	}

	/** 
	 * Sets the value of isrMontoImpuestoModified
	 */
	public void setIsrMontoImpuestoModified(boolean isrMontoImpuestoModified)
	{
		this.isrMontoImpuestoModified = isrMontoImpuestoModified;
	}

	/** 
	 * Gets the value of isrMontoImpuestoModified
	 */
	public boolean isIsrMontoImpuestoModified()
	{
		return isrMontoImpuestoModified;
	}

	/**
	 * Method 'getIdNominaRegPatronal'
	 * 
	 * @return int
	 */
	public int getIdNominaRegPatronal()
	{
		return idNominaRegPatronal;
	}

	/**
	 * Method 'setIdNominaRegPatronal'
	 * 
	 * @param idNominaRegPatronal
	 */
	public void setIdNominaRegPatronal(int idNominaRegPatronal)
	{
		this.idNominaRegPatronal = idNominaRegPatronal;
		this.idNominaRegPatronalNull = false;
		this.idNominaRegPatronalModified = true;
	}

	/**
	 * Method 'setIdNominaRegPatronalNull'
	 * 
	 * @param value
	 */
	public void setIdNominaRegPatronalNull(boolean value)
	{
		this.idNominaRegPatronalNull = value;
		this.idNominaRegPatronalModified = true;
	}

	/**
	 * Method 'isIdNominaRegPatronalNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdNominaRegPatronalNull()
	{
		return idNominaRegPatronalNull;
	}

	/** 
	 * Sets the value of idNominaRegPatronalModified
	 */
	public void setIdNominaRegPatronalModified(boolean idNominaRegPatronalModified)
	{
		this.idNominaRegPatronalModified = idNominaRegPatronalModified;
	}

	/** 
	 * Gets the value of idNominaRegPatronalModified
	 */
	public boolean isIdNominaRegPatronalModified()
	{
		return idNominaRegPatronalModified;
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
		
		if (!(_other instanceof NominaComprobanteDescripcion)) {
			return false;
		}
		
		final NominaComprobanteDescripcion _cast = (NominaComprobanteDescripcion) _other;
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
		
		if (fechaPago == null ? _cast.fechaPago != fechaPago : !fechaPago.equals( _cast.fechaPago )) {
			return false;
		}
		
		if (fechaPagoModified != _cast.fechaPagoModified) {
			return false;
		}
		
		if (fechaInicialPago == null ? _cast.fechaInicialPago != fechaInicialPago : !fechaInicialPago.equals( _cast.fechaInicialPago )) {
			return false;
		}
		
		if (fechaInicialPagoModified != _cast.fechaInicialPagoModified) {
			return false;
		}
		
		if (fechaFinPago == null ? _cast.fechaFinPago != fechaFinPago : !fechaFinPago.equals( _cast.fechaFinPago )) {
			return false;
		}
		
		if (fechaFinPagoModified != _cast.fechaFinPagoModified) {
			return false;
		}
		
		if (numDiasPagados != _cast.numDiasPagados) {
			return false;
		}
		
		if (numDiasPagadosNull != _cast.numDiasPagadosNull) {
			return false;
		}
		
		if (numDiasPagadosModified != _cast.numDiasPagadosModified) {
			return false;
		}
		
		if (isrImpuestoPorcentaje != _cast.isrImpuestoPorcentaje) {
			return false;
		}
		
		if (isrImpuestoPorcentajeNull != _cast.isrImpuestoPorcentajeNull) {
			return false;
		}
		
		if (isrImpuestoPorcentajeModified != _cast.isrImpuestoPorcentajeModified) {
			return false;
		}
		
		if (isrMontoImpuesto != _cast.isrMontoImpuesto) {
			return false;
		}
		
		if (isrMontoImpuestoNull != _cast.isrMontoImpuestoNull) {
			return false;
		}
		
		if (isrMontoImpuestoModified != _cast.isrMontoImpuestoModified) {
			return false;
		}
		
		if (idNominaRegPatronal != _cast.idNominaRegPatronal) {
			return false;
		}
		
		if (idNominaRegPatronalNull != _cast.idNominaRegPatronalNull) {
			return false;
		}
		
		if (idNominaRegPatronalModified != _cast.idNominaRegPatronalModified) {
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
		if (fechaPago != null) {
			_hashCode = 29 * _hashCode + fechaPago.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaPagoModified ? 1 : 0);
		if (fechaInicialPago != null) {
			_hashCode = 29 * _hashCode + fechaInicialPago.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaInicialPagoModified ? 1 : 0);
		if (fechaFinPago != null) {
			_hashCode = 29 * _hashCode + fechaFinPago.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaFinPagoModified ? 1 : 0);
		long temp_numDiasPagados = Double.doubleToLongBits(numDiasPagados);
		_hashCode = 29 * _hashCode + (int) (temp_numDiasPagados ^ (temp_numDiasPagados >>> 32));
		_hashCode = 29 * _hashCode + (numDiasPagadosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (numDiasPagadosModified ? 1 : 0);
		long temp_isrImpuestoPorcentaje = Double.doubleToLongBits(isrImpuestoPorcentaje);
		_hashCode = 29 * _hashCode + (int) (temp_isrImpuestoPorcentaje ^ (temp_isrImpuestoPorcentaje >>> 32));
		_hashCode = 29 * _hashCode + (isrImpuestoPorcentajeNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (isrImpuestoPorcentajeModified ? 1 : 0);
		long temp_isrMontoImpuesto = Double.doubleToLongBits(isrMontoImpuesto);
		_hashCode = 29 * _hashCode + (int) (temp_isrMontoImpuesto ^ (temp_isrMontoImpuesto >>> 32));
		_hashCode = 29 * _hashCode + (isrMontoImpuestoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (isrMontoImpuestoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idNominaRegPatronal;
		_hashCode = 29 * _hashCode + (idNominaRegPatronalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idNominaRegPatronalModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NominaComprobanteDescripcionPk
	 */
	public NominaComprobanteDescripcionPk createPk()
	{
		return new NominaComprobanteDescripcionPk(idNominaComprobanteDescripcion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.NominaComprobanteDescripcion: " );
		ret.append( "idNominaComprobanteDescripcion=" + idNominaComprobanteDescripcion );
		ret.append( ", idCromprobanteFiscal=" + idCromprobanteFiscal );
		ret.append( ", fechaPago=" + fechaPago );
		ret.append( ", fechaInicialPago=" + fechaInicialPago );
		ret.append( ", fechaFinPago=" + fechaFinPago );
		ret.append( ", numDiasPagados=" + numDiasPagados );
		ret.append( ", isrImpuestoPorcentaje=" + isrImpuestoPorcentaje );
		ret.append( ", isrMontoImpuesto=" + isrMontoImpuesto );
		ret.append( ", idNominaRegPatronal=" + idNominaRegPatronal );
		return ret.toString();
	}

}
