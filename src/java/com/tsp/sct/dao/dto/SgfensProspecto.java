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

public class SgfensProspecto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PROSPECTO in the sgfens_prospecto table.
	 */
	protected int idProspecto;

	/** 
	 * This attribute represents whether the attribute idProspecto has been modified since being read from the database.
	 */
	protected boolean idProspectoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the sgfens_prospecto table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column RAZON_SOCIAL in the sgfens_prospecto table.
	 */
	protected String razonSocial;

	/** 
	 * This attribute represents whether the attribute razonSocial has been modified since being read from the database.
	 */
	protected boolean razonSocialModified = false;

	/** 
	 * This attribute maps to the column LADA in the sgfens_prospecto table.
	 */
	protected String lada;

	/** 
	 * This attribute represents whether the attribute lada has been modified since being read from the database.
	 */
	protected boolean ladaModified = false;

	/** 
	 * This attribute maps to the column TELEFONO in the sgfens_prospecto table.
	 */
	protected String telefono;

	/** 
	 * This attribute represents whether the attribute telefono has been modified since being read from the database.
	 */
	protected boolean telefonoModified = false;

	/** 
	 * This attribute maps to the column CELULAR in the sgfens_prospecto table.
	 */
	protected String celular;

	/** 
	 * This attribute represents whether the attribute celular has been modified since being read from the database.
	 */
	protected boolean celularModified = false;

	/** 
	 * This attribute maps to the column CORREO in the sgfens_prospecto table.
	 */
	protected String correo;

	/** 
	 * This attribute represents whether the attribute correo has been modified since being read from the database.
	 */
	protected boolean correoModified = false;

	/** 
	 * This attribute maps to the column CONTACTO in the sgfens_prospecto table.
	 */
	protected String contacto;

	/** 
	 * This attribute represents whether the attribute contacto has been modified since being read from the database.
	 */
	protected boolean contactoModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the sgfens_prospecto table.
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
	 * This attribute maps to the column DESCRIPCION in the sgfens_prospecto table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column LATITUD in the sgfens_prospecto table.
	 */
	protected double latitud;

	/** 
	 * This attribute represents whether the attribute latitud has been modified since being read from the database.
	 */
	protected boolean latitudModified = false;

	/** 
	 * This attribute maps to the column LONGITUD in the sgfens_prospecto table.
	 */
	protected double longitud;

	/** 
	 * This attribute represents whether the attribute longitud has been modified since being read from the database.
	 */
	protected boolean longitudModified = false;

	/** 
	 * This attribute maps to the column DIRECCION in the sgfens_prospecto table.
	 */
	protected String direccion;

	/** 
	 * This attribute represents whether the attribute direccion has been modified since being read from the database.
	 */
	protected boolean direccionModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_IMAGEN_PROSPECTO in the sgfens_prospecto table.
	 */
	protected String nombreImagenProspecto;

	/** 
	 * This attribute represents whether the attribute nombreImagenProspecto has been modified since being read from the database.
	 */
	protected boolean nombreImagenProspectoModified = false;

	/** 
	 * This attribute maps to the column ID_USUARIO_VENDEDOR in the sgfens_prospecto table.
	 */
	protected int idUsuarioVendedor;

	/** 
	 * This attribute represents whether the attribute idUsuarioVendedor has been modified since being read from the database.
	 */
	protected boolean idUsuarioVendedorModified = false;

	/** 
	 * This attribute maps to the column FECHA_REGISTRO in the sgfens_prospecto table.
	 */
	protected Date fechaRegistro;

	/** 
	 * This attribute represents whether the attribute fechaRegistro has been modified since being read from the database.
	 */
	protected boolean fechaRegistroModified = false;

	/** 
	 * This attribute maps to the column DIR_NUMERO_EXTERIOR in the sgfens_prospecto table.
	 */
	protected String dirNumeroExterior;

	/** 
	 * This attribute represents whether the attribute dirNumeroExterior has been modified since being read from the database.
	 */
	protected boolean dirNumeroExteriorModified = false;

	/** 
	 * This attribute maps to the column DIR_NUMERO_INTERIOR in the sgfens_prospecto table.
	 */
	protected String dirNumeroInterior;

	/** 
	 * This attribute represents whether the attribute dirNumeroInterior has been modified since being read from the database.
	 */
	protected boolean dirNumeroInteriorModified = false;

	/** 
	 * This attribute maps to the column DIR_CODIGO_POSTAL in the sgfens_prospecto table.
	 */
	protected String dirCodigoPostal;

	/** 
	 * This attribute represents whether the attribute dirCodigoPostal has been modified since being read from the database.
	 */
	protected boolean dirCodigoPostalModified = false;

	/** 
	 * This attribute maps to the column DIR_COLONIA in the sgfens_prospecto table.
	 */
	protected String dirColonia;

	/** 
	 * This attribute represents whether the attribute dirColonia has been modified since being read from the database.
	 */
	protected boolean dirColoniaModified = false;

	/**
	 * Method 'SgfensProspecto'
	 * 
	 */
	public SgfensProspecto()
	{
	}

	/**
	 * Method 'getIdProspecto'
	 * 
	 * @return int
	 */
	public int getIdProspecto()
	{
		return idProspecto;
	}

	/**
	 * Method 'setIdProspecto'
	 * 
	 * @param idProspecto
	 */
	public void setIdProspecto(int idProspecto)
	{
		this.idProspecto = idProspecto;
		this.idProspectoModified = true;
	}

	/** 
	 * Sets the value of idProspectoModified
	 */
	public void setIdProspectoModified(boolean idProspectoModified)
	{
		this.idProspectoModified = idProspectoModified;
	}

	/** 
	 * Gets the value of idProspectoModified
	 */
	public boolean isIdProspectoModified()
	{
		return idProspectoModified;
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
		this.idEmpresaModified = true;
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
	 * Method 'getRazonSocial'
	 * 
	 * @return String
	 */
	public String getRazonSocial()
	{
		return razonSocial;
	}

	/**
	 * Method 'setRazonSocial'
	 * 
	 * @param razonSocial
	 */
	public void setRazonSocial(String razonSocial)
	{
		this.razonSocial = razonSocial;
		this.razonSocialModified = true;
	}

	/** 
	 * Sets the value of razonSocialModified
	 */
	public void setRazonSocialModified(boolean razonSocialModified)
	{
		this.razonSocialModified = razonSocialModified;
	}

	/** 
	 * Gets the value of razonSocialModified
	 */
	public boolean isRazonSocialModified()
	{
		return razonSocialModified;
	}

	/**
	 * Method 'getLada'
	 * 
	 * @return String
	 */
	public String getLada()
	{
		return lada;
	}

	/**
	 * Method 'setLada'
	 * 
	 * @param lada
	 */
	public void setLada(String lada)
	{
		this.lada = lada;
		this.ladaModified = true;
	}

	/** 
	 * Sets the value of ladaModified
	 */
	public void setLadaModified(boolean ladaModified)
	{
		this.ladaModified = ladaModified;
	}

	/** 
	 * Gets the value of ladaModified
	 */
	public boolean isLadaModified()
	{
		return ladaModified;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
		this.telefonoModified = true;
	}

	/** 
	 * Sets the value of telefonoModified
	 */
	public void setTelefonoModified(boolean telefonoModified)
	{
		this.telefonoModified = telefonoModified;
	}

	/** 
	 * Gets the value of telefonoModified
	 */
	public boolean isTelefonoModified()
	{
		return telefonoModified;
	}

	/**
	 * Method 'getCelular'
	 * 
	 * @return String
	 */
	public String getCelular()
	{
		return celular;
	}

	/**
	 * Method 'setCelular'
	 * 
	 * @param celular
	 */
	public void setCelular(String celular)
	{
		this.celular = celular;
		this.celularModified = true;
	}

	/** 
	 * Sets the value of celularModified
	 */
	public void setCelularModified(boolean celularModified)
	{
		this.celularModified = celularModified;
	}

	/** 
	 * Gets the value of celularModified
	 */
	public boolean isCelularModified()
	{
		return celularModified;
	}

	/**
	 * Method 'getCorreo'
	 * 
	 * @return String
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'setCorreo'
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
		this.correoModified = true;
	}

	/** 
	 * Sets the value of correoModified
	 */
	public void setCorreoModified(boolean correoModified)
	{
		this.correoModified = correoModified;
	}

	/** 
	 * Gets the value of correoModified
	 */
	public boolean isCorreoModified()
	{
		return correoModified;
	}

	/**
	 * Method 'getContacto'
	 * 
	 * @return String
	 */
	public String getContacto()
	{
		return contacto;
	}

	/**
	 * Method 'setContacto'
	 * 
	 * @param contacto
	 */
	public void setContacto(String contacto)
	{
		this.contacto = contacto;
		this.contactoModified = true;
	}

	/** 
	 * Sets the value of contactoModified
	 */
	public void setContactoModified(boolean contactoModified)
	{
		this.contactoModified = contactoModified;
	}

	/** 
	 * Gets the value of contactoModified
	 */
	public boolean isContactoModified()
	{
		return contactoModified;
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
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'getLatitud'
	 * 
	 * @return double
	 */
	public double getLatitud()
	{
		return latitud;
	}

	/**
	 * Method 'setLatitud'
	 * 
	 * @param latitud
	 */
	public void setLatitud(double latitud)
	{
		this.latitud = latitud;
		this.latitudModified = true;
	}

	/** 
	 * Sets the value of latitudModified
	 */
	public void setLatitudModified(boolean latitudModified)
	{
		this.latitudModified = latitudModified;
	}

	/** 
	 * Gets the value of latitudModified
	 */
	public boolean isLatitudModified()
	{
		return latitudModified;
	}

	/**
	 * Method 'getLongitud'
	 * 
	 * @return double
	 */
	public double getLongitud()
	{
		return longitud;
	}

	/**
	 * Method 'setLongitud'
	 * 
	 * @param longitud
	 */
	public void setLongitud(double longitud)
	{
		this.longitud = longitud;
		this.longitudModified = true;
	}

	/** 
	 * Sets the value of longitudModified
	 */
	public void setLongitudModified(boolean longitudModified)
	{
		this.longitudModified = longitudModified;
	}

	/** 
	 * Gets the value of longitudModified
	 */
	public boolean isLongitudModified()
	{
		return longitudModified;
	}

	/**
	 * Method 'getDireccion'
	 * 
	 * @return String
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * Method 'setDireccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
		this.direccionModified = true;
	}

	/** 
	 * Sets the value of direccionModified
	 */
	public void setDireccionModified(boolean direccionModified)
	{
		this.direccionModified = direccionModified;
	}

	/** 
	 * Gets the value of direccionModified
	 */
	public boolean isDireccionModified()
	{
		return direccionModified;
	}

	/**
	 * Method 'getNombreImagenProspecto'
	 * 
	 * @return String
	 */
	public String getNombreImagenProspecto()
	{
		return nombreImagenProspecto;
	}

	/**
	 * Method 'setNombreImagenProspecto'
	 * 
	 * @param nombreImagenProspecto
	 */
	public void setNombreImagenProspecto(String nombreImagenProspecto)
	{
		this.nombreImagenProspecto = nombreImagenProspecto;
		this.nombreImagenProspectoModified = true;
	}

	/** 
	 * Sets the value of nombreImagenProspectoModified
	 */
	public void setNombreImagenProspectoModified(boolean nombreImagenProspectoModified)
	{
		this.nombreImagenProspectoModified = nombreImagenProspectoModified;
	}

	/** 
	 * Gets the value of nombreImagenProspectoModified
	 */
	public boolean isNombreImagenProspectoModified()
	{
		return nombreImagenProspectoModified;
	}

	/**
	 * Method 'getIdUsuarioVendedor'
	 * 
	 * @return int
	 */
	public int getIdUsuarioVendedor()
	{
		return idUsuarioVendedor;
	}

	/**
	 * Method 'setIdUsuarioVendedor'
	 * 
	 * @param idUsuarioVendedor
	 */
	public void setIdUsuarioVendedor(int idUsuarioVendedor)
	{
		this.idUsuarioVendedor = idUsuarioVendedor;
		this.idUsuarioVendedorModified = true;
	}

	/** 
	 * Sets the value of idUsuarioVendedorModified
	 */
	public void setIdUsuarioVendedorModified(boolean idUsuarioVendedorModified)
	{
		this.idUsuarioVendedorModified = idUsuarioVendedorModified;
	}

	/** 
	 * Gets the value of idUsuarioVendedorModified
	 */
	public boolean isIdUsuarioVendedorModified()
	{
		return idUsuarioVendedorModified;
	}

	/**
	 * Method 'getFechaRegistro'
	 * 
	 * @return Date
	 */
	public Date getFechaRegistro()
	{
		return fechaRegistro;
	}

	/**
	 * Method 'setFechaRegistro'
	 * 
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro)
	{
		this.fechaRegistro = fechaRegistro;
		this.fechaRegistroModified = true;
	}

	/** 
	 * Sets the value of fechaRegistroModified
	 */
	public void setFechaRegistroModified(boolean fechaRegistroModified)
	{
		this.fechaRegistroModified = fechaRegistroModified;
	}

	/** 
	 * Gets the value of fechaRegistroModified
	 */
	public boolean isFechaRegistroModified()
	{
		return fechaRegistroModified;
	}

	/**
	 * Method 'getDirNumeroExterior'
	 * 
	 * @return String
	 */
	public String getDirNumeroExterior()
	{
		return dirNumeroExterior;
	}

	/**
	 * Method 'setDirNumeroExterior'
	 * 
	 * @param dirNumeroExterior
	 */
	public void setDirNumeroExterior(String dirNumeroExterior)
	{
		this.dirNumeroExterior = dirNumeroExterior;
		this.dirNumeroExteriorModified = true;
	}

	/** 
	 * Sets the value of dirNumeroExteriorModified
	 */
	public void setDirNumeroExteriorModified(boolean dirNumeroExteriorModified)
	{
		this.dirNumeroExteriorModified = dirNumeroExteriorModified;
	}

	/** 
	 * Gets the value of dirNumeroExteriorModified
	 */
	public boolean isDirNumeroExteriorModified()
	{
		return dirNumeroExteriorModified;
	}

	/**
	 * Method 'getDirNumeroInterior'
	 * 
	 * @return String
	 */
	public String getDirNumeroInterior()
	{
		return dirNumeroInterior;
	}

	/**
	 * Method 'setDirNumeroInterior'
	 * 
	 * @param dirNumeroInterior
	 */
	public void setDirNumeroInterior(String dirNumeroInterior)
	{
		this.dirNumeroInterior = dirNumeroInterior;
		this.dirNumeroInteriorModified = true;
	}

	/** 
	 * Sets the value of dirNumeroInteriorModified
	 */
	public void setDirNumeroInteriorModified(boolean dirNumeroInteriorModified)
	{
		this.dirNumeroInteriorModified = dirNumeroInteriorModified;
	}

	/** 
	 * Gets the value of dirNumeroInteriorModified
	 */
	public boolean isDirNumeroInteriorModified()
	{
		return dirNumeroInteriorModified;
	}

	/**
	 * Method 'getDirCodigoPostal'
	 * 
	 * @return String
	 */
	public String getDirCodigoPostal()
	{
		return dirCodigoPostal;
	}

	/**
	 * Method 'setDirCodigoPostal'
	 * 
	 * @param dirCodigoPostal
	 */
	public void setDirCodigoPostal(String dirCodigoPostal)
	{
		this.dirCodigoPostal = dirCodigoPostal;
		this.dirCodigoPostalModified = true;
	}

	/** 
	 * Sets the value of dirCodigoPostalModified
	 */
	public void setDirCodigoPostalModified(boolean dirCodigoPostalModified)
	{
		this.dirCodigoPostalModified = dirCodigoPostalModified;
	}

	/** 
	 * Gets the value of dirCodigoPostalModified
	 */
	public boolean isDirCodigoPostalModified()
	{
		return dirCodigoPostalModified;
	}

	/**
	 * Method 'getDirColonia'
	 * 
	 * @return String
	 */
	public String getDirColonia()
	{
		return dirColonia;
	}

	/**
	 * Method 'setDirColonia'
	 * 
	 * @param dirColonia
	 */
	public void setDirColonia(String dirColonia)
	{
		this.dirColonia = dirColonia;
		this.dirColoniaModified = true;
	}

	/** 
	 * Sets the value of dirColoniaModified
	 */
	public void setDirColoniaModified(boolean dirColoniaModified)
	{
		this.dirColoniaModified = dirColoniaModified;
	}

	/** 
	 * Gets the value of dirColoniaModified
	 */
	public boolean isDirColoniaModified()
	{
		return dirColoniaModified;
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
		
		if (!(_other instanceof SgfensProspecto)) {
			return false;
		}
		
		final SgfensProspecto _cast = (SgfensProspecto) _other;
		if (idProspecto != _cast.idProspecto) {
			return false;
		}
		
		if (idProspectoModified != _cast.idProspectoModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (razonSocial == null ? _cast.razonSocial != razonSocial : !razonSocial.equals( _cast.razonSocial )) {
			return false;
		}
		
		if (razonSocialModified != _cast.razonSocialModified) {
			return false;
		}
		
		if (lada == null ? _cast.lada != lada : !lada.equals( _cast.lada )) {
			return false;
		}
		
		if (ladaModified != _cast.ladaModified) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (telefonoModified != _cast.telefonoModified) {
			return false;
		}
		
		if (celular == null ? _cast.celular != celular : !celular.equals( _cast.celular )) {
			return false;
		}
		
		if (celularModified != _cast.celularModified) {
			return false;
		}
		
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		if (correoModified != _cast.correoModified) {
			return false;
		}
		
		if (contacto == null ? _cast.contacto != contacto : !contacto.equals( _cast.contacto )) {
			return false;
		}
		
		if (contactoModified != _cast.contactoModified) {
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
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (latitud != _cast.latitud) {
			return false;
		}
		
		if (latitudModified != _cast.latitudModified) {
			return false;
		}
		
		if (longitud != _cast.longitud) {
			return false;
		}
		
		if (longitudModified != _cast.longitudModified) {
			return false;
		}
		
		if (direccion == null ? _cast.direccion != direccion : !direccion.equals( _cast.direccion )) {
			return false;
		}
		
		if (direccionModified != _cast.direccionModified) {
			return false;
		}
		
		if (nombreImagenProspecto == null ? _cast.nombreImagenProspecto != nombreImagenProspecto : !nombreImagenProspecto.equals( _cast.nombreImagenProspecto )) {
			return false;
		}
		
		if (nombreImagenProspectoModified != _cast.nombreImagenProspectoModified) {
			return false;
		}
		
		if (idUsuarioVendedor != _cast.idUsuarioVendedor) {
			return false;
		}
		
		if (idUsuarioVendedorModified != _cast.idUsuarioVendedorModified) {
			return false;
		}
		
		if (fechaRegistro == null ? _cast.fechaRegistro != fechaRegistro : !fechaRegistro.equals( _cast.fechaRegistro )) {
			return false;
		}
		
		if (fechaRegistroModified != _cast.fechaRegistroModified) {
			return false;
		}
		
		if (dirNumeroExterior == null ? _cast.dirNumeroExterior != dirNumeroExterior : !dirNumeroExterior.equals( _cast.dirNumeroExterior )) {
			return false;
		}
		
		if (dirNumeroExteriorModified != _cast.dirNumeroExteriorModified) {
			return false;
		}
		
		if (dirNumeroInterior == null ? _cast.dirNumeroInterior != dirNumeroInterior : !dirNumeroInterior.equals( _cast.dirNumeroInterior )) {
			return false;
		}
		
		if (dirNumeroInteriorModified != _cast.dirNumeroInteriorModified) {
			return false;
		}
		
		if (dirCodigoPostal == null ? _cast.dirCodigoPostal != dirCodigoPostal : !dirCodigoPostal.equals( _cast.dirCodigoPostal )) {
			return false;
		}
		
		if (dirCodigoPostalModified != _cast.dirCodigoPostalModified) {
			return false;
		}
		
		if (dirColonia == null ? _cast.dirColonia != dirColonia : !dirColonia.equals( _cast.dirColonia )) {
			return false;
		}
		
		if (dirColoniaModified != _cast.dirColoniaModified) {
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
		_hashCode = 29 * _hashCode + idProspecto;
		_hashCode = 29 * _hashCode + (idProspectoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (razonSocial != null) {
			_hashCode = 29 * _hashCode + razonSocial.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (razonSocialModified ? 1 : 0);
		if (lada != null) {
			_hashCode = 29 * _hashCode + lada.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (ladaModified ? 1 : 0);
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (telefonoModified ? 1 : 0);
		if (celular != null) {
			_hashCode = 29 * _hashCode + celular.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (celularModified ? 1 : 0);
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (correoModified ? 1 : 0);
		if (contacto != null) {
			_hashCode = 29 * _hashCode + contacto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contactoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		long temp_latitud = Double.doubleToLongBits(latitud);
		_hashCode = 29 * _hashCode + (int) (temp_latitud ^ (temp_latitud >>> 32));
		_hashCode = 29 * _hashCode + (latitudModified ? 1 : 0);
		long temp_longitud = Double.doubleToLongBits(longitud);
		_hashCode = 29 * _hashCode + (int) (temp_longitud ^ (temp_longitud >>> 32));
		_hashCode = 29 * _hashCode + (longitudModified ? 1 : 0);
		if (direccion != null) {
			_hashCode = 29 * _hashCode + direccion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (direccionModified ? 1 : 0);
		if (nombreImagenProspecto != null) {
			_hashCode = 29 * _hashCode + nombreImagenProspecto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreImagenProspectoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioVendedor;
		_hashCode = 29 * _hashCode + (idUsuarioVendedorModified ? 1 : 0);
		if (fechaRegistro != null) {
			_hashCode = 29 * _hashCode + fechaRegistro.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaRegistroModified ? 1 : 0);
		if (dirNumeroExterior != null) {
			_hashCode = 29 * _hashCode + dirNumeroExterior.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (dirNumeroExteriorModified ? 1 : 0);
		if (dirNumeroInterior != null) {
			_hashCode = 29 * _hashCode + dirNumeroInterior.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (dirNumeroInteriorModified ? 1 : 0);
		if (dirCodigoPostal != null) {
			_hashCode = 29 * _hashCode + dirCodigoPostal.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (dirCodigoPostalModified ? 1 : 0);
		if (dirColonia != null) {
			_hashCode = 29 * _hashCode + dirColonia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (dirColoniaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensProspectoPk
	 */
	public SgfensProspectoPk createPk()
	{
		return new SgfensProspectoPk(idProspecto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensProspecto: " );
		ret.append( "idProspecto=" + idProspecto );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", razonSocial=" + razonSocial );
		ret.append( ", lada=" + lada );
		ret.append( ", telefono=" + telefono );
		ret.append( ", celular=" + celular );
		ret.append( ", correo=" + correo );
		ret.append( ", contacto=" + contacto );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", latitud=" + latitud );
		ret.append( ", longitud=" + longitud );
		ret.append( ", direccion=" + direccion );
		ret.append( ", nombreImagenProspecto=" + nombreImagenProspecto );
		ret.append( ", idUsuarioVendedor=" + idUsuarioVendedor );
		ret.append( ", fechaRegistro=" + fechaRegistro );
		ret.append( ", dirNumeroExterior=" + dirNumeroExterior );
		ret.append( ", dirNumeroInterior=" + dirNumeroInterior );
		ret.append( ", dirCodigoPostal=" + dirCodigoPostal );
		ret.append( ", dirColonia=" + dirColonia );
		return ret.toString();
	}

}
