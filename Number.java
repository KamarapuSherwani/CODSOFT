package task1;
import java.util.*;

public class Number{

	public void game(){
		int r_num, num, score=0, diff, won=0;
		Scanner sc = new Scanner(System.in);

		r_num = 1+(int)(Math.random()*10);
		//System.out.println("System generated random Number: "+r_num);

     for(int i=1; i<=5; i++){ //Limiting no. of attempts to 5

		System.out.println("Enter any positive random Number: ");
		num = sc.nextInt();

		diff = Math.abs(r_num-num);

		if(num == r_num) //correct guess
		    {
		      System.out.println("Correct Guess! You Won!");	
              won++;
              score+=10; //if correct score increases to 10 points
              break;
		    }
		else if(diff<25)
		    {
              System.out.println("Guess is too Low!");
              score+=2;	
		    }
		else
		    {
              System.out.println("Guess is too High!");	
              score+=2;
		    }    
     } //for close

      System.out.println("Your score is: "+score);
      System.out.println("No. of rounds won: "+won);

	} //game() close

	public static void main(String[] args) {

		Number n = new Number();
		Scanner in = new Scanner(System.in);
		int round=0, play;
	do{
		n.game();
		round++;
		System.out.println("want to play another round?\n1.Yes\n2.No ");
		play = in.nextInt();
      }while(play!=2);

      System.out.println("No. of rounds played: "+round);
	
}
}