package com.treehouse;

public class AddTwoNumbers {


     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        // two non-empty ll
        // may be of differing lengths
        // add together the two lists number value.
        // return as a new linked list in reversed order 807 ==== 7-> 0->


    // My answer - WRONG cannot parse super long numbers...


        public static ListNode addTwoNumbersCORRECT(ListNode l1, ListNode l2) {

            ListNode resultHead = new ListNode(); // this is our head
            ListNode current = resultHead; // this

            ListNode p1 = l1;
            ListNode p2 = l2;
            boolean rem = false;

            while(p1 != null || p2 != null) { //??
                int total = 0;

                if(p1 == null) {
                    total += p2.val;
                    p2 = p2.next;
                }
                else if(p2 == null) {
                    total += p1.val;
                    p1 = p1.next;
                }
                else {
                    total += (p1.val + p2.val);
                    p1 = p1.next;
                    p2 = p2.next;
                }

                if(rem) total += 1;
                if(total >= 10) {
                    rem = true;
                    total = total % 10;
                }
                else rem = false;

                ListNode node = new ListNode(total);
                current.next = node;
                current = current.next;
            }
            if(rem) current.next = new ListNode(1);
            return resultHead.next;
        }


        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            StringBuilder sb1 = new StringBuilder(listToString(l1));
            StringBuilder sb2 = new StringBuilder(listToString(l2));

            long l1final = Long.parseLong(sb1.reverse().toString());
            long l2final = Long.parseLong(sb2.reverse().toString());

            long total = l1final + l2final;

            StringBuilder sb = new StringBuilder();
            sb.append(total).reverse();

            return intListFromStringBuilder(sb);

        }

        public static String listToString(ListNode list) {
            String l1number = "";

            ListNode l1current = list;
            while(l1current != null) {
                l1number += l1current.val;
                l1current = l1current.next;
            }
            return l1number;
        }

        public static ListNode intListFromStringBuilder(StringBuilder sb) {
            ListNode finalList = new ListNode();
            ListNode current = finalList;

            for(int i = 0; i < sb.length(); i++) {
                current.val = Character.getNumericValue(sb.charAt(i));
                if(i == sb.length() -1) break;
                current.next = new ListNode();
                current = current.next;
            }
            return finalList;
        }
    }
