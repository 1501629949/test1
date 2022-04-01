package org.bwf.study;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.bwf.study.dao")
public class CatEyeApplication {
    public static void main(String[] args){
        SpringApplication.run(CatEyeApplication.class , args);
    }
}
