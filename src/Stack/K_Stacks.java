package Stack;
import java.util.*;
import java.util.Scanner;
public class K_Stacks {
    int arr[],top[],next[];
    int k, freeTop, cap;
    K_Stacks(int k1, int n){
        k = k1;
        cap = n;
        arr = new int[cap];
        top = new int[k];
        next = new int[cap];

        for(int i=0;i<k;i++){
            top[i] = -1;
        }
        freeTop = 0;
        for(int i=0;i<cap;i++){
            next[i] = i+1;
        }
        next[cap-1] = -1;

    }
    boolean isFull()
    {
        return (freeTop == -1);
    }

    // To push an item in stack number 'sn' where sn is from 0 to k-1
    void push(int item, int sn)
    {
        // Overflow check
        if (isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }

        int i = freeTop; // Store index of first free slot

        // Update index of free slot to index of next slot in free list
        freeTop = next[i];

        // Update next of top and then top for stack number 'sn'
        next[i] = top[sn];
        top[sn] = i;

        // Put the item in array
        arr[i] = item;
    }

    // To pop an from stack number 'sn' where sn is from 0 to k-1
    int pop(int sn)
    {
        // Underflow check
        if (isEmpty(sn))
        {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }

        // Find index of top item in stack number 'sn'
        int i = top[sn];

        top[sn] = next[i]; // Change top to store next of previous top

        // Attach the previous top to the beginning of free list
        next[i] = freeTop;
        freeTop = i;

        // Return the previous top item
        return arr[i];
    }

    // To check whether stack number 'sn' is empty or not
    boolean isEmpty(int sn)
    {
        return (top[sn] == -1);
    }

    public static void main(String[] args) {
        int k = 3 , n = 10;
        K_Stacks ks = new K_Stacks(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
