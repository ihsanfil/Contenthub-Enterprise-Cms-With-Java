package com.contenthub;
import org.springframework.boot.SpringApplication;import org.springframework.boot.autoconfigure.SpringBootApplication;
@org.springframework.cache.annotation.EnableCaching
@SpringBootApplication public class ContentHubApplication {public static void main(String[] args){SpringApplication.run(ContentHubApplication.class,args);}}