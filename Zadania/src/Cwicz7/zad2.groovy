package Cwicz7

import groovy.json.JsonSlurper

def url = 'https://api.ratesapi.io/api/latest'

def apiResult = (new JsonSlurper()).parse(
        new InputStreamReader(
                (new URL(url)).newInputStream()
        )
)
double PLNrate = apiResult.rates.PLN

def menuPLNFile = new File("MenuPl.txt")
def menuEURFile = new File("MenuEur.txt")

menuEURFile.delete()

menuPLNFile.eachLine {line ->
    def priceInPLN = line.find("\\d+\\.\\d+")
    def priceInEUR = (priceInPLN as BigDecimal) / PLNrate
    menuEURFile << line.replace(line.find("\\d+\\.\\d+"), priceInEUR as String).replace("PLN", "EUR") + "\n"
}