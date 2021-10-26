package oit.is.lec05.kaizi.mobpro05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootSamplesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSamplesApplication.class, args);
  }

}
