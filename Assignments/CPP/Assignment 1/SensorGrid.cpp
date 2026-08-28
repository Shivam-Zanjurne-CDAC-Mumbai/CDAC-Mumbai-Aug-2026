//============================================================================
// Name        : SensorGrid.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Problem 3 — Building Sensor Grid in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	double grid[3][3];
	cout<<"Enter Grid Values: "<<endl;
	//24.0 31.5 28.0 45.0 22.0 30.0 19.0 27.5 50.2

	for(int r = 0; r < 3; r++){
		for(int c = 0; c < 3; c++){
			cin>>grid[r][c];
		}
	}

	double max_room_temp = INT_MIN;
	int max_floor = -1;
	int max_room = -1;
	double max_average = -1.0;
	int max_average_floor = -1;
	int warning_cnt = 0;

	for(int i = 0; i < 3; i++){
		double curr_sum = 0;
		for(int j = 0; j < 3; j++){
			double curr_temp = grid[i][j];
			if(curr_temp >= 30) warning_cnt++;
			curr_sum += curr_temp;
			if(curr_temp > max_room_temp){
				max_room_temp = curr_temp;
				max_floor = i;
				max_room = j;
			}
		}
		double curr_average_temp = (curr_sum/3);
		if(curr_average_temp > max_average){
			max_average = curr_average_temp;
			max_average_floor = i;
		}
	}
	cout<<endl;
	cout<<endl;
	for(int i = 0; i < 3; i++){
		cout<<"Floor "<<i+1<<" ";
		for(int j = 0; j < 3; j++){
			cout<<grid[i][j]<<" ";
		}
		cout<<endl;
	}

	cout<<"Hottest Room: "<<"Floor "<<max_floor+1<<" "<<"Room "<<max_room+1<<" "<<max_room_temp<<"C"<<endl;
	cout<<"Hottest Floor: "<<"Floor "<<max_average_floor+1<<" "<<"Average: "<<max_average<<"C"<<endl;
	cout<<"Rooms at WARNING ro above: "<<warning_cnt<<endl;


	return 0;
}
