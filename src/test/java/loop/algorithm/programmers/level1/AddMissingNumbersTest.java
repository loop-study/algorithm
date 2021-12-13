package loop.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class AddMissingNumbersTest {

    @Test
    void test() {
        int sum = 0;
        int total = 45;
        int[] numbers = {1,2,3,4,5};

        for (int i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int result = total - sum;
        assertThat(result).isEqualTo(30);
    }
}