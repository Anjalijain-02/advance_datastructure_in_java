public class Main
{ private listnode head;
 private static class listnode
 {

     private  int data;
     private listnode next;

    public  listnode (int data)

        {   this.data = data;

            this.next = null;

        } // Constructor

    }
    // brootforce method;
    public int length()
    {
       if(head==null)
       {
           return 0;
       }
       int count=0;
       listnode current=head;
       while(current!=null)
       {
           count++;
           current=current.next;
       }
       return count;
    }
    public void display()
    {
        listnode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
    }
    public void insertfirst(int value)
    {
        listnode newnode=new listnode(value);
        newnode.next=head;
        head=newnode;
    }
 


    public static void main(String[] args)

    {   Main sll=new Main();

        sll.insertfirst(11);
        sll.insertfirst(8);
        sll.insertfirst(1);
        sll.display();
      
    }
}

