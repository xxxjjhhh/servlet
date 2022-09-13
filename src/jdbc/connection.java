import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class Connect {
 
  public static void main(String[] args){
    
    Class.forName("oracle.jdbc.driver.OracleDriver"); //jdbc 클래스 찾기
    Connection con = DriverManager.getConnection();
    Statement st = con.createStatement(); //쿼리 입력
    ResultSet rs = st.executeQuery(sql);
    rs.next(); //다음 레코드
    String title = rs.getString("title");
  }
}
