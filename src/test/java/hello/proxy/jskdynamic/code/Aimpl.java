package hello.proxy.jskdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Aimpl implements AInterface{
    @Override
    public String call() {
        log.info("A호출");
        return "A";
    }
}
