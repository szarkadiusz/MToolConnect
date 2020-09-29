package pl.mtoolconnect.Model;

import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class RaspberryGpioPinsListener implements GpioPinListenerDigital {
    @Override
    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
//        https://pi4j.com/1.2/usage.html#Create_Controller_Instance
    }
}
