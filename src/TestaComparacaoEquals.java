class Cliente{
    String nome;

    //constructor
    public Cliente(String nome){
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public String getNome() {
        return nome;
    }


    //manipulando nosso equals
    @Override
    public boolean equals(Object o){  // a assinatura precisa ser obrigatoriamente Objetct, pois se eu colocar (Cliente o), eu estarei sobrecarregando, e nao sobrescrevendo
        Cliente outro = (Cliente) o;

        return this.nome.equals(outro.nome);
    }
}


public class TestaComparacaoEquals {
        public static void main(String[] args){

            // == teste se duas variaveis estao apontando para o mesmo objeto
            Cliente c1 = new Cliente("Leandro");
            Cliente c2 = new Cliente("Silva");
            Cliente c3 = new Cliente("Leandro");

            System.out.println(c1 == c2); //false, nao é o mesmo cliente
            System.out.println(c1 == c1); // true, é o mesmo cliente
            System.out.println(c1==c3); // false, nao está para a mesma referencia, sao objetos diferentes embora tenham o mesmo conteudo na poo
            // false, pois não é a mesma 
            // referência: são objetos diferentes na memória
            System.out.println(c1.equals(c3));   //OBS: Agora true, pois manipulamos o metodo de igualdade equals na classe Cliente
            // false, pois não é a mesma 
            // referência: são objetos diferentes na memória
          

        }
}
