package pro.sky.skyprospringhomework24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HwController {
    private final HwServiceInterface hwService;
    public HwController(HwServiceInterface hwService){
        this.hwService = hwService;
    }
    @GetMapping
    public String hello() {
        return hwService.hello();
    }
    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return hwService.answerHello( userName);
    }
}
