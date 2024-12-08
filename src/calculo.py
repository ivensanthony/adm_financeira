def calcular_valor_futuro(vp, i, n):
    return vp * (1 + i) ** n

def calcular_valor_presente(vf, i, n):
    return vf / (1 + i) ** n

#calculo para joana
vf_joana_fulano = calcular_valor_futuro(1200, 0.09, 10)
print(f"Valor Futuro (Joana Fulano): ${vf_joana_fulano:.2f}")

vf_joana_ciclano = calcular_valor_futuro(2000, 0.10, 8)
print(f"Valor futuro (Joana Ciclano): ${vf_joana_ciclano:.2f}")



#calcular qual o mais rentável
rentabilidade_joana_fulano = vf_joana_fulano - 1200
rentabilidade_joana_ciclano = vf_joana_ciclano - 2000

# Comparação de rentabilidade para Joana
if rentabilidade_joana_fulano > rentabilidade_joana_ciclano:
    print("Joana Fulano tem a maior rentabilidade.")
else:
    print("Joana Ciclano tem a maior rentabilidade.")


#calculo para joao
vp_joao_fulano = calcular_valor_presente(12000, 0.10, 10)
print(f"Valor Presente (João fulano): ${vp_joao_fulano:.2f}")

vp_joao_ciclano = calcular_valor_presente(14000, 0.12, 12)
print(f"Valor Presente (João Ciclano): ${vp_joao_ciclano:.2f}")


#calcular qual o mais rentável

rentabilidade_joao_fulano = vp_joao_fulano - 2.840,83
rentabilidade_joao_ciclano = vp_joao_ciclano - 4.287,18

# Comparação de rentabilidade para Joao
if rentabilidade_joao_fulano > rentabilidade_joao_ciclano:
    print("Joao Fulano tem a maior rentabilidade.")
else:
    print("Joao Ciclano tem a maior rentabilidade.")


