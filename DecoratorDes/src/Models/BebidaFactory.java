package Models;

import Interfaces.IBebida;

public class BebidaFactory {
    private static final String PACKAGE = "Models";

    public static IBebida criar(String nomeBebida) {
        try {
            String className = PACKAGE + "." + nomeBebida;
            Class<?> clazz = Class.forName(className);

            // garante que implementa IBebida
            if (!IBebida.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("Classe não é uma IBebida válida: " + className);
            }

            return (IBebida) clazz.getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Tipo de bebida não encontrado: " + nomeBebida, e);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar bebida: " + nomeBebida, e);
        }
    }
}
