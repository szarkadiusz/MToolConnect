package pl.mtoolconnect.Model;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import org.springframework.stereotype.Service;

@Service
public class RaspberryGpioPinsListener implements GpioPinListenerDigital {
    String objectChange;
    // create gpio controller instance
    final GpioController gpio = GpioFactory.getInstance();

    // create provision for pins


     s1SensorIn.addListener(new GpioPinListenerDigital() {
        @Override
        public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
            // display pin state on console
            System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
        }
//        https://pi4j.com/1.2/example/listener.html
    }

    @Override
    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {

    });


//    @Override
//    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
////        https://pi4j.com/1.2/usage.html#Create_Controller_Instance
//
//        // display pin state on console
//if(event.getState()== PinState.HIGH){
//        objectChange = event.getPin() + " ruch";
//    }else{
//        objectChange="brak";
//    }
}}
