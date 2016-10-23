package io.github.cgew85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderPatternApplication.class, args);
        final Cocktail whiteRussian = new Cocktail.CocktailBuilder("Vodka", "Kahlua")
                .setCherry(false).setLittleUmbrella(true).build();
        System.out.println("Cocktail: " + whiteRussian.getBoozeNumberOne()
        + " and " + whiteRussian.getBoozeNumberTwo());
    }
}
