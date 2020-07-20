package com.cedricchatelain.storyteller.infrastructure.controllers.forms;

import com.cedricchatelain.storyteller.domain.Dummy;

public class CreateDummyDataForm {

    private String value;

    public Dummy toDummy() {
        return new Dummy(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
