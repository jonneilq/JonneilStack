/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonneilstack;

public class JonneilStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public JonneilStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    public void push (long j) {
        stackArray[++top] = j;
    }
    public long pop() {
        return stackArray [top--];
    }
    public long peek() {
        return stackArray [top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    
    
    
    public static void main(String[] args) {
        JonneilStack theStack = new JonneilStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
	theStack.push(60);
	theStack.push(70);
	theStack.push(80);
	theStack.push(90);
	theStack.push(100);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" , ");
        }
        System.out.println("");
    }
    
}
