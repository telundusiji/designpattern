package site.teamo.learning.designpattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MicroUSBCable implements MicroUSB {
    @Override
    public void usb2Data() {
        log.info("我是MicroUSB数据传输");
    }

    @Override
    public void electric() {
        log.info("我是MicroUSB充电");
    }
}
