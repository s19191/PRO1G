package Cwicz5

String reverseWords(String s) {
    return s.tokenize().reverse()
}

println reverseWords("Ala ma kota")