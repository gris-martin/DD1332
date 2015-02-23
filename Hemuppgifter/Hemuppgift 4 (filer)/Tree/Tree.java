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
	    else
		System.out.println(value + " finns redan i trädet");
	    return pointer;
	    		     	    
	}

	public void writeTree1(){
	    writeTree1(root);
	}
	
	private void writeTree1(Node pointer){
	    if (pointer == null)
		return;
	    System.out.println(pointer.value);
	    writeTree1(pointer.left);
	    writeTree1(pointer.right);
	    return;
	}


	private void writeTree2(Node pointer){
	    if (pointer == null)
		return;
	    writeTree2(pointer.left);
	    System.out.println(pointer.value);
	    writeTree2(pointer.right);
	    return;
	}

	private void writeTree2(){
	    writeTree2(root);
	}
	
	
	public static void main(String args[])
	{

	    Tree srcTree = new Tree();
	    Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++){
		srcTree.put(rand.nextInt(20)+1);
	    }
	    System.out.println("");
	    
	    srcTree.writeTree1();

	    System.out.println("");

	    srcTree.writeTree2();
	    
	}
}
