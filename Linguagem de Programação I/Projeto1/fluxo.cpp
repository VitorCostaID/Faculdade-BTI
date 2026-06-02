#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int valor1 = 2, valor2 = 1;
    float resultado = 0;

    while (valor1 > valor2 || valor2 == 0){
        cout << "Entre com o primeiro valor: ";
        cin >> valor1;
        cout << "Entre com o segundo valor: ";
        cin >> valor2;
        if (valor1 > valor2){
            cout << "Erro! Entre com um primeiro valor menor ou igual ao segundo.\n";
        }
        if (valor2 == 0){
            cout << "Erro!, por favor digite um número diferente de 0 para o segundo valor.\n";
        }
    }

    resultado = ((float)valor1/valor2)*100;

    cout << fixed << setprecision(2);
    cout << resultado << "%";

    return 0;
}