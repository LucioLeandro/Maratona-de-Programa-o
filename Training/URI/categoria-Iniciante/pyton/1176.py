# -*- coding: utf-8 -*-

vetor = [0, 1]


def get_fibonacci(sequencia):
    sequencia

    if sequencia == 0 or sequencia == 1:
        print "Fib(%d) = %d" % (sequencia, vetor[sequencia])
        return

    if sequencia < len(vetor):
        print "Fib(%d) = %d" % (sequencia, vetor[sequencia])
        return

    contador = len(vetor)

    while contador <= sequencia:
        vetor.append(vetor[contador - 1] + vetor[contador - 2])
        contador += 1

    print ("Fib(%d) = %d" % (sequencia, vetor[sequencia]))


def main():
    qtd_casos = input()

    count = 1

    while(count <= qtd_casos):
        sequencia = input()
        get_fibonacci(sequencia)
        count += 1

main()