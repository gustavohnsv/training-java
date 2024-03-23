package ComplexNumbers;

public final class OrdinaryComplex implements Complex {

    private final double real;
    private final double imaginaria;

    public OrdinaryComplex(double real, double imaginaria) { // CONSTRUTOR
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double parteReal() { return real; }
    public double parteImaginaria() { return imaginaria; }

    private double realNovo (Complex b) {
        return real * b.parteReal() - imaginaria * b.parteImaginaria();
    }

    private double imagNovo (Complex b) {
        return imaginaria * b.parteReal() - real * b.parteImaginaria();
    }
    
    public Complex sum(Complex b) {
        return new OrdinaryComplex(real + b.parteReal(), imaginaria + b.parteImaginaria());
    }

    public Complex sub(Complex b) {
        return new OrdinaryComplex(real - b.parteReal(), imaginaria - b.parteImaginaria());
    }

    public Complex mult(Complex b) {
        return new OrdinaryComplex(realNovo(b), imagNovo(b));
    }

    public Complex div(Complex b) {
        double divisor = b.parteReal() * b.parteReal() + b.parteImaginaria() * b.parteImaginaria();
        double NRdiv = realNovo(b) / divisor; // significa "Novo real divido"
        double NIdiv = imagNovo(b) / divisor; // significa "Novo imaginário divido"
        return new OrdinaryComplex(NRdiv, NIdiv);
    }
    
}