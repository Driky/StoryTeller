package com.cedricchatelain.storyteller.domain.entities;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Story {
    private String id;
    @NonNull
    private Boolean isPublished;
}
