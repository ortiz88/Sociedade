package sociedade

class Pontuacao {

    Integer posicao
    Integer valor

    static constraints = {
    }


    static belongsTo = [
            carnaval: Carnaval,
            escola: Escola
    ]
}
