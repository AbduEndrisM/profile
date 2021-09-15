package com.jeba.profile.service;

import com.jeba.profile.domain.LocationRequestPayload;
import com.jeba.profile.domain.entity.Location;
import com.jeba.profile.domain.entity.User;

public interface ILocationService {

    Location getLocation(User user);
    Boolean setLocation(Location location);

    Location saveLocationInfo(Location location);

    Location getLocationInfo(LocationRequestPayload locationRequestPayload);
}
