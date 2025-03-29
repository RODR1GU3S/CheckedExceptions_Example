# 📄 Exceções Verificadas (Checked Exceptions) em Java

## ✅ O que são Checked Exceptions?

As **Checked Exceptions** (ou **Exceções Verificadas**) são exceções que o **compilador do Java obriga você a tratar ou propagar**.

Quando um método pode gerar uma exceção verificada, você precisa obrigatoriamente:

- **Tratar** usando um bloco `try/catch`, ou
- **Propagar** usando a palavra-chave `throws` na assinatura do método.

Se você **não tratar ou propagar**, o código **não compila**.

---

## 🚀 Exemplos de Checked Exceptions

Algumas exceções comuns que são verificadas:

- `IOException`
- `SQLException`
- `FileNotFoundException`

Essas exceções são **filhas diretas da classe `java.lang.Exception`**, mas **não são filhas de `RuntimeException`**.

---

## 💡 Exemplo Prático

Abaixo temos um exemplo simples que tenta abrir um arquivo chamado `arquivo.txt`. Caso aconteça algum problema ao abrir o arquivo (como ele não existir), o programa irá capturar e tratar a exceção:

```java
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExemploChecked {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("arquivo.txt"));
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
}
```

Se você **remover o bloco `try/catch`** ou não adicionar um **`throws IOException`** na assinatura do método `main`, o código **não irá compilar**.

---

## 🎯 Quando usar?

Sempre que você estiver lidando com operações que podem gerar problemas externos e que o Java **não consegue garantir em tempo de compilação**, como:

- Acesso a arquivos
- Comunicação com banco de dados
- Leitura de dados de rede
- Operações de entrada/saída em geral

---
