class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var node = head
        val list = arrayListOf<Int>()
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        var first: ListNode? = null
        var last: ListNode? = null
        for (i in list.size / 2 until list.size) {
            val p = ListNode(list[i])
            if (first == null) {
                first = p
                last = p
            } else {
                last?.next = p
                last = p
            }
        }
        return first
    }
}