package loop.algorithm.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AddMissingNumbersTest {

    @Test
    void test() {
        int result = 0;
        int total = 45;
        int[] numbers = {1,2,3,4,5};

        result = total - Arrays.stream(numbers).sum();
        System.out.println(result);
    }
}