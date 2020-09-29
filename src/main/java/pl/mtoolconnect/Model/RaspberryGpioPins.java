package pl.mtoolconnect.Model;

import com.pi4j.io.gpio.*;

import java.time.LocalDate;
import java.time.LocalTime;


public class RaspberryGpioPins {

    private int id;
    private String station;
    private LocalDate date;
    private LocalTime time;

    /*
    SENSORS MAP

    Station 1
        in-     GPIO 8
        out-    GPIO 9
    Station 2
        in-     GPIO 7
        out-    GPIO 0
    Station 3
        in-     GPIO 2
        out-    GPIO 3
    Station 4
        in-     GPIO 12
        out-    GPIO 13

     */
// create gpio controller instance
    final GpioController gpio = GpioFactory.getInstance();

// create provision for pins
    GpioPinDigitalInput s1SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_08, "s1In");
    GpioPinDigitalInput s1SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_09, "s1Out");
    GpioPinDigitalInput s2SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, "s2In");
    GpioPinDigitalInput s2SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, "s2Out");
    GpioPinDigitalInput s3SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, "s3In");
    GpioPinDigitalInput s3SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_03, "s3Out");
    GpioPinDigitalInput s4SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_12, "s4In");
    GpioPinDigitalInput s4SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_13, "s4Out");


}
