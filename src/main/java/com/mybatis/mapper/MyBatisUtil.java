package com.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil
{

	public static SqlSessionFactory getSqlSessionFactory()
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try
		{
			inputStream = Resources.getResourceAsStream( resource );
		} catch( IOException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build( inputStream );
	}

}
