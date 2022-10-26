package Delete_the_Middle_Node_of_a_Linked_List;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode last = head, middle = head, prev = head;
        while (last.next != null) {
            prev = middle;
            middle = middle.next;
            last = last.next.next;
            if (last == null) break;
        }
        prev.next = middle.next;
        return head;
    }
}
