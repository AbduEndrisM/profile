package com.jeba.profile.service;

import com.jeba.profile.adapter.IDeviceAdapter;
import com.jeba.profile.domain.entity.Device;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceService implements IDeviceService{

    private final IDeviceAdapter deviceAdapter;

    @Override
    public Device saveDeviceInfo(Device device) {
        return deviceAdapter.saveDeviceInfo(device);
    }

    @Override
    public Device updateDeviceInfo(Device device) {
        return deviceAdapter.updateDeviceInfo(device);
    }
}
