package com.cedricchatelain.storyteller.domain.entities;

import com.cedricchatelain.storyteller.domain.InvalidDummmyException;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

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
        void success_when_given_required_args() {
            Boolean isPublished = false;

            Story story = Story.builder().isPublished(isPublished).build();

            assertThat(story).isInstanceOf(Story.class);
        }
    }
}
