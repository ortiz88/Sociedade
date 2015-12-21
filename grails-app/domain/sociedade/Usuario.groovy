package sociedade

class Usuario {
    String nome
    String login
    String senha
    String cpf
    String email
    Date dataNascimento
    String municipio
    boolean casado

    static constraints = {
        nome nullable: false, maxSize:255
        login nullable: false, maxSize:45
        senha nullable: false, maxSize:45
        cpf nullable: false, maxSize:45
        email nullable: false, maxSize:200
        municipio nullable: false, maxSize:150
    }

    //static belongsTo = [
      //      responsavel: Responsavel, integrante: Integrante
    //]
}
