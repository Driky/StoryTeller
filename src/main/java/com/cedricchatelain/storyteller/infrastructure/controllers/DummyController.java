package com.cedricchatelain.storyteller.infrastructure.controllers;

import com.cedricchatelain.storyteller.infrastructure.controllers.forms.CreateDummyDataForm;
import com.cedricchatelain.storyteller.domain.Dummy;
import com.cedricchatelain.storyteller.use_cases.CreateDummyData;
import com.cedricchatelain.storyteller.use_cases.GetAllDummyData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DummyController {

    private final CreateDummyData createDummyData;

    private final GetAllDummyData getAllDummyData;

    public DummyController(CreateDummyData createDummyData, GetAllDummyData getAllDummyData) {
        this.createDummyData = createDummyData;
        this.getAllDummyData = getAllDummyData;
    }

    @GetMapping(value = "/api/dummy", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Dummy> getAllDummyData() {
        return getAllDummyData.getAll();
    }

    @PostMapping(value = "/api/dummy", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Dummy createDummyData(@RequestBody CreateDummyDataForm createDummyDataForm) {
        return createDummyData.create(createDummyDataForm.toDummy());
    }
}
