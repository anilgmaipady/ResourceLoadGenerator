package com.agm.loadgenerator.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadConroller {
    Logger logger = LoggerFactory.getLogger(LoadConroller.class);
    @GetMapping("/startCPULoad")
    public String startCPULoad(){
        logger.debug("startCPULoad");
        return "ok";
    }

    @GetMapping("/stopCPULoad")
    public String stopCPULoad(){
        logger.debug("stopCPULoad");
        return "ok";
    }

    @GetMapping("/startMemoryLoad")
    public String startMemoryLoad(){
        logger.debug("startMemoryLoad");
        return "ok";
    }

    @GetMapping("/stopMemoryLoad")
    public String stopMemoryLoad(){
        logger.debug("stopCPULoad");
        return "ok";
    }
}
