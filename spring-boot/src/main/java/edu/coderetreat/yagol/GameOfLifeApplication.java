package edu.coderetreat.yagol;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.coderetreat.yagol.rest")
public class GameOfLifeApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GameOfLifeApplication.class, args);
    }


}