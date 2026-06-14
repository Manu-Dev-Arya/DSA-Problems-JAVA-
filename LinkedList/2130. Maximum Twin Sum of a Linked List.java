
class Solution {
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }

        int i = 0;
        int mid = len/2 - 1;
        int max = Integer.MIN_VALUE;
        ListNode node = head;
        while(i <= mid){
            int num1 = node.val;
            temp = node;
            int k = len-1-i-i;
            while(k > 0){
                temp = temp.next;
                k--;
            }
            int num2 = temp.val;
            max = Math.max(max, (num1 + num2));
            node = node.next;
            i++;
        }
        return max;
    }
}


class Solution {
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int mid = len/2 - 1;
        int max = Integer.MIN_VALUE;
        ListNode node = head;
        while(i <= mid){
            st.push(node.val);
            node = node.next;
            i++;    
        }
        
        while(node != null){
            int num1 = st.pop();
            int num2 = node.val;
            max = Math.max(max, (num1 + num2));
            node = node.next;
        }
        
        return max;
    }
} 