# Atividade 06

Sim, com certeza. Segue o texto revisado e formatado para melhorar a clareza e a organização. As informações foram agrupadas de forma mais lógica e a linguagem foi ajustada para um tom mais direto e profissional.

Sistema de Gerenciamento de Quartos de Hotel

Elabore um sistema simples para gerenciar quartos de hotel, seguindo os requisitos abaixo:

1. Superclasse: Classe Quarto

    Crie uma classe chamada Quarto com os seguintes atributos:

        numero (int)

        capacidade (int)

        precoBase (double)

        ocupado (boolean, privado)

    Inclua os seguintes métodos:

        checkIn(): para ocupar o quarto.

        checkOut(): para desocupar o quarto.

        calcularDiaria(): retorna o valor da diária, podendo ser sobrescrito pelas subclasses.

        toString(): exibe as informações completas do quarto.

2. Subclasses

Cada subclasse deve herdar da classe Quarto e implementar a sua própria lógica para o cálculo da diária.

    QuartoStandard: A diária é igual ao precoBase.

    QuartoEconomico: A diária tem um desconto fixo de R$ 30,00.

    Suite: A diária tem um acréscimo de R$ 80,00. Se o quarto tiver hidromassagem, adicione mais R$ 40,00.

    SuitePresidencial: Uma classe final (não pode ser herdada), com acréscimo de R$ 200,00 na diária.

3. Sobrescrita e uso de super

    Todas as subclasses devem sobrescrever o método calcularDiaria().

    Utilize a palavra-chave super nos construtores e no método toString() das subclasses para reaproveitar o código da classe-mãe.

4. Programa Principal

    Crie um vetor de quartos (Quarto[]) contendo pelo menos 5 objetos de tipos diferentes.

    Simule algumas operações de check-in e check-out.

    Percorra o vetor, exibindo as informações de cada quarto e o valor da diária calculada.

    Use o operador instanceof para contar a quantidade de quartos de cada tipo.

    Calcule o faturamento estimado, somando as diárias dos quartos que estão ocupados.