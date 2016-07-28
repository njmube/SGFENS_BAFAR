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

public class EmpleadoArqueo implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ARQUEO in the empleado_arqueo table.
	 */
	protected int idArqueo;

	/** 
	 * This attribute represents whether the attribute idArqueo has been modified since being read from the database.
	 */
	protected boolean idArqueoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPLEADO in the empleado_arqueo table.
	 */
	protected int idEmpleado;

	/** 
	 * This attribute represents whether the primitive attribute idEmpleado is null.
	 */
	protected boolean idEmpleadoNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpleado has been modified since being read from the database.
	 */
	protected boolean idEmpleadoModified = false;

	/** 
	 * This attribute maps to the column ID_COBRANZA_METODO_PAGO in the empleado_arqueo table.
	 */
	protected int idCobranzaMetodoPago;

	/** 
	 * This attribute represents whether the primitive attribute idCobranzaMetodoPago is null.
	 */
	protected boolean idCobranzaMetodoPagoNull = true;

	/** 
	 * This attribute represents whether the attribute idCobranzaMetodoPago has been modified since being read from the database.
	 */
	protected boolean idCobranzaMetodoPagoModified = false;

	/** 
	 * This attribute maps to the column MONTO in the empleado_arqueo table.
	 */
	protected double monto;

	/** 
	 * This attribute represents whether the primitive attribute monto is null.
	 */
	protected boolean montoNull = true;

	/** 
	 * This attribute represents whether the attribute monto has been modified since being read from the database.
	 */
	protected boolean montoModified = false;

	/** 
	 * This attribute maps to the column REFERENCIA in the empleado_arqueo table.
	 */
	protected String referencia;

	/** 
	 * This attribute represents whether the attribute referencia has been modified since being read from the database.
	 */
	protected boolean referenciaModified = false;

	/** 
	 * This attribute maps to the column FECHA in the empleado_arqueo table.
	 */
	protected Date fecha;

	/** 
	 * This attribute represents whether the attribute fecha has been modified since being read from the database.
	 */
	protected boolean fechaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the empleado_arqueo table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/**
	 * Method 'EmpleadoArqueo'
	 * 
	 */
	public EmpleadoArqueo()
	{
	}

	/**
	 * Method 'getIdArqueo'
	 * 
	 * @return int
	 */
	public int getIdArqueo()
	{
		return idArqueo;
	}

	/**
	 * Method 'setIdArqueo'
	 * 
	 * @param idArqueo
	 */
	public void setIdArqueo(int idArqueo)
	{
		this.idArqueo = idArqueo;
		this.idArqueoModified = true;
	}

	/** 
	 * Sets the value of idArqueoModified
	 */
	public void setIdArqueoModified(boolean idArqueoModified)
	{
		this.idArqueoModified = idArqueoModified;
	}

	/** 
	 * Gets the value of idArqueoModified
	 */
	public boolean isIdArqueoModified()
	{
		return idArqueoModified;
	}

	/**
	 * Method 'getIdEmpleado'
	 * 
	 * @return int
	 */
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	/**
	 * Method 'setIdEmpleado'
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
		this.idEmpleadoNull = false;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'setIdEmpleadoNull'
	 * 
	 * @param value
	 */
	public void setIdEmpleadoNull(boolean value)
	{
		this.idEmpleadoNull = value;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'isIdEmpleadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpleadoNull()
	{
		return idEmpleadoNull;
	}

	/** 
	 * Sets the value of idEmpleadoModified
	 */
	public void setIdEmpleadoModified(boolean idEmpleadoModified)
	{
		this.idEmpleadoModified = idEmpleadoModified;
	}

	/** 
	 * Gets the value of idEmpleadoModified
	 */
	public boolean isIdEmpleadoModified()
	{
		return idEmpleadoModified;
	}

	/**
	 * Method 'getIdCobranzaMetodoPago'
	 * 
	 * @return int
	 */
	public int getIdCobranzaMetodoPago()
	{
		return idCobranzaMetodoPago;
	}

	/**
	 * Method 'setIdCobranzaMetodoPago'
	 * 
	 * @param idCobranzaMetodoPago
	 */
	public void setIdCobranzaMetodoPago(int idCobranzaMetodoPago)
	{
		this.idCobranzaMetodoPago = idCobranzaMetodoPago;
		this.idCobranzaMetodoPagoNull = false;
		this.idCobranzaMetodoPagoModified = true;
	}

	/**
	 * Method 'setIdCobranzaMetodoPagoNull'
	 * 
	 * @param value
	 */
	public void setIdCobranzaMetodoPagoNull(boolean value)
	{
		this.idCobranzaMetodoPagoNull = value;
		this.idCobranzaMetodoPagoModified = true;
	}

	/**
	 * Method 'isIdCobranzaMetodoPagoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCobranzaMetodoPagoNull()
	{
		return idCobranzaMetodoPagoNull;
	}

	/** 
	 * Sets the value of idCobranzaMetodoPagoModified
	 */
	public void setIdCobranzaMetodoPagoModified(boolean idCobranzaMetodoPagoModified)
	{
		this.idCobranzaMetodoPagoModified = idCobranzaMetodoPagoModified;
	}

	/** 
	 * Gets the value of idCobranzaMetodoPagoModified
	 */
	public boolean isIdCobranzaMetodoPagoModified()
	{
		return idCobranzaMetodoPagoModified;
	}

	/**
	 * Method 'getMonto'
	 * 
	 * @return double
	 */
	public double getMonto()
	{
		return monto;
	}

	/**
	 * Method 'setMonto'
	 * 
	 * @param monto
	 */
	public void setMonto(double monto)
	{
		this.monto = monto;
		this.montoNull = false;
		this.montoModified = true;
	}

	/**
	 * Method 'setMontoNull'
	 * 
	 * @param value
	 */
	public void setMontoNull(boolean value)
	{
		this.montoNull = value;
		this.montoModified = true;
	}

	/**
	 * Method 'isMontoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMontoNull()
	{
		return montoNull;
	}

	/** 
	 * Sets the value of montoModified
	 */
	public void setMontoModified(boolean montoModified)
	{
		this.montoModified = montoModified;
	}

	/** 
	 * Gets the value of montoModified
	 */
	public boolean isMontoModified()
	{
		return montoModified;
	}

	/**
	 * Method 'getReferencia'
	 * 
	 * @return String
	 */
	public String getReferencia()
	{
		return referencia;
	}

	/**
	 * Method 'setReferencia'
	 * 
	 * @param referencia
	 */
	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
		this.referenciaModified = true;
	}

	/** 
	 * Sets the value of referenciaModified
	 */
	public void setReferenciaModified(boolean referenciaModified)
	{
		this.referenciaModified = referenciaModified;
	}

	/** 
	 * Gets the value of referenciaModified
	 */
	public boolean isReferenciaModified()
	{
		return referenciaModified;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
		this.fechaModified = true;
	}

	/** 
	 * Sets the value of fechaModified
	 */
	public void setFechaModified(boolean fechaModified)
	{
		this.fechaModified = fechaModified;
	}

	/** 
	 * Gets the value of fechaModified
	 */
	public boolean isFechaModified()
	{
		return fechaModified;
	}

	/**
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
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
		
		if (!(_other instanceof EmpleadoArqueo)) {
			return false;
		}
		
		final EmpleadoArqueo _cast = (EmpleadoArqueo) _other;
		if (idArqueo != _cast.idArqueo) {
			return false;
		}
		
		if (idArqueoModified != _cast.idArqueoModified) {
			return false;
		}
		
		if (idEmpleado != _cast.idEmpleado) {
			return false;
		}
		
		if (idEmpleadoNull != _cast.idEmpleadoNull) {
			return false;
		}
		
		if (idEmpleadoModified != _cast.idEmpleadoModified) {
			return false;
		}
		
		if (idCobranzaMetodoPago != _cast.idCobranzaMetodoPago) {
			return false;
		}
		
		if (idCobranzaMetodoPagoNull != _cast.idCobranzaMetodoPagoNull) {
			return false;
		}
		
		if (idCobranzaMetodoPagoModified != _cast.idCobranzaMetodoPagoModified) {
			return false;
		}
		
		if (monto != _cast.monto) {
			return false;
		}
		
		if (montoNull != _cast.montoNull) {
			return false;
		}
		
		if (montoModified != _cast.montoModified) {
			return false;
		}
		
		if (referencia == null ? _cast.referencia != referencia : !referencia.equals( _cast.referencia )) {
			return false;
		}
		
		if (referenciaModified != _cast.referenciaModified) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (fechaModified != _cast.fechaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
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
		_hashCode = 29 * _hashCode + idArqueo;
		_hashCode = 29 * _hashCode + (idArqueoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpleado;
		_hashCode = 29 * _hashCode + (idEmpleadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpleadoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCobranzaMetodoPago;
		_hashCode = 29 * _hashCode + (idCobranzaMetodoPagoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCobranzaMetodoPagoModified ? 1 : 0);
		long temp_monto = Double.doubleToLongBits(monto);
		_hashCode = 29 * _hashCode + (int) (temp_monto ^ (temp_monto >>> 32));
		_hashCode = 29 * _hashCode + (montoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (montoModified ? 1 : 0);
		if (referencia != null) {
			_hashCode = 29 * _hashCode + referencia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (referenciaModified ? 1 : 0);
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpleadoArqueoPk
	 */
	public EmpleadoArqueoPk createPk()
	{
		return new EmpleadoArqueoPk(idArqueo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.EmpleadoArqueo: " );
		ret.append( "idArqueo=" + idArqueo );
		ret.append( ", idEmpleado=" + idEmpleado );
		ret.append( ", idCobranzaMetodoPago=" + idCobranzaMetodoPago );
		ret.append( ", monto=" + monto );
		ret.append( ", referencia=" + referencia );
		ret.append( ", fecha=" + fecha );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}
