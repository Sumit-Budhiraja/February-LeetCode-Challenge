public class Solution {

    //TC: O(n)
    //SC: O(n)
    Set<ListNode> set = null;
    public boolean hasCycle(ListNode head) {
        set = new HashSet<>();
        ListNode it = head;
        while(it!=null){
            if(set.contains(it)){
                return true; // cycle found
            }
            set.add(it);
            it = it.next;
        }

        return false;

    }
}
