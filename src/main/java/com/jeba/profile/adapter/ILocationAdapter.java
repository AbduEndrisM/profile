package com.jeba.profile.adapter;

import com.jeba.profile.domain.LocationRequestPayload;
import com.jeba.profile.domain.entity.Location;

public interface ILocationAdapter {
    Location getLocationInfo(LocationRequestPayload user);
    Location saveLocation(Location location);
}
