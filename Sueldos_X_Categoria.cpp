#include<iostream>
using namespace std;
int main(){
	
	float Sueldo,New_Sueldo=0;
	int cat;
	
	cout<<"Ingrese su sueldo básico: ";
	cin>>Sueldo;
	cout<<"Ingrese su categoria: ";
	cin>>cat;
	
	switch(cat){
		case 1:
			New_Sueldo = Sueldo + (Sueldo * 0.15);
		break;
		case 2:
			New_Sueldo = Sueldo + (Sueldo * 0.10);
		break;
		case 3:
			New_Sueldo = Sueldo + (Sueldo * 0.08);
		break;
		case 4:
			New_Sueldo = Sueldo + (Sueldo * 0.07);
		break;
		default:
			cout<<"Por favor, ingrese una categoria valida "<<endl;
		break;
	}	
	
	cout<<"Su categoria es: "<<cat<<endl;
	cout<<"Su sueldo anterior es: "<<Sueldo<<"$"<<endl;
	cout<<"Su nuevo sueldo es: "<<New_Sueldo<<"$"<<endl;

	return 0;	
}
