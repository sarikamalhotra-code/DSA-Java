class Solution {
    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }
}