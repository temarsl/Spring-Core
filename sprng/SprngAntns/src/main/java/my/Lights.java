package my;

import org.springframework.stereotype.Component;

@Component
public class Lights {
    public void OnOff(int x) {
        if(x == 1) {
            System.out.println("lights on");
        } else System.out.println("lights off");
    }
}
