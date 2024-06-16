package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age,Address address){};

record Address(String state,String city){};

@Configuration
public class AppConfigration {
    @Bean
    public String name()
    {
        return "pankaj";
    }

    @Bean
    public int age()
    {
        return 25;
    }

    @Bean
    public Address address()
    {
        return new Address("up","lucknow");
    }

    @Bean
    public Person person1()
    {
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person2(String name,int age,Address address)
    {
        return new Person(name,age,address);
    }

}
