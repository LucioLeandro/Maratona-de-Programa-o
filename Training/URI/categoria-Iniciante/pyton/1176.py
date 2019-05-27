# -*- coding: utf-8 -*-

vetor = [0, 1]


def get_fibonacci(sequencia):
    position = sequencia

    if position == 0 or position == 1:
        print vetor[position]
        return
    
    if sequencia < len(vetor):
        print vetor[sequencia - 1]
        return
    
    

def main():
    qtd_casos = input()
    
    count = 1

    while(count <= int(qtd_casos)):
        sequencia = input()
        get_fibonacci(sequencia)
        count += 1

main()