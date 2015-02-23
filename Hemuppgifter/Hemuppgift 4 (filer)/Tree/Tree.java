
class Tree
    {
	private Node root;
	public Tree(){
	    root = null;
	}

	public void put(int value){
	    root = put(value, root);
	}
	
	private Node put(int value, Node pointer){
	    if (pointer == null)
		pointer = new Node(value);
	    else if (pointer.value > value)
		pointer.left = put(value, pointer.left);
	    else if (pointer.value < value)
		pointer.right = put(value, pointer.right);
	    else
		System.out.println("Objektet existerar redan i trädet");
	    return pointer;
	    		     	    
	}

	
	public static void main(String args[])
	{

	    
	    
	}
    }
    
}
