#include <iostream>
#include <fstream>
#include <sstream>
#include <map>

int main(int argc, char* argv[]) {
    if (argc < 2) {
        std::cerr << "Uso: " << argv[0] << " <arquivo.txt>\n";
        return 1;
    }

    std::ifstream arquivo(argv[1]);
    if (!arquivo) {
        std::cerr << "Erro ao abrir o arquivo: " << argv[1] << "\n";
        return 1;
    }

    std::string linha;
    std::getline(arquivo, linha);  // Lê a linha inteira

    std::istringstream stream(linha);
    std::string palavra;

    std::map<std::string, int> frequencia;

    while (stream >> palavra) {
        frequencia[palavra]++;
    }

    for (const auto& par : frequencia) {
        std::cout << par.first << ": " << par.second << "\n";
    }

    return 0;
}