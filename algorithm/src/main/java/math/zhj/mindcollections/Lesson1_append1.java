package math.zhj.mindcollections;

/**
 * Created by zhaohongjie on 2019/2/19.
 */
public class Lesson1_append1 {
    public static void main(String[] args) {

        int even_cnt = 0, odd_cnt = 0;
        long start = 0, end = 0;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {

            if((i & 1) == 0){
                even_cnt ++;
            }else{
                odd_cnt ++;
            }

        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(even_cnt + " " + odd_cnt);

        even_cnt = 0;
        odd_cnt = 0;
        start = 0;
        end = 0;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {

            if((i % 2) == 0){
                even_cnt ++;
            }else{
                odd_cnt ++;
            }

        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(even_cnt + " " + odd_cnt);

    }
}
