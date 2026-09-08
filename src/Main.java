void main() {
    // Crear una pila
    ArrayStack pila = new ArrayStack(2);

    System.out.println("=== PRUEBAS DE STACK ===");

    // 1. isEmpty()
    System.out.println("\n1. ¿La pila está vacía?");
    System.out.println(pila.isEmpty());

    // 2. size()
    System.out.println("\n2. Tamaño inicial:");
    System.out.println(pila.size());

    // 3. push()
    System.out.println("\n3. Agregando elementos...");
    pila.push("A");
    pila.push("B");
    pila.push("C");

    System.out.println("Pila: " + pila);

    // 4. size()
    System.out.println("\n4. Tamaño después de agregar elementos:");
    System.out.println(pila.size());

    // 5. peek()
    System.out.println("\n5. Elemento en la cima (peek):");
    System.out.println(pila.peek());

    System.out.println("Pila después de peek: " + pila);

    // 6. search()
    System.out.println("\n6. Buscar elementos:");
    System.out.println("¿Existe B?: " + pila.search("B"));
    System.out.println("¿Existe X?: " + pila.search("X"));

    // 7. pop()
    System.out.println("\n7. Sacando elementos...");
    System.out.println("Elemento eliminado: " + pila.pop());
    System.out.println("Pila ahora: " + pila);

    System.out.println("Elemento eliminado: " + pila.pop());
    System.out.println("Pila ahora: " + pila);

    // 8. clear()
    System.out.println("\n8. Limpiando pila...");
    pila.clear();

    System.out.println("Pila después de clear: " + pila);

    // 9. isEmpty()
    System.out.println("\n9. ¿La pila está vacía?");
    System.out.println(pila.isEmpty());

    // 10. size()
    System.out.println("\n10. Tamaño final:");
    System.out.println(pila.size());
}
