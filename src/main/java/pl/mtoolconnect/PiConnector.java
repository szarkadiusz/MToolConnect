package pl.mtoolconnect;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.RaspiPin;
import pl.mtoolconnect.DAO.RaspberryDAO;

public class PiConnector implements RaspberryDAO {


    @Override
    public void getConnection() {
        final GpioController gpio = GpioFactory.getInstance();


        final GpioPinDigitalInput s1SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_08, "s1In");
        final  GpioPinDigitalInput s1SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_09, "s1Out");
        final  GpioPinDigitalInput s2SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, "s2In");
        final  GpioPinDigitalInput s2SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, "s2Out");
        final   GpioPinDigitalInput s3SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, "s3In");
        final   GpioPinDigitalInput s3SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_03, "s3Out");
        final   GpioPinDigitalInput s4SensorIn = gpio.provisionDigitalInputPin(RaspiPin.GPIO_12, "s4In");
        final   GpioPinDigitalInput s4SensorOut = gpio.provisionDigitalInputPin(RaspiPin.GPIO_13, "s4Out");


    }
}

