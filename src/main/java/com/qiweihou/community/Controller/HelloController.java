package com.qiweihou.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qiwei
 * @date 2020/1/5
 */

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
