# data-structures-and-algorithms
This directory contains following Data Structures and Algorithms implementations as well as projects and problem solving.
1.  Arrays 
	- Matrix Rotation 90 degrees in place.
	- Create Arrays class: insert(), removeAt(), indexOf(), print(), max(), reverse(), insertAt().

2.  Linked Lists
	- Basic Singly Linked List implementation with required methods.
	- Reversing Singly Link List in one pass.
	- Finding the Kth node from the last of a singly linked List in one pass.
	- Finding the middle node/nodes of a singly linked list in one pass (Size is not known in advance)
	- isEmpty(), addLast(), deleteLast(), print(), reverse(), findKthNodeFromTheEnd(), isPalindrome(), sortListDesc().
	- getRandom() - Linked List Random Node
		
3.  Stacks
    - Usage: 
        - Undo\redo operation in word processors.
        - Expression evaluation and syntax parsing
        - Many virtual machines like JVM are stack oriented.
	- Basic Stack implementation using a Linked List.
	- Expression balance check using a stack.
	- Reverse a string with stack.	
	- isBalanced(), reverse(), TwoStacks, MinStack.
	
4.  Queues
    - Usage:
        - Transport and operations research where various entities are stored and held to be processed later ie the queue performs the function of a buffer.
        - Ticket counter line where people who come first will get his ticket first.
        - Key press sequence in keyboard.
        - Printers.
	- Basic Queue implementation with a Linked List.
	- Reverse First K elements of Queue
	- ArrayQueue, PriorityQueue, StackQueue, StackWithTwoQueues.

5.  HashTables & Sets
    - Usage:
        - used for fast data lookup - symbol table for compilers.
        - Database indexing, caches. 
        - Unique data representation.
    - Collision:
        - Chaining: In chaining we use array indexes to store the values. If hash code of second value also points to the same index then we replace that index value with an linked list and all values pointing to that index are stored in the linked list and actual array index points to the head of the the linked list. But if there is only one hash code pointing to an index of array then the value is directly stored in that index. Same logic is applied while retrieving the values. This is used in Java HashMap/Hashtable to avoid collisions.
        - Linear probing: This technique is used when we have more index in the table than the values to be stored. Linear probing technique works on the concept of keep incrementing until you find an empty slot. The pseudo code looks like this:
        - Double hashing technique: In this technique we use two hashing functions h1(k) and h2(k). If the slot at h1(k) is occupied then the second hashing function h2(k) used to increment the index. The pseudo-code looks like this:
    - Basic HashTable implementation with a Linked List.
    - put(), get(), remove(), hash()
    - findFirstNonRepeatingCharacter(), findFirstRepeatingCharacter()
    
6.  Binary Trees & AVL Trees
    - Binary: (Can be skewed if insert elements in asc or desc order)
        - Traversing:
            - Breadth first (Level order)
            - Depth first:
                - Pre-order: Root, Left, Right.
                - In-order: Left, Root, Right
                - Post-order: Left, Right, Root
        - insert(), find()
        - traversePreOrder(), traverseInOrder(), traversePostOrder(), traverseLevelOrder()
        - height(), min(), equals(), isBinarySearchTree(), printNodesAtKDistance()
        - size(), countLeaves(), max(), contains(), areSibling(), getAncestors()
        
    - AVL trees:
        - Unbalanced(skewed): 
            - height(left) - height(right) > 1 --> left heavy 
            - height(right) - height(left) > 1 --> right heavy
        - Rotations:
            - Left(LL)
            - Right(RR)
            - Left - Right(LR)
            - Right - Left(RL)
        - insert(), balance(), balanceFactor(), isLeftHeavy(), isRightHeavy(), balanceFactor(), rotateLeft(), rotateRight(), setHeight()
        - height(), heightDebug(), size()
        - isBalanced() - !(height(leftChild) - height(rightChild) > 1) && !(height(rightChild) - height(leftChild) > 1)
        - isPerfect() - Math.pow(2, height(root)+1)-1 == size(root)
    
    - Heaps:
        - Is a Complete Binary Tree (All levels should be full of nodes and levels should be filled from the left to the right).
            - Each child of the Heap should be equal or smaller than parent. If not we need to bubble it up.
            - Min Heap (Root is smallest) - Default heap, PriorityQueue<Integer> heap = new PriorityQueue<>(); can be used. 
            - Max Heap (Root is largest)  - PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder()); can be used.
        - Not Complete.
        - Formula to get left child: leftChild = parent * 2 + 1;
        - Formula to get right child: rightChild = parent * 2 + 2;
        - Formula to get parent: parent = (index - 1) / 2;
        - Formula to get LAST parent: lastParent = (n / 2) - 1;
        - insert(), remove(), isFull(), isEmpty(), sortHeap()
        - heapify(), getKthLargestNumber()
        
7.  Tries
    - Usage: Autocompletion.
	- Digital.
	- Radix.
	- Prefix.
	- Traversals:
	    - Pre-order.
	    - Post-order.
	- TrieWithArray, TrieWithHashMap
	- insert(), contains(), traverse()      
	
8.  Graphs
    - A graph is a non-linear data structure consisting of vertices (V) and edges (E).
    - Directed VS Undirected
    - Usage: 
        - Routers connection in network.
        - How people connected in social media platforms and how strong the connections are.
    - Traversal:
        - Depth - first Search (go deep in each level).
        - Breadth - first Search (using Queue).
    - Implementation:
        - Adjacency Matrix.
        - Adjacency List.
    - Nodes called - Vertices.
    - Two connected Nodes are neighbors.
    - Traversal algorithms.
    - Dijkstra's shortest path algorithm can be implemented by using Priority Queue.
    - Prim's algorithm to find the minimum spanning tree of the Graph:
        - Extend the tree by adding the smallest connected edge.
            
0.  Leetcode
    - Trees:
	    - increasingBST() / Increasing Order Search Tree - Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
    	- populatingNextRightPointersinEachNodeII() / Populating Next Right Pointers in Each Node II. Given a binary tree populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL. Initially, all next pointers are set to NULL.
	- Strings:
	    - lengthOfLongestSubstring() / Longest Substring Without Repeating Characters - Given a string s, find the length of the longest substring without repeating characters.
    	- longestPalindrome() / Longest Palindromic Substring. Given a string s, return the longest palindromic substring in s.
    	- isSubsequence() / Is Subsequence. Given a string s and a string t, check if s is subsequence of t.
	- Integers:
	    - kthFactor() / The kth Factor of n. Factor of a number - A factor divides a number completely without leaving any remainder. For Ex: factors of number 12 are: [1,2,3,4,6,12]. Given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0. Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
	- Arrays:
	    - canPlaceFlowers() / Can Place Flowers. You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
	    - generateMatrix() / Spiral Matrix II. Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
	    - numPairsDivisibleBy60() / Pairs of Songs With Total Durations Divisible by 60. You are given a list of songs where the ith song has a duration of time[i] seconds. Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
	    - validMountainArray() / Valid Mountain Array. Given an array of integers arr, return true if and only if it is a valid mountain array. Recall that arr is a mountain array if and only if: arr.length >= 3. There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... < arr[i - 1] < A[i]; arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        - removeDuplicates() / Remove Duplicates from Sorted Array II. Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
        - sortedSquares() / Squares of a Sorted Array. Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
        