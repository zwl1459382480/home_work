package mytest;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookInfoDao extends BookDB {

    /**
     * 实现增删改功能
     * @param sql
     * @return
     */
    public int executeUpdate(String sql){
        int r=0;
        getConnection();
        Statement statement = getStatement();
        try {
            r = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return r;
    }
    public List<Map<String,Object>> executeQuery(String sql){
        getConnection();
        Statement statement = getStatement();
        List<Map<String,Object>> books = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            while (resultSet.next()){
                Map<String,Object> map = new HashMap<>();
                for (int i = 0;i<columnCount;i++){
                    String key = resultSetMetaData.getColumnLabel(i+1);
                    Object value = resultSet.getObject(i+1);
                    map.put(key,value);
                }
                books.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return books;
    }

}
