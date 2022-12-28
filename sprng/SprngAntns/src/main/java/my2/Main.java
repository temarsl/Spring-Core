package my2;

import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigReactiveWebApplicationContext(Adapter.class);
        Heroo adapter = ctx.getBean("Adapter", Adapter.class);
        Heroo hero = new Hero();
        Allyy ally = new Ally();

        System.out.println("Союзник помогает:");
        ally.spell();
        ally.protection();
        System.out.println("Герой делает:");
        testHero(hero);
        System.out.println("Адаптированный союзник помогает:");
        testHero(adapter);
    }

    static void testHero(Heroo iHero) {
        iHero.attack();
        iHero.dodge();
    }
}