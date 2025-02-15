public class Stack {
int[] arr;
Stack(int a){
    int tos=-1;
    arr=new int[a];
}
public void push(int a){
    if (tos==arr.length-1){
        System.out.println("stack is full");
    }
    else{
        arr[++tos]=a;
    }
}
public int pop(){
    if (tos!=-1){
    return arr[tos--];
    }
    else{
    return tos;
    }
}

}