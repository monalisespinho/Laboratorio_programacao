public class Circulo {
    int raio;
    double pi = 3.14;

    double calcularArea(){
        double area = pi * (2*raio);
        return area;
    }
    double calcularPerimetro(){
        double perimetro = 2*pi*raio;
        return perimetro;
    }
}
