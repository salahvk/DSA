class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to start the result list
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0; // To handle carry over

        // Traverse both linked lists
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;

            carry = sum / 10; // Carry for the next iteration
            current.next = new ListNode(sum % 10); // Create a new node with the digit
            current = current.next;

            // Move to the next nodes
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }

        // If there's still a carry, add a new node for it
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the result list, skipping the dummy node
        return dummyHead.next;
    }
}
