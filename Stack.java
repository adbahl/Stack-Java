/** Stack.java: Stack the linear data structure which follows last in first out.
 * Code covers method like push, pop, peek, isStackEmpty and isStackFull
 * Created by Arvind Bahl on 6/4/2019.
 */
public class Stack {

    String [] stackArr;
    int maxsize;
    int topindex = -1;

    // Constructor function for class
    Stack(int msize){
        this.maxsize = msize;
        stackArr = new String[msize];
    }

    //Push function to push element in stack
    public void push(String inputString){
        if(topindex<maxsize-1){
            stackArr[++topindex] = inputString;
        }
        else{
            System.out.println("Sorry, Can't push it in the stack is full");
        }
    }

    // Pop function to get the top element in stack and remove it from stack
    public String pop(){
        if(topindex==-1){
            return "The stack is empty";
        }
        else{
            String topelement = stackArr[topindex];
            stackArr[topindex]= "";
            topindex--;
            return topelement;
        }
    }

    // Peek function to view or get the top value in the stack
    public String peek(){
        if(topindex==-1){
            return "The stack is empty";
        }
        else{
            return stackArr[topindex];
        }
    }

    // isStackFull gives the answer if the stack is full or not
    public boolean isStackFull(){
        return (topindex == maxsize-1);
    }

    // isStackEmpty returns if the stack empty is empty or not
    public boolean isStackEmpty(){
        return(topindex==-1);
    }


    public static void main(String[] args){

        Stack firstStack = new Stack(4);
        System.out.println("Is the stack empty = " + firstStack.isStackEmpty());
        System.out.println("Is the stack full = " + firstStack.isStackFull());

        firstStack.push("FirstItem");
        firstStack.push("SecondItem");
        firstStack.push("ThirdItem");
        firstStack.push("ForthItem");
        firstStack.push("FifthItem");

        System.out.println("Is the stack empty = " + firstStack.isStackEmpty());
        System.out.println("Is the stack full = " + firstStack.isStackFull());

        System.out.println("This is peek item "+ firstStack.peek());
        System.out.println("This is popped item "+ firstStack.pop());
        System.out.println("This is peek item "+firstStack.peek());
        System.out.println("This is popped item "+ firstStack.pop());
        System.out.println("This is peek item "+ firstStack.peek());
        System.out.println("This is popped item "+ firstStack.pop());
        System.out.println("This is peek item "+ firstStack.peek());
        System.out.println("This is popped item "+ firstStack.pop());
        System.out.println("This is peek item "+ firstStack.peek());
        System.out.println("This is popped item "+ firstStack.pop());

    }
}
