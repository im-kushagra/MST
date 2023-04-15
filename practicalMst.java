import java.util.*;

public class practicalMst{
    public static void main(String args[]){

        //Creating Set 1
        Set<String> s1=new HashSet<String>();
        s1.add("B");
        s1.add("A");
        s1.add("C");
        s1.add("D");
        s1.add("C");

        System.out.println("Set 1: "+s1);
        //Creating List 2
        List l1=new ArrayList<>();

        l1.add("B");
        l1.add("A");
        l1.add("C");
        l1.add("D");
        l1.add("C");

        System.out.println("List: "+l1);
         
       //Creating Set 2 
       Set<String> s2=new HashSet<String>(l1);
       System.out.println("Set 2: "+s2);
       
       //Check Whether Set 1 and Set 2 are Equal
       System.out.println("Set 1 and Set 2 are Equal :"+s1.equals(s2));
       //Remove A from Set 1
       s1.remove("A");
       //A is removed from Set 1

       System.out.println("Set 1 and Set 2 are Equal :"+s1.equals(s2));

       //Printing Size of Set 1 and Set 2
       System.out.println("Size of Set 1: "+s1.size());
       System.out.println("Size of Set 2: "+s2.size());

       //Printing Set 1 using Iterator
        System.out.println("Printing Set 1 Using Iterator");
       Iterator it = s1.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }


            System.out.println("\nDisplaying the Set 1 using for each loop:");
                for (String i: s1)
                    {
                         System.out.println(i);
                    }

    }
}