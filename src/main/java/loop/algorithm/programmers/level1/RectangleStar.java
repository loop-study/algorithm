package loop.algorithm.programmers.level1;

// 직사각형 별찍기 https://programmers.co.kr/learn/courses/30/lessons/12969
public class RectangleStar {

    public void star(int width, int length) {
        for (int l = 0; l < length; l++) {
            StringBuilder builder = new StringBuilder();
            for (int w = 0; w < width; w++) {
                builder.append("*");
            }
            System.out.println(builder.toString());
        }
    }
}
