public class Figuras_Geometricas {
    
    public static class Círculo {
        int radio;
        
        Círculo(int radio) {
            this.radio = radio;
        }
        
        double calcularArea() {
            return Math.PI * Math.pow(radio, 2);
        }
        
        double calcularPerímetro() {
            return 2 * Math.PI * radio;
        }
    }

    public static class Rectángulo {
        int base;
        int altura;
        
        Rectángulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }
        
        double calcularArea() {
            return base * altura;
        }
        
        double calcularPerímetro() {
            return (2 * base) + (2 * altura);
        }
    }

    public static class Cuadrado {
        int lado;
        
        Cuadrado(int lado) {
            this.lado = lado;
        }
        
        double calcularArea() {
            return lado * lado;
        }
        
        double calcularPerímetro() {
            return (4 * lado);
        }
    }

    public static class TriánguloRectángulo {
        int base;
        int altura;
        
        TriánguloRectángulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }
        
        double calcularArea() {
            return (base * altura / 2);
        }
        
        double calcularPerímetro() {
            return (base + altura + calcularHipotenusa());
        }
        
        double calcularHipotenusa() {
            return Math.pow(base*base + altura*altura, 0.5);
        }
        
        void determinarTipoTriángulo() {
            if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
                System.out.println("Es un triangulo equilatero");
            else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
                System.out.println("Es un triangulo escaleno");
            else
                System.out.println("Es un triangulo isosceles");
        }
    }
    
    public static class Rombo {
        int diagonalMayor;
        int diagonalMenor;
        
        Rombo(int diagonalMayor, int diagonalMenor) {
            this.diagonalMayor = diagonalMayor;
            this.diagonalMenor = diagonalMenor;
        }
        
        double calcularArea() {
            return (diagonalMayor * diagonalMenor) / 2.0;
        }
        
        double calcularPerímetro() {
            double lado = Math.sqrt(
                Math.pow(diagonalMayor/2.0, 2) + 
                Math.pow(diagonalMenor/2.0, 2)
            );
            return 4 * lado;
        }
    }

    public static class Trapecio {
        int baseMayor;
        int baseMenor;
        int altura;
        int lado1;
        int lado2;
        
        Trapecio(int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
            this.baseMayor = baseMayor;
            this.baseMenor = baseMenor;
            this.altura = altura;
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
        
        double calcularArea() {
            return ((baseMayor + baseMenor) * altura) / 2.0;
        }
        
        double calcularPerímetro() {
            return baseMayor + baseMenor + lado1 + lado2;
        }
    }
}