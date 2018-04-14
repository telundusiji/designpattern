package site.teamo.learning.designpattern.adapter;

public class TypeCPhone {
    public void charging(TypeC typeC){
        typeC.electric();
    }

    public void dataTransfer(TypeC typeC){
        typeC.usb3Data();
    }
}
