# Data Structures (cs251)

##Linked List

**Usage**
+ addToHead(T data) - Add any generic data to the head of the list
+ addToTail(T data) - Add any generic data to the tail of the list
+ contains(T data) - Search for the first occurrence of data in the list
+ remove(T data) - Remove the first occurrence of data in the list
+ remove(T data, boolean all) - Set boolean to true to remove all occurrences of the data in the list

**Notes**

Plot of interval time of insertion of each element using ...

 java.kumar116.LinkedList | java.util.LinkedList
:--------------------------------------------------:|:-----------------------------------------------------:
![Plot of LinkedList when using simple O(1) insertion](https://github.com/kumar116/cs251/blob/master/archive/LinkedList/plot_ll_loop.png?raw=true "Plot of LinkedList when using simple O(1) insertion") | ![Plot of LinkedList when using java.util's LinkedList](https://github.com/kumar116/cs251/blob/master/archive/LinkedList/plot_ll_java.png?raw=true "Plot of LinkedList when using java.util's LinkedList")

##Stack

**Usage**
+ push(T data) - Add any generic data to the stack
+ pop() - Get and remove the data at the top
+ size() - Returns the size of the stack/Can be used to find if the Stack is empty.

**Notes**

NoSQL database(for example MongoDB) can be used to store and make any kind of data structure, but what can it be used for ?

To try a demonstration, do meteor run inside mongo-stack folder.

![Mongo Stack](https://github.com/kumar116/DT/blob/master/mongo-stack/stack-mongo.jpg?raw=true "Mongo Stack")
