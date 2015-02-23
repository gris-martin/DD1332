

class Node{

    public Node left;
    public Node right;
    public int value;

    public Node(int v){
	this.value = v;
	this.left = null;
	this.right = null;
    }

    public Node(Node original){
	this.left = original.left;
	this.right = original.right;
	this.value = original.value;
    }
    
}
    
