package my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarFacade {
    @Autowired
    Lights lights;
    @Autowired
    Music music;

    @Autowired
    public CarFacade(Lights lights, Music music) {
        this.lights = lights;
        this.music = music;
    }
    public void getInTheCar() {
        System.out.println("go!");
        lights.OnOff(1);
        music.on();
        music.setVolume(100);
    }
    public void getOutOfTheCar() {
        System.out.println("end :) ");
        lights.OnOff(0);
        music.off();
    }
}
