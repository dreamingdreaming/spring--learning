import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * IOC（控制反转的SpringJDBC模板）
 *
 * @author renl
 * @date 2018-11-29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2IOC {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
    public void demo02(){
        jdbcTemplate.update("insert into account  values (null ,?,?);","renl03",25000d);
    }

}
