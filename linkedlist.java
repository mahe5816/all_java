class slist{
    class node{
    public int data;
    node link;
    node(int data){
        this.data=data;
        node link=null;
    }
}
node link=null;
node head=null;
node tail=null;
    public void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            node current=head;
            while(current.link!=null){
                current=current.link;
            }
            current.link=newnode;
        }
    }
    void display(){
        node p=head;
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.link;
        }
        System.out.println("NULL->");
    }
    void delete(int pos){
        int c=0;
        node temp=head;
        while(temp!=null && c!=pos-1){
            temp=temp.link;
            c++;
        }
        temp.link=temp.link.link;
    }
    void deletelast(){
        node temp=head,var=head;
        while(temp.link!=null){
            var=temp;
            temp=temp.link;
        }
        var.link=null;
    }
}

public class linkedlist {
    public static void main(String[] args) {
    slist a=new slist();
    a.insert(2);
    a.insert(3);
    a.insert(4);
    a.insert(2);
    a.insert(5);
    a.display();
    a.deletelast();
    a.display();
    }
}
