public class Fracao {
    int numerador;
    int denominador;

    Fracao(int num, int den) {
        numerador = num;
        denominador = den;
    }

    Fracao multiplicar(Fracao outra) {
        int novoNumerador = numerador * outra.numerador;
        int novoDenominador = denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }
}