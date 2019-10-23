/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev1;

/**
 *
 * @author muhammet
 */
public class Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Odev1LinkedList deneme = new Odev1LinkedList();
        deneme.addFirst(10);
        deneme.addLast(50);
        deneme.addLast(60);
        deneme.addLast(70);
        deneme.addLast(80);
        deneme.print();
        System.out.println(deneme.reverse().toString());
        
        Odev1LinkedList concate = new Odev1LinkedList();
        concate.addFirst(100);
        concate.addLast(110);
        concate.addLast(200);
        concate.addLast(500);
        
        concate.print();
        
        Odev1LinkedList a = (Odev1LinkedList) deneme.concatenate(concate);
        
        a.print();
        
        
        Odev1LinkedList ek = new Odev1LinkedList();
        ek.insertInOrder(5);
        ek.insertInOrder(4);
        ek.insertInOrder(6);
        ek.insertInOrder(2);
        ek.insertInOrder(1);
        ek.insertInOrder(0);
        ek.insertInOrder(9);
        ek.insertInOrder(7);
        
        ek.print();
        
        deneme.insertInOrder(0);
        deneme.print();
        deneme.insertInOrder(80);
        deneme.insertInOrder(100);
        deneme.print();
    }
    
}
