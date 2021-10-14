package br.edu.ifsul.erp_system.database;

public class BinTreeAct {

    private BinTreeNode root_node;

    public BinTreeAct() {
        root_node = null;
    }

    public void insertNode(int v) {
        BinTreeNode new_node = new BinTreeNode();
        new_node.bt_item = v;
        new_node.right_v = null;
        new_node.left_v = null;

        if(root_node == null) root_node = new_node;
        else{
            BinTreeNode atual = root_node;
            BinTreeNode anterior;
            while(true) {
                anterior = atual;
                if (v <= atual.bt_item) {
                    atual = atual.left_v;
                    if (atual == null) {
                        anterior.left_v = new_node;
                        return;
                    }
                }
                else {
                    atual = atual.right_v;
                    if (atual == null) {
                        anterior.right_v = new_node;
                        return;
                    }
                }
            }
        }
    }

    public BinTreeNode findNode(int x) {
        if (root_node == null) return null;

        BinTreeNode curr_node = root_node;
        while (curr_node.bt_item != x) {
            if(x < curr_node.bt_item ) curr_node = curr_node.left_v;
            else curr_node = curr_node.right_v;
            if (curr_node == null) return null;
        }

        return curr_node;
    }
}
