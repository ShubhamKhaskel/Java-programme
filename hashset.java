import java.util.*;
//kon value kon index e boshbe ota depend kore hashfunction er upor
class hashset
{
    public static void main(String args[])
    {
        HashSet<Integer> m=new HashSet<>(); 
        //////////////
        //insert 
        ///////////////
        
        m.add(6);
        m.add(1);
        m.add(2);
        m.add(8);
        m.add(11);
        System.out.println(m); 
        
        ///////////
        //search
        ///////////
        
        if(m.contains(11))
        {
          System.out.println("set contains 11");  
        }
        if(!m.contains(12))
        {
            System.out.println("set does not contain 12"); 
        }
        
        ////////////
        //delete
        ////////////
        
        m.remove(2);
        if(!m.contains(2))
        {
            System.out.println("set does not contain 2 it is deleted");
        }
        
        ///////////
        //size
        ///////////
        
        System.out.println("size= "+m.size());
        
        /////////////
        //Iterator
        //set er moddhey kono index hoye na so we use a iterator
        /////////////
        
        Iterator it=m.iterator();   //Iterator =datatype  iterator=function
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}