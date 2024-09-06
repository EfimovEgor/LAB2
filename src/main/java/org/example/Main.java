package org.example;

public class Main {
    private static int SuperJump = 2;

    public static int getSuperJump() {
        return SuperJump;
    }

    public static void decrementSuperJumpCount() {
        SuperJump--;
    }

    public static void main(String[] args) {
        Member[] members = {
                new Cat("Толик", 69, 1),
                new Cat("Бобик", 70, 1),
                new Person("Егор", 50, 1),
                new Robot("robot 1", 50, 0),
                new Robot("robot 2", 50, 1),
                new Улитка("Гери", 23)
        };

        Obstacle[] obstacle = {
                new Treadmill(TreadmillL.Short),
                new Treadmill(TreadmillL.Long),
                new Treadmill(TreadmillL.Long),
//                new Treadmill(TreadmillL.Long),
                new Wall(Walll.HIGH),
                new Wall(Walll.HIGH),
                new Wall(Walll.HIGH),
                new Treadmill(TreadmillL.Short),
                new Treadmill(TreadmillL.Middle),
                new Treadmill(TreadmillL.Long),
                };

        for (Member memb : members) {
            for (Obstacle obs : obstacle) {
                if (!obs.isCan(memb)) {
                    break;
                }
            }
        }
    }
}