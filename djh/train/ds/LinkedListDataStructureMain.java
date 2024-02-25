package djh.train.ds;

import djh.train.ds.model.Employee;

public class LinkedListDataStructureMain {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Ajay",23000);
        Employee e2 = new Employee(2,"Raj",34000);
        Employee e3 = new Employee(3,"Kamal",12000);
        Employee e4 = new Employee(4,"De",45000);

        LinkedListStackStructure listStackStructure = new LinkedListStackStructure();
        listStackStructure.push(e1);
        listStackStructure.push(e2);
        listStackStructure.push(e3);
        listStackStructure.printStack();
        System.out.println(listStackStructure.peek());
        System.out.println(listStackStructure.pop());

        listStackStructure.printStack();
        System.out.println(listStackStructure.peek());
    }
}
