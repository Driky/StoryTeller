package com.cedricchatelain.storyteller.domain.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class MarkupLink extends Markup {
    // private AnchorType anchorType;
    //Fixit: make it a class for link/url
    final private String href;
    final private String rel;

    private MarkupLink(@NonNull String href, String rel, @NonNull String title, @NonNull int end, @NonNull int start, @NonNull MarkupType type){
        super(title, end, start, type);

        if (type != MarkupType.LINK) {
            throw new InvalidMarkupTypeException(String.format("MarkupLink with type: %s", type));
        }

        this.href = href;
        this.rel = rel;
    }
}
