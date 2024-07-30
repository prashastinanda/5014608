package com.list;

public class LinkedList {

	private class Node {
        Task data;
        Node next;

        Node(Task data) {
            this.data = data;
            this.next = null;
        }
    }
	
	private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getTaskId() == taskId) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }

        if (head.data.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.getTaskId() == taskId) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
