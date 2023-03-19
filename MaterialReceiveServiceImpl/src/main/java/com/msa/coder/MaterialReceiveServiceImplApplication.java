package com.msa.coder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// remember add "-javaagent:/skywalking/agent/skywalking-agent.jar" jvm args to start monitoring
public class MaterialReceiveServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaterialReceiveServiceImplApplication.class, args);
    }
}
