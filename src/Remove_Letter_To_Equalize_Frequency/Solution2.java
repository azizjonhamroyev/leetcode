package Remove_Letter_To_Equalize_Frequency;

public class Solution2 {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode res = new ListNode(0);
        res.next = A;
        ListNode head = A;
        ListNode head2 = res;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head2.next = head.next;
                head = head.next;
            } else {
                head2 = head;
                head = head.next;
            }
        }
        return res.next;
    }
}
