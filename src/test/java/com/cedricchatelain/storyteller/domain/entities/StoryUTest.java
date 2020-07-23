package com.cedricchatelain.storyteller.domain.entities;

import com.cedricchatelain.storyteller.domain.InvalidDummmyException;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(MockitoExtension.class)
public class StoryUTest {

    @Nested
    class ConstructorShould {

        @Test
        void fail_when_published_is_null() {
            Boolean isPublished = null;

            Throwable throwable = catchThrowable(() -> Story.builder().isPublished(isPublished).build());

            assertThat(throwable).isInstanceOf(java.lang.NullPointerException.class)
                    .hasMessage("isPublished is marked non-null but is null");
        }

        @Test
        void fail_when_id_is_null() {
            String id = null;
            Boolean isPublished = false;

            Throwable throwable = catchThrowable(() -> Story.builder().isPublished(isPublished).id(id).build());

            assertThat(throwable).isInstanceOf(java.lang.NullPointerException.class)
                    .hasMessage("id is marked non-null but is null");
        }

        @Test
        void fail_when_Paragraphs_is_null() {
            String id = "some_id";
            Boolean isPublished = false;

            Throwable throwable = catchThrowable(() -> Story.builder().isPublished(isPublished).id(id).build());

            assertThat(throwable).isInstanceOf(java.lang.NullPointerException.class)
                    .hasMessage("paragraphs is marked non-null but is null");
        }

        @Test
        void fail_when_Paragraphs_is_empty() {
            String id = "some_ID";
            Boolean isPublished = false;
            ArrayList <Paragraph> paragraphs = new ArrayList<Paragraph>();

            Throwable throwable = catchThrowable(() -> Story.builder().isPublished(isPublished).id(id).paragraphs(paragraphs).build());

            assertThat(throwable).isInstanceOf(java.security.InvalidParameterException.class)
                    .hasMessage("A Story require a least one Paragraph");
        }

        @Test
        void fail_when_first_paragraph_isnt_TITLE() {
            String id = "some_ID";
            Boolean isPublished = false;
            ArrayList <Paragraph> paragraphs = new ArrayList<Paragraph>();
            paragraphs.add(Paragraph.builder().name("name").type(ParagraphType.TEXT).build());

            Throwable throwable = catchThrowable(() -> Story.builder().isPublished(isPublished).id(id).paragraphs(paragraphs).build());

            assertThat(throwable).isInstanceOf(java.security.InvalidParameterException.class)
                    .hasMessage("A Story require it's first Paragraph to be of type TITLE");
        }

        @Test
        void success_when_given_required_args() {
            Boolean isPublished = false;
            String id = "some_id";
            ArrayList <Paragraph> paragraphs = new ArrayList<Paragraph>();
            paragraphs.add(Paragraph.builder().name("name").type(ParagraphType.TITLE).build());

            Story story = Story.builder().isPublished(isPublished).id(id).paragraphs(paragraphs).build();

            assertThat(story).isInstanceOf(Story.class);
        }
    }
}
