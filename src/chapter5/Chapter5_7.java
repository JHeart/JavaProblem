package chapter5;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
}
class Point3D extends Point{
	private int z;
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public Point3D(int x,int y,int z) {
		super(x, y);
		this.z=z;
	}
	void moveUp(){
		z++;
	}
	void moveDown() {
		z--;
	}

	void move(int x, int y, int z) {
		super.move(x, y);
		this.z=z;
	}
	public String toString() {
		//System.out.println("("+x+","+y+","+z+")");
		return "("+getX()+","+getY()+","+z+")";
	}
}

public class Chapter5_7 {
	public static void main(String[] args) {
		Point3D p= new Point3D(1,2,3);//1,2,3,��  ���� x,y,z���� ��
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.moveUp();//z������ ���� �̵�
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.moveDown();//z������ �Ʒ��� �̵�
		p.move(10,10);//x,y,������ �̵�
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.move(100,200,300);//x,y,z ������ �̵�
		System.out.println(p.toString()+"�Դϴ�.");
		
	}
}
