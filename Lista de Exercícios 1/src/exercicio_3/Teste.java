package exercicio_3;

public class Teste {

	public static void main(String[] args) {
			
		Complexo a = new Complexo(2.0, 3.0, 3.0, 4.0);
		Complexo b = new Complexo(3.0, 6.0, 5.0, 10.0);
		
		a.soma(); //(2,0 + 3,0i) + (3,0 + 4,0i) = (5,0 + 7,0i)
		b.multiplica(); //(3,0 + 6,0i) * (5,0 + 10,0i) = (15,0 + 60,0i)
		
		Complexo2 c = new Complexo2();
		Complexo2 d = new Complexo2(7.8, -9.1);
		Complexo2 e = new Complexo2(4.5, 6.7);
		
		System.out.println(c); //(0.0 + 0.0i)
		System.out.println(d); //(7.8 + -9.1i)
		System.out.println(e); ////(4.5 + 6.7i)
		System.out.println(Complexo2.soma(d, e)); //(12.3 + -2.4i)
		System.out.println(Complexo2.multiplica(d, e));	//(35.1 + -60.97i)
	}
}