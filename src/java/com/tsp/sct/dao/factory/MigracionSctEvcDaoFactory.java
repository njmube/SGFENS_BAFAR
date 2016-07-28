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

public class MigracionSctEvcDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return MigracionSctEvcDao
	 */
	public static MigracionSctEvcDao create()
	{
		return new MigracionSctEvcDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return MigracionSctEvcDao
	 */
	public static MigracionSctEvcDao create(Connection conn)
	{
		return new MigracionSctEvcDaoImpl( conn );
	}

}
