package alg.zhj.campaign.week06.practise;

/**
 * Created by zhaohongjie on 2020/7/8.
 */
public class ReverseString_recurse_344 {

    public void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}


