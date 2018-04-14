package site.teamo.learning.designpattern.adapter.instance;

import site.teamo.learning.designpattern.adapter.MicroUSB;
import site.teamo.learning.designpattern.adapter.TypeC;

public class MicroUSBToTypeCAdapter implements TypeC {

    private MicroUSB microUSB;

    public MicroUSBToTypeCAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    @Override
    public void usb3Data() {
        microUSB.usb2Data();
    }

    @Override
    public void electric() {
        microUSB.electric();
    }
}
