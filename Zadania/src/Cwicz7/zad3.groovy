package Cwicz7

def dir = new File(System.getProperty("user.home") + "/Desktop")

int counter = 1;
dir.eachFileRecurse {
    if (it.name.endsWith(".html")) println counter++ + " " + it
}