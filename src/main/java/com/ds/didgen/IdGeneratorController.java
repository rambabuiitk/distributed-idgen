package com.ds.didgen;

import com.ds.didgen.exception.ClockMovedBackException;
import com.ds.didgen.exception.NodeIdOutOfBoundException;
import com.ds.didgen.service.SequenceIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdGeneratorController {

    @Autowired
    private SequenceIdGenerator sequenceIdGenerator;

    @GetMapping(value = "nextId", produces = "application/JSON")
    public ResponseEntity<?> getNextId() throws NodeIdOutOfBoundException, ClockMovedBackException {
        return ResponseEntity.ok(sequenceIdGenerator.generateId());
    }
}
