package exercicioPedagio

class Caminhao(override var placa: String, override var cor: String, override var modelo: String, override var numeroEixos: Int ) :Veiculo(placa,cor, modelo, numeroEixos), Pagamento {
	override fun pagar(forma: Pagamento.TipoPagamento){
		var totalPagar = 8.5 * numeroEixos
		println("Pagamento recibo Caminhão via $forma no valor R$ $totalPagar")

	}
}