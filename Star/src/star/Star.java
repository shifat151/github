/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star;

/**
 *
 * @author User
 */
public class Star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j,k,x=4;
        for(i=0;i<4;i++){
            for(j=0;j<x;j++){
                System.out.print(" ");
            }
            x=x-1;
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
