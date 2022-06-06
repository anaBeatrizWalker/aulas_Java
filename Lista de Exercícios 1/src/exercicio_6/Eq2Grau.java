package exercicio_6;

public class Eq2Grau {
	double a; 
	double b; 
	double c;
	
	Eq2Grau(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	double delta() {
		return (b*b - 4*a*c);
	}
	
	double raiz1() {
		return (( -b + (Math.sqrt (delta()))) / ( 2*a ));
	}
	
	double raiz2() {
		return (( -b - (Math.sqrt (delta()))) / ( 2*a ));	
	}
}
