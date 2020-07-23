package com.cedricchatelain.storyteller.domain.entities;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Paragraph {
    @NonNull
    private String name;
    @NonNull
    private ParagraphType type;
//    private String text;
}
