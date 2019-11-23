package Indirection;

public class EnemyRobotAdapter implements EnemyAttacker {
   EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot theRobot) {
        this.theRobot = theRobot;
    }

    public void attack() {
        theRobot.jumpOnEnemy();
    }
}
