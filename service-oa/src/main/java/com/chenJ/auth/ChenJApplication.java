package com.chenJ.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.mapper
 * @ClassName : ChenJApplication.java
 * @createTime : 2024/4/24 1:35
 * @Description :
 */
@SpringBootApplication
@MapperScan(value = "com.chenJ.auth.mapper")
public class ChenJApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChenJApplication.class, args);
    }
}
