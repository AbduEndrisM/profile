package com.jeba.profile.adapter;

import com.jeba.profile.domain.DispatchRequestPayload;
import com.jeba.profile.domain.entity.User;
import com.jeba.profile.repository.IDispatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DispatchAdapter implements IDispatchAdapter{

    private final IDispatchRepository dispatchRepository;

    @Override
    public User requestDriver(DispatchRequestPayload dispatchRequestPayload) {
        User user = new User();

        return dispatchRepository.save(user); //TODO
    }
}
