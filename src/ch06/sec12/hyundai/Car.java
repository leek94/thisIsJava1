package ch06.sec12.hyundai;


import ch06.sec12.hankook.*;
import ch06.sec12.kumho.*;

public class Car {

	//Field 선언
	SnowTire tire1 = new SnowTire();
	ch06.sec12.hankook.Tire tire2 = new ch06.sec12.hankook.Tire(); 
	// hankook, kumho 둘다 tire를 가지고 있기 때문에 전체이름을 선언해서 알려줘야함
	
	AllSeasonTire tire3 = new AllSeasonTire(); // 하나 뿐이여서 상관없음
	//Construct 선언
	
	//Method 선언
}
