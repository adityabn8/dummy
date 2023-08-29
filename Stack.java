// Simple Stack implementation with basic operations like isEmpty(), isFull(), top(), push(), pop() and size().
class StackImpl{
    static final int MAX=100;
    int top=-1;
    int[] arr=new int[10];

    boolean isFull(){
        if(top==MAX-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    int top(){
        if(!isEmpty()){
            return arr[top];
        }
        return -1;
    }

    boolean push(int elem){
        if(!isFull()){
            arr[++top]=elem;
            return true;
        }
        return false;
    }

    int pop(){
        if(!isEmpty()){
            return arr[top--];
        }
        return -1;
    }
    int size(){
        return top+1;
    }
}

class Stack{
    public static void main(String[] args){
        StackImpl obj = new StackImpl();
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        obj.push(4);
        obj.push(5);
        obj.push(8);
        obj.push(2);
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
    }
}