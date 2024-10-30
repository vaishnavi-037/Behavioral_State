package tv;

import tv.context.TVContext;

public class Application {
    public static void main(String[] args) {

        TVContext context = new TVContext();

        // turning TV ON
        context.pressPowerButton();

        // turning TV OFF
        context.pressPowerButton();
    }
}
