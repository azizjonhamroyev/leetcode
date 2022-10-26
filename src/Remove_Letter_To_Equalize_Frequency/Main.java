package Remove_Letter_To_Equalize_Frequency;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        ListNode root = new ListNode(1);
        root.next = new ListNode(1);
        root.next.next = new ListNode(1);
        root.next.next.next = new ListNode(1);
        root.next.next.next.next = new ListNode(2);
        root.next.next.next.next.next = new ListNode(2);
        root.next.next.next.next.next.next = new ListNode(2);
        root.next.next.next.next.next.next.next = new ListNode(2);
        root.next.next.next.next.next.next.next.next = new ListNode(3);
        ListNode listNode = solution.deleteDuplicates(root);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
