package xian.woniu.mars;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：Gary Wang
 * @date ：Created By ${DATE}
 */
@SpringBootApplication
@MapperScan("xian.woniu.mars.mapper")
public class AuthApp {

    public static void main(String[] args) {
        SpringApplication.run(AuthApp.class, args);
    }

}