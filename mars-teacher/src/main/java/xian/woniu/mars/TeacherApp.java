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
public class TeacherApp {

    public static void main(String[] args) {
        SpringApplication.run(TeacherApp.class, args);
    }

}