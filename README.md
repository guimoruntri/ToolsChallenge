Inserir nova transação: localhost:8080/pagamento/

Buscar uma transação:   localhost:8080/pagamento/consulta/{id}

Buscar todas as transações : localhost:8080/pagamento/consulta/

Realizar/buscar estorno: localhost:8080/pagamento/estorno/{id}

Json para inserção:

{
    "transacao": {
        "id": "1",
        "numeroCartao": "12345678",
        "descricao": {
            "valor": "50.00",
            "dataHora": "30/09/2017 13:32",
            "estabelecimeto": 123
        },
        "formaPagamento": {
            "formaPagamento": "AVISTA",
            "parcelas": 1
        }
    }
}