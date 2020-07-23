package com.cedricchatelain.storyteller.domain.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class Paragraph {
    @NonNull
    private String name;
    @NonNull
    private ParagraphType type;
    private String text;
}
