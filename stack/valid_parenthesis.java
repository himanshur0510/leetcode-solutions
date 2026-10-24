class node{     
    node next;
    char data;
    node(char data){
        this.next=null;
        this.data=data;
    }
}
class stack{
    node top=null;
    void push(char data){
        if(top==null){
            top=new node(data);
        }
        else{
        node newnode=new node(data);
        newnode.next=top;
        top=newnode;
        }
    }
    char pop(){
        if(top==null){
            return ' ';
        }
        char ui=top.data;
        top=top.next;
        return ui;
    } 
    char peek(){
        if(top==null){
            return ' ';
        }
        return top.data;
    }
}
class Solution{
    public boolean isValid(String s){
        stack od=new stack();
        int i=0;
        int j=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                od.push(c);
                i++;
            }
            if(c=='}' || c==']' || c==')'){
                if(od.peek()==' '){
                    j=1;
                    break;
                }
                else{
                    if((c=='}'&& od.peek()=='{') || (c==']' && od.peek()=='[') || ( c==')' && od.peek()=='(')){
                        od.pop();
                        i++;
                    }
                    else{
                        j=1;
                        break;
                    }
                    
                }
            }
        }
        if(j==1 || od.peek()!=' '){
            return false;
        }
        return true;
    }
}