package io.github.cgew85;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderPatternApplicationTests {

    @Test
    public void testBuilder() {
        Cocktail whiteRussian = new Cocktail.CocktailBuilder("Vodka", "Kahlua")
                .setCherry(false).setLittleUmbrella(true).build();
        assertEquals(whiteRussian.getBoozeNumberOne(), "Vodka");
        assertEquals(whiteRussian.getBoozeNumberTwo(), "Kahlua");
        assertEquals(whiteRussian.hasCherry(), false);
        assertEquals(whiteRussian.hasLittleUmbrella(), true);
    }
}
