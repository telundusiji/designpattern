package site.teamo.learning.designpattern.adapter.instance;

import site.teamo.learning.designpattern.adapter.MicroUSBCable;
import site.teamo.learning.designpattern.adapter.TypeC;
import site.teamo.learning.designpattern.adapter.TypeCPhone;

public class Main {
    public static void main(String[] args){
        TypeCPhone typeCPhone = new TypeCPhone();
        TypeC typeC = new MicroUSBToTypeCAdapter(new MicroUSBCable());
        typeCPhone.charging(typeC);
        typeCPhone.dataTransfer(typeC);
    }
}
