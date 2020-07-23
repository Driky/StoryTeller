package com.cedricchatelain.storyteller.domain.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.security.InvalidParameterException;
import java.util.ArrayList;

@Builder
@Getter
public class Story {
    @NonNull
    private String id;
    @NonNull
    private Boolean isPublished;
    @NonNull
    private ArrayList<Paragraph> paragraphs;

    private Story(@NonNull String id, @NonNull Boolean isPublished, @NonNull ArrayList <Paragraph> paragraphs) {
        if(paragraphs.size() < 1) {
            throw new InvalidParameterException("A Story require a least one Paragraph");
        }

        if(paragraphs.get(0).getType() != ParagraphType.TITLE) {
            throw new InvalidParameterException("A Story require it's first Paragraph to be of type TITLE");
        }

        this.id = id;
        this.isPublished = isPublished;
        this.paragraphs = paragraphs;
    }
}
