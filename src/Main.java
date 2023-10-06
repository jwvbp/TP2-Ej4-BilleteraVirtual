import ar.edu.unlu.billeteraVirtual.Usuario;
import ar.edu.unlu.cuentas.Cuenta;
import ar.edu.unlu.cuentas.CuentaCredito;

public class Main {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1000.00, 500.00);
		Usuario usuario1 = new Usuario(cuenta);
		Cuenta cuenta2 = new Cuenta(1000.00, 500.00);
		CuentaCredito cuentaCredito2 = new CuentaCredito(1000.00);
		Usuario usuario2 = new Usuario(cuenta2, cuentaCredito2);

		System.out.println("------------>Usuario1");
		usuario1.mostrarEstado();
		System.out.println("---------------------->gastar 200");
		usuario1.realizarGasto(200);
		usuario1.mostrarEstado();
		System.out.println("---------------------->invertir 300");
		usuario1.invertir(300, "10-07-2023");
		usuario1.mostrarEstado();
		System.out.println("---------------------->gastar 1000");
		usuario1.realizarGasto(1000);
		usuario1.mostrarEstado();
		System.out.println("---------------------->depositar 600");
		usuario1.depositar(600);
		usuario1.mostrarEstado();
		System.out.println("---------------------->recup inv menos de 30 dias");
		usuario1.recuperarInversion("09-08-2023");
		usuario1.mostrarEstado();
		System.out.println("---------------------->recup mas de 30 dias");
		usuario1.recuperarInversion("11-08-2023");
		usuario1.mostrarEstado();
		System.out.println("------------>Usuario2");
		usuario2.mostrarEstado();
		System.out.println("------------>comprar a credito 200");
		usuario2.comprar(200);
		usuario2.mostrarEstado();
		System.out.println("------------>comprar a credito 700");
		usuario2.comprar(700);
		usuario2.mostrarEstado();
		System.out.println("------------>comprar a credito 200");
		usuario2.comprar(200);
		usuario2.mostrarEstado();

		System.out.println(usuario2.getSaldoDeudorCompra(0) + "-------->deuda de compra [0]");
		System.out.println(usuario2.getSaldoDeudorCompra(1) + "-------->deuda de compra [1]");
		System.out.println(usuario2.getSaldoDeudor() + "-------->deuda de todas las compras");

		System.out.println("------------>pagar 200 a compra[1]");
		usuario2.pagar(200, 1);
		usuario2.mostrarEstado();

		System.out.println(usuario2.getSaldoDeudorCompra(0) + "-------->deuda de compra [0]");
		System.out.println(usuario2.getSaldoDeudorCompra(1) + "-------->deuda de compra [1]");
		System.out.println(usuario2.getSaldoDeudor() + "-------->deuda de todas las compras");
	}
}
