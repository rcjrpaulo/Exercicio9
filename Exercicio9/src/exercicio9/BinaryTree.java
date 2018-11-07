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
public class BinaryTree {
    int valor;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int valor) {
        this.valor = valor;
    }
    
    public int getChildrenSum()
    {
        BinaryTree leftNode = this.left;
        BinaryTree rightNode = this.right;
        int result;
        
        result = this.searchChildren(this);
        
        return result;
    }
    
    public boolean hasLeftNode()
    {
        return left != null;
    }
    
    
    public boolean hasRightNode()
    {
        return right != null;
    }
    
    private int searchChildren(BinaryTree node)
    {
        if (node.hasLeftNode() && node.hasRightNode()) {
            return node.valor + node.searchChildren(node.left) + node.searchChildren(node.right);
        }
        
        if (node.hasLeftNode()) {
            return node.valor + node.searchChildren(node.left); 
        }
        if (node.hasRightNode()) {
            return node.valor + node.searchChildren(node.right); 
        }
        
        return node.valor;
    }
}
