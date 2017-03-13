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

##Graph
make main

Will run a simple graph algorithm to do a 
+ BFS - Breadth First Search
+ DFS - Depth First Search
+ isCyclic - If a graph is cyclic

on a directed graph and undirected graph

##To Do
+ Distribute test file and src file in different folder using maven
+ Move build process to Maven from Makefiles.

<pre>
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running kumar116.LinkedListTest
Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.042 sec - in kumar116.LinkedListTest

Results :

Tests run: 13, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.036 s
[INFO] Finished at: 2017-03-13T02:36:39-04:00
[INFO] Final Memory: 12M/153M
[INFO] ------------------------------------------------------------------------
</pre>
