//============================================================================
// Name        : SensorReadingClassifier.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Problem 1 — Sensor Reading Classifier in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void change_temperature_farenheit(double temp_c, double &temp_f){
	temp_f = (temp_c * 9/5)+32;
}

void getStatus(double temperature, string& status_label, int& status_code){
	if(temperature < 0){
			status_code = -1;
			status_label = "SENSOR_ERROR";
		}
		else if(temperature >= 0 && temperature <= 29){
			status_code = 0;
			status_label = "NORMAL";
		}
		else if(temperature >= 30 && temperature <= 44){
			status_code = 1;
			status_label = "WARNING";
		}
		else if(temperature >= 45 && temperature <= 59){
			status_code = 2;
			status_label = "CRITICAL";
		}
		else{
			status_code = 3;
			status_label = "SHUTDOWN";
		}
}

void showConsole(double temp_c, double temp_f, string status_label, char* action_message){
	cout<<"Temperature : "<<temp_c<<" C"<<" "<<"/ "<<temp_f<<"F"<<endl;
	cout<<"Status : "<<status_label<<endl;
	cout<<"Action : "<<action_message<<endl;
	string reading = temp_c > 25 ? "Above Average":"Below Average";
	cout<<"Reading : "<<reading<<endl;
}

int main() {
	double temperature, temperature_f;
	string status_label, reading;
	int status_code;
	char* actionArr[]{"Sensor fault — check wiring", "No action required", "Alert sent to supervisor", "Cooling system triggered", "Emergency shutdown initiated"};

	cout<<"Enter your temperature: "<<endl;
	cin>>temperature;
	change_temperature_farenheit(temperature, temperature_f);
//	cout<<temperature<<endl;
//	cout<<temperature_f<<endl;
	getStatus(temperature,status_label, status_code);
//	cout<<status_label<<endl;
//	cout<<status_code<<endl;
	switch (status_code){
		case -1:
			showConsole(temperature,temperature_f,status_label,actionArr[status_code+1]);
			break;
		case 0:
			showConsole(temperature,temperature_f,status_label,actionArr[status_code+1]);
			break;
		case 1:
			showConsole(temperature,temperature_f,status_label,actionArr[status_code+1]);
			break;
		case 2:
			showConsole(temperature,temperature_f,status_label,actionArr[status_code+1]);
			break;
		case 3:
			showConsole(temperature,temperature_f,status_label,actionArr[status_code+1]);
			break;
		default:
			cout<<"Invalid Status Code"<<endl;
			break;
	}


	return 0;
}
