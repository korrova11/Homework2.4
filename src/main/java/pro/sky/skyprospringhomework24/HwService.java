package pro.sky.skyprospringhomework24;

import org.springframework.stereotype.Service;

@Service

public class HwService implements HwServiceInterface {

    public String hello() {
        return "hello";
    }

    public String answerHello( String userName) {
        return "hello" + userName;
    }
}
