/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg3;

/**
 *
 * @author GAMES
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       
    int n =4;
    
    for (int i = 1; i <= n; i++) {
        for(int j = n; j >= 1; j--) {
            
            if (i == 1 || i == n || i == j) {
                System.out.print("@ ");
            }
            
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}