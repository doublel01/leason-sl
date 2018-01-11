package org.leason.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lee on 2018/1/10.
 */
@SpringBootApplication
@MapperScan("org.leason.learn.dal.dao")
@ComponentScan("org.leason.learn")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
