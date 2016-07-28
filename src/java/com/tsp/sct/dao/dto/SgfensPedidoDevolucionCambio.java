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

public class SgfensPedidoDevolucionCambio implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PEDIDO_DEVOL_CAMBIO in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idPedidoDevolCambio;

	/** 
	 * This attribute represents whether the attribute idPedidoDevolCambio has been modified since being read from the database.
	 */
	protected boolean idPedidoDevolCambioModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the sgfens_pedido_devolucion_cambio table.
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
	 * This attribute maps to the column ID_EMPRESA in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPLEADO in the sgfens_pedido_devolucion_cambio table.
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
	 * This attribute maps to the column ID_CONCEPTO in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idConcepto is null.
	 */
	protected boolean idConceptoNull = true;

	/** 
	 * This attribute represents whether the attribute idConcepto has been modified since being read from the database.
	 */
	protected boolean idConceptoModified = false;

	/** 
	 * This attribute maps to the column ID_PEDIDO in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idPedido;

	/** 
	 * This attribute represents whether the primitive attribute idPedido is null.
	 */
	protected boolean idPedidoNull = true;

	/** 
	 * This attribute represents whether the attribute idPedido has been modified since being read from the database.
	 */
	protected boolean idPedidoModified = false;

	/** 
	 * This attribute maps to the column ID_TIPO in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idTipo;

	/** 
	 * This attribute represents whether the primitive attribute idTipo is null.
	 */
	protected boolean idTipoNull = true;

	/** 
	 * This attribute represents whether the attribute idTipo has been modified since being read from the database.
	 */
	protected boolean idTipoModified = false;

	/** 
	 * This attribute maps to the column APTO_PARA_VENTA in the sgfens_pedido_devolucion_cambio table.
	 */
	protected double aptoParaVenta;

	/** 
	 * This attribute represents whether the primitive attribute aptoParaVenta is null.
	 */
	protected boolean aptoParaVentaNull = true;

	/** 
	 * This attribute represents whether the attribute aptoParaVenta has been modified since being read from the database.
	 */
	protected boolean aptoParaVentaModified = false;

	/** 
	 * This attribute maps to the column NO_APTO_PARA_VENTA in the sgfens_pedido_devolucion_cambio table.
	 */
	protected double noAptoParaVenta;

	/** 
	 * This attribute represents whether the primitive attribute noAptoParaVenta is null.
	 */
	protected boolean noAptoParaVentaNull = true;

	/** 
	 * This attribute represents whether the attribute noAptoParaVenta has been modified since being read from the database.
	 */
	protected boolean noAptoParaVentaModified = false;

	/** 
	 * This attribute maps to the column ID_CLASIFICACION in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idClasificacion;

	/** 
	 * This attribute represents whether the primitive attribute idClasificacion is null.
	 */
	protected boolean idClasificacionNull = true;

	/** 
	 * This attribute represents whether the attribute idClasificacion has been modified since being read from the database.
	 */
	protected boolean idClasificacionModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION_CLASIFICACION in the sgfens_pedido_devolucion_cambio table.
	 */
	protected String descripcionClasificacion;

	/** 
	 * This attribute represents whether the attribute descripcionClasificacion has been modified since being read from the database.
	 */
	protected boolean descripcionClasificacionModified = false;

	/** 
	 * This attribute maps to the column ID_CONCEPTO_ENTREGADO in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int idConceptoEntregado;

	/** 
	 * This attribute represents whether the primitive attribute idConceptoEntregado is null.
	 */
	protected boolean idConceptoEntregadoNull = true;

	/** 
	 * This attribute represents whether the attribute idConceptoEntregado has been modified since being read from the database.
	 */
	protected boolean idConceptoEntregadoModified = false;

	/** 
	 * This attribute maps to the column MONTO_RESULTANTE in the sgfens_pedido_devolucion_cambio table.
	 */
	protected double montoResultante;

	/** 
	 * This attribute represents whether the primitive attribute montoResultante is null.
	 */
	protected boolean montoResultanteNull = true;

	/** 
	 * This attribute represents whether the attribute montoResultante has been modified since being read from the database.
	 */
	protected boolean montoResultanteModified = false;

	/** 
	 * This attribute maps to the column DIFERENCIA_FAVOR in the sgfens_pedido_devolucion_cambio table.
	 */
	protected int diferenciaFavor;

	/** 
	 * This attribute represents whether the primitive attribute diferenciaFavor is null.
	 */
	protected boolean diferenciaFavorNull = true;

	/** 
	 * This attribute represents whether the attribute diferenciaFavor has been modified since being read from the database.
	 */
	protected boolean diferenciaFavorModified = false;

	/** 
	 * This attribute maps to the column FECHA in the sgfens_pedido_devolucion_cambio table.
	 */
	protected Date fecha;

	/** 
	 * This attribute represents whether the attribute fecha has been modified since being read from the database.
	 */
	protected boolean fechaModified = false;

	/** 
	 * This attribute maps to the column CANTIDAD_DEVUELTA in the sgfens_pedido_devolucion_cambio table.
	 */
	protected double cantidadDevuelta;

	/** 
	 * This attribute represents whether the primitive attribute cantidadDevuelta is null.
	 */
	protected boolean cantidadDevueltaNull = true;

	/** 
	 * This attribute represents whether the attribute cantidadDevuelta has been modified since being read from the database.
	 */
	protected boolean cantidadDevueltaModified = false;

	/** 
	 * This attribute maps to the column FOLIO_MOVIL in the sgfens_pedido_devolucion_cambio table.
	 */
	protected String folioMovil;

	/** 
	 * This attribute represents whether the attribute folioMovil has been modified since being read from the database.
	 */
	protected boolean folioMovilModified = false;

	/** 
	 * This attribute maps to the column DEVOLUCION_EFCTIVO in the sgfens_pedido_devolucion_cambio table.
	 */
	protected double devolucionEfctivo;

	/** 
	 * This attribute represents whether the primitive attribute devolucionEfctivo is null.
	 */
	protected boolean devolucionEfctivoNull = true;

	/** 
	 * This attribute represents whether the attribute devolucionEfctivo has been modified since being read from the database.
	 */
	protected boolean devolucionEfctivoModified = false;

	/**
	 * Method 'SgfensPedidoDevolucionCambio'
	 * 
	 */
	public SgfensPedidoDevolucionCambio()
	{
	}

	/**
	 * Method 'getIdPedidoDevolCambio'
	 * 
	 * @return int
	 */
	public int getIdPedidoDevolCambio()
	{
		return idPedidoDevolCambio;
	}

	/**
	 * Method 'setIdPedidoDevolCambio'
	 * 
	 * @param idPedidoDevolCambio
	 */
	public void setIdPedidoDevolCambio(int idPedidoDevolCambio)
	{
		this.idPedidoDevolCambio = idPedidoDevolCambio;
		this.idPedidoDevolCambioModified = true;
	}

	/** 
	 * Sets the value of idPedidoDevolCambioModified
	 */
	public void setIdPedidoDevolCambioModified(boolean idPedidoDevolCambioModified)
	{
		this.idPedidoDevolCambioModified = idPedidoDevolCambioModified;
	}

	/** 
	 * Gets the value of idPedidoDevolCambioModified
	 */
	public boolean isIdPedidoDevolCambioModified()
	{
		return idPedidoDevolCambioModified;
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
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaNull = false;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'setIdEmpresaNull'
	 * 
	 * @param value
	 */
	public void setIdEmpresaNull(boolean value)
	{
		this.idEmpresaNull = value;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'isIdEmpresaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
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
	 * Method 'getIdConcepto'
	 * 
	 * @return int
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'setIdConcepto'
	 * 
	 * @param idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
		this.idConceptoNull = false;
		this.idConceptoModified = true;
	}

	/**
	 * Method 'setIdConceptoNull'
	 * 
	 * @param value
	 */
	public void setIdConceptoNull(boolean value)
	{
		this.idConceptoNull = value;
		this.idConceptoModified = true;
	}

	/**
	 * Method 'isIdConceptoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdConceptoNull()
	{
		return idConceptoNull;
	}

	/** 
	 * Sets the value of idConceptoModified
	 */
	public void setIdConceptoModified(boolean idConceptoModified)
	{
		this.idConceptoModified = idConceptoModified;
	}

	/** 
	 * Gets the value of idConceptoModified
	 */
	public boolean isIdConceptoModified()
	{
		return idConceptoModified;
	}

	/**
	 * Method 'getIdPedido'
	 * 
	 * @return int
	 */
	public int getIdPedido()
	{
		return idPedido;
	}

	/**
	 * Method 'setIdPedido'
	 * 
	 * @param idPedido
	 */
	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
		this.idPedidoNull = false;
		this.idPedidoModified = true;
	}

	/**
	 * Method 'setIdPedidoNull'
	 * 
	 * @param value
	 */
	public void setIdPedidoNull(boolean value)
	{
		this.idPedidoNull = value;
		this.idPedidoModified = true;
	}

	/**
	 * Method 'isIdPedidoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdPedidoNull()
	{
		return idPedidoNull;
	}

	/** 
	 * Sets the value of idPedidoModified
	 */
	public void setIdPedidoModified(boolean idPedidoModified)
	{
		this.idPedidoModified = idPedidoModified;
	}

	/** 
	 * Gets the value of idPedidoModified
	 */
	public boolean isIdPedidoModified()
	{
		return idPedidoModified;
	}

	/**
	 * Method 'getIdTipo'
	 * 
	 * @return int
	 */
	public int getIdTipo()
	{
		return idTipo;
	}

	/**
	 * Method 'setIdTipo'
	 * 
	 * @param idTipo
	 */
	public void setIdTipo(int idTipo)
	{
		this.idTipo = idTipo;
		this.idTipoNull = false;
		this.idTipoModified = true;
	}

	/**
	 * Method 'setIdTipoNull'
	 * 
	 * @param value
	 */
	public void setIdTipoNull(boolean value)
	{
		this.idTipoNull = value;
		this.idTipoModified = true;
	}

	/**
	 * Method 'isIdTipoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdTipoNull()
	{
		return idTipoNull;
	}

	/** 
	 * Sets the value of idTipoModified
	 */
	public void setIdTipoModified(boolean idTipoModified)
	{
		this.idTipoModified = idTipoModified;
	}

	/** 
	 * Gets the value of idTipoModified
	 */
	public boolean isIdTipoModified()
	{
		return idTipoModified;
	}

	/**
	 * Method 'getAptoParaVenta'
	 * 
	 * @return double
	 */
	public double getAptoParaVenta()
	{
		return aptoParaVenta;
	}

	/**
	 * Method 'setAptoParaVenta'
	 * 
	 * @param aptoParaVenta
	 */
	public void setAptoParaVenta(double aptoParaVenta)
	{
		this.aptoParaVenta = aptoParaVenta;
		this.aptoParaVentaNull = false;
		this.aptoParaVentaModified = true;
	}

	/**
	 * Method 'setAptoParaVentaNull'
	 * 
	 * @param value
	 */
	public void setAptoParaVentaNull(boolean value)
	{
		this.aptoParaVentaNull = value;
		this.aptoParaVentaModified = true;
	}

	/**
	 * Method 'isAptoParaVentaNull'
	 * 
	 * @return boolean
	 */
	public boolean isAptoParaVentaNull()
	{
		return aptoParaVentaNull;
	}

	/** 
	 * Sets the value of aptoParaVentaModified
	 */
	public void setAptoParaVentaModified(boolean aptoParaVentaModified)
	{
		this.aptoParaVentaModified = aptoParaVentaModified;
	}

	/** 
	 * Gets the value of aptoParaVentaModified
	 */
	public boolean isAptoParaVentaModified()
	{
		return aptoParaVentaModified;
	}

	/**
	 * Method 'getNoAptoParaVenta'
	 * 
	 * @return double
	 */
	public double getNoAptoParaVenta()
	{
		return noAptoParaVenta;
	}

	/**
	 * Method 'setNoAptoParaVenta'
	 * 
	 * @param noAptoParaVenta
	 */
	public void setNoAptoParaVenta(double noAptoParaVenta)
	{
		this.noAptoParaVenta = noAptoParaVenta;
		this.noAptoParaVentaNull = false;
		this.noAptoParaVentaModified = true;
	}

	/**
	 * Method 'setNoAptoParaVentaNull'
	 * 
	 * @param value
	 */
	public void setNoAptoParaVentaNull(boolean value)
	{
		this.noAptoParaVentaNull = value;
		this.noAptoParaVentaModified = true;
	}

	/**
	 * Method 'isNoAptoParaVentaNull'
	 * 
	 * @return boolean
	 */
	public boolean isNoAptoParaVentaNull()
	{
		return noAptoParaVentaNull;
	}

	/** 
	 * Sets the value of noAptoParaVentaModified
	 */
	public void setNoAptoParaVentaModified(boolean noAptoParaVentaModified)
	{
		this.noAptoParaVentaModified = noAptoParaVentaModified;
	}

	/** 
	 * Gets the value of noAptoParaVentaModified
	 */
	public boolean isNoAptoParaVentaModified()
	{
		return noAptoParaVentaModified;
	}

	/**
	 * Method 'getIdClasificacion'
	 * 
	 * @return int
	 */
	public int getIdClasificacion()
	{
		return idClasificacion;
	}

	/**
	 * Method 'setIdClasificacion'
	 * 
	 * @param idClasificacion
	 */
	public void setIdClasificacion(int idClasificacion)
	{
		this.idClasificacion = idClasificacion;
		this.idClasificacionNull = false;
		this.idClasificacionModified = true;
	}

	/**
	 * Method 'setIdClasificacionNull'
	 * 
	 * @param value
	 */
	public void setIdClasificacionNull(boolean value)
	{
		this.idClasificacionNull = value;
		this.idClasificacionModified = true;
	}

	/**
	 * Method 'isIdClasificacionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdClasificacionNull()
	{
		return idClasificacionNull;
	}

	/** 
	 * Sets the value of idClasificacionModified
	 */
	public void setIdClasificacionModified(boolean idClasificacionModified)
	{
		this.idClasificacionModified = idClasificacionModified;
	}

	/** 
	 * Gets the value of idClasificacionModified
	 */
	public boolean isIdClasificacionModified()
	{
		return idClasificacionModified;
	}

	/**
	 * Method 'getDescripcionClasificacion'
	 * 
	 * @return String
	 */
	public String getDescripcionClasificacion()
	{
		return descripcionClasificacion;
	}

	/**
	 * Method 'setDescripcionClasificacion'
	 * 
	 * @param descripcionClasificacion
	 */
	public void setDescripcionClasificacion(String descripcionClasificacion)
	{
		this.descripcionClasificacion = descripcionClasificacion;
		this.descripcionClasificacionModified = true;
	}

	/** 
	 * Sets the value of descripcionClasificacionModified
	 */
	public void setDescripcionClasificacionModified(boolean descripcionClasificacionModified)
	{
		this.descripcionClasificacionModified = descripcionClasificacionModified;
	}

	/** 
	 * Gets the value of descripcionClasificacionModified
	 */
	public boolean isDescripcionClasificacionModified()
	{
		return descripcionClasificacionModified;
	}

	/**
	 * Method 'getIdConceptoEntregado'
	 * 
	 * @return int
	 */
	public int getIdConceptoEntregado()
	{
		return idConceptoEntregado;
	}

	/**
	 * Method 'setIdConceptoEntregado'
	 * 
	 * @param idConceptoEntregado
	 */
	public void setIdConceptoEntregado(int idConceptoEntregado)
	{
		this.idConceptoEntregado = idConceptoEntregado;
		this.idConceptoEntregadoNull = false;
		this.idConceptoEntregadoModified = true;
	}

	/**
	 * Method 'setIdConceptoEntregadoNull'
	 * 
	 * @param value
	 */
	public void setIdConceptoEntregadoNull(boolean value)
	{
		this.idConceptoEntregadoNull = value;
		this.idConceptoEntregadoModified = true;
	}

	/**
	 * Method 'isIdConceptoEntregadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdConceptoEntregadoNull()
	{
		return idConceptoEntregadoNull;
	}

	/** 
	 * Sets the value of idConceptoEntregadoModified
	 */
	public void setIdConceptoEntregadoModified(boolean idConceptoEntregadoModified)
	{
		this.idConceptoEntregadoModified = idConceptoEntregadoModified;
	}

	/** 
	 * Gets the value of idConceptoEntregadoModified
	 */
	public boolean isIdConceptoEntregadoModified()
	{
		return idConceptoEntregadoModified;
	}

	/**
	 * Method 'getMontoResultante'
	 * 
	 * @return double
	 */
	public double getMontoResultante()
	{
		return montoResultante;
	}

	/**
	 * Method 'setMontoResultante'
	 * 
	 * @param montoResultante
	 */
	public void setMontoResultante(double montoResultante)
	{
		this.montoResultante = montoResultante;
		this.montoResultanteNull = false;
		this.montoResultanteModified = true;
	}

	/**
	 * Method 'setMontoResultanteNull'
	 * 
	 * @param value
	 */
	public void setMontoResultanteNull(boolean value)
	{
		this.montoResultanteNull = value;
		this.montoResultanteModified = true;
	}

	/**
	 * Method 'isMontoResultanteNull'
	 * 
	 * @return boolean
	 */
	public boolean isMontoResultanteNull()
	{
		return montoResultanteNull;
	}

	/** 
	 * Sets the value of montoResultanteModified
	 */
	public void setMontoResultanteModified(boolean montoResultanteModified)
	{
		this.montoResultanteModified = montoResultanteModified;
	}

	/** 
	 * Gets the value of montoResultanteModified
	 */
	public boolean isMontoResultanteModified()
	{
		return montoResultanteModified;
	}

	/**
	 * Method 'getDiferenciaFavor'
	 * 
	 * @return int
	 */
	public int getDiferenciaFavor()
	{
		return diferenciaFavor;
	}

	/**
	 * Method 'setDiferenciaFavor'
	 * 
	 * @param diferenciaFavor
	 */
	public void setDiferenciaFavor(int diferenciaFavor)
	{
		this.diferenciaFavor = diferenciaFavor;
		this.diferenciaFavorNull = false;
		this.diferenciaFavorModified = true;
	}

	/**
	 * Method 'setDiferenciaFavorNull'
	 * 
	 * @param value
	 */
	public void setDiferenciaFavorNull(boolean value)
	{
		this.diferenciaFavorNull = value;
		this.diferenciaFavorModified = true;
	}

	/**
	 * Method 'isDiferenciaFavorNull'
	 * 
	 * @return boolean
	 */
	public boolean isDiferenciaFavorNull()
	{
		return diferenciaFavorNull;
	}

	/** 
	 * Sets the value of diferenciaFavorModified
	 */
	public void setDiferenciaFavorModified(boolean diferenciaFavorModified)
	{
		this.diferenciaFavorModified = diferenciaFavorModified;
	}

	/** 
	 * Gets the value of diferenciaFavorModified
	 */
	public boolean isDiferenciaFavorModified()
	{
		return diferenciaFavorModified;
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
	 * Method 'getCantidadDevuelta'
	 * 
	 * @return double
	 */
	public double getCantidadDevuelta()
	{
		return cantidadDevuelta;
	}

	/**
	 * Method 'setCantidadDevuelta'
	 * 
	 * @param cantidadDevuelta
	 */
	public void setCantidadDevuelta(double cantidadDevuelta)
	{
		this.cantidadDevuelta = cantidadDevuelta;
		this.cantidadDevueltaNull = false;
		this.cantidadDevueltaModified = true;
	}

	/**
	 * Method 'setCantidadDevueltaNull'
	 * 
	 * @param value
	 */
	public void setCantidadDevueltaNull(boolean value)
	{
		this.cantidadDevueltaNull = value;
		this.cantidadDevueltaModified = true;
	}

	/**
	 * Method 'isCantidadDevueltaNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadDevueltaNull()
	{
		return cantidadDevueltaNull;
	}

	/** 
	 * Sets the value of cantidadDevueltaModified
	 */
	public void setCantidadDevueltaModified(boolean cantidadDevueltaModified)
	{
		this.cantidadDevueltaModified = cantidadDevueltaModified;
	}

	/** 
	 * Gets the value of cantidadDevueltaModified
	 */
	public boolean isCantidadDevueltaModified()
	{
		return cantidadDevueltaModified;
	}

	/**
	 * Method 'getFolioMovil'
	 * 
	 * @return String
	 */
	public String getFolioMovil()
	{
		return folioMovil;
	}

	/**
	 * Method 'setFolioMovil'
	 * 
	 * @param folioMovil
	 */
	public void setFolioMovil(String folioMovil)
	{
		this.folioMovil = folioMovil;
		this.folioMovilModified = true;
	}

	/** 
	 * Sets the value of folioMovilModified
	 */
	public void setFolioMovilModified(boolean folioMovilModified)
	{
		this.folioMovilModified = folioMovilModified;
	}

	/** 
	 * Gets the value of folioMovilModified
	 */
	public boolean isFolioMovilModified()
	{
		return folioMovilModified;
	}

	/**
	 * Method 'getDevolucionEfctivo'
	 * 
	 * @return double
	 */
	public double getDevolucionEfctivo()
	{
		return devolucionEfctivo;
	}

	/**
	 * Method 'setDevolucionEfctivo'
	 * 
	 * @param devolucionEfctivo
	 */
	public void setDevolucionEfctivo(double devolucionEfctivo)
	{
		this.devolucionEfctivo = devolucionEfctivo;
		this.devolucionEfctivoNull = false;
		this.devolucionEfctivoModified = true;
	}

	/**
	 * Method 'setDevolucionEfctivoNull'
	 * 
	 * @param value
	 */
	public void setDevolucionEfctivoNull(boolean value)
	{
		this.devolucionEfctivoNull = value;
		this.devolucionEfctivoModified = true;
	}

	/**
	 * Method 'isDevolucionEfctivoNull'
	 * 
	 * @return boolean
	 */
	public boolean isDevolucionEfctivoNull()
	{
		return devolucionEfctivoNull;
	}

	/** 
	 * Sets the value of devolucionEfctivoModified
	 */
	public void setDevolucionEfctivoModified(boolean devolucionEfctivoModified)
	{
		this.devolucionEfctivoModified = devolucionEfctivoModified;
	}

	/** 
	 * Gets the value of devolucionEfctivoModified
	 */
	public boolean isDevolucionEfctivoModified()
	{
		return devolucionEfctivoModified;
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
		
		if (!(_other instanceof SgfensPedidoDevolucionCambio)) {
			return false;
		}
		
		final SgfensPedidoDevolucionCambio _cast = (SgfensPedidoDevolucionCambio) _other;
		if (idPedidoDevolCambio != _cast.idPedidoDevolCambio) {
			return false;
		}
		
		if (idPedidoDevolCambioModified != _cast.idPedidoDevolCambioModified) {
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
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
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
		
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idConceptoNull != _cast.idConceptoNull) {
			return false;
		}
		
		if (idConceptoModified != _cast.idConceptoModified) {
			return false;
		}
		
		if (idPedido != _cast.idPedido) {
			return false;
		}
		
		if (idPedidoNull != _cast.idPedidoNull) {
			return false;
		}
		
		if (idPedidoModified != _cast.idPedidoModified) {
			return false;
		}
		
		if (idTipo != _cast.idTipo) {
			return false;
		}
		
		if (idTipoNull != _cast.idTipoNull) {
			return false;
		}
		
		if (idTipoModified != _cast.idTipoModified) {
			return false;
		}
		
		if (aptoParaVenta != _cast.aptoParaVenta) {
			return false;
		}
		
		if (aptoParaVentaNull != _cast.aptoParaVentaNull) {
			return false;
		}
		
		if (aptoParaVentaModified != _cast.aptoParaVentaModified) {
			return false;
		}
		
		if (noAptoParaVenta != _cast.noAptoParaVenta) {
			return false;
		}
		
		if (noAptoParaVentaNull != _cast.noAptoParaVentaNull) {
			return false;
		}
		
		if (noAptoParaVentaModified != _cast.noAptoParaVentaModified) {
			return false;
		}
		
		if (idClasificacion != _cast.idClasificacion) {
			return false;
		}
		
		if (idClasificacionNull != _cast.idClasificacionNull) {
			return false;
		}
		
		if (idClasificacionModified != _cast.idClasificacionModified) {
			return false;
		}
		
		if (descripcionClasificacion == null ? _cast.descripcionClasificacion != descripcionClasificacion : !descripcionClasificacion.equals( _cast.descripcionClasificacion )) {
			return false;
		}
		
		if (descripcionClasificacionModified != _cast.descripcionClasificacionModified) {
			return false;
		}
		
		if (idConceptoEntregado != _cast.idConceptoEntregado) {
			return false;
		}
		
		if (idConceptoEntregadoNull != _cast.idConceptoEntregadoNull) {
			return false;
		}
		
		if (idConceptoEntregadoModified != _cast.idConceptoEntregadoModified) {
			return false;
		}
		
		if (montoResultante != _cast.montoResultante) {
			return false;
		}
		
		if (montoResultanteNull != _cast.montoResultanteNull) {
			return false;
		}
		
		if (montoResultanteModified != _cast.montoResultanteModified) {
			return false;
		}
		
		if (diferenciaFavor != _cast.diferenciaFavor) {
			return false;
		}
		
		if (diferenciaFavorNull != _cast.diferenciaFavorNull) {
			return false;
		}
		
		if (diferenciaFavorModified != _cast.diferenciaFavorModified) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (fechaModified != _cast.fechaModified) {
			return false;
		}
		
		if (cantidadDevuelta != _cast.cantidadDevuelta) {
			return false;
		}
		
		if (cantidadDevueltaNull != _cast.cantidadDevueltaNull) {
			return false;
		}
		
		if (cantidadDevueltaModified != _cast.cantidadDevueltaModified) {
			return false;
		}
		
		if (folioMovil == null ? _cast.folioMovil != folioMovil : !folioMovil.equals( _cast.folioMovil )) {
			return false;
		}
		
		if (folioMovilModified != _cast.folioMovilModified) {
			return false;
		}
		
		if (devolucionEfctivo != _cast.devolucionEfctivo) {
			return false;
		}
		
		if (devolucionEfctivoNull != _cast.devolucionEfctivoNull) {
			return false;
		}
		
		if (devolucionEfctivoModified != _cast.devolucionEfctivoModified) {
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
		_hashCode = 29 * _hashCode + idPedidoDevolCambio;
		_hashCode = 29 * _hashCode + (idPedidoDevolCambioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpleado;
		_hashCode = 29 * _hashCode + (idEmpleadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpleadoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idConceptoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idPedido;
		_hashCode = 29 * _hashCode + (idPedidoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idPedidoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idTipo;
		_hashCode = 29 * _hashCode + (idTipoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idTipoModified ? 1 : 0);
		long temp_aptoParaVenta = Double.doubleToLongBits(aptoParaVenta);
		_hashCode = 29 * _hashCode + (int) (temp_aptoParaVenta ^ (temp_aptoParaVenta >>> 32));
		_hashCode = 29 * _hashCode + (aptoParaVentaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (aptoParaVentaModified ? 1 : 0);
		long temp_noAptoParaVenta = Double.doubleToLongBits(noAptoParaVenta);
		_hashCode = 29 * _hashCode + (int) (temp_noAptoParaVenta ^ (temp_noAptoParaVenta >>> 32));
		_hashCode = 29 * _hashCode + (noAptoParaVentaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (noAptoParaVentaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idClasificacion;
		_hashCode = 29 * _hashCode + (idClasificacionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idClasificacionModified ? 1 : 0);
		if (descripcionClasificacion != null) {
			_hashCode = 29 * _hashCode + descripcionClasificacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionClasificacionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idConceptoEntregado;
		_hashCode = 29 * _hashCode + (idConceptoEntregadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoEntregadoModified ? 1 : 0);
		long temp_montoResultante = Double.doubleToLongBits(montoResultante);
		_hashCode = 29 * _hashCode + (int) (temp_montoResultante ^ (temp_montoResultante >>> 32));
		_hashCode = 29 * _hashCode + (montoResultanteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (montoResultanteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + diferenciaFavor;
		_hashCode = 29 * _hashCode + (diferenciaFavorNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (diferenciaFavorModified ? 1 : 0);
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaModified ? 1 : 0);
		long temp_cantidadDevuelta = Double.doubleToLongBits(cantidadDevuelta);
		_hashCode = 29 * _hashCode + (int) (temp_cantidadDevuelta ^ (temp_cantidadDevuelta >>> 32));
		_hashCode = 29 * _hashCode + (cantidadDevueltaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (cantidadDevueltaModified ? 1 : 0);
		if (folioMovil != null) {
			_hashCode = 29 * _hashCode + folioMovil.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (folioMovilModified ? 1 : 0);
		long temp_devolucionEfctivo = Double.doubleToLongBits(devolucionEfctivo);
		_hashCode = 29 * _hashCode + (int) (temp_devolucionEfctivo ^ (temp_devolucionEfctivo >>> 32));
		_hashCode = 29 * _hashCode + (devolucionEfctivoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (devolucionEfctivoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensPedidoDevolucionCambioPk
	 */
	public SgfensPedidoDevolucionCambioPk createPk()
	{
		return new SgfensPedidoDevolucionCambioPk(idPedidoDevolCambio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensPedidoDevolucionCambio: " );
		ret.append( "idPedidoDevolCambio=" + idPedidoDevolCambio );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEmpleado=" + idEmpleado );
		ret.append( ", idConcepto=" + idConcepto );
		ret.append( ", idPedido=" + idPedido );
		ret.append( ", idTipo=" + idTipo );
		ret.append( ", aptoParaVenta=" + aptoParaVenta );
		ret.append( ", noAptoParaVenta=" + noAptoParaVenta );
		ret.append( ", idClasificacion=" + idClasificacion );
		ret.append( ", descripcionClasificacion=" + descripcionClasificacion );
		ret.append( ", idConceptoEntregado=" + idConceptoEntregado );
		ret.append( ", montoResultante=" + montoResultante );
		ret.append( ", diferenciaFavor=" + diferenciaFavor );
		ret.append( ", fecha=" + fecha );
		ret.append( ", cantidadDevuelta=" + cantidadDevuelta );
		ret.append( ", folioMovil=" + folioMovil );
		ret.append( ", devolucionEfctivo=" + devolucionEfctivo );
		return ret.toString();
	}

}
