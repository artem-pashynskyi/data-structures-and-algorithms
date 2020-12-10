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
	- Basic Stack implementation using a Linked List.
	- Expression balance check using a stack.
	- Reverse a string with stack.	
	- isBalanced(), reverse(), TwoStacks, MinStack.
	
4.  Queues
	- Basic Queue implementation with a Linked List.
	- Reverse First K elements of Queue
	- ArrayQueue, PriorityQueue, StackQueue, StackWithTwoQueues.

5.  HashTables & Sets
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
        - Complete (All levels should be full of nodes and levels should be filled from the left to the right).
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
            
0.  Leetcode:
    - Trees:
	    - increasingBST() / Increasing Order Search Tree - Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
    	- populatingNextRightPointersinEachNodeII() / Populating Next Right Pointers in Each Node II. Given a binary tree populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL. Initially, all next pointers are set to NULL.
	- Strings:
	    - lengthOfLongestSubstring() / Longest Substring Without Repeating Characters - Given a string s, find the length of the longest substring without repeating characters.
    	- longestPalindrome() / Longest Palindromic Substring. Given a string s, return the longest palindromic substring in s.
	- Integers:
	    - kthFactor() / The kth Factor of n. Factor of a number - A factor divides a number completely without leaving any remainder. For Ex: factors of number 12 are: [1,2,3,4,6,12]. Given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0. Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
	- Arrays:
	    - canPlaceFlowers() / Can Place Flowers. You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
	    - generateMatrix() / Spiral Matrix II. Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
	    - numPairsDivisibleBy60() / Pairs of Songs With Total Durations Divisible by 60. You are given a list of songs where the ith song has a duration of time[i] seconds. Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
	    - validMountainArray() / Valid Mountain Array. Given an array of integers arr, return true if and only if it is a valid mountain array. Recall that arr is a mountain array if and only if: arr.length >= 3. There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... < arr[i - 1] < A[i]; arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
