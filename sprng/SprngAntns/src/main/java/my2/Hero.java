package my2;

import org.springframework.stereotype.Component;

@Component
public class Hero implements Heroo {
    @Override
    public void attack() {
        System.out.println("Удар мечом");
    }

    @Override
    public void dodge() {
        System.out.println("Перекат");
    }
}
