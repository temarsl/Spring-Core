package my2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

class Adapter implements Heroo {
    Allyy ally;

    public Adapter(Allyy ally) {
        this.ally = ally;
    }

    @Override
    public void attack() {
        ally.spell();
    }

    @Override
    public void dodge() {
        ally.protection();
    }

    @Bean("Adapter")
    public Adapter getAlly() {
        return new Adapter(ally);
    }
}
