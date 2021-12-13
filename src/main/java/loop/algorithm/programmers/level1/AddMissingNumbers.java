package loop.algorithm.programmers.level1;

import java.util.Arrays;

// 없는 숫자 더하기 https://programmers.co.kr/learn/courses/30/lessons/86051
public class AddMissingNumbers {

    public int test() {
        int total = 45;
        int[] numbers = {1,2,3,4,5};

        return total - Arrays.stream(numbers).sum();
    }
}
