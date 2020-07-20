package com.cedricchatelain.storyteller.infrastructure.controllers.forms;

import com.cedricchatelain.storyteller.domain.Dummy;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreateDummyDataFormUTest {

    @Nested
    class ToDummyShould {

        @Test
        void return_new_Dummy_object_with_form_value() {
            // Given
            String formValue = "some value";
            CreateDummyDataForm createDummyDataForm = new CreateDummyDataForm();
            createDummyDataForm.setValue(formValue);

            // When
            Dummy dummy = createDummyDataForm.toDummy();

            // Then
            assertThat(dummy.getValue()).isEqualTo(formValue);
        }
    }

}