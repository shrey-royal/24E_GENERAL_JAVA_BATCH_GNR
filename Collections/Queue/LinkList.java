import java.util.Deque;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        // LinkedList<Integer> nums = new LinkedList<>();

        // for(int i=0 ;i<20; i++) nums.addFirst((int)(Math.random()*10));

        // System.out.println(nums);

        // System.out.println(nums.get(2));
        // System.out.println(nums.getFirst());
        // System.out.println(nums.getLast());

        // nums.removeFirst();
        // nums.removeLast();

        // System.out.println(nums.removeFirstOccurrence(8));
        // System.out.println(nums.removeLastOccurrence(5));

        // System.out.println(nums);

        Deque<Integer> n = new LinkedList<>();

        n.offer(12);
        n.offer(34);
        n.offer(45);

        System.out.println(n);
        System.out.println(n.poll());
        System.out.println(n.pollFirst());
        System.out.println(n.pollLast());
        
        // System.out.println(n.peek());
        // System.out.println(n.peekFirst());
        // System.out.println(n.peekLast());
        
        // System.out.println(n.size());

        System.out.println(n.element());


    }
}

/*
Methods of LinkedList:

1. addFirst() - adds an element to the beginning of the list
2. addLast() - adds an element to the end of the list
3. removeFirst() - removes an element from the beginning of the list
4. removeLast() - removes an element from the end of the list
5. getFirst() - returns the first element of the list
6. getLast() - returns the last element of the list
7. removeFirstOccurrence() - removes the first occurrence of the specified element from the list
8. removeLastOccurrence() - removes the last occurrence of the specified element from the list

Other methods are same as ArrayList

Methods of Queue:

1. add() - adds an element to the queue
2. remove() - removes an element from the queue
3. element() - returns the element at the head of the queue
4. offer() - adds an element to the queue
5. poll() - removes an element from the queue
6. peek() - returns the element at the head of the queue
7. size() - returns the size of the queue
8. isEmpty() - returns true if the queue is empty


Task:

Write a Java program to shuffle elements in a linked list.

Test Case: 
Linked list before shuffling:                                          
[Red, Green, Black, Pink, orange]                                      
Linked list after shuffling:                                           
[orange, Pink, Red, Black, Green] 



*/