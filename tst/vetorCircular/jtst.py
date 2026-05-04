#!/usr/bin/env python3

import json
import subprocess

# comando do seu programa (ajuste aqui)
PROGRAMA = ["java", "Solucao"]

with open("tst.json", "r") as f:
    data = json.load(f)

tests = data["tests"]

for i, test in enumerate(tests, 1):
    entrada = test["input"]
    esperado = test["output"]

    # executa o programa passando o input
    resultado = subprocess.run(
        PROGRAMA,
        input=entrada,
        text=True,
        capture_output=True
    )

    saida = resultado.stdout

    if saida == esperado:
        print(f"Teste {i}: OK")
    else:
        print(f"Teste {i}: ERRO")
        print(f"Esperado: {repr(esperado)}")
        print(f"Recebido: {repr(saida)}")
