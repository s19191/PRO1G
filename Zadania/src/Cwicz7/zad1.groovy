package Cwicz7

def membersProjects = [:]
def bigProjects = []
def projektyDuzeFile = new File('ProjektyDuze.txt')
projektyDuzeFile.delete()
def programisciFile = new File('Programisci.txt')
programisciFile.delete()
def projektyFile = new File('Projekty.txt')
projektyFile.eachLine { line ->
    def array = line.tokenize('\t')
    def projectName = array[0]
    def team = array[1..array.size() - 1]
    team.each { member ->
        if (member in membersProjects)
            membersProjects[member] << projectName
        else {
            membersProjects[member] = [projectName]
        }
    }
    if (team.size() > 3) bigProjects << projectName
}

projektyDuzeFile << "Projekty w których pracuje więcej niż 3 osoby: "
bigProjects.each {projektyDuzeFile << "$it, "}

membersProjects.each { key, value ->
    programisciFile << "$key\t"
    value.each { programisciFile << "$it\t" }
    programisciFile << "\n"
}