package com.labproblems;

import java.util.ArrayList;

class Node1
{
Node1 rightNode;
Node1 leftNode;
int nodedata;

Node1(int data)
{
nodedata = data;
rightNode=leftNode =null;
}
}


public class problem6 {

 static ArrayList<Integer> longestPath(Node1 root)
{
	if(root == null)
	{
		ArrayList<Integer> path = new ArrayList<>();
		return path;
	}
	
	ArrayList<Integer> right = longestPath(root.rightNode);
	ArrayList<Integer> left = longestPath(root.leftNode);
	if(right.size() > left.size())
	{
		right.add(root.nodedata);
	}
	else
	{
		left.add(root.nodedata);
	}
	return (left.size() > right.size()? left:right);
 }
	
public static void main(String args[])
{
	Node1 root = new Node1(100);

    Node1 node1 = new Node1(20);
    Node1 node2 = new Node1(130);
    Node1 node3 = new Node1(10);
    Node1 node4 = new Node1(50);
    Node1 node5 = new Node1(110);
    Node1 node6 = new Node1(140);
    Node1 node7 = new Node1(5);
    root.leftNode = node1;
    root.rightNode = node2;
    
    node3.leftNode = node7;
    
    node1.leftNode = node3;
    node1.rightNode = node4;
    
    node2.leftNode = node5;
    node2.rightNode = node6;
 ArrayList<Integer> arr = longestPath(root);
for(int i:arr)
{
	System.out.println(i);
}

}
	
	
}

