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
 


    public static void main(String[] args)

    {   Main sll=new Main();

        sll.head = new listnode(10);
        listnode  second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.display();
         System.out.println();
        System.out.println("length is :"+sll.length());
    }
}

