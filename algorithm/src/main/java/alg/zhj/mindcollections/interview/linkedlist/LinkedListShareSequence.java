package alg.zhj.mindcollections.interview.linkedlist;

/**
 * Created by zhaohongjie on 2019/5/13.
 */
public class LinkedListShareSequence {

    /**
     * 打印链表的公共部分
     *
     * @param head1
     * @param head2
     */
    public void printCommonPart(ListNode head1, ListNode head2) {
        System.out.print("Common Part: ");
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head1 = head1.next;
            } else if (head1.val > head2.val) {
                head2 = head2.next;
            } else {
                System.out.print(head1.val + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode three1 = new ListNode(3);
        ListNode four1 = new ListNode(4);
        ListNode five1 = new ListNode(5);

        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);

        head1.next = one;
        head1.next.next = two;
        head1.next.next.next= three;
        head1.next.next.next.next = five;

        head2.next = two1;
        head2.next.next = three1;
        head2.next.next.next= four1;
        head2.next.next.next.next = five1;

        LinkedListShareSequence obj = new LinkedListShareSequence();
        obj.printCommonPart(head1, head2);
    }

}
