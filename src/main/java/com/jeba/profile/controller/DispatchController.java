package com.jeba.profile.controller;

import com.jeba.profile.domain.DispatchRequestPayload;
import com.jeba.profile.domain.entity.Location;
import com.jeba.profile.service.IDispatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/dispatch/")
public class DispatchController {

    private final IDispatchService dispatchService;

    @GetMapping("/request")
    public Boolean dispatchRequest(@RequestBody DispatchRequestPayload dispatchRequestPayload) {
        return dispatchService.requestDriver(dispatchRequestPayload);
    }



}
