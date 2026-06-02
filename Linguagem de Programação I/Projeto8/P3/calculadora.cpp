#include <iostream>
#include <sstream>
#include <stack>
#include <string>
#include <cstdlib>

int main(int argc, char* argv[]) {
    if (argc != 2) {
        std::cerr << "Uso: " << argv[0] << " \"<expressao RPN>\"\n";
        return 1;
    }

    std::stack<double> pilha;
    std::istringstream entrada(argv[1]);
    std::string token;

    while (entrada >> token) {
        if (token == "+" || token == "-" || token == "*" || token == "/") {
            if (pilha.size() < 2) {
                std::cerr << "Erro: operandos insuficientes para operador '" << token << "'.\n";
                return 1;
            }
            double b = pilha.top(); pilha.pop();
            double a = pilha.top(); pilha.pop();

            if (token == "+") pilha.push(a + b);
            else if (token == "-") pilha.push(a - b);
            else if (token == "*") pilha.push(a * b);
            else if (token == "/") {
                if (b == 0) {
                    std::cerr << "Erro: divisão por zero.\n";
                    return 1;
                }
                pilha.push(a / b);
            }
        } else {
            try {
                double numero = std::stod(token);
                pilha.push(numero);
            } catch (...) {
                std::cerr << "Erro: token inválido '" << token << "'.\n";
                return 1;
            }
        }
    }

    if (pilha.size() != 1) {
        std::cerr << "Erro: expressão mal formada.\n";
        return 1;
    }

    std::cout << "Resultado: " << pilha.top() << "\n";
    return 0;
}