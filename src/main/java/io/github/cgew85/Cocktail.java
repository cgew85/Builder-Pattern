package io.github.cgew85;

/**
 * Created by cgew85 on 23.10.2016.
 */
public class Cocktail {

    private String boozeNumberOne;
    private String boozeNumberTwo;

    private boolean hasCherry;
    private boolean hasLittleUmbrella;

    public String getBoozeNumberOne() {
        return boozeNumberOne;
    }

    public String getBoozeNumberTwo() {
        return boozeNumberTwo;
    }

    public boolean hasCherry() {
        return hasCherry;
    }

    public boolean hasLittleUmbrella() {
        return hasLittleUmbrella;
    }

    private Cocktail(CocktailBuilder cocktailBuilder) {
        this.boozeNumberOne = cocktailBuilder.boozeNumberOne;
        this.boozeNumberTwo = cocktailBuilder.boozeNumberTwo;

        this.hasCherry = cocktailBuilder.hasCherry;
        this.hasLittleUmbrella = cocktailBuilder.hasLittleUmbrella;
    }

    public static class CocktailBuilder {

        private String boozeNumberOne;
        private String boozeNumberTwo;

        private boolean hasCherry;
        private boolean hasLittleUmbrella;

        public CocktailBuilder(String boozeNumberOne, String boozeNumberTwo) {
            this.boozeNumberOne = boozeNumberOne;
            this.boozeNumberTwo = boozeNumberTwo;
        }

        public CocktailBuilder setCherry(boolean hasCherry) {
            this.hasCherry = hasCherry;
            return this;
        }

        public CocktailBuilder setLittleUmbrella(boolean hasLittleUmbrella) {
            this.hasLittleUmbrella = hasLittleUmbrella;
            return this;
        }

        public Cocktail build() {
            return new Cocktail(this);
        }
    }
}
