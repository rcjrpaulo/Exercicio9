/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author paulo
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree mainTree = new BinaryTree(3);
        BinaryTree firstLeftTree = new BinaryTree(4);
        BinaryTree firstRightTree = new BinaryTree(5);
        BinaryTree secondLeftTree = new BinaryTree(6);
        BinaryTree secondRightTree = new BinaryTree(7);
        
        firstLeftTree.left = secondLeftTree;
        firstRightTree.right = secondRightTree;

        mainTree.left = firstLeftTree;
        mainTree.right = firstRightTree;
        
        int result = mainTree.getChildrenSum();
        
        System.out.println("mainTree's children Sum = " + result);
        
        
        
    }
    
}
