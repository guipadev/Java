package com.example.main;

import com.example.impl.TextEditor;

public class Main {

	public static void main(String[] args) {
        // Crear el editor de texto
        TextEditor editor = new TextEditor();
        // Escribir contenido
        editor.write("Primera línea\n");
        editor.write("Segunda línea\n");
        // Guardar el estado actual
        TextEditor.Memento memento = editor.save();
        // Escribir más contenido
        editor.write("Tercera línea\n");
        // Restaurar al estado anterior
        editor.restore(memento);

        /* Obtener y mostrar el contenido 
        restaurado*/
        System.out.println("Contenido restaurado:\n" + editor.getContent());
    }

}
