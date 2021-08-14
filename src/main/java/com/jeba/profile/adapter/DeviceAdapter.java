package com.jeba.profile.adapter;

import com.jeba.profile.domain.entity.Device;
import com.jeba.profile.repository.IDeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceAdapter implements IDeviceAdapter{

    private final IDeviceRepository deviceRepository;

    @Override
    public Device saveDeviceInfo(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public Device updateDeviceInfo(Device device) {
        return deviceRepository.save(device);
    }
}
