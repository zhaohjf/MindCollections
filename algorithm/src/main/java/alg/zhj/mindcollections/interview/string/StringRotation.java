package alg.zhj.mindcollections.interview.string;

/**
 * https://leetcode-cn.com/problems/rotate-string/
 *
 * Created by zhaohongjie on 2019/3/30.
 */
public class StringRotation {

    /**
     * 简单将两个B字符串连接在一起，判断是否包含A字符串即可。
     *
     * @param A
     * @param B
     * @return
     */
    public boolean isRotation(String A, String B) {

        if (A == null || B == null || A.length() != B.length()) {
            return false;
        }

        String b2 = B + B;

        return b2.indexOf(A) != -1;
    }

    public static void main(String[] args) {
        StringRotation obj = new StringRotation();
        System.out.println(obj.isRotation("abcd", "cdab"));
    }
}
