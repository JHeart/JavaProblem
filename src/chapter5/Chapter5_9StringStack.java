package chapter5;

public class Chapter5_9StringStack implements Chapter5_9Stack{
	private int size;
	private int i=0;
	private String []stack;
	
	public int getSize() {
		return size;
	}

	public Chapter5_9StringStack(int size) {
		stack= new String[size];
		this.size=size;
	}
	
	@Override
	public int length() {
		return i;
	}

	@Override
	public int capacity() {
		return getSize();
	}

	@Override
	public String pop() {
		return stack[i];
	}

	@Override
	public boolean push(String val) {
		if(i<size) {
			stack[i]=val;
			i++;
			return true;
			}else return false;
	}

}
