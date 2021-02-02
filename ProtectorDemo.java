//===Author(s):         Phiona 
//===Unit 11:           Final Project
//===Project Tittle:    Defender. 
//===Description:       A user defined package that will be called while; car is in stop mode
//						but another object comes towards it. Second, while it is moving and 
//						suddanely detects objects in certain range. 
//===Source:            https://beginnersbook.com/2013/03/packages-in-java/
//===Book:              http://www.engineeringinspiration.co.uk/brakecalcs.html
//===Date:              31st Jan 2021.

import CarProtector.Protector;

public class ProtectorDemo{
   public static void main(String args[]){
	Protector obj = new Protector();
	//Obstacle should not be bellow 200cm towards a car. 
	//obj.defender(150);
	// Car states can change
	obj.defender(200,60,500);
   }
}

//======================End=================================================
