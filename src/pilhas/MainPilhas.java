void main() {
    Stack<String> pilha = new Stack<>();
    String s1 = "Ana";
    String s2 = "Maria";
    String s3 = "José";
    pilha.push(s1);
    pilha.push(s2);
    pilha.push(s3);
    IO.println("Pilha inicial: " + pilha);

    IO.println("=".repeat(30));
    String topo = pilha.peek();
    IO.println("Topo da pilha: " + topo);

    IO.println("=".repeat(30));
    String removido = pilha.pop();
    IO.println("Removido: " + removido);
    IO.println("Pilha após remoção: " + pilha);
}