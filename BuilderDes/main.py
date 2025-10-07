from Builder.RelatorioBuilder import RelatorioBuilder

Relatorio = (
    RelatorioBuilder.com_cabecalho("Relatorios de Auditoria")
    .comSumario("Resumo dos Principais pontos")
    .comTabelas({"dados": [1,2,3]})
    .comGraficos("Grafico1.png")
    .comRodape("Funfa por favor")
    .construir()
)

print(Relatorio.mostrarDados())