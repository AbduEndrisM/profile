package com.jeba.profile.controller;

import com.jeba.profile.domain.entity.Device;
import com.jeba.profile.service.IDeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "v1/device/")
public class DeviceController {

    private final IDeviceService deviceService;

    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Device saveDeviceInfo(@RequestBody Device device) {
        return deviceService.saveDeviceInfo(device);
    }

    @PutMapping(path = "/update",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Device updateDeviceInfo(@RequestBody Device device) {
        return deviceService.saveDeviceInfo(device);
    }
}
