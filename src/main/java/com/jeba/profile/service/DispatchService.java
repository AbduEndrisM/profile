package com.jeba.profile.service;

import com.jeba.profile.adapter.IDispatchAdapter;
import com.jeba.profile.domain.DispatchRequestPayload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DispatchService implements IDispatchService{

    private final IDispatchAdapter dispatchAdapter;
    @Override
    public Boolean requestDriver(DispatchRequestPayload dispatchRequestPayload) {

         dispatchAdapter.requestDriver(dispatchRequestPayload);

         return Boolean.TRUE;
    }
}
