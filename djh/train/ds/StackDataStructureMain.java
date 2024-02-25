package djh.train.ds;

import djh.train.ds.model.Employee;

public class StackDataStructureMain {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Ajay",23000);
        Employee e2 = new Employee(2,"Raj",34000);
        Employee e3 = new Employee(3,"Kamal",12000);
        Employee e4 = new Employee(4,"De",45000);

        ArrayStackStructure structure = new ArrayStackStructure(10);
        structure.push(e1);
        structure.push(e2);
        structure.push(e3);
        structure.printStack();
        System.out.println(structure.peek());
        System.out.println(structure.pop());

        structure.printStack();
        System.out.println(structure.peek());

    }
}
