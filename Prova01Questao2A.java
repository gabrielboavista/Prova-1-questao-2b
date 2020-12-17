package prova01questao2a;
public class Prova01Questao2A {
    public static void main(String[] args) {
        ProdutosVendidos p1 = new ProdutosVendidos ("TVPhilips", 1350f, "Philips", "50PUG6513");
        ProdutosVendidos p2 = new ProdutosVendidos ("TVAoc", 750f, "AOC", "LE32S5970S");
        p1.status();
        p2.status();
        
        Estoque pp1 = new Estoque ("TVPhilips", 1350f, "Philips", "50PUG6513");
        Estoque pp2 = new Estoque ("TVAoc", 750f, "AOC", "LE32S5970S");
        pp1.status();
        pp2.status();
    }
    
}
