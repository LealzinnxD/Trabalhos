public class App {
    public static void main(String[] args) {
        Pessoa enzo =new Pessoa();
        Pessoa vinicius13 = new Pessoa();
        Carro carro = new Carro();


        System.out.println(enzo.nome + "...." + enzo.genero + "...." + enzo.idade);
        System.out.println(vinicius13.nome+"....."+vinicius13.genero+"....."+vinicius13.idade);
        System.out.println(carro.nome + "...." + carro.marca+ "....." + carro.combustivel+ "....." + carro.ano+ "....."+carro.km);
    }
}
