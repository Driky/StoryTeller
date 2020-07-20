package com.cedricchatelain.storyteller.domain.entities;

public class Paragraph {
    private LayoutType layout;
    private String name;
    // can be text of parag or caption of image
    private String text;
    private ParagraphType type;
    private Markup[] markups;
    private Metadata metadata;
    private Boolean hasDropCap;
}
