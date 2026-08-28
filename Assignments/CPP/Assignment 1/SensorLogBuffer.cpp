//============================================================================
// Name        : SensorLogBuffer.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Problem 2 — Sensor Log Buffer in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void getStatusCount(double temperature, int& normal_cnt, int& warning_cnt, int& critical_cnt, int& shutdown_cnt){
	if(temperature < 0){

		}
		else if(temperature >= 0 && temperature <= 29){
			normal_cnt++;
		}
		else if(temperature >= 30 && temperature <= 44){
			warning_cnt++;
		}
		else if(temperature >= 45 && temperature <= 59){
			critical_cnt++;
		}
		else{
			shutdown_cnt++;
		}
}


int main() {
	int N;
	cout<<"Enter the readings size: "<<endl;
	cin>>N;
	int sz = N;
	double arr[sz];
	int idx = 0;
	int error_count = 0;
	cout<<"Enter Readings: "<<endl;
	while(N--){
		double curr_val;
		cin>>curr_val;
		arr[idx] = curr_val;
		idx++;
	}


	double first_critical;
	int first_critical_idx;
	double min = INT_MAX;
	double max = INT_MIN;
	double sum = 0;

	for(int i = 0; i < sz; i++){
		double curr_val = arr[i];
		if(curr_val >= 45.0){
			first_critical = arr[i];
			first_critical_idx = i;
			break;
		}
	}
	int normal_cnt =0;
	int warning_cnt =0;
	int critical_cnt =0;
	int shutdown_cnt =0;

	cout<<endl;
	cout<<"Readings entered : "<<sz<<endl;
	cout<<"Valid readings: ";
	for(int i = 0; i < sz; i++){
		double curr_val = arr[i];
		if(curr_val < 0) {
			error_count++;
			continue;
		}
		cout<<curr_val<<" ";

		//category_count
		getStatusCount(curr_val, normal_cnt, warning_cnt, critical_cnt, shutdown_cnt);

		//min find
		if(curr_val < min){
			min = curr_val;
			}
		//max find
		if(curr_val > max){
			max = curr_val;
			}

		sum += curr_val;
	}
	cout<<endl;
	cout<<"Skipped (errors): "<<error_count<<endl;
	cout<<"First CRITICAL: "<<"Index "<<first_critical_idx<<" "<<first_critical<<"C"<<endl;
	cout<<"Min: "<<min<<" ";
	cout<<"Max: "<<max<<" ";
    cout<<"Average: "<<(double)(sum/(sz-error_count))<<" "<<endl;
    cout<<"Normal: "<<normal_cnt<<" ";
    cout<<"Warning: "<<warning_cnt<<" ";
    cout<<"Critical: "<<critical_cnt<<" ";
    cout<<"Shutdown: "<<shutdown_cnt<<" ";

	return 0;
}

