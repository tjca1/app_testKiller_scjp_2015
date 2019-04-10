/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.testeCodigos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 805690
 */
public class bean {

    String nome;

    public bean(String nome) {
        this.nome = nome;
    }

    bean() {
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final bean other = (bean) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

   

    


}
