package com.jeba.profile.adapter;

import com.jeba.profile.domain.entity.Device;

public interface IDeviceAdapter {

    Device saveDeviceInfo(Device device);
    Device updateDeviceInfo(Device device);

}
