package com.jeba.profile.adapter;

import com.jeba.profile.domain.LocationRequestPayload;
import com.jeba.profile.domain.entity.Location;
import com.jeba.profile.repository.ILocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationAdapter implements ILocationAdapter{

    private final ILocationRepository locationRepository;
    @Override
    public Location getLocationInfo(LocationRequestPayload locationRequestPayload) {
        return locationRepository.findById(locationRequestPayload.getPhoneNumber()).get();
    }

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }
}
