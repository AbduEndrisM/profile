package com.jeba.profile.service;

import com.jeba.profile.domain.entity.Device;

public interface IDeviceService {
    Device saveDeviceInfo(Device device);
    Device updateDeviceInfo(Device device);

}
