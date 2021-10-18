package demo.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MysqlDemoApplication implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("jdbcEmoteRepository")
    private EmoteRepository emoteRepository;
    public static void main(String[] args) {
        SpringApplication.run(MysqlDemoApplication.class, args);


        //System.out.println(emotes.count());
    }
    @Override
    public void run(String... args){
        System.out.println("Test");
        System.out.println(emoteRepository.count());
        System.out.println(emoteRepository.findAll());
    }

}
