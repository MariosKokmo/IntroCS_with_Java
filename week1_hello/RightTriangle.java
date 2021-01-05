public class RightTriangle{
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		boolean arepositive = ((n1>0) && (n2>0) && (n3>0));
		boolean isRight = (Math.pow(n1,2) + Math.pow(n2,2) == Math.pow(n3,2));
		boolean isOk = arepositive && isRight;
		System.out.println(isOk);
		}
}