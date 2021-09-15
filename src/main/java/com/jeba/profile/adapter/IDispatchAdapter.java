package com.jeba.profile.adapter;

import com.jeba.profile.domain.DispatchRequestPayload;
import com.jeba.profile.domain.entity.User;

public interface IDispatchAdapter {

    User requestDriver(DispatchRequestPayload dispatchRequestPayload);
}
