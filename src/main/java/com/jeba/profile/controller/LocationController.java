package com.jeba.profile.controller;

import com.jeba.profile.domain.LocationRequestPayload;
import com.jeba.profile.domain.entity.Location;
import com.jeba.profile.service.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/location/")
public class LocationController {


    private final ILocationService locationService;

    @PostMapping("/save")
    public Location saveLocationInfo(@RequestBody Location location) {
        return locationService.saveLocationInfo(location);
    }

    @PutMapping("/update")
    public Location updateLocationInfo(@RequestBody Location location) {
        return locationService.saveLocationInfo(location);
    }

    @GetMapping("/get")
    public Location getLocationInfo(@RequestBody LocationRequestPayload locationRequestPayload) {
        return locationService.getLocationInfo(locationRequestPayload);
    }


}
