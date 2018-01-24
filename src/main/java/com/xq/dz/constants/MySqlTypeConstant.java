package com.xq.dz.constants;

import com.xq.dz.annotation.LengthCount;


/**
 * 用于配置Mysql数据库中类型，并且该类型需要设置几个长度
 * 这里配置多少个类型决定了，创建表能使用多少类型
 * 例如：varchar(1)
 *     double(5,2)
 *     datetime
 *
 * @author sunchenbin
 * @version 2016年6月23日 下午5:59:33 
 */
public class MySqlTypeConstant {

	@LengthCount
	public static final  String INT = "int";
	
	@LengthCount
	public static final  String VARCHAR = "varchar";
	
	@LengthCount(lengthCount=0)
	public static final  String TEXT = "text";
	
	@LengthCount(lengthCount=0)
	public static final  String DATETIME = "datetime";
	
	@LengthCount(lengthCount=2)
	public static final  String DECIMAL = "decimal";
	
	@LengthCount(lengthCount=2)
	public static final  String DOUBLE = "double";
	
	@LengthCount
	public static final  String CHAR = "char";
	
	/**
	 * 等于java中的long
	 */
	@LengthCount
	public static final  String BIGINT = "bigint";
}
