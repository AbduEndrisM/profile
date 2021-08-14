package com.jeba.profile.service;

import com.jeba.profile.adapter.ILocationAdapter;
import com.jeba.profile.domain.LocationRequestPayload;
import com.jeba.profile.domain.entity.Location;
import com.jeba.profile.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationService implements ILocationService{

    private final ILocationAdapter locationAdapter;
    @Override
    public Location getLocation(User user) {
        return null;
    }

    @Override
    public Boolean setLocation(Location location) {
        return null;
    }

    @Override
    public Location saveLocationInfo(Location location) {
        return locationAdapter.saveLocation(location);
    }

    @Override
    public Location getLocationInfo(LocationRequestPayload locationRequestPayload) {
        return locationAdapter.getLocationInfo(locationRequestPayload);
    }
}
