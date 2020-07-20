package com.cedricchatelain.storyteller.infrastructure.database.repositories;

import com.cedricchatelain.storyteller.domain.Dummy;
import com.cedricchatelain.storyteller.domain.DummyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyJpaRepository extends JpaRepository<Dummy, Long>, DummyRepository {
}
