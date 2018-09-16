package l1;
/*
 * 静态方法也叫类方法，由Static修饰，它是在类加载的时候会一起加载，它不属于某个对象，但是它可以通过对象来
 * 调用，应为本身静态方法和静态变量也是属于类的，而类就是为了给我们的实例变量赋初值的，所以通过对象是可以调用
 * 静态的方法和静态的变量。
 * 
 * 静态方法不可以调用实例方法和实例变量，因为在类加载的时候并不清楚这个实例的方法和变量是属于哪个对象的，同样
 * 的道理静态方法中也不能使用this关键字的，因为它没有具体的指向的对象。
 * 而实例的方法和变量时可以访问静态的方法和变量的，可以先暂时理解为实例的方法的权限大于静态的方法和变量（就是
 * 实例方法，普通方法可以调用静态的，但静态的方法不可以调用实例的方法和变量）。
 * 
 */
public class StaticMethod {
	private static int i;
	private int n;
	static void callM() {
		i=10;//静态方法可以调用静态变量
		//n=20;//静态方法不可以调用实例变量
		callH();//静态方法可以调用静态方法
		//call();//静态方法不可以调用实例方法
		System.out.println("我是一个静态方法。");
	}
	static void callH() {
		System.out.println("静态方法。");
	}
	void  call() {
		i=5;//实例方法可以调用静态变量
		n=15;//实例方法可以调用实例变量
		callM();//实例方法可以调用静态方法
		callH();//实例方法可以调用静态方法
		callT();//实例方法可以调用实例方法
		System.out.println("我是一个普通方法。");
	}
	public static void main (String []args) {
		StaticMethod.callH();
		int a = StaticMethod.i;
		StaticMethod.callM();
		StaticMethod aa = new StaticMethod();
		aa.call();
		int l=aa.n;
		aa.callH();
		int c= aa.i;
		}
	void callT() {
		
	}
}
