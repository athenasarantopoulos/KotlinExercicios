package exercicioPedagio

class Moto(override var placa: String, override var cor: String, override var modelo: String, override var numeroEixos: Int ) :Veiculo(placa,cor, modelo, numeroEixos) , Pagamento {
	override fun pagar(forma: Pagamento.TipoPagamento) {
		var totalPagar = 5
			println("Pagamento recibo Moto via $forma no valor R$ $totalPagar")

	}
}
