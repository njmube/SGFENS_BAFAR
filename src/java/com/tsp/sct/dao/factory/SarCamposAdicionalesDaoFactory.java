/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.factory;

import java.sql.Connection;
import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.jdbc.*;

public class SarCamposAdicionalesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return SarCamposAdicionalesDao
	 */
	public static SarCamposAdicionalesDao create()
	{
		return new SarCamposAdicionalesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return SarCamposAdicionalesDao
	 */
	public static SarCamposAdicionalesDao create(Connection conn)
	{
		return new SarCamposAdicionalesDaoImpl( conn );
	}

}
