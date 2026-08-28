//============================================================================
// Name        : CalibrationPacketParser.cpp
// Author      : Shivam Zanjurne
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

// If size <= 0 : return false, leave output pointers unchanged
// Otherwise : set *outMin to point at the minimum element in rawData
// set *outMax to point at the maximum element in rawData
// return true
bool parsePacket(const int* rawData, int size,
 int** outMin, int** outMax){
//	cout<<outMin<<endl;
//	cout<<outMax<<endl;
	int mx = INT_MIN;
	int mn = INT_MAX;
	int mn_idx = -1;
	int mx_idx = -1;

	for(int i = 0; i < size; i++){
		int curr_val = rawData[i];
		if(curr_val > mx){
			mx_idx = i;
			mx = curr_val;
		}

		if(curr_val < mn){
			mn_idx = i;
			mn = curr_val;
		}

	}
	const int* t1 = &rawData[mn_idx];
	const int* t2 = &rawData[mx_idx];

	//const cast used to typecast the const int* pointer to int* because in parameter we have const int* rawdata
	*outMin = const_cast<int*>(t1);
	*outMax = const_cast<int*>(t2);

	return true;
}


int main() {
	int packet[] = {45, 12, 67, 8, 55, 31};
	int* minPtr = nullptr;
	int* maxPtr = nullptr;
//	cout<<&minPtr<<endl;
//	cout<<&maxPtr<<endl;
	if (parsePacket(packet, 6, &minPtr, &maxPtr)) {
	 cout << "Calibration Min : " << *minPtr << endl;
	 cout << "Calibration Max : " << *maxPtr << endl;
	}

	return 0;
}
