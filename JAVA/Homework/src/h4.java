class Node{
    // 데이터 선언
    private int data;
    private Node left;
    private Node right;
    
    public Node(int data){
        this.setData(data);
        setRight(null);
        setLeft(null);
    }
     
    public int getData() {
    	return data;
    	}
    public void setData(int data) {
    	this.data = data;
    	}
    public Node getLeft() {
    	return left;
    	}
    public void setLeft(Node left) {
    	this.left = left;
    	}
    public Node getRight() {
    	return right;
    	}
    public void setRight(Node right) {
    	this.right = right;
    	}
}
