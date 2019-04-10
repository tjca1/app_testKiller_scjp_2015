/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.testeCodigos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author 805690
 */
public class testeCod {

    public static void main_(String[] args) {
         bean a = new bean();
         bean b = new bean();
         bean c = new bean();
         bean d = new bean();

         a.nome = "Thiago";
         b.nome = "Thiago";
         c.nome = "Thiago";
         d.nome = "Thiago";

         System.out.println("a:"+a.hashCode());
         System.out.println("b:"+b.hashCode());
         System.out.println("c:"+c.hashCode());
         System.out.println("d:"+d.hashCode());


/////////////////////////////////////////////////////////////////////////////////////////////
         List<bean> l = new ArrayList<bean>();
         Set<bean> set = new HashSet<bean>();
         set.add(a);
         set.add(b);
         set.add(c);
         set.add(d);
         ////
         l.add(a);
         l.add(a);
         l.add(a);
         l.add(a);

         System.out.println("Quantidade Set:"+set.size());
         System.out.println("Quantidade List:"+l.size());
         /////////////////
         System.out.println("hash a:"+a.nome.hashCode());
         System.out.println("hash b:"+b.nome.hashCode());
         System.out.println("hash c:"+c.nome.hashCode());
         System.out.println("hash d:"+d.nome.hashCode());





    }

}
