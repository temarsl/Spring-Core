package my;

import org.springframework.stereotype.Component;

@Component
public class Music {
    public void on() {
        System.out.println("music on");
    }
    public void setVolume(int i) {
        System.out.println("music volume - " + i);
    }
    public void off() {
        System.out.println("music off");
    }
}
