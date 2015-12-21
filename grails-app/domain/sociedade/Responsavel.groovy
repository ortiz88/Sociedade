package sociedade

class Responsavel {

    Date inicioPeriodo
    Date terminoPeriodo

    static constraints = {
    }

    static belongsTo = [
            usuario: Usuario, escola:Escola
    ]
}
