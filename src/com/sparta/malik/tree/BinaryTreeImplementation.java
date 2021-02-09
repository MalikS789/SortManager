package com.sparta.malik.tree;

import java.util.ArrayList;

public class BinaryTreeImplementation implements BinaryTree {

    private Node root = null;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    @Override
    public int getRootElement() {
       return root.value;
    }

    @Override
    public int getNumberOfElements() {
        ArrayList result = traverseInOrder(new ArrayList(), root);
        return result.size();
    }

    @Override
    public void addElement(int element) {
        root = addElement(root, element);
    }

    private Node addElement(Node current, int element) {
        if (current == null) {
            return new Node(element);
        }
        if (element < current.value) {
            current.left = addElement(current.left, element);
        } else if (element > current.value) {
            current.right = addElement(current.right, element);
        } else {
            return current;
        }
        return current;
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        return findElement(root, value);
    }

    private boolean findElement(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value ?
                findElement(current.left, value) :
                findElement(current.right, value);
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element, root);
        if (node != null && node.left != null) {
            return node.left.value;
        } else {
            throw new ChildNotFoundException();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element, root);
        if (node != null && node.right != null) {
            return node.right.value;
        } else {
            throw new ChildNotFoundException();
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        ArrayList result = traverseInOrder(new ArrayList(), root);
        int[] array = new int[result.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) result.get(i);
        }
        return array;
    }

    private Node findNode(int element, Node node) {
        //InOrder Traversal
        if (node != null) {
            findNode(element, node.left);
            if (node.value == element) {
                return node;
            }
            findNode(element, node.right);
        }
        return null;
    }

    private ArrayList traverseInOrder(ArrayList result, Node node) {
            if (node != null) {
                traverseInOrder(result, node.left);
                result.add(node.value);
                traverseInOrder(result, node.right);
            }
            return result;
    }

    private ArrayList traversePreOrder(ArrayList result, Node node) {
        if (node != null) {
            result.add(node.value);
            traversePreOrder(result, node.left);
            traversePreOrder(result, node.right);
        }
        return result;
    }

    public ArrayList traversePostOrder(ArrayList result, Node node) {
        if (node != null) {
            traversePostOrder(result, node.left);
            traversePostOrder(result, node.right);
            result.add(node.value);
        }
        return result;
    }

    @Override
    public int[] getSortedTreeDesc() {
        ArrayList result = traverseInOrder(new ArrayList(), root);
        int[] array = new int[result.size()];
        int j = 0;
        for (int i = array.length - 1; i > -1; i--) {
            array[j] = (int) result.get(i);
            j++;
        }
        return array;
    }


}
