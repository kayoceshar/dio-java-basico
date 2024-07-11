public class MinhaClasse {
  public static void main(String[] args) {
    String meuNome = "Kayou";
    int anoDeNascimento = 1989;
    boolean verdade = true;
    String primeiroNome = "Primeiro";
    String segundoNome = "Segundo";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto
    );


  }

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
  }

     

  
}
