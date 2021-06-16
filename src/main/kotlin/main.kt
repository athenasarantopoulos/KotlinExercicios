fun main() {
	for (mes in Mes.values()) {
		if (mes.feriado) {
			println("O ${mes.nome} possui ${mes.quantidadeFeriados} feriados")
		} else {
			println("O ${mes.nome} não possui feriado")
		}
	}
}

enum class Mes(val nome: String, val feriado: Boolean, val quantidadeFeriados: Int) {
	JANEIRO("Janeiro", true, 1),
	FEVEREIRO("Fevereiro", true, 2),
	MARCO("Março", false, 0),
	ABRIL("Abril", true, 2),
	MAIO("Maio", true, 1),
	JUNHO("Junho", false, 0),
	JULHO("Julho", false, 0),
	AGOSTO("Agosto", false, 0),
	SETEMBRO("Setembro", true, 1),
	OUTUBRO("Outubro", true, 1),
	NOVEMBRO("Novembro", true, 1),
	DEZEMBRO("Dezembro", true, 1)
}
