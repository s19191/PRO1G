package Cwicz2

def txt = 'blakdlaskda 2019-03-12 asdasd 19/12/03 1997-13-12 1998-11-12adasdsd ' +
        '1998-01-32 1998-01-00 1998-01-31 1998-22-31'

txt.findAll(/(\d{4})-(\d{2})-(\d{2})/, { all, year, month, day ->
    def valid = false

    def monthMatcher = month ==~ '[0][1-9]|[1][0-2]'
    def dayMatcher = day ==~ '[0-2][1-9]|[3][0-1]'

    def month31 = month ==~ '01|03|05|07|08|10|12'

    if (month31 && (day.toInteger() <= 31))
        valid = true
    else if (!month31 && (day.toInteger() <= 30))
        valid = true

    if (monthMatcher && dayMatcher && valid)
        println "$all"
})