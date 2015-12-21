package sociedade

class Integrante {

    Float idAltura
    Float peso
    Integer sapato

    static constraints = {
    }

    static belongsTo = [
          usuario: Usuario,
            escola: Escola
    ]
}
