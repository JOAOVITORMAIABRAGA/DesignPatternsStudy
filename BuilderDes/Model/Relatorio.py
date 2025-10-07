from dataclasses import dataclass, field
from typing import List, Optional

@dataclass(frozen=True)
class Relatorio:
    cabeçalho: str
    sumario: Optional[str] = None
    tabelas: List[dict] = field(default_factory=list)
    grafico: List[str] = field(default_factory=list)
    rodape: Optional[str] = None

    def mostrarDados(self):
        return self.cabeçalho, self.sumario, self.tabelas, self.grafico, self.rodape