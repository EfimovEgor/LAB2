package org.example;

public interface Member {

    default boolean superJump(String name) {
        int SuperJumpCount = Main.getSuperJump();
        if (SuperJumpCount > 0) {  // Изменено на `>` для корректного вывода оставшегося количества
            Main.decrementSuperJumpCount();
            // Используем `System.out.print()` и добавляем завершение строки позднее, если нужно
            System.out.print(name + " использовал суперпрыжок. Осталось " + SuperJumpCount + ". ");
            return true;
        } else {
            // Уведомление, если суперпрыжок больше не доступен
            System.out.print(name + " больше нельзя использовать суперпрыжок.");
            return false;
        }
    }

    boolean run(int distance);
    boolean jump(int height);
    String getName();
}
