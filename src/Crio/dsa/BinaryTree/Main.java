package Crio.dsa.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree
    {
        static int index = -1;
        public static Node buildBT(int nodes[])
        {
            index += 1;
            int val = nodes[index];
            if(val == -1) return null;
            Node node = new Node(nodes[index]);
            node.left = buildBT(nodes);
            node.right = buildBT(nodes);
            return node;
        }

        public static void displayPreOrder(Node node)
        {
            if(node == null) return;

            System.out.print(node.data);
            displayPreOrder(node.left);
            displayPreOrder(node.right);

        }
        static void displayInOrder(Node root)
        {
            if(root == null) return;

            displayInOrder(root.left);
            System.out.print(root.data);
            displayInOrder(root.right);
        }

        static void displayPostOrder(Node root)
        {
            if(root == null) return;

            displayPostOrder(root.left);
            displayPostOrder(root.right);
            System.out.print(root.data);
        }

        static void displayLevelNodes(Node root, int level, HashMap<Integer, List<Integer>> map)
        {
            if(root == null) return;
            level += 1;
            List<Integer> current = map.getOrDefault(level,new ArrayList<>());
            current.add(root.data);
            map.put(level,current);
            displayLevelNodes(root.left,level,map);
            displayLevelNodes(root.right,level,map);
            if(map.containsKey(level))
            {
                System.out.print("level " + level + " :");
                for(Integer val : map.get(level))
                {
                    System.out.print(val);
                }
                System.out.println();
            }
        }

        static int getCount(Node node)
        {
            if(node == null) return 0;

            int leftCount = getCount(node.left);
            int rightCount = getCount(node.right);
            return  1 + leftCount + rightCount;
        }

        static int sumOfNodes(Node node)
        {
            if(node == null) return 0;

            int leftSum = sumOfNodes(node.left);
            int rightSum = sumOfNodes(node.right);
            return node.data + leftSum + rightSum;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node head = BinaryTree.buildBT(nodes);
        String s = "";
        System.out.println(head.data);
        System.out.print("PreOrder Traversal : ");
        BinaryTree.displayPreOrder(head);
        System.out.println();
        System.out.print("InOrder Traversal : ");
        BinaryTree.displayInOrder(head);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        BinaryTree.displayPostOrder(head);
        System.out.println();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        BinaryTree.displayLevelNodes(head,0,map);
        System.out.println(BinaryTree.getCount(head));
        System.out.println(BinaryTree.sumOfNodes(head));
    }
}
