//============================================================================
// Name        : SensorBug.cpp
// Author      : Shivam Zanjurne
// Version     :
// Copyright   : Your copyright notice
// Description : Problem 1 — The Bug in Sensor Recalibration in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2){
	int temp = reading1;
	reading1 = reading2;
	reading2 = temp;

}

void resetSensorPairV2(int& reading1, int& reading2){
	int temp = reading1;
	reading1 = reading2;
	reading2 = temp;

}

void resetSensorPairV3(int* reading1, int* reading2){
	int temp = *reading1;
	*reading1 = *reading2;
	*reading2 = temp;

}
int main() {
	int A = 55;
	int B = 12;

	//V1 fails because when we send the value of a variable to a function, without giving it's memory address like we do in
	//call by pointer or by giving it a alias or reference, it creates it's own local copy in the function
	//it swaps the local copies of the variables in the function v1 and after it executes and we return to main function, the actual
	//values of them are not changed, because we never touched the original variables we just send a copy, we just a value

	cout<<"--- V1: Call by Value ---"<<endl;
	cout<<"Before : "<<"A="<<A<<" "<<"B="<<B<<endl;
	resetSensorPairV1(A,B);
	cout<<"After : "<<"A="<<A<<" "<<"B="<<B<<endl;

	cout<<endl;
	cout<<endl;
	cout<<"--- V1: Call by Reference ---"<<endl;
	cout<<"Before : "<<"A="<<A<<" "<<"B="<<B<<endl;
	resetSensorPairV2(A,B);
	cout<<"After : "<<"A="<<A<<" "<<"B="<<B<<endl;
	cout<<endl;
	cout<<endl;
	cout<<"--- V1: Call by Pointer ---"<<endl;
	cout<<"Before : "<<"A="<<A<<" "<<"B="<<B<<endl;
	resetSensorPairV3(&A,&B);
	cout<<"After : "<<"A="<<A<<" "<<"B="<<B<<endl;



	return 0;
}
