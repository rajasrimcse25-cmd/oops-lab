interface StackADT{
  void push(int x);
  void display();
}
class Stack implements StackADT{
  int[]s=new int[5];
  int top=-1;
  public void push(int x){
    if(top==s.length -1)
      System.out.println("Stack Overflow");
    else
      s[++top]=x;
}
public void display(){
  for(int i = top;i >= 0;i--)
     System.out.println(s[i]);
     }
}
public class StackDemo{
  public static void main(String[] args){
  Stack st = new Stack();
  st.push(10);
  st.push(20);
  st.push(30);
  System.out.println("Stack Elements:");
  st.display();
  }
}
