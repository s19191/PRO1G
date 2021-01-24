package Cwicz6

import groovy.json.JsonSlurper

def text = 'Ala ma kota za -12.99 PLN Kot ma Ale za 0.0 PLN Kot kosztuje: 40.99 PLN'

def url = 'https://api.ratesapi.io/api/latest'
def apiResult = (new JsonSlurper()).parse(
        new InputStreamReader(
                (new URL(url)).newInputStream()
        )
)
def PLNrate = apiResult.rates.PLN as BigDecimal

def pricesInPLN = text.findAll("-?\\d+.?\\d+ PLN")

for (priceInPLN in pricesInPLN) text = text.replace(priceInPLN, ((priceInPLN.tokenize()[0] as BigDecimal) / PLNrate) + " EUR")

println text