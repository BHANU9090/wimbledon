package org.example.controller;

import org.example.model.WimbledonResult;
import org.example.service.WimbledonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wimbledon")
public class WimbledonController {
    private final WimbledonService wimbledonService;

    @Autowired
    public WimbledonController(WimbledonService wimbledonService) {
        this.wimbledonService = wimbledonService;
    }

    @GetMapping
    public WimbledonResult getWimbledonFinal(@RequestParam int year) throws Throwable {
        return wimbledonService.getFinalByYear(year);
    }

}
