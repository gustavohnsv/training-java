package ComplexNumbers;

public interface Complex {

    double parteReal();
    double parteImaginaria();

    Complex sum(Complex aux);
    Complex sub(Complex aux);
    Complex mult(Complex aux);
    Complex div(Complex aux);

}
