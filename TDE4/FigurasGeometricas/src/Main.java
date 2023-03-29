public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;
        double resultado = quadrado.calcularArea();
        System.out.println(resultado);
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.raio = 5;
        double resultadoC = circunferencia.calcularArea();
        System.out.println(resultadoC);
        Trapezio trapezio = new Trapezio();
        trapezio.baseMenor = 2;
        trapezio.baseMaior = 5;
        trapezio.altura = 7;
        double resultadoT = trapezio.calcularArea();
        System.out.println(resultadoT);
        Triangulo triangulo = new Triangulo();
        triangulo.altura = 4;
        triangulo.base = 3;
        double resultadoTr = triangulo.calcularArea();
        System.out.println(resultadoTr);


    }
}