package com.ds.didgen.service;

import com.ds.didgen.exception.ClockMovedBackException;
import com.ds.didgen.exception.NodeIdOutOfBoundException;
import org.springframework.stereotype.Service;

@Service
public interface SequenceIdGenerator {
    long generateId() throws ClockMovedBackException, NodeIdOutOfBoundException;
}
