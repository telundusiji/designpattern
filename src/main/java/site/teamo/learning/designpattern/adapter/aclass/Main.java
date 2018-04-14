package site.teamo.learning.designpattern.adapter.aclass;

import site.teamo.learning.designpattern.adapter.TypeC;
import site.teamo.learning.designpattern.adapter.TypeCPhone;

public class Main {
    public static void main(String[] args){
        TypeCPhone typeCPhone = new TypeCPhone();
        TypeC typeC = new MicroUSBToTypeCAdapter();
        typeCPhone.charging(typeC);
        typeCPhone.dataTransfer(typeC);
    }
}
