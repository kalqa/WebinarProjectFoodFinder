package com.foodfinder;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FoodFinderApplicationTest {

    @Test
    public void should_return_receipe_when_user_gave_five_correct_ingredients() {
        FoodFinderDto result = new FoodFinderApplicationStarter().start();

        assertThat(result.message()).isEqualTo("success");
        assertThat(result.receipe()).isEqualTo("jajecznica");
    }

    @Test
    public void should_return_error_message_when_user_gave_less_than_five_correct_ingredients() {
        FoodFinderDto result = new FoodFinderApplicationStarter().start();
    }

    @Test
    public void should_return_error_message_when_user_gave_more_than_five_correct_ingredients() {
        FoodFinderDto result = new FoodFinderApplicationStarter().start();
    }
}
