package chapter5;

public class Chapter5_9StringStack implements Chapter5_9Stack{
	private int size;
	private int top;
	private String[] stack;
	
	public int getSize() {
		return size;
	}

	public Chapter5_9StringStack(int size) {
		stack= new String[size];
		this.size=size;
		top=0;
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return getSize();
	}

	@Override
	public String pop() {
			if(top==0) return null;
			String s=stack[top];
			top--;
		
		return s;
	}

	@Override
	public boolean push(String val) {
		if(top==stack.length-1)return false;
		else{
			stack[top]=val;
			top++;
			return true;
			} 
	}

}
