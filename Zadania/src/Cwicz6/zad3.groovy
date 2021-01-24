package Cwicz6

import java.time.LocalDate
import java.time.format.DateTimeParseException

def txt = '2010-09-01 Ala ma kota 1999-01-01 Kot ma Ale 2021-02-29'

def dates = txt.findAll(/(\d{4})-(\d{2})-(\d{2})/)

def validatedDates = []
def incorrectDates = []
dates.each { date ->
    try {
        LocalDate.parse(date)
        validatedDates << date
    } catch(DateTimeParseException e) {
        incorrectDates << "Data: $date jest nieprawidłowa"
    }
}
println validatedDates

println incorrectDates