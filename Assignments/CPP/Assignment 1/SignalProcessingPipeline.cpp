//============================================================================
// Name        : SignalProcessingPipeline.cpp
// Author      : Shivam Zanjurne
// Version     :
// Copyright   : Your copyright notice
// Description : Problem 2 — Signal Processing Pipeline in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cmath>
using namespace std;

// Returns sqrt( sum of (each element squared) / n )
double computeRMS(double* signal, int n){
	double* ptr = signal;
	double sumofsquared = 0;
	for(int i = 0; i < n; i++){
		sumofsquared += (*ptr) * (*ptr);
		ptr++;
	}
	cout<<"Sum of Squared: "<<sumofsquared<<endl;
	cout<<"Sum of Squared / n: "<<sumofsquared/n<<endl;
	double ret = sqrt(sumofsquared/n);

	return ret;
}
// Divides every element by the max absolute value in the array (in-place)
void normalise(double* signal, int n){
	double max = *signal;
	double* ptr = signal;
	for(int i = 0; i < n; i++){
		if(abs(*ptr) > max){
			max = abs(*ptr);
		}
		ptr++;
	}
	cout<<endl;
	cout<<"MAX: "<<max<<endl;
	ptr = signal;
	for(int i = 0; i < n; i++){
		*ptr /= max;
	}
}

// Returns count of positions where adjacent elements have opposite signs
int countZeroCrossings(double* signal, int n){
	int cnt = 0;
	double* ptr = signal;

	for(int i = 0; i < n-1; i++){
		double curr_val = *ptr;
		double next_val = *(ptr+1);
		if(curr_val * next_val < 0){
//			cout<<curr_val<<" "<<next_val<<endl;
			cnt++;
		}
		ptr++;
	}
	return cnt;
}

// Multiplies every element by gainFactor (in-place)
void applyGain(double* signal, int n, double gainFactor){
	double* ptr = signal;
	for(int i = 0; i < n; i++){
		*ptr *= gainFactor;
		ptr++;
	}
}


int main() {
	double arr[7] =  {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
	double ret1 = computeRMS(arr,7);
	cout<<endl;
	cout<<"ComputeRMS : "<<ret1<<endl;
	cout<<endl;
	cout<<"Before Normalizing"<<endl;
	for(double n : arr){
		cout<<n<<" ";
	}
	normalise(arr, 7);
	cout<<endl;
		cout<<"After Normalizing"<<endl;
		for(double n : arr){
			cout<<n<<" ";
		}
	cout<<endl;
	cout<<endl;
	cout<<"Count zero crossing"<<endl;
	int ret2 = countZeroCrossings(arr,7);
	cout<<"Zero Crossing OP: "<<ret2<<endl;
	cout<<endl;
	cout<<endl;
		cout<<"Before Gain"<<endl;
		for(double n : arr){
			cout<<n<<" ";
		}
		applyGain(arr, 7, 6.7);
		cout<<endl;
		cout<<endl;
		cout<<"After Gain"<<endl;
		for(double n : arr){
				cout<<n<<" ";
			}
	return 0;
}
