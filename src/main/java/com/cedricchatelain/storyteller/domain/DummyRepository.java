package com.cedricchatelain.storyteller.domain;

import java.util.List;

public interface DummyRepository {

    Dummy save(Dummy dummy);

    List<Dummy> findAll();

}
