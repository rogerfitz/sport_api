package com.sports.api.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Roger on 6/2/2017.
 */
@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "Ergo sum";
    }
}
