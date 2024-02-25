package djh.train.ds;

import djh.train.ds.model.Employee;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListStackStructure {
    private int top;
    private LinkedList<Employee> stack;

    public LinkedListStackStructure(){
        stack = new LinkedList<>();
    }

    public void push(Employee emp){
        stack.push(emp);
    }

    public Employee pop(){
        return stack.pop();
    }
    public Employee peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        stack.forEach( emp -> System.out.println(emp+"\n------------^-------------"));
    }
}
