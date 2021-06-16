package exercicioPedagio

interface Pagamento {
	 enum class TipoPagamento{
		DEBITO,DINHEIRO
	}

	fun pagar( forma:TipoPagamento)
}