public class RandomWalkers {
    public static void main(String[] args) {
        
    int r = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    int trials = Integer.parseInt(args[1]);
    int distance = 0;
    int step =0;
    double avg_step =0;
    double p = 0;
	
    for ( int i = 0; i < trials; i++) {
        step = 0;
        x = 0;
        y = 0;
        distance = 0;
        
        while (distance < r) {
            p = Math.random();
            if ( p < 0.25) {
                x += 1;
            } else if ( p < 0.5) {
                x -= 1;
            } else if ( p < 0.75) {
                y -= 1;
            } else {
                y += 1;
            }
            distance = Math.abs(x) + Math.abs(y);
            step += 1;
        }
        avg_step += step;
        }
	
    System.out.println("average number of steps = " + avg_step/trials);
    }
}