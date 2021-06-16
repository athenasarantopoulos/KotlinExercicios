package exercicioPedagio

fun main() {
	val carro = Carro("MGH1000", "Amarelo","Fiat", 4)
	carro.pagar(Pagamento.TipoPagamento.DEBITO)
	val moto = Moto("MGH1330", "Preto","CBR", 2)
	moto.pagar(Pagamento.TipoPagamento.DINHEIRO)
	val caminhao = Caminhao("TGH3500", "Cinza","VW", 12)
	caminhao.pagar(Pagamento.TipoPagamento.DEBITO)
}