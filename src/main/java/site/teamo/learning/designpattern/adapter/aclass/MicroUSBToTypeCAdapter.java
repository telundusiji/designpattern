package site.teamo.learning.designpattern.adapter.aclass;

import site.teamo.learning.designpattern.adapter.MicroUSBCable;
import site.teamo.learning.designpattern.adapter.TypeC;

public class MicroUSBToTypeCAdapter extends MicroUSBCable implements TypeC {
    @Override
    public void usb3Data() {
        super.usb2Data();
    }

    @Override
    public void electric() {
        super.electric();
    }
}
