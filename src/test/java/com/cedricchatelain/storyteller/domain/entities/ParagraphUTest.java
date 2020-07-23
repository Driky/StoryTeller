package com.cedricchatelain.storyteller.domain.entities;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(MockitoExtension.class)
public class ParagraphUTest {
    @Nested
    class ConstructorShould {

        @Test
        void fail_when_name_is_null() {
            String name = null;

            Throwable throwable = catchThrowable(() -> Paragraph.builder().name(name).build());

            assertThat(throwable).isInstanceOf(java.lang.NullPointerException.class)
                    .hasMessage("name is marked non-null but is null");
        }

        @Test
        void fail_when_type_is_null() {
            ParagraphType type = null;
            String name = "random_name";

            Throwable throwable = catchThrowable(() -> Paragraph.builder().name(name).type(type).build());

            assertThat(throwable).isInstanceOf(java.lang.NullPointerException.class)
                    .hasMessage("type is marked non-null but is null");
        }

        @Test
        void succes_when_type_is_not_null() {
            ParagraphType type = ParagraphType.TEXT;
            String name = "random_name";

            Paragraph para = Paragraph.builder().name(name).type(type).build();

            assertThat(para).isInstanceOf(Paragraph.class).hasFieldOrPropertyWithValue("name", name).hasFieldOrPropertyWithValue("type", type);
        }
    }
}
