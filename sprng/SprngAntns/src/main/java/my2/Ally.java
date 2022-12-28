package my2;

import org.springframework.stereotype.Component;

@Component
public class Ally implements Allyy {
    @Override
    public void spell() {
        System.out.println("Va faill, Elaine");
    }

    @Override
    public void protection() {
        System.out.println("Защита");
    }
}
