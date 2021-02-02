//===Author(s):         Phiona 
//===Unit 11:           Final Project
//===Project Tittle:    Defender. 
//===Description:       A user defined package that will be called while; car is in stop mode
//						but another object comes towards it. Second, while it is moving and 
//						suddanely detects objects in certain range. 
//===Source:            https://beginnersbook.com/2013/03/packages-in-java/
//===Book:              http://www.engineeringinspiration.co.uk/brakecalcs.html
//===Date:              31st Jan 2021.

package CarProtector;
import java.util.Scanner;

public class Protector {

	//If car is not moving but detects object in A metres. 
   public int defender(int a){
	   	Scanner in = new Scanner(System.in);
		int d = in.nextInt();
	   if (d<=a){// object is in 10 Meters
		   //DigitalWrite(1,HIGH);
		   System.out.println("Turn on Protective actuators");
		   //DigitalWrite(2,HIGH);
		   System.out.println("Turn on warning actuators");		   		   
	   }
	   else{
		   
		   System.out.println("stay in the normal state");
	   } 	   
	return 0;
   }
   
   // If car is moving with speed S and detects object at distance D
   // Potential Energy of the car PE. 
   public int defender(int s, int d, int PE){
	   //Speed should not equal to 0km/h and distance < 100m 
	   if(s!=0 && d<200){
		   int brake= (PE*s/d);		   
		   // Turn all the LEDs on and off for accident warning
		   for (int Pin = 9; Pin < 14; Pin++) {

			   System.out.println("Turn on emergence lights");
			   //digitalWrite(Pin, HIGH);
			   //delay(100);
			   //digitalWrite(Pin, LOW);
			   //delay(200);
			}
			//digitalWrite(4, HIGH);
			System.out.println("Increase brake presure to "+brake+" Pascal");
		}
	return 0;
   }
}

//=================End===================================================
