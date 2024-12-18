public class main_Figuras_Geometricas {

    public static void main(String args[]) {
        Figuras_Geometricas.Círculo figura1 = new Figuras_Geometricas.Círculo(2);
        Figuras_Geometricas.Rectángulo figura2 = new Figuras_Geometricas.Rectángulo(1,2);
        Figuras_Geometricas.Cuadrado figura3 = new Figuras_Geometricas.Cuadrado(3);
        Figuras_Geometricas.TriánguloRectángulo figura4 = new Figuras_Geometricas.TriánguloRectángulo(3,5);
        Figuras_Geometricas.Rombo figura5 = new Figuras_Geometricas.Rombo(6, 4);
        Figuras_Geometricas.Trapecio figura6 = new Figuras_Geometricas.Trapecio(10, 6, 4, 5, 5);
        
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerímetro());
        System.out.println();
        
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerímetro());
        System.out.println();
        
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        
        System.out.println("El area del rombo es = " + figura5.calcularArea());
        System.out.println("El perimetro del rombo es = " + figura5.calcularPerímetro());
        System.out.println();
        
        System.out.println("El area del trapecio es = " + figura6.calcularArea());
        System.out.println("El perietro del trapecio es = " + figura6.calcularPerímetro());
        System.out.println();
        
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
        
        
    }
}