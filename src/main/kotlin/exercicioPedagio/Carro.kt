package exercicioPedagio

class Carro(override var placa: String, override var cor: String, override var modelo: String, override var numeroEixos: Int ) :Veiculo(placa,cor, modelo, numeroEixos) , Pagamento {
	override fun pagar(forma: Pagamento.TipoPagamento) {
		var totalPagar = 8.5
		println("Pagamento recibo carro via $forma no valor R$ $totalPagar")
	}
}