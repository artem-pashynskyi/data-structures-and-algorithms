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
        
    - AVL:
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
            
0.  Leetcode
	- increasingBST() / Increasing Order Search Tree - Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
	- lengthOfLongestSubstring() / Longest Substring Without Repeating Characters - Given a string s, find the length of the longest substring without repeating characters.
	- kthFactor() / The kth Factor of n. Factor of a number - A factor divides a number completely without leaving any remainder. For Ex: factors of number 12 are: [1,2,3,4,6,12]. Given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0. Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.    