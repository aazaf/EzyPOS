package com.bootcamp.pos.EzyPOS.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/17/22
 */

@RestController
@RequestMapping("api/v1/test/")
public class TestController {

    @GetMapping("/access")
    public String access(){
        return "hello spring!";
    }

}
