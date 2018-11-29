import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JDBC模板类的使用
 *
 * @author renl
 * @date 2018-11-29
 */
public class JdbcDemo1 {
    @Test
    /*jdbc模板的使用类似于Dbutils*/
    public void demo01(){
    /*创建连接池*/
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/springtest");
    dataSource.setUsername("root");
    dataSource.setPassword("123");

    /*创建jdbc模板*/
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    jdbcTemplate.update("insert into account values (null ,?,?)","renl",10000d);

}

}
