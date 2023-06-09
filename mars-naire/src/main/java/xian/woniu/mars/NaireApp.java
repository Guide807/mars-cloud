package xian.woniu.mars;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：Gary Wang
 * @date ：Created By ${DATE}
 */
@SpringBootApplication
@MapperScan("xian.woniu.mars.mapper")
@EnableFeignClients
public class NaireApp {

    public static void main(String[] args) {
        SpringApplication.run(NaireApp.class,args);
    }
}