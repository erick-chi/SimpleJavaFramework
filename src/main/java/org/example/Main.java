package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        FileReader reader = new FileReader("C:\\Users\\Erick Chi\\IdeaProjects\\Pomdemo\\src\\test\\resources\\ConfigFiles\\config.properties");

        Properties props = new Properties();
        props.load(reader);

        System.out.println(props.getProperty("browser"));
        System.out.println(props.getProperty("url"));
    }
}