package Ch38.Domain.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Ch38.Domain.Dao.ConnectionPool.ConnectionItem;
import Ch38.Domain.Dao.ConnectionPool.ConnectionPool;

public abstract class Dao {
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	//CONNECTION POOL
	protected ConnectionPool connectionPool;
	protected ConnectionItem connectionItem;
	
	public Dao() throws Exception{
		//connectionPool
		connectionPool = ConnectionPool.getInstance();
	}
}
