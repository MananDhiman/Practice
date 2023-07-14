import java.util.ArrayList;
import java.util.List;

public class lc1669 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode itr = list1;
        ArrayList<ListNode> list = new ArrayList<>();

        int i = 0;
        while(i <= b+1){
            list.add(itr);
            itr = itr.next;
            i++;
        }

        //
        for(ListNode l: list){
            System.out.println("ListNode in list"+l.val);
        }
        //

        list.get(a-1).next = list2;

        itr = list2;
        while(itr.next != null){
            itr = itr.next;
        }

       itr.next = list.get(b+1);

        return list1;
    }
    public static void main(String[] args) {
        ListNode l = new ListNode(0, null);
        l.next = new ListNode(1, null);
        l.next.next = new ListNode(2, null);

        ListNode l2 = new ListNode(100, null);
        l2.next = new ListNode(101, null);
        l2.next.next = new ListNode(102, null);
        l2.next.next.next = new ListNode(103, null);

        mergeInBetween(l,1,1,l2);

        ListNode itr = l;
        while(itr != null){
            System.out.println(itr.val);
            itr = itr.next;
        }
    }
}
