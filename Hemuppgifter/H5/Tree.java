import java.util.Random;

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
	    if (pointer == null){
		pointer = new Node(value);
	    }
	    else if (pointer.value > value){
		pointer.left = put(value, pointer.left);
	    }
	    else if (pointer.value < value){
		pointer.right = put(value, pointer.right);
	    }
	    else{
		//System.out.println(value + " finns redan i trädet");
	    }
	    return pointer;
	    		     	    
	}

	private void writeTree(Node pointer){
	    if (pointer == null)
		return;
	    writeTree(pointer.left);
	    System.out.println(pointer.value);
	    writeTree(pointer.right);
	    return;
	}

	public void writeTree(){
	    writeTree(root);
	}

	public int exist(int value){
	    if (exist(value, root))
		return 1;
	    else
		return 0;
	}

	public boolean exist(int value, Node pointer){
	    if (pointer == null)
		return false;
	    else if (value == pointer.value)
		return true;
	    else if (value < pointer.value)
		return exist(value, pointer.left);
	    else 
		return exist(value, pointer.right);
	}
	

	public static void main(String args[])
	{

	    Tree srcTree = new Tree();
	    Random rand = new Random();
	    int a = 0;
	    for (int i = 0; i < 10; i++){
		srcTree.put(rand.nextInt(20)+1);
	    }

	    
	    srcTree.writeTree();
	    System.out.println("\n" + srcTree.exist(5));
	    
	    
	}

}
