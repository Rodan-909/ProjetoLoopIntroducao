/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloop;

/**
 *
 * @author odavi
 */
public class ProjetoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        cont = 1;
        
        while(cont <= 100){
            if(cont % 3 == 0 || cont % 5 == 0){
                System.out.println(cont);
                
            }
            cont++;
                
        }
    }
    
}
