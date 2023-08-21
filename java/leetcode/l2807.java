import java.util.*;

public class l2807 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) return head;
        else if (head.next.next == null) {
            ListNode last = head.next;
            head.next = new ListNode(getGCD(head.val, head.next.val), last);
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();

        ListNode itr = head;

        while (itr.next.next != null) {

            list.add(itr.val);
            list.add(getGCD(itr.val, itr.next.val));
            itr = itr.next;
        }

        list.add(itr.val);
        list.add(getGCD(itr.val, itr.next.val));
        list.add(itr.next.val);

        return new ListNode(list.remove(0), getNext(list));

    }

    static int  getGCD(int x, int y) {
        int gcd = 1;

        for(int i = 1; i <= x && i <= y; i++)
            if(x%i==0 && y%i==0) gcd = i;

        return gcd;
    }

    static ListNode getNext(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return new ListNode(list.remove(0));
        }

        return new ListNode(list.remove(0), getNext(list));
    }
    public static void main(String[] args) {

        ListNode l2 = new ListNode(18, null);
        l2.next = new ListNode(6, null);
        l2.next.next = new ListNode(10, null);
        l2.next.next.next = new ListNode(3, null);
        insertGreatestCommonDivisors(l2);

    }
}
