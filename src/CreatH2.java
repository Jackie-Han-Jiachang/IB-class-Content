import java.sql.Connection;
import java.sql.DriverManager;

public class CreatH2 {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:h2:file:/Users/jackyhan/Java/h2/data/traveldb", "sa", "");
        conn.close();
        System.out.println("✅ 连接成功，数据库文件应已生成");
    }
}