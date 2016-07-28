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

public class EstatusDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EstatusDao
	 */
	public static EstatusDao create()
	{
		return new EstatusDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EstatusDao
	 */
	public static EstatusDao create(Connection conn)
	{
		return new EstatusDaoImpl( conn );
	}

}
