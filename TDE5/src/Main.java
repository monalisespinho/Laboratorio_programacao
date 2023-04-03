public class Main {
    public static void main(String[] args) {
        //Exercicio 1
        Carro meuCarro = new Carro();
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Mustang";
        meuCarro.ano = 2012;
        meuCarro.cor =  "azul";
        meuCarro.acelerar();
        meuCarro.frear();

        //Exercicio 2
        Calculadora calculadora = new Calculadora();
        calculadora.numberOne= 10;
        calculadora.numberTwo= 2;
        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());

        //Exercicio 3
        Retangulo retangulo = new Retangulo();
        retangulo.base= 4;
        retangulo.altura= 5;
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());

        //Exercicio 4
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.numeroDaConta = 12345;
        minhaConta.saldo = 1000.0;
        minhaConta.titular = "João";

        ContaBancaria outraConta = new ContaBancaria();
        outraConta.numeroDaConta = 67890;
        outraConta.saldo = 500.0;
        outraConta.titular = "Maria";
    }

}