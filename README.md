# cs251
Data Structures

You can add an item to a LinkedList using addToTail(T data). This function uses recursion to add an element to the list. The time complexity of such an algorithm is O(n) because it inserts the element at the tail of the list.
![Plot of LinkedList when using recursion](/LinkedList/plot_ll_recursion.png?raw=true "Plot of LinkedList when using recursion")

**Recursion should never be used in LinkedList. It's easy to write a recursive function for LinkedList but it can also give the problem of Stack Overflow.**

We can use a similar function to add(T data). This function runs in O(1) time. It inserts the element at the top of the list.
![Plot of LinkedList when using simple O(1) insertion](/LinkedList/plot_ll_loop.png?raw=true "Plot of LinkedList when using simple O(1) insertion")

This is how java's LinkedList also works. It inserts the element at the top of the head. Following is the plot of time it takes to insert an element as the List continues to grow. It's comparable to the graph above.
![Plot of LinkedList when using java.util's LinkedList](/LinkedList/plot_ll_loop.png?raw=true "Plot of LinkedList when using java.util's LinkedList")
