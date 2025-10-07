from Model.Relatorio import Relatorio

class RelatorioBuilder:
    def __init__(self, cabeçalho):
        self._cabeçalho = cabeçalho
        self._sumario = None
        self._tabelas = []
        self._graficos = []
        self._rodape = None

    @classmethod
    def com_cabecalho(cls, cabecalho: str):
        return cls(cabecalho)

    def comSumario(self, sumario: str):
        self._sumario = sumario
        return self
    
    def comTabelas(self, tabela: dict):
        self._tabelas.append(tabela)
        return self
    
    def comGraficos(self, grafico: str):
        self._graficos.append(grafico)
        return self
    
    def comRodape(self, rodape: str):
        self._roadape = rodape
        return self
    
    def construir(self) -> Relatorio:
        return Relatorio(
            cabeçalho=self._cabeçalho,
            sumario=self._sumario,
            tabelas=self._tabelas,
            grafico=self._graficos,
            rodape=self._rodape
        )