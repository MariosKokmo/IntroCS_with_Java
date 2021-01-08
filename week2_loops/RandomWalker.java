public class RandomWalker {
    public static void main(String[] args) {
	
    int r = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    int distance = 0;
    int step =0;
    double p = 0;
	
    System.out.println("("+x+", "+y+")");
    while (distance < r) {
        p = Math.random();
        if ( p < 0.25 ) {
            x += 1;
            }
            else if ( p < 0.5){
                x -= 1;
                }
                else if ( p < 0.75){
                    y -= 1;
                    }
                    else {
                        y += 1;
                        }
    System.out.println(" ( " + x + " , " + y + " ) ");
    step += 1;
    distance = Math.abs(x) + Math.abs(y);
    }
    System.out.println( " steps = " + step );
    }
}