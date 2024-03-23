package ComplexNumbers;

public final class PolarComplex implements Complex {
    private final double raio;
    private final double theta;

    public PolarComplex(double raio, double theta) {
        this.raio = raio;
        this.theta = theta;
    }

    public double magnitude() { return raio; }
    public double fase() { return theta; }
    public double parteReal() { return raio * Math.cos(theta); }
    public double parteImaginaria() { return raio * Math.sin(theta); }

    public Complex sum(Complex b) {
        double real = this.parteReal() + b.parteReal();
        double imaginaria = this.parteImaginaria() + b.parteImaginaria();
        return new PolarComplex(Math.sqrt(Math.pow(real, 2) + Math.pow(imaginaria, 2)), Math.atan2(imaginaria, real));
    }

    public Complex sub(Complex b) {
        double real = this.parteReal() - b.parteReal();
        double imaginaria = this.parteImaginaria() - b.parteImaginaria();
        return new PolarComplex(Math.sqrt(Math.pow(real, 2) + Math.pow(imaginaria, 2)), Math.atan2(imaginaria, real));
    }

    public Complex mult(Complex b) {
        double NR = this.magnitude() * ((PolarComplex) b).magnitude(); // Para usar "b.magnitude(), o método "magnitude()" deveria estar contido na interface Complex, mas como não está, então deve-se adotar dessa forma.
        double NT = this.fase() + ((PolarComplex) b).fase(); // Para usar "b.fase(), o método "fase()" deveria estar contido na interface Complex, mas como não está, então deve-se adotar dessa forma.
        return new PolarComplex(NR, NT); // NR = Novo raio / NT = Novo theta
    }

    public Complex div(Complex b) {
        double NR = this.magnitude() / ((PolarComplex) b).magnitude(); // Para usar "b.magnitude(), o método "magnitude()" deveria estar contido na interface Complex, mas como não está, então deve-se adotar dessa forma.
        double NT = this.fase() - ((PolarComplex) b).fase(); // Para usar "b.fase(), o método "fase()" deveria estar contido na interface Complex, mas como não está, então deve-se adotar dessa forma.
        return new PolarComplex(NR, NT); // NR = Novo raio / NT = Novo theta
    }
}