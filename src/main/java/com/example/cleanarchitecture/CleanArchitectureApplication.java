package com.example.cleanarchitecture;

import infrastructure.console.Main;
import model.Exception.NotValidePriceException;
import model.Exception.UserIsNotPublicException;
import model.Exception.UserIsPublicException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanArchitectureApplication {

    public static void main(String[] args) throws UserIsPublicException, UserIsNotPublicException, NotValidePriceException {
        Main.executeUseCases();
    }

}
