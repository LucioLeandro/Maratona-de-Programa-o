# -*- coding: utf-8 -*-

def calculaTempoNecessario(distancia):
    result = (int(distancia) / 30.0) * 60
    print "%d minutos" % result


def main():
    distancia = raw_input()
    calculaTempoNecessario(distancia)


main()