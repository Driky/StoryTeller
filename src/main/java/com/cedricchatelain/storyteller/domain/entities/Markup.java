package com.cedricchatelain.storyteller.domain.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

@Getter @Builder @AllArgsConstructor
public class Markup {
    final private String title;
    final private int end;
    final private int start;
    final private MarkupType type;
}
