package com.codewithalgi.java_game.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
}

record Address(String FirstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Algin";
    }

    @Bean
    public int age() {
        return 18;
    }

    @Bean
    public Person person() {
        var person = new Person("Dhipin", 20, new Address("Baker Street", "London"));
        return person;
    }

    @Bean(name = "person2MethodCall")
    public Person person2() {
        var person = new Person(name(), age(), address());
        return person;
    }

    @Bean(name = "person3Parameters")
    @Primary
    public Person person3(String name, int age, Address address3) {
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("addrress3qualifier") Address address3) {
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean(name = "my address")
    public Address address() {
        var Address = new Address("Baker Street", "London");
        return Address;
    }

    @Bean(name = "address3")
    @Qualifier("addrress3qualifier")
    public Address address3() {
        var Address = new Address("Grate Lake", "Canada");
        return Address;
    }
}
