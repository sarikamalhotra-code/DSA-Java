class Solution {
    public ListNode insertAtTail(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        if (head == null) {
            return newNode;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}