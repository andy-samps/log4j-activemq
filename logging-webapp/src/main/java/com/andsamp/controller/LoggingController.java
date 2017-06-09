package com.andsamp.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.log4j.Logger.getLogger;

/**
 * Created by osboxes on 6/8/17.
 */

@RestController
@RequestMapping(value = "/log", produces="application/json")
public class LoggingController {
    private static final Logger logger = getLogger(LoggingController.class);

    @GetMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void logParam(String msg) {
        logger.error("msg: "+msg);
    }
}
