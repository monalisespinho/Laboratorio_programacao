public class Retangulo {
    int base;
    int altura;

    int calcularArea(){
        int area = base * altura;
        return area;
    }

    int calcularPerimetro(){
        int perimetro = base*2 + altura*2;
        return perimetro;
    }
}
