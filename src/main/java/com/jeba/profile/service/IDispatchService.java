package com.jeba.profile.service;

import com.jeba.profile.domain.DispatchRequestPayload;

public interface IDispatchService {

    Boolean requestDriver(DispatchRequestPayload dispatchRequestPayload);
}
