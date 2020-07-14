package ProjectStackFrame;

import java.util.EmptyStackException;
import java.util.Vector;

public class Stack<type> extends Vector<type> {

    /**
     * This constructor creates a new Stack, initialed empty
     */
    public Stack() {
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item
     * @return item
     */
    public type push(type item) {
        addElement(item);
        return item;
    }

    /**
     * Removes the object at the top of this stack throws EmptyStackException if
     * the stack is empty
     *
     * @return topElement (deleted object)
     */
    public type pop() {
        //EmptyStackException is an error we throw if the stack is empty
        if (elementCount == 0) {
            throw new EmptyStackException();
        }

        type topElement = (type) elementData[--elementCount];

        // Set topMost element to null to assist the gc(garbage collector) in cleanup.
        elementData[elementCount] = null;

        return topElement;
    }

    /**
     * show the element on the top of the stack, but does not remove it. throws
     * EmptyStackException if the stack is empty.
     *
     * @return the element on the top of the stack
     */
    public type peek() {
        //EmptyStackException is an error we throw if the stack is empty         
        if (elementCount == 0) {
            throw new EmptyStackException();
        }

        return (type) elementData[elementCount - 1];
    }

    /**
     * Tests if this stack is empty.
     *
     * @return false if the stack contains elements and true if the stack is
     * empty
     */
    @Override
    public boolean isEmpty() {
        return elementCount == 0;
    }

    /**
     * Returns the number of components in this Stack.
     *
     * @return the number of components in this Stack.
     */
    public int getsize() {
        return elementCount;
    }

    /**
     * @param input (Integer Stack contains Numbers Only)
     * @return the sorted stack
     */
    public Stack<Integer> sortAscending(Stack<Integer> input) {
        //copy the original stack and sort the copied
        Stack<Integer> copy = new Stack<>();
        for (int i = 0; i < input.getsize(); i++) {
            copy.push(input.get(i));
        }

        //create temp Stack to sort the items in it
        Stack<Integer> tmpStack = new Stack<>();
        while (!copy.isEmpty()) {
            // pop out the first element 
            int tmp = copy.pop();

            // while temporary stack is not empty and 
            // top of stack is greater than temp 
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                // pop from temporary stack and  
                // push it to the input stack 
                copy.push(tmpStack.pop());
            }

            // push temp in tempory of stack 
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}
