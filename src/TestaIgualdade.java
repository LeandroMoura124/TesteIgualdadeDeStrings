public class TestaIgualdade {
    // public static void main (String[] args){
    //     // String nome1 = new String("Leandro");
    //     // String nome2 = new String("Leandro"); //armazenou em outra pool
    //     // String nome1 = "Leandro";
    //     // String nome2 = "Leandro";
    //     // String nome3 = new String("Leandro");
    //     String ab = "a" + "b";
    //     System.out.println(ab == "ab"); //retorna true, pois concatenei o valor da var String literalmente, no meu out.print mandei
    //     //comparar o a var e o valor dela - está apontando para msm referencia

    //     String c = "c";
    //     String cd = c + "d";
    //     System.out.println(cd == "cd"); //retorna false, sao objetos diferentes e nao é colocado no pool quando eu concateno uma referencia
    //     // estao em pool diferentes, por isso nao enxerga o conteudo


    //     String texto = "um texto qualquer";
    //     String txt = texto.substring(3, 8); //"Texto"
    //     System.out.println(txt == "texto"); //retorna false - nao está colocando objeto na msm poo, está criando um novo
        
    //     System.out.println(texto.toLowerCase() == texto);//retorna true, só está chamando um novo metodo e pegando a msm poo com a mesma string armazenada na vairavel
    //     System.out.println(txt.toLowerCase().equals("texto")); //retorna true, está avaliando o mesmo conteudo
    //     /*Em suma, se o metodo que for invocado alterar o nome da String, cria-se um novo objeto */



    //     /*Contando as Strings - quantos objetos foram criados */
    //     String h = new String("hello "); //Criado 2 objetos (New e o valor literal("Hello")) - apenas o valor "Hello" foi parar no poo
    //     // A string criada com new, ela nao para no poo de string
    //     String h1 = "hello "; // nenhum objeto é criado, já existe o valor no poo - apenas faz a referencia pro objeto que ja existe dentro do poo de strings
    //     String w = "word"; // 1 novo objeto é criado no poo de strings
        
    //     System.out.println(h); //0
    //     System.out.println(h1 + "word"); //1 como concatena, novo objeto é criado no poo de strings
    //     System.out.println("Hello " == h1); //1 é criado, pois o H do hello é maiusculo, entao cria o novo objeto (nao criaria caso eu utilizasse o metodo lowerCase)



    //     //Cria 2 objetos, um literal (que vai para o pool) e o outro 
    //     //com o new
    //     String h = new String ("hello ");

    //     //nenhum objeto criado, usa o mesmo do pool
    //     String h1 = "hello ";
    //     //novo objeto criado e inserido no pool
    //     String w = "world"; 

    //     //nenhum  objeto criado, usa do pool
    //     System.out.println("hello ");

    //     //criado um novo objeto resultante da concatenação,
    //     // mas este não vai para o pool
    //     System.out.println(h1 + "world");

    //     //Novo objeto criado e colocado no pool (Hello com H maiúsculo).
    //     System.out.println("Hello " == h1);     // 1COPIAR 
    // }
}
