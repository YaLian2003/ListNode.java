class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class ListADT {
    private ListNode head;

    // Add a new element to the list
    public void insert(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Check if the list has no repeats
    public boolean hasNoRepeats() {
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            while (temp != null) {
                if (current.value == temp.value) {
                    return false; // Duplicate found
                }
                temp = temp.next;
            }
            current = current.next;
        }
        return true; // No duplicates
    }
}
