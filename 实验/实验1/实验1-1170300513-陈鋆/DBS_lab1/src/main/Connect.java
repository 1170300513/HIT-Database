package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
  static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver"; //JDBC driver name
  static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/edusystem?user=root&serverTimezone=Asia/Shanghai"; //���ݿ�URL
  
  static final String USER = "root"; //�û���
  static final String PASS = "chen5211999"; //����
  
  public static Connection getConn(Connection conn){
    // Register JDBC driver
    try {
      Class.forName(JDBC_DRIVER);
      System.out.println("�ɹ�����Mysql Driver!");
    } catch (Exception e) {
      System.out.print("����Mysql Driverʧ��!");
      e.printStackTrace();
    }
    //�������ݿ�
    try {
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      conn.setAutoCommit(false);
      System.out.println("�ɹ����ӵ����ݿ�!");
    } catch (Exception e) {
      System.out.println("���ӵ����ݿ�ʧ��!");
      e.printStackTrace();
    }
    return conn;
}
}
